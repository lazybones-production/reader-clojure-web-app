(ns reader-web-app.core-test
  (:require [clojure.test :refer :all]
            [reader-web-app.core :refer :all]
            [ring.mock.request :as mock]))

(deftest books-test
  (testing "list books"
    (let [response (app (mock/request :get "/books"))]
      (is (= (:status response) 200))))

  (testing "book entity"
    (let [response (app (mock/request :get "/books/1"))]
      (is (= (:status response) 200))))

  (testing "create a book"
    (let [response (app (mock/request :post "/books"))]
      (is (= (:status response) 201))))

  (testing "delete a book"
    (let [response (app (mock/request :delete "/books/1"))]
      (is (= (:status response) 200)))))

(deftest not-found
  (testing "not found route")
    (let [response (app (mock/request :get "/not-found"))]
      (is (= (:status response) 404))))
