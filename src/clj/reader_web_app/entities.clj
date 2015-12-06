(ns reader-web-app.entities
  (:use korma.core)
  (:require reader-web-app.db))

(declare books users)

(defentity books
  (pk :id)
  (table :books)
  (entity-fields :title :id :firstname :lastname :genre))

(defentity users
  (pk :id)
  (table :users)
  (entity-fields :name :id))
