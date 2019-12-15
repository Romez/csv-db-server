(ns client.core
  (:import [java.net Socket InetSocketAddress])
  (:require [clojure.java.io :as io])
  (:gen-class))

(defn -main [& args]
  ; (let [sock-addr (InetSocketAddress. "server" 9997)
  ;      client-sock (doto (ServerSocket))] 
  ;   )
  ; (let [sock-addr (InetSocketAddress. nil port)
  ;       (println sock-addr))
  ; (with-open [sock (Socket. "server" 9997)
  ;             writer (io/writer sock)]
  ;   (.append writer "select student"))
  (println (.isReachable (java.net.InetAddress/getByName "server") 5000))

  (println "Hello, World!"))
