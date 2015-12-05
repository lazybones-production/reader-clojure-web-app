(ns reader-web-app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]
            [ring.middleware.json :as middleware]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defn get-books [_]
    {:status 200
     :body {:data "[]"}})

(defn create-book [_]
    {:status 201})

(defn delete-book [_]
    {:status 200
     :body {:data "{}"}})

(defroutes app-routes
  (context "/books" []
    (GET "/" [] get-books)
    (POST "/" [] create-book)
    (DELETE "/:id" [] delete-book))
  (route/not-found {:body {:error "Not such route"}}))

(def app
  (-> app-routes
    ;; for automatic parsing requests
    ;; :keywords for getting keys as keywords, not strings
    (middleware/wrap-json-body {:keywords? true})
    ;; for automatic parsing response
    (middleware/wrap-json-response)
    ;; don't know what it is))
    (wrap-defaults api-defaults)))
