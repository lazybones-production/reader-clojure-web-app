(ns reader-web-app.fsw
  (:require [clojure.xml :as xml])
  (:import [javax.xml.bind.DatatypeConverter])
  (:import [java.io.FileOutputStream]))

(defn save-cover
  [raw-binary-jpg, cover-path]
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