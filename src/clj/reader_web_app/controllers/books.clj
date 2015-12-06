(ns reader-web-app.controllers.books
  (:require [reader-web-app.models.book :as book]))

(defn get-books [_]
    {:status 200
     :body {:data (book/find-all)}})

(defn get-book [{{:keys [id]} :params}]
  {:status 200
   :body {:data (book/find-by-id id)}})

(defn create-book [{{:keys [book]} :params}]
  {:status 201
   :body {:data (book/create-book book)}})
