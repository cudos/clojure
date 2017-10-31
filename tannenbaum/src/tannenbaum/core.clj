(ns tannenbaum.core
  (:gen-class))


(defn get-tannenbaum [num-of-rows]
  ;; List [num-of-rows - 1, num-of-rows - 2, ..., 0]
  (def num-of-leading-spaces (range (- num-of-rows 1) -1 -1))
  (def leading-spaces (map #(take % (repeat " ")) num-of-leading-spaces))
  (def treetop-X (map #(take % (repeat "X")) (range 1 (* 2 num-of-rows) 2)))  
  (def tree (vec (map #(concat %1 %2) leading-spaces treetop-X)))
  (def treetrunk (into '("|") (seq (take (- num-of-rows 1) (repeat " ")))))
  (def tree (conj tree treetrunk))
  (map clojure.string/join  tree))


(defn -main
  "Print Tannenbaum with given height."
  [& args]
  (run! println (get-tannenbaum (read-string (first args))))
  )
