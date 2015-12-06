(ns reader-web-app.components.reading-progress
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn reading-progress [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/div #js {:className "progress-container"}
        (dom/div #js {:className "progress-value"
                      :style #js { :width (:progress data) } })))))
