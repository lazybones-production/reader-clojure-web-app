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
    (let [book (slurp "book.fb2")
          response (app (mock/request :post "/books" {"book" book}))]
      (is (= (:status response) 201)))))

(deftest users-test
  (testing "list users"
    (let [response (app (mock/request :get "/users"))]
      (is (= (:status response) 200))))

  (testing "user entity"
    (let [response (app (mock/request :get "/users/1"))]
      (is (= (:status response) 200))))

  (testing "create a user"
    (let [response (app (mock/request :post "/users" {"name" "Vasya"}))]
      (is (= (:status response) 201)))))

(deftest not-found
  (testing "not found route")
    (let [response (app (mock/request :get "/not-found"))]
      (is (= (:status response) 404))))
