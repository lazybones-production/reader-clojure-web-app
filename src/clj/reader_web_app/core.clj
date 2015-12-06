(ns reader-web-app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [reader-web-app.controllers.books :as books]
            [reader-web-app.controllers.users :as users]
            [ring.util.response :refer [response]]
            [ring.middleware.json :as middleware]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defroutes app-routes
  (context "/books" []
    (GET "/" [] books/get-books)
    (GET "/:id" [] books/get-book)
    (POST "/" [] books/create-book))
  (context "/users" []
    (GET "/" [] users/get-users)
    (GET "/:id" [] users/get-user)
    (POST "/" [] users/create-user))
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
