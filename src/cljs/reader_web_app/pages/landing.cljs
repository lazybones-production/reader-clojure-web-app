(ns reader-web-app.pages.landing
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]
            [reader-web-app.components.adding-book :as adding-book]))




;; Cover
(defn book-card [book owner]
  (reify
    om/IRender
    (render [_]
      (dom/div #js {:className "book-card"}
        (dom/div #js {:className "book-card-cover-container"}
          (dom/img #js {:className "book-card-cover"
                        :src (:cover book)
                        :alt "cover"}))))))

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
            (om/build-all book-card books)))
        (dom/div #js {:className "welcome"}
          (dom/div #js {:className "overlay-dropzone"} "")
          (dom/div #js {:className "welcome-text-container"}
            (dom/p #js {:className "welcome-app-description"}
              (dom/span #js {:className "logo"} "Shelf")
              " is the best place to just pick up a book, start reading and continue on any device even you are offline.")
            (dom/p #js {:className "welcome-dropzone-description"} "Drop your book anywhere on this page to start reading.")
            (dom/i #js {:className "fa fa-plus-square-o drop-icon"}
              (om/build adding-book/adding-book []))
            (dom/p #js {:className "welcome-show-library"}
              "Or "
              (dom/a #js {:className "sl-link-btn"}
                (dom/i #js {:className "fa fa-search"} "")
                "search library")
              " collected by other readers.")))))))

(defn landing-page [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div nil
               ;; (dom/h1 nil "Heelo from landing page")
               (om/build books-grid ((:books data) :items))))))
