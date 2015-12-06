(ns reader-web-app.pages.books
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]))

(enable-console-print!)

;; Cover
(defn book-card [book owner]
  (reify
    om/IRender
    (render [_]
      (dom/a #js {:href (str "/books/" (get book "id"))}
        (dom/div #js {:className "book-card"}
          (dom/div #js {:className "book-card-cover-container"}
            (do
              (println book)
              (dom/img #js {:className "book-card-cover"
                            :src (str "/book-covers/" (get book "id") ".jpeg")
                            :alt "cover"})))

          )))))

(defn books-grid [books owner]
  (reify
    om/IDidMount
    (did-mount [this]
      (actions/get-all-books))
    om/IRender
    (render [_]
      (dom/div #js {:className "app-container"}
        (dom/div #js {:className "heading"}
          (dom/div #js {:className "logo"}
            (dom/i #js {:className "fa fa-book" } "")
            (dom/span nil "Shelf.")))
        (dom/div #js {:className "book-cards-grid-container"}
          (dom/div #js {:className "book-cards-grid"}
            (om/build-all book-card books)))))))


(defn books-page [data owner]
  (reify
    om/IDidMount
    (did-mount [this]
      (actions/get-all-books))
    om/IRender
    (render [this]
      (dom/div nil
        (om/build books-grid ((:books data) :items))))))
