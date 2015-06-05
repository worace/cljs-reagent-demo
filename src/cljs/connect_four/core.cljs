(ns connect-four.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent.session :as session]
              [secretary.core :as secretary :include-macros true]
              [goog.events :as events]
              [goog.history.EventType :as EventType])
    (:import goog.History))

;; -------------------------
;; Views

(enable-console-print!)

(println "DOING SUTFFF")
(defn home-page [grid]
  [:div [:h2 "Pizza"]
   [:div [:a {:href "#/about"} "go to about page"]]])


(defn generate-grid []
  (for [x (range 0 4) y (range 0 4)] [x y])
  )

(def grid (atom (generate-grid)))

(defn grid-view [grid]
  [:ul (map cell grid)])

(defn cell [coords]
  (println coords)
  [:li [:span (interpose ", " coords)]])

(defn init! []
  (println "hello")
  (reagent/render [grid-view @grid] (.getElementById js/document "app")))

(println "HIIII")
