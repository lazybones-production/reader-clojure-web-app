(ns reader-web-app.controllers.users
  (:require [reader-web-app.models.user :as user]))

(defn get-users [_]
  {:status 200
   :body {:data (user/find-all)}})

(defn get-user [{{:keys [id]} :params}]
  {:status 200
   :body {:data (user/find-by-id id)}})

(defn create-user [{{:keys [name]} :params}]
  {:status 201
   :body {:data (user/create-user name)}})
