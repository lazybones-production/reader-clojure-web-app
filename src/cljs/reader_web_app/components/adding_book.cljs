(ns reader-web-app.components.adding-book
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]))

(defn dragHandler [owner isOver e]
  (.stopPropagation e)
  (.preventDefault e)
  (om/update-state! owner (fn [state] (assoc state :isOver isOver))))

(defn processResult [e]
  (let [book (.-result (.-target e))]
    (actions/upload-book book)))

(defn readFile [file]
  (let [reader (js/FileReader.)]
    (println reader)
    (set! (.-onload reader) processResult)
    (.readAsText reader file)))

(defn dropFile [owner e]
  (.stopPropagation e)
  (.preventDefault e)
  (om/update-state! owner (fn [state] (assoc state :isOver false)))
  (let [files (.-files (.-dataTransfer e))
        file (aget files 0)]
    (readFile file)))

(defn adding-book [data owner]
  (reify
    om/IInitState
    (init-state [_]
      {:isOver false})
    om/IRenderState
    (render-state [this state]
      (do
        (println state)
        (dom/div #js {:className "dnd-container"
                      :onDragOver (fn [e] (dragHandler owner true e))
                      :onDragLeave (fn [e] (dragHandler owner false e))
                      :onDrop (fn [e] (dropFile owner e))})))))
