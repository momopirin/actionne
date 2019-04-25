(defproject snsguardian "0.1.0-SNAPSHOT"
  :description "Protect your privacy, clean up your sns accounts "
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main  ^:skip-aot snsguardian.core
  ;:aot [snsguardian.core]
  :profiles {:uberjar {:aot :all} }
  :plugins [ [lein-ring "0.12.0"] [lein-cljfmt "0.6.0"]]
  :dependencies [[org.clojure/clojure "1.9.0"],
    [instaparse "1.4.9"] ,
    [metosin/compojure-api "1.1.11"]
    [ring/ring-jetty-adapter "1.6.3"]
    [com.cerner/clara-rules "0.18.0"]
    [tea-time "1.0.1"]
    [twttr "3.2.2"]
    ]
  :repl-options {:init-ns snsguardian.core})
