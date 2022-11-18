(ns policy-tool.app.core
  (:require [reagent.dom :as rdom]))

(defn mainlayout []
 [:div.row
 [:div.col]
 [:div.col
 [:h1 "Policy Generator"]
 [:h2 "L2 heading style"]]
 [:div.col
 [:p "A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog. A quick brown fox jumped over the lazy doooog."]]
 [:div.col]])

(defn app []
 [mainlayout])

(defn render []
  (rdom/render [app] (.getElementById js/document "root")))

(defn ^:export main []
  (render))

(defn ^:dev/after-load reload! []
  (render))
