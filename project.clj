(defproject flappy-bird-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2760"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 ;[sablono "0.2.16"]
                 [reagent "0.5.0"]
                 [figwheel "0.2.3-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-figwheel "0.2.3-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "flappy-bird-demo"
              :source-paths ["src"]
              :compiler {
                         :output-to "resources/public/js/flappy_bird_demo.js"
                         :output-dir "resources/public/js/out"
                         :optimizations :none
                         :cache-analysis true
                         :source-map-timestamp true
                         :source-map true}}]}
  
  :figwheel { :css-dirs ["resources/public/css"]
              :open-file-command "emacsclient"
             })
