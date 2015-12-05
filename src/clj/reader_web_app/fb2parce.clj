(ns reader-web-app.fb2parce
  (:require [clojure.xml :as xml])
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
  (if (string? raw-meta-info)
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

(defn parse-book
  [book-path]
  (let [raw-book (xml/parse book-path)
        raw-book-content (xml/content raw-book)
        raw-meta-info (first raw-book-content)]
    (flatten (map #(get-meta-info raw-meta-info %) [:first-name :last-name :book-title :genre]))))

(defn -main
  [some]
  (print "Karter_Kris_Raspinatel.fb2")) 