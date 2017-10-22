(ns fizz-buzz.core
  (:gen-class))


(defn get-fizz-buzz-numbers
  "Return numbers from 1 to 100. Some numbers are \"translated\":
  * Multiples of 3: return \"Fizz\"
  * Multiples of 5: return \"Buzz\"
  * Multiples of 3 and 5: return \"FizzBuzz\""
  []
  (map (fn [x]
         (cond
           (and (= (mod x 3) 0) (= (mod x 5) 0)) "FizzBuzz"
           (= (mod x 3) 0) "Fizz"
           (= (mod x 5) 0) "Buzz"
           :else x)) (range 1 101)))


(defn -main
  "Print numbers from 1 to 100. Some numbers are \"translated\":
  * Multiples of 3: return \"Fizz\"
  * Multiples of 5: return \"Buzz\"
  * Multiples of 3 and 5: return \"FizzBuzz\""
  [& args]
  (run! println (get-fizz-buzz-numbers)))
