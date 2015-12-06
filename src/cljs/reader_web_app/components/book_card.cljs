(ns reader-web-app.components.book-card
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn book-card [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "book-card"}
        (dom/img #js {:className "book-card-cover"
                      :src (:image data)
                      :alt (:title data) })
        (dom/i #js {:className }))
      (dom/div #js {:className "book-card-progress-container"}
        (dom/div #js {:className "book-card-progress"})))))
