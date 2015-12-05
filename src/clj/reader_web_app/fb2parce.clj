(ns reader-web-app.fb2parce
  (:require [clojure.xml :as xml])
  (:gen-class))

(defn get-meta-info
  [raw-meta-info, k]
  (println "\n" raw-meta-info)
  (if (string? raw-meta-info)
    nil
    (if (map? raw-meta-info)
      (if (= (xml/tag raw-meta-info) k)
        {k (raw-meta-info :content)}
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
    ; (println raw-meta-info)
    (map #(get-meta-info raw-meta-info %) [:first-name :last-name])))

(defn -main
  [some]
  (print "Karter_Kris_Raspinatel.fb2")) 