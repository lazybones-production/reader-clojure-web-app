(ns reader-web-app.pages.book
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]
            [reader-web-app.components.reader :as reader]))

(defn book-page [data owner]
  (let [id (:id (:params data))]
    (reify
    om/IWillMount
    (will-mount [this]
      (actions/get-book id))
    om/IRender
    (render [this]
      (dom/div #js {:className "123"}
        (om/build reader/reader data))))))
