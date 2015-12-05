(ns reader-web-app.state)

(defonce app-state (atom {:route :home
                          :counter 0}))
