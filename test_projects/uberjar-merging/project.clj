;; This project is used for leiningen's test suite, so don't change
;; any of these values without updating the relevant tests. If you
;; just want a basic project to work from, generate a new one with
;; "lein new".

(defproject nomnomnom "0.5.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [janino "2.5.15"]
                 [org.platypope/method-fn "0.1.0"]
                 [porcupine "0.0.4"]]
  :uberjar-exclusions [#"DUMMY"]
  :uberjar-merge-with {#"\.properties$" [slurp str spit]}
  :test-selectors {:default (fn [m] (not (:integration m)))
                   :integration :integration
                   :int2 :int2
                   :no-custom (fn [m] (not (false? (:custom m))))})
