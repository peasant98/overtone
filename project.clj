(defproject overtone "0.1.1"
            :description "An audio/musical experiment."
            :dependencies [
                           [org.clojure/clojure "1.1.0"]
                           [org.clojure/clojure-contrib "1.1.0"]

                           [jline "0.9.94"]
                           [scenegraph/decora-hw  "0.0.1-SNAPSHOT"]
                           [scenegraph/decora-jogl "0.0.1-SNAPSHOT"]
                           [scenegraph/decora-runtime "0.0.1-SNAPSHOT"]
                           [scenegraph "0.0.1-SNAPSHOT"]
                           [vijual "0.1.0-SNAPSHOT"]
                           [org.clojars.rosejn/jsyntaxpane "0.9.5-b27"]
                           ;[penumbra "0.5.0"]

                           [osc-clj "0.1.2-SNAPSHOT"]
                           [byte-spec "0.1"]
                           [midi-clj "0.1"]

                           [overtone/clj-scsynth "0.0.2-SNAPSHOT"]
                           [overtone/clj-scenegraph "0.0.3-SNAPSHOT"]]
            :native-dependencies [[overtone/scsynth "3.3.1-SNAPSHOT"]
                                  [overtone/scsynth-jna "3.3.1-SNAPSHOT"]
                                  [lwjgl "2.2.2"]
                                  ]
            :dev-dependencies [[native-deps "1.0.0"]
                               [lein-clojars "0.5.0-SNAPSHOT"]
                               [autodoc "0.7.0"]
                               [org.clojars.ato/nailgun "0.7.1"]
                               [org.clojars.gilbertl/vimclojure "2.1.2"]
                               [lein-nailgun "0.1.0"]
                               [swank-clojure "1.1.0-SNAPSHOT"]
                               [leiningen/lein-swank "1.1.0"]]

            :main overtone.app.repl)
