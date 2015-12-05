(ns reader-web-app.pages.landing
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(defn landing-page [data owner]
  (reify
    om/IRender
    (render [this]
      (dom/h1 nil "Heelo from landing page"))))
