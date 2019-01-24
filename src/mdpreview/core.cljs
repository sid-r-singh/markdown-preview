(ns mdpreview.core
  (:require [reagent.core :as r]
            [mdpreview.views :as views]))

(defn ^:dev/after-load start
  []
  (r/render [views/app]
            (.getElementById js/document "app")))

(defn ^:export main
  []
  (start))
