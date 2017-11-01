(ns zeichen-zaehlen.core
  (:gen-class))


(defn -main
  "Anzahl der in einem String vorkommenden Zeichen."
  [& args]
  (print "Zeichenanzahlen: ") (println (frequencies (seq (first args)))))
