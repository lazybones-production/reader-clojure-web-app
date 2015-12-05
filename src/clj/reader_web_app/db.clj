(ns reader-web-app.db
  (:use korma.db))

(defdb db (postgres {:db "shelf"
                     :user "postgres"
                     :password ""
                     :host "localhost"
                     :port 5432}))
