;;; Ejercicio 2
;;Definir la función segundos que reciba los cuatro valores (días, horas, minutos y segundos) del tiempo que dura un evento y devuelva el valor de ese tiempo expresado solamente en segundos.

; V1 (by Elias)
(defn segundos[a b c d](+ d (* 60 (+ c (* 60 (+ b (* 24 a)) )) )))

; V2 (by Fabrizio)
(defn segundos[d h m s](+ (* d 86400)(* h 3600)(* m 60) s))

; V3 (by Ignacio)
(defn days_to_sec [d] (* d 24 60 60)) 

(defn hours_to_sec [h] (* h 60 60))

(defn minutes_to_sec [m] (* m 60))

(defn segundos [d h m s] (if (or (neg? d) (neg? h) (neg? m) (neg? s)) 
                           (println "Alguno de los valores ingresados es invalido (negativo)") 
                           (+ (days_to_sec d) (hours_to_sec h) (minutes_to_sec m) s)))