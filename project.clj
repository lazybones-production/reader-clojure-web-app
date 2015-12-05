(defproject reader-clojure-web-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.58" :exclusions [org.apache.ant/ant]]
                 [org.omcljs/om "0.9.0"]]
  :plugins [[lein-figwheel "0.5.0-1"]]
  :main ^:skip-aot reader-web-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
