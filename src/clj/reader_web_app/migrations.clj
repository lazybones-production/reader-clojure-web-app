(ns reader-web-app.migrations
  (:require [ragtime.jdbc :as jdbc]))

(def config
  {:datastore   (jdbc/sql-database {:connection-uri "jdbc:postgresql://localhost:5432/shelf?user=shelf&password=shelf"})
   :migrations (jdbc/load-resources "migrations")})
