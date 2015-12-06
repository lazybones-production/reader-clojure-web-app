(ns reader-web-app.pages.book
  (:require [om/core :as om :include-macros true]
            [om/dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]))

(defn find-position [el]
  (.-children el))

(defn findPosition []
  (let [el (.getElementById js/document "book-content")]
    ))

(defn handleScroll [e]
  ())

(defn handleResize [e]
  ())

(defn book-page [data owner]
  (reify
    om/IInitState
    (init-state [_]
      (.addEventListener js/document "scroll" handleScroll)
      (.addEventListener js/document "resize" handleResize)
      {})
    om/IDidMount
    (did-mount []
      (actions/get-book (:data )))
    om/IRenderState
    (render-state [_ state]
      (dom/div #js {:className "book-container"}
        (dom/div #js {:id "book-content"})))))
