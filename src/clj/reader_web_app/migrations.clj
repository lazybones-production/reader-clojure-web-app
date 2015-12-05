(ns reader-web-app.migrations
  (:require [ragtime.jdbc :as jdbc]
            [ragtime.repl :as repl]))

(defn load-config []
  {:datastore   (jdbc/sql-database {:connection-uri "jdbc:postgresql://localhost:5432/shelf?user=postgres"})
   :migrations (jdbc/load-resources "migrations")})

(defn migrate []
  (repl/migrate (load-config)))

(defn rollback []
  (repl/rollback (load-config)))
