(ns reader-web-app.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {
  :text "Hello CLJS Application"
  :counter 0
  :contacts []
  :covers [1 2 3 4 5 6]
  }))

;; increment counter in state
(defn incrementCounter [data]
  (om/transact! data :counter inc))

;; Cover
(defn cover [cover owner]
  (reify
    om/IRender
    (render [_]
      (dom/div #js {:className "cover"} (str cover "!!!")))))

(defn covers-grid [covers owner]
  (reify
    om/IRender
    (render [_]
      (dom/div #js {:className "covers-grid-container"}
        (dom/div #js {:className "covers-grid"}
          (om/build-all cover covers))))))

;; just plain render, without nested components to prove concepts
(om/root
  (fn [data owner]
    (reify om/IRender
      (render [_]
        (dom/div #js {:className "container"}
          (dom/h1 nil (:text data))
           ;; (dom/button #js {:className "button" :onClick #(incrementCounter data)} "Click me!")
           ;; (dom/span nil (:counter data))
          (om/build covers-grid (:covers data))))))
  app-state
  {:target (. js/document (getElementById "app"))})



;; (swap! app-state update-in [:counter] inc)

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:counter] inc)

)
