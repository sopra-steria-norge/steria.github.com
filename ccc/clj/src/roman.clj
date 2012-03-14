(ns roman
  (:use clojure.test))

(with-test
  (defn roman [x]
    (cond
      (>= x 90) "Numbers above 89 are not supported"
      (>= x 50) (str "L" (roman (- x 50))) 
      (>= x 40) (str "XL" (roman (- x 40)))
      (>= x 10) (str "X" (roman (- x 10)))
      (= x 9) "IX"
      (>= x 5) (str "V" (roman (- x 5)))
      (= x 4) "IV"
      (> x 0) (str (roman (- x 1)) "I")      
      :else ""))

  (is (= "I" (roman 1)))
  (is (= "II" (roman 2)))
  (is (= "III" (roman 3)))
  (is (= "IV" (roman 4)))
  (is (= "V" (roman 5)))
  (is (= "VI" (roman 6)))
  (is (= "IX" (roman 9)))
  (is (= "X" (roman 10)))
  (is (= "XI" (roman 11)))
  (is (= "XIV" (roman 14)))
  (is (= "XV" (roman 15)))
  (is (= "XIX" (roman 19)))
  (is (= "XL" (roman 40)))
  (is (= "LIX" (roman 59)))
  (is (= "Numbers above 89 are not supported" (roman 90))))

