(defn entero? [x]  (and (number? x)       (== x (Math/floor x))))
(defn div10[x](/ x 10))
(defn sig-mul-10 [a] (if (= a 0) 1 (if (= (entero? (div10 a)) true) a (sig-mul-10 (+ a 1)) ) ) )