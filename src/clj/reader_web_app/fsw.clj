(ns reader-web-app.fsw
  (:require [clojure.xml :as xml])
  (:import [javax.xml.bind.DatatypeConverter])
  (:import [java.io.FileOutputStream]))

(def cover-path "resources/public/book-covers/")
(def body-path "resources/public/book-bodies/")

(defn save-cover
  [raw-binary-jpg]
  (if (nil? raw-binary-jpg)
    nil
    (let [binary-jpg (first (xml/content raw-binary-jpg))
         full-cover (str cover-path (.toString (char-array 29)) ".jpeg")
         fos (java.io.FileOutputStream. full-cover)]
      (try
       (.write fos (javax.xml.bind.DatatypeConverter/parseBase64Binary binary-jpg))
       (catch clojure.lang.ExceptionInfo e (println (str "SaveFileError: " e)))
       (finally (.close fos)))
      full-cover))
  )

(defn saver
  [data, data-path]
  (println "ok")
  (let [fos (java.io.FileOutputStream. data-path)]
    (try
      (.write fos data)
      (catch clojure.lang.ExceptionInfo e (println (str "SaveFileError: " e)))
      (finally (try
                  (.close fos)
                  (catch clojure.lang.ExceptionInfo e (println (str "OnCloseFileConnectExeption:" e))))))
    data-path))

(defn save-to-file
  [data, k, uuid]
  (if (nil? data)
    nil
    (case (str k)
      "image" (saver (javax.xml.bind.DatatypeConverter/parseBase64Binary (first (xml/content data))) (str cover-path uuid) ".jpeg")
      "body" (let [bp (str body-path uuid ".xml")]
               (spit bp data)
               bp)))) ; (saver (.toCharArray data) (str body-path (.toString (char-array 29)) ".xml"))