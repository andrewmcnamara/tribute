(defproject shouter "0.0.1"
  :description "Volunteer Mangement App"
  :url "http://github.com/abedra/shouter"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.4.0"]])