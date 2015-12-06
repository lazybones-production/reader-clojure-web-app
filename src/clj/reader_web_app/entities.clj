(ns reader-web-app.entities
  (:use korma.core)
  (:require reader-web-app.db))

(declare books)

(defentity books
  (pk :id)
  (table :books)
  (entity-fields :title))
