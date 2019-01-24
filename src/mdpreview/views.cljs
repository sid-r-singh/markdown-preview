(ns mdpreview.views
  (:require [mdpreview.state :refer [app-state]]
            [mdpreview.events :refer [increment decrement]]))

(defn header
  []
  [:div
   [:h1 "A template for reagent apps"]])

(defn counter
  []
  [:div
   [:button.btn {:on-click #(decrement %)} "-"]
   [:button {:disabled true} (get @app-state :count)]
   [:button.btn {:on-click #(increment %)} "+"]])

(defn app []
  [:div
   [header]
   [counter]])
