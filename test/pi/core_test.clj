(ns pi.core-test
  (:use clojure.test
        pi.core))

(deftest pi-test
  (testing "greater than 3.14159"
    (is (< 3.14159265 (pi 1000))))
  (testing "less than 3.14160"
    (prn (+ 0.0 (pi 1000)))
    (is (> 3.141592654 (pi 1000))))






         )
