(ns reader-web-app.router
  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [reader-web-app.routes :as routes]
            [reader-web-app.state :as state]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.History
           goog.history.Html5History
           goog.Uri))

(defroute "/" []
  (swap! state/app-state assoc :route :home))

(defroute "/books" []
  (swap! state/app-state assoc :route :books))

(defroute "/books/:id" {:as params}
  (swap! state/app-state (fn [x] (merge x {:params params
                                           :route :book}))))

(secretary/set-config! :prefix "#")


;; Quick and dirty history configuration.
(let [h (History.)]
  (goog.events/listen h EventType/NAVIGATE #(secretary/dispatch! (.-token %)))
  (doto h (.setEnabled true)))
