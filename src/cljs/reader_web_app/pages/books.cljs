(ns reader-web-app.pages.books
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]))

(defn books-page [data owner]
  (reify
    om/IDidMount
    (did-mount [this]
      (actions/get-all-books))
    om/IRender
    (render [this]
      (dom/div nil nil))))
