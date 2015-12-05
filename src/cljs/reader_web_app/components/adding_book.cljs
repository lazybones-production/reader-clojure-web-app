(ns reader-web-app.components.adding-book
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [ajax.core :refer [POST]]))

(defn dragHandler [owner isOver e]
  (do
    (.stopPropagation e)
    (.preventDefault e)
    (om/update-state! owner (fn [state] (assoc state :isOver isOver)))))

(defn handle-response-ok [resp]
  ())

(defn set-upload-indicator []
  ())

(defn handle-response-error [ctx]
  ())

(defn processResult [e]
  (let [result (.-result (.-target e))]
        (POST "/upload" {:params {:message result}
                         :handler handle-response-ok
                         :error-handler handle-response-error
                         :format :json
                         :response-format :json
                         :request-format :json
                         :keywords? true})))

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
    (readFile file)
    (set-upload-indicator)))

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
                      :onDrop (fn [e] (dropFile owner e))}
          (if (= (:isOver state) true)
            (dom/div #js {:className "dnd-drop"} "I am over!!!!")
            (dom/div nil "I am not over....")))))))
