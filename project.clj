(defproject reader-web-app "0.1.0-SNAPSHOT"
  :description "offline fb2 reader app"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.58" :exclusions [org.apache.ant/ant]]
                 [secretary "1.2.3"]
                 [org.omcljs/om "0.9.0"]
                 [compojure "1.4.0"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [cljs-ajax "0.5.2"]
                 [alandipert/storage-atom "1.2.4"]
                 [com.novemberain/monger "3.0.0-rc2"]
                 [ring/ring-mock "0.3.0"]
                 [korma "0.4.0"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [ragtime "0.5.2"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]
  :aliases {"migrate"  ["run" "-m" "reader-web-app.migrations/migrate"]
            "rollback" ["run" "-m" "reader-web-app.migrations/rollback"]}
  :cljsbuild {
    :builds [{
    :source-paths ["src/cljs"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "resources/public/js/main3.js"  ; default: target/cljsbuild-main.js
          :optimizations :advanced
          :pretty-print true}}]}
  :figwheel {:css-dirs ["resources/public"]}
  :ring {:handler reader-web-app.core/app}
  :main ^:skip-aot reader-web-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
