(ns reader-web-app.fb2parce
  (:require [clojure.xml :as xml]
            [reader-web-app.fsw :as fsw])
  (:import [javax.xml.bind.DatatypeConverter])
  (:import [java.io.FileOutputStream]))

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
  (loop [nodes raw-book]
    (if (empty? nodes)
      nil
      (let [[cnode & nodess] nodes]
        (if (= (clojure.xml/tag cnode) k)
          cnode
          (recur nodess))))))

(defn parse-book
  [book-path]
  (let [raw-book (xml/parse book-path)
        raw-book-content (xml/content raw-book)
        raw-meta-info (get-node raw-book-content :description)
        raw-body (get-node raw-book-content :body)
        raw-binary-jpg (get-node raw-book-content :binary)
        f-meta (flatten (map #(get-meta-info raw-meta-info %) [:first-name :last-name :book-title :genre]))
        cover (fsw/save-cover raw-binary-jpg "resources/public/book-covers/")
        ]
    ; (flatten (map #(get-meta-info raw-meta-info %) [:first-name :last-name :book-title :genre]))
    ; (println raw-meta-info)
    ; (String. (javax.xml.bind.DatatypeConverter/parseBase64Binary (first (clojure.xml/content raw-binary-jpg))))
    ; (fsw/save-cover raw-binary-jpg "resources/public/book-covers/")
    ; (fsw/save-body raw-body "resources/private/book-bodies/")
    {:meta f-meta :cover cover}))

(defn -main
  [some]
  (print "Karter_Kris_Raspinatel.fb2")) 