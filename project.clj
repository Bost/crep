(defproject crep :lein-v
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies
  [
   [org.clojure/clojure "1.10.0"]
   [org.clojure/algo.monads "0.1.6"]
   [org.clojure/tools.reader "1.3.2"]
   ]
  :plugins
  [
   ;; Drive leiningen project version from git instead of the other way around
   [com.roomkey/lein-v "7.0.0"]
   ]
  ;; :main ^:skip-aot crep.core
  :main crep.core
  ;; :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :repl-options {:init-ns crep.core}
  )

