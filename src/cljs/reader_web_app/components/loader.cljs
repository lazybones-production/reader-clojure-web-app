(ns reader-web-app.components.loader
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn loader [owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "loader-container"}
        (dom/div #js {:className "loader-spinner"})))))
