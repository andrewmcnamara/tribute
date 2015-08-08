(set-env!
 :source-paths   #{"src"}
 :dependencies '[[adzerk/boot-reload    "0.3.1"      :scope "test"]
                 [adzerk/boot-cljs      "0.0-3308-0" :scope "test"]
                 [com.joshuadavey/boot-middleman "0.0.4" :scope "test"]
                 [pandeiro/boot-http    "0.4.0"      :scope "test"]
                 [org.clojure/clojure "1.7.0"]
                 [adzerk/boot-cljs-repl "0.1.10-SNAPSHOT" :scope "test"]])

(require '[com.joshuadavey.boot-middleman :refer [middleman]]
         '[pandeiro.http :refer [serve]]
         '[adzerk.boot-reload    :refer [reload]]
         '[adzerk.boot-cljs      :refer [cljs]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(deftask dev []
 (comp
  (serve :dir "target/")
  (watch)
  (middleman :dir "html")
  (reload :on-jsload 'bootcljs.core/on-reload)
  (cljs-repl)
  (cljs :source-map true)
))