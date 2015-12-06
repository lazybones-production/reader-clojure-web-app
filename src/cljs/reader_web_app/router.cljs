(ns reader-web-app.router
  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [reader-web-app.routes :as routes]
            [reader-web-app.state :as state]
            [goog.events :as events]
            [goog.history.EventType :as EventType])
  (:import goog.history.Html5History
           goog.Uri))

(defroute "/" []
  (swap! state/app-state assoc :route :home))

(defroute "/books" []
  (swap! state/app-state assoc :route :books))

(defroute "/books/:id" {:as params}
  (swap! state/app-state (fn [x] (merge x {:params params
                                           :route :book}))))

;; -------------------------
;; History
;; from here – https://gist.github.com/city41/aab464ae6c112acecfe1
(defn hook-browser-navigation! []
  (let [history (doto (Html5History.)
                  (events/listen
                    EventType/NAVIGATE
                    (fn [event]
                      (secretary/dispatch! (.-token event))))
                  (.setUseFragment false)
                  (.setPathPrefix "")
                  (.setEnabled true))]

                  (events/listen js/document "click"
                             (fn [e]
                               (let [path (.getPath (.parse Uri (.-href (.-target e))))
                                     title (.-title (.-target e))]
                                 (when (secretary/locate-route path)
                                   (. e preventDefault)
                                   (. history (setToken path title))))))))

;; need to run this after routes have been defined
(hook-browser-navigation!)
