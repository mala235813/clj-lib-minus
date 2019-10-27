(ns minus.minus-test
  (:require [clojure.test :refer :all]
            [minus.minus :refer :all]))

(deftest minus-test
  (testing "Subtraction"
    (is (= 3 (minus 8 5)))))
