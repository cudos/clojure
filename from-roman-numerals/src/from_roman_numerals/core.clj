(ns from-roman-numerals.core
  (:gen-class))


(defn from-roman-numeral
  [numeral]
  (reduce (fn [result numeral-letter]
            (+ result (cond
                        (= numeral-letter \I) 1
                        (= numeral-letter \V) 5
                        (= numeral-letter \X) 10
                        (= numeral-letter \L) 50
                        (= numeral-letter \C) 100
                        (= numeral-letter \D) 500
                        (= numeral-letter \M) 1000
                        :else 0
                        )))
          0
          (seq numeral)))


(defn from-roman-numerals
  [numerals]
  (map from-roman-numeral numerals))


(defn -main
  "Gebe Römische Zahlen in Dezimalzahlen aus."
  [& args]
  (do
    (run! println (from-roman-numerals args))))
