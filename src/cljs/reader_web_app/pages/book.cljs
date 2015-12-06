(ns reader-web-app.pages.book
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]))

(defn is-visible [el]
  (let [coords (js->clj (.getBoundingClientRect el))]
    ()))

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
  (let [id (:id (:params data))
        book (get (:book data) (cljs.reader/read-string id))]
    (reify
      om/IInitState
      (init-state [_]
        (.addEventListener js/document "scroll" handleScroll)
        (.addEventListener js/document "resize" handleResize)
        {})
      om/IDidMount
      (did-mount [_]
        (actions/get-book id))
      om/IRenderState
      (render-state [_ state]
        (let [book-content (:book book)]
          (do
            (dom/div #js {:className "book-container"}
              (dom/div #js {:id "book-content"
                            :dangerouslySetInnerHTML #js {:__html book-content }} nil))))))))

