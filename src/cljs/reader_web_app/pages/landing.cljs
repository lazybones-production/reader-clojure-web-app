(ns reader-web-app.pages.landing
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

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

(defn landing-page [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div nil
               ;; (dom/h1 nil "Heelo from landing page")
               (om/build covers-grid (:covers data))))))
