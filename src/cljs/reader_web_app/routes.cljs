(ns reader-web-app.routes
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [reader-web-app.pages.books :as books]
            [reader-web-app.pages.landing :as landing]
            [reader-web-app.pages.book :as book]))

(def routes {:books landing/landing-page
             :home books/books-page
             :book book/book-page})
