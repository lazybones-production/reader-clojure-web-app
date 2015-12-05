(ns reader-web-app.utils.api
  (:require [ajax.core :refer [GET POST]]))

(defn get
  ([url] (GET url {:response-format :json}))
  ([url params] (GET url (assoc params :response-format :json))))

(defn post
  ([url] (POST url {:response-format :json}))
  ([url params] (POST url (assoc params :response-format :json))))

(defn post-json
  ([url] (POST url {:response-format :json
                    :format :json}))
  ([url params] (POST url (merge params {:response-format :json
                                         :format :json}))))
