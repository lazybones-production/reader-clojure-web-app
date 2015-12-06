(ns reader-web-app.state)

(defonce app-state (atom {:route :home
                          ;; route params
                          :params {}
                          ;; list of books to render
                          ;; without any caching
                          :books {:is-fetching false
                                  :items [{:id 1 :title "yo 1", :cover "http://payload.cargocollective.com/1/4/128429/2040423/45cd8ec84e303febca9f661e1f7f0264.jpg"}
                                          {:id 2 :title "yo 2", :cover nil}]}
                          ;; book for reading
                          :book {}
                          ;; user settings
                          :settings {}
                          ;; user data about books – progress, etc
                          :data {}
                          ;; all notifications
                          :uploading {:in-progress false}
                          :notifications []}))
