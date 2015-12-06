(ns reader-web-app.fb2parser-test
  (:require [clojure.test :refer :all]
            [reader-web-app.fb2parse :as parse]))

(deftest parser-test
  (testing "should-parse-fb2"
    (let [book (slurp "book.fb2")
          meta (get (parse/parse-book book "1") :meta)]
      (is (= (get meta :title) "The Adventures of Tom Sawyer")))))
