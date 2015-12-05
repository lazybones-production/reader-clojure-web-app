(ns reader-web-app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]
            [ring.middleware.json :as middleware]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defroutes app-routes
  (GET "/books" [] {:body {:my-map "hello"}})
  (GET "/books2" [] {:body {:my-map "hello2"}})
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
