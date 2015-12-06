(ns reader-web-app.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.routes :as routes]
            [reader-web-app.router :as router]
            [reader-web-app.state :as state]
            [reader-web-app.components.adding-book :as adding-book]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

(om/root
  (fn [data owner]
    (reify om/IRender
      (render [_]
        (dom/div #js {:className "container"}
          (om/build adding-book/adding-book [])
          (dom/div #js {:className "content-container"}
            (dom/a #js {:href "/"} "Home")
            (dom/a #js {:href "/books"} "Books")
            (dom/a #js {:href "/books/1"} "BOOK")
            #_(om/build ((:route data) routes/routes) data))))))
  state/app-state
  {:target (. js/document (getElementById "app"))})

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:counter] inc)
)
