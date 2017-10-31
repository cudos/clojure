(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little tea pot!"))


(println "Cleanliness is next to godliness!")


"Lord Voldemort"
"\"He who must not be named\""

(def name "Chewbaca")
(str "\"Uggllggllggllggllglglglgl\" - " name)


;; An empty map
{}

;; A map with some entries
{:first-name: "Charlie"
 :last-name: "McFishwich"}

;; Associate a string key with an operator
{"string-key" +}

;; Maps can be nested
{:name {:first "John" :middle "Carol" :last "Smith"}}

;; Create a map with the hash-map function
(hash-map :a 1 :b 2)

;; Look up values with get
(get {:a 0 :b 1} :b)

;; Set a default value when key does not exist in map
(get {:a 0 :b 1} :c "unicorn?")

;; Get value in nested map
(get-in {:a 0 :b {:c 2}} [:b :c])

;; Keyword as a function to get value from map
(:a {:a 0 :b 1})

;; Provide a default value as with get
(:c {:a 0 :b 1} 2)

;; A vector literal
[3 2 1]

;; Get element from a vector
(get [3 2 1] 0)

;; Get element from mixed vector
(get [1 {:a 2} 3], 1)

;; Create vector with vector function
(vector "creepy" "full" "moon")

;; Add elements to a vector
(conj [1 2 3] 4)

;; Create a list
'(1 2 3 4)

;; Retrieve an element from a list
(nth '(:a :b :c) 0)

(nth '(:a :b :c) 2)

;; Create a list with the list function
(list 1 "two" {3 4})

;; Elements are added to the beginning
(conj '(1 2 3) 4)

;; Create a hash set
#{"kurt vonnegut" 20 :icicle}

;; Use hash-set function to create hash set
(hash-set 1 1 2 2 )

;; Insert already existing element into hash set
(conj #{:a :b} :b)

;; Use the set function to create hash sets from lists or vectors
(set [1 1 1 2 2 3 3 3])

;; Use contains? function to check existance
(contains? #{:a :b} :a)

(contains? #{:a :b} 3)

(contains? #{nil} nil)

;; Use keyword to access set element
(:a #{:a :b})

;; Note that get always returns nil when accessing set with get
(get #{:a nil} nil)
(get #{:a :b} nil)

;; Some function calls
(+ 1 2 3 4)
(* 1 2 3 4)
(first [1 2 3 4])

;; Function call that returns the + operator
(or + -)

;; Do something interesting with that
((or + -) 1 2 3)

;; Something more complex
((and (= 1 1) +) 1 2 3)

((first [+ 1]) 1 2 3)

;; Not valid function calls, numbers and strings aren't functions
(1 2 3 4)
("string" 2 3 4)

;; Function with function as argument
(map inc [1 2 3 4])

;; Define a function
(defn too-enthusiastic
  "Return a cheer that might be too enthusiastic"
  [name]
  (str "OH MY GOD! " name " YOU ARE MOST ... "
       "MORE AWE..."))

(too-enthusiastic "Zelda")

;; arity overloading
(defn multi-arity
  ;; 3-arity arguments and body
  ([first-arg second-arg third-arg]
   (do-things first-arg second-arg third-arg))
  ;; 2-arity arguments and body
  ([first-arg second-arg]
   (do-things first-arg second-arg))
  ;; 1-arity arguments and body
  ([first-arg]
   (do-things first-arg)))


;; Variable list of parameters
(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The incredible Hulk")

;; Combine normal parameters with rest parameters
(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

;; Find with regular expression
(re-find #"^left-" "left-eye")

(re-find #"^left-" "cleft-chin")
   
