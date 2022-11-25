(ns policy-tool.app.core
  (:require [reagent.dom :as rdom]
            [reagent.core :as r]
            [file-saver :as fs]))

(def download-me (new js/Blob ["Hello wurld"] ["text/plain"]))

(fs/saveAs download-me "hw.txt")

(defn download-button []
  [:div
   [:input {:type "button" :value "press me"
            :on-click}]])

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
