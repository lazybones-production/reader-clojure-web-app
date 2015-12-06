(ns reader-web-app.component.books-grid
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.component.book-card :as book-card]))

(defn books-grid [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "book-cards-grid-container"}
        (dom/div #js {:className "book-cards-grid"}
          (om/build-all book-card/book-card (:items (:books data))))))))
