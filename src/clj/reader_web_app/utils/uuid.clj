(ns reader-web-app.utils.uuid)

(defn uuid [] (str (java.util.UUID/randomUUID)))
