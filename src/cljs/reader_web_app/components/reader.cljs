(ns reader-web-app.components.reader
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.actions.common :as actions]
            [reader-web-app.components.reading-progress :as reading-progress]
            [reader-web-app.state :as state]))

(def body (.-body js/document))
(def html (.-documentElement js/document))

(defn get-scroll-top []
  (.-scrollTop body))

(defn get-window-height []
  (.-innerHeight js/window))

(defn get-window-width []
  (.-innerWidth js/window))

(defn set-scroll [scroll]
  (set! (.-scrollTop body) scroll))

(defn scroll-screen [direction]
  (let [screen (- (get-window-height) 50)
        scroll (get-scroll-top)]
    (set-scroll (if (= direction 1)
                  (+ scroll screen)
                  (- scroll screen)))))

(defn scroll-down
  []
  (scroll-screen 1))

(defn scroll-up
  []
  (scroll-screen -1))

(defn handle-keydown
  [e]
  (let [code (.-keyCode e)]
    (cond
     (or (= code 39) (= code 32) (= code 40)) (scroll-down)
     (or (= code 38) (= code 37)) (scroll-up))))

(defn change-body-scroll [is-allowed]
  (set! (.-overflow (.-style body)) is-allowed))

(defn disable-body-scroll
  []
  (change-body-scroll "hidden"))

(defn allow-body-scroll
  []
  (change-body-scroll ""))

(defn find-first
  [f coll]
  (first (filter f coll)))

(defn get-coords [el]
  (let [coords (.getBoundingClientRect el)
        top (.-top coords)
        height (.-height coords)
        bottom (.-bottom coords)]
    {:top top
      :height height
      :bottom bottom}))

(defn is-visible [el]
  (let [coords (get-coords el)
        is-vis (and (>= 0 (:top coords)) (> (:bottom coords) 0))]
    is-vis))

(defn get-children [el]
  (.-children el))

(defn get-document-height []
  (let [x (.-scrollHeight body)
        y (.-offsetHeight body)
        z (.-clientHeight html)
        w (.-scrollHeight html)
        q (.-offsetHeight html)]
    (max x y z w q)))

(defn find-percents []
  (let [scroll (get-scroll-top)
        height (get-document-height)
        result (* 100 (/ scroll height))]
    result))

(defn handleScroll [e]
  ())

(defn handleResize [id e]
  (let [progress (:progress (get (:data @state/app-state) id) 0)
        height (get-document-height)
        new-offset (/ (* height progress) 100)]
    (set-scroll new-offset)))

(defn reader [data owner]
  (let [id (:id (:params data))
        book (get (:book data) id)
        progress (:progress (get (:data data) id) 0)
        handle-resize (partial handleResize id)
        handle-keydown-bound (fn [e]
                               (handle-keydown e)
                               (actions/update-book-progress id (find-percents)))
        handle-touch (fn [e]
          (let [touch (aget (.-touches e) 0)
                x (.-clientX touch)
                y (.-clientY touch)
                height (get-window-height)
                width (get-window-width)
                is-in-bottom (> (/ y height) 0.75)
                is-in-right (> (/ x width) 0.5)]
            (if (is-in-bottom)
              (scroll-down)
              (if (is-in-right)
                (scroll-down)
                (scroll-up)))))]
    (reify
      om/IInitState
      (init-state [_]
        {:interval nil})
      om/IDidMount
      (did-mount [_]
        (.addEventListener js/window "resize" handle-resize)
        (.addEventListener js/document "keydown" handle-keydown-bound)
        (.addEventListener (.getElementById js/document "book-content") "touchstart" handle-touch)
        (handle-resize [])
        (disable-body-scroll))
      om/IWillUnmount
      (will-unmount [_]
        (.removeEventListener js/document "resize" handle-resize)
        (.removeEventListener js/document "keydown" handle-keydown-bound)
        (.removeEventListener (.getElementById js/document "book-content") "touchstart" handle-touch)
        (allow-body-scroll))
      om/IRenderState
      (render-state [_ state]
        (let [book-content (:book book)]
            (dom/div #js {:className "book-container"}
              (dom/div #js {:id "book-content"
                            :className "book-content"
                            :dangerouslySetInnerHTML #js {:__html book-content }} nil)
              (om/build reading-progress/reading-progress {:progress (str progress "%")})))))))

