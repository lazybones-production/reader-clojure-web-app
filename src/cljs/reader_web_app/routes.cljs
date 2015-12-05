(ns reader-web-app.routes
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.pages.books :as books]
            [reader-web-app.pages.landing :as landing]))

(def routes {:home landing/landing-page
             :books books/books-page})
