(ns reader-web-app.fb2parse
  (:require [clojure.xml :as xml])
  (:import [javax.xml.bind.DatatypeConverter])
  (:import [java.io.FileOutputStream])
  (:gen-class))

; (defn is-en?
;   [data]
;     (loop [maps data]
;       (if (empty? maps)
;         false
;         (let [[cmap & maps] maps]
;          (if (and (= (xml/tag cmap) :lang) (= (xml/content cmap) [:en]))
;            true
;            (recur maps))))))

; (defn get-meta
;   [raw-meta-info, ks]
;   (map #(get-meta-info raw-meta-info %) {:author}))

(defn get-meta-info
  [raw-meta-info, k]
  (println "\n" raw-meta-info)
  (if (or (string? raw-meta-info) (nil? raw-meta-info))
    nil
    (if (map? raw-meta-info)
      (if (= (xml/tag raw-meta-info) k)
        (if (nil? (first (raw-meta-info :content)))
          nil
          (if (re-matches #"[A-Za-z0-9\s]*" (first (raw-meta-info :content)))
            {k (raw-meta-info :content)}
            nil))
        (get-meta-info (raw-meta-info :content) k))
      (if (vector? raw-meta-info)
        (loop [nodes raw-meta-info
             meta-info []]
        (if (empty? nodes)
          meta-info
          (let [[cnode & nodess] nodes
                new-node (get-meta-info cnode k)]
             (recur nodess (into meta-info new-node)))))))))

(defn get-node
  [raw-book, k]
  (println k)
  (loop [nodes raw-book]
    (if (empty? nodes)
      nil
      (let [[cnode & nodess] nodes]
        (if (= (clojure.xml/tag cnode) k)
          cnode
          (recur nodess))))))

(defn get-in-node
  [nodes, ks]
  )

(defn save-cover
  [raw-binary-jpg, cover-path]
  (if (nil? raw-binary-jpg)
    nil
    (let [binary-jpg (first (clojure.xml/content raw-binary-jpg))
        full-cover (str cover-path (.toString (char-array 29)) ".jpeg")
         fos (java.io.FileOutputStream. full-cover)]
      (try
       (.write fos (javax.xml.bind.DatatypeConverter/parseBase64Binary binary-jpg))
       (catch clojure.lang.ExceptionInfo e (println (str "SaveFileError: " e)))
       (finally (.close fos)))))
  )

(defn parse-book
  [book-path]
  (let [raw-book (xml/parse book-path)
        raw-book-content (xml/content raw-book)
        raw-meta-info (get-node raw-book-content :description)
        raw-body (get-node raw-book-content :body)
        raw-binary-jpg (get-node raw-book-content :binary)]
    (println raw-binary-jpg)
    ; (flatten (map #(get-meta-info raw-meta-info %) [:first-name :last-name :book-title :genre]))
    ; (println (first raw-book))
    ; (String. (javax.xml.bind.DatatypeConverter/parseBase64Binary (first (clojure.xml/content raw-binary-jpg))))
    (save-cover raw-binary-jpg "resources/public/book-covers/")))

(defn -main
  [some]
  (print "Karter_Kris_Raspinatel.fb2"))
