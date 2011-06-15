;; -*- indent-tabs-mode: nil -*-

(ns midje.t-fact-table
  (:use [midje.sweet])
  (:use [midje.test-util]))

(fact-table
   (+ 1 1) => 2)


(fact-table
 (+ ?a ?b) => ?result 
 ?a    ?b      ?result
  1     2       3)


;; (fact-table
;;  "This is some commentary"
;;  (+ ?a ?b) => ?result 
;;  ?a    ?b      ?result
;;   1     2       4)


(future-fact "production mode for fact-table")
(future-fact "future-fact-table")