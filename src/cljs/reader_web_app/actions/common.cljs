(ns reader-web-app.actions.common
  (:require [reader-web-app.utils.api :as api]
            [reader-web-app.state :as state]
            [secretary.core :as secretary]))

(enable-console-print!)

(defn set-books-loading [is-fetching]
  (swap! state/app-state assoc-in [:books] {:is-fetching is-fetching}))

(defn get-all-books-success [res]
  (set-books-loading false)
  (swap! state/app-state update-in [:books] merge {:items (get res "data")}))

(defn update-book-progress [id progress]
  ()
  (swap! state/app-state assoc-in [:data id] {:progress progress}))

(defn get-all-books-error [err]
  (set-books-loading false)
  ())

(defn get-all-books-all []
  (set-books-loading true)
  (api/xhr-get "/books" {:handler get-all-books-success
                     :error-handler get-all-books-error}))

(defn get-all-books []
  (let [{books :books} @state/app-state
        should-fetch (= (count (:items books)) 0)]
    (if (= should-fetch true)
      (get-all-books-all))))

(defn setBookLoading [id is-fetching]
  (swap! state/app-state assoc-in [:books id] {:is-fetching is-fetching}))

(defn get-book-success [id res]
  (setBookLoading id false)
  ())

(defn get-book-error [id err]
  (setBookLoading id false)
  ())

(defn get-book-call [id]
  (setBookLoading id true)
  (api/xhr-get (str "/books/" id) {:handler (partial get-book-success id)
                               :error-handler (partial get-book-error id)}))

(defn get-book [id]
  (let [{book :book} @state/app-state
        should-fetch (nil? (get book id))]
    (if (= should-fetch true)
      (get-book-call id))))

(defn getUserBooks []
  ())

(defn update-progress [in-progress]
  (swap! state/app-state assoc :in-progress in-progress))

(defn upload-book-success [res]
  (update-progress false)
  (let [book (:data res)
        id (:id book)]
    (println book res)
    (swap! state/app-state update-in [:books :items] conj book)
    (swap! state/app-state update-in [:book] merge {id book})
    (secretary/dispatch! (str "/books/" id))))

(defn upload-book-error []
  (update-progress false)
  ())

(defn upload-book [book]
  (update-progress true)
  (api/xhr-post-json "/books" {:params {:book book}
                           :handler upload-book-success
                           :error-handler upload-book-error
                           :keywords? true}))

(defn load-body-success [id data]
  (swap! state/app-state update-in [:book] merge {id {:book data}}))

(defn load-body [id]
  (api/xhr-get (str "/book-bodies/" id ".xml") {:handler (partial load-body-success id)}))

(defn updateSettings []
  ())

(defn updateBookInfo []
  ())
