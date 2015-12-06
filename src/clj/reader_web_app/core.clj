(ns reader-web-app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [reader-web-app.models.books :as books]
            [ring.util.response :refer [response]]
            [ring.middleware.json :as middleware]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]
            [ring.middleware.cors :refer [wrap-cors]]
            [reader-web-app.fb2parce :as fb2]
            [compojure.handler :as handler]))

(defn get-books [_]
    {:status 200
     :body {:data (books/find-all)}})

(defn create-book [book]
  {:status 200
   :body {:data (books/create-book file)}})

(defn get-book [id]
  {:status 200
   :body {:data (books/find-by-id id)}})

(defn delete-book [_]
    {:status 200
     :body {:data "{}"}})

(defroutes app-routes
  (context "/books" []
    (GET "/" [] get-books)
    (GET "/:id" [id] (get-book id))
    (POST "/" [book] (create-book book))
    (DELETE "/:id" [] delete-book))
  (route/not-found {:body {:error "Not such route"}}))

(defn allow-cross-origin
  "middleware function to allow crosss origin"
  [handler]
  (fn [request]
   (let [response (handler request)]
    (assoc-in response [:headers "Access-Control-Allow-Origin"]
         "*"))))

(defn options-200
  "middleware function to always 200 an OPTIONS request"
  [handler]
  (fn [request]
    (if (= :options (:request-method request))
      {:headers {"Access-Control-Allow-Origin" "*"
                 "Access-Control-Allow-Headers" "DNT,X-CustomHeader,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type"
                 "Access-Control-Allow-Methods" "GET, POST, PUT, OPTIONS"}
       :body ""
       :status 204}
      (handler request))))

(def app
  (-> app-routes
    ;; for automatic parsing requests
    ;; :keywords for getting keys as keywords, not strings
    (wrap-cors :access-control-allow-origin #".*"
                      :access-control-allow-credentials "true"
                      :access-control-allow-headers ["Origin"
                                                     "X-Requested-With"
                                                     "Content-Type"
                                                     "Accept"]
                      :access-control-allow-methods ["GET"
                                                     "POST"
                                                     "PUT"
                                                     "DELETE"
                                                     "OPTIONS"])
    (options-200)
    (allow-cross-origin)
    (middleware/wrap-json-body {:keywords? true})
    ;; for automatic parsing response
    (middleware/wrap-json-response)
    ;; don't know what it is))
    (wrap-defaults api-defaults)))
