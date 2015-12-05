(ns reader-web-app.pages.books
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn books-page [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/h1 nil "Heelo from books page"))))
