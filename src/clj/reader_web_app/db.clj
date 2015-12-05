(ns reader-web-app.db
  (:use korma.db))

(defdb db (postgres {:db "shelf"
                     :user "shelf"
                     :password "shelf"
                     :host "localhost"
                     :port 5432}))
