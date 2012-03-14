(ns anagram
  (:use clojure.test))

(def words
  '("elvis" "lives"
    "auctioned" "cautioned" "education"
    "countries" "cretinous" "neurotics"
    "cratering" "retracing" "terracing"
    "emigrants" "mastering" "streaming"
    "estranges" "greatness" "sergeants"
    "gnarliest" "integrals" "triangles"
    "mutilates" "stimulate" "ultimates"
    "reprising" "respiring" "springier"))

(with-test
  (defn anagram? [a b]
    (= (sort a) (sort b)))

  (is (anagram? "foo" "oof"))
  (is (anagram? "bar" "rba"))
  (is (false? (anagram? "foo" "bar"))))

(with-test
  (defn anagrams [word]
    (filter #(anagram? % word) words))

  (is (= () (anagrams "blerk")))
  (is (= '("elvis" "lives") (anagrams "lives")))
  (is (= '("gnarliest" "integrals" "triangles") (anagrams "integrals")))
  (is (= '("cratering" "retracing" "terracing") (anagrams "cratering"))))
