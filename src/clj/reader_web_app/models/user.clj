(ns reader-web-app.models.user
  (:use korma.core)
  (:require [reader-web-app.entities :as e]
            [reader-web-app.utils.uuid :as utils]
            [reader-web-app.fb2parse :as fb2]))

(defn find-all []
  (select e/users))

(defn find-by [field value]
  (first
    (select e/users
      (where {field value})
      (limit 1))))

(defn find-by-id [id]
  (find-by :id id))

(defn find-all-by [field value]
  (select e/users
    (where {field value})))

(defn create-user [name]
  (let [id (utils/uuid)]
    (insert e/users
      (values {:name name :id id}))))
