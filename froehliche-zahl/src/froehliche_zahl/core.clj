(ns froehliche-zahl.core
  (:gen-class))


(defn number-to-seq [number]
  (map read-string (map str (seq (str number))))
)


(defn is-froehlich?
  [number-seq]
  (cond
    (and (= (count number-seq) 1) (= (first number-seq) 1)) true
    (and (= (count number-seq) 1) (not= (first number-seq) 1)) false
    :else (is-froehlich? (number-to-seq (reduce + (map #(* % %) number-seq))))))


(defn -main
  "Erkenne, ob eine Zahl froehlich ist.
  
  Eine Fröhliche Zahl ist eine Zahl, bei der die Summe der Quadrate ihrer Ziffern „auf die Dauer“ 1 ergibt."
  [& args]
  (println (is-froehlich? (number-to-seq (first (vec args)))))
)
