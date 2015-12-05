(ns reader-web-app.state)

(defonce app-state (atom {:route :home
                          ;; list of books to render
                          ;; without any caching
                          :books {:is-fetching false
                                  :items []}
                          ;; book for reading
                          :book {}
                          ;; user settings
                          :settings {}
                          ;; user data about books – progress, etc
                          :data {}
                          ;; all notifications
                          :uploading {:in-progress false}
                          :notifications []}))
