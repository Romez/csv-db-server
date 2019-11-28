(ns task02.test-call)

(gen-class
  :name task02.Hello
  :methods [^:static [hello [String] void]])

(defn- -hello [s] (println s))
