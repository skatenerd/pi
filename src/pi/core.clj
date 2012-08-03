(ns pi.core)

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))

(defn continued-fraction [iterations denom]
  (if (pos? iterations)
    (let [squared-term
          (* (+ 1 (* 2 iterations))
             (+ 1 (* 2 iterations)))
          new-denom
          (+ 6 
             (/ squared-term
                denom))]
      (recur (dec iterations) new-denom))
    (/ 1 denom)))

(defn pi [iterations]
  (+ 3 (continued-fraction iterations 6)))
