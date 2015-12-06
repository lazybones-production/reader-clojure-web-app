(ns reader-web-app.utils.api
  (:require [ajax.core :refer [GET POST]]))

(def api-prefix "/api")

(defn prepare-url [url]
  (str api-prefix url))

(defn xhr-get
  ([url] (GET url {:response-format :json}))
  ([url params] (GET (prepare-url url) (assoc params :response-format :json))))

(defn xhr-post
  ([url] (POST url {:response-format :json}))
  ([url params] (POST (prepare-url url) (assoc params :response-format :json))))

(defn xhr-post-json
  ([url] (POST url {:response-format :json
                    :format :json}))
  ([url params] (POST (prepare-url url) (merge params {:response-format :json
                                                       :format :json}))))
