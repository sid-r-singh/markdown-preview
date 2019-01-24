(ns mdpreview.state
  (:require [reagent.core :refer [atom]]))

(def inital-value
  "## Welcome to my Reagent/Clojurescript Markdown Previewer!
   Write some markdown, e.g. in **bold**.
  ")


(defonce app-state (atom {:value inital-value}))
