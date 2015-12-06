(ns reader-web-app.components.reading-progress
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn reading-progress [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div nil "123"))))
