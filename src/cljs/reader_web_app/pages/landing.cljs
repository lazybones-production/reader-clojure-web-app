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
      (dom/div #js {:className "heading"}
        (dom/div #js {:className "logo"}
          (dom/i #js {:className "fa fa-book" } "")
          (dom/span nil "Shelf."))
        (dom/div #js {:className "welcome"}
          (dom/div #js {:className "overlay-dropzone"} "")
          (dom/div #js {:className "welcome-text-container"}
            (dom/p #js {:className "welcome-app-description"}
              (dom/span #js {:className "logo"} "Shelf")
              " is the best place to just pick up a book, start reading and continue on any device even you are offline.")
            (dom/p #js {:className "welcome-dropzone-description"} "Drop your book anywhere on this page to start reading.")
            (dom/i #js {:className "fa fa-plus-square-o drop-icon"} "")
            (dom/p #js {:className "welcome-show-library"}
              "Or "
              (dom/a #js {:className "sl-link-btn"}
                (dom/i #js {:className "fa fa-search"} "")
                "search library"))))
      (dom/div #js {:className "covers-grid-container"}
        (dom/div #js {:className "covers-grid"}
          (om/build-all cover covers)))))))


(defn landing-page [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div nil
               ;; (dom/h1 nil "Heelo from landing page")
               (om/build covers-grid (:covers data))))))
