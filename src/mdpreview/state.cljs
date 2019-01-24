(ns mdpreview.state
  (:require [reagent.core :refer [atom]]))

(def inital-value
  "## Welcome to this Reagent/Clojurescript Markdown Previewer!
   Type in some markdown, e.g. in *italic*.
   
   
   ### Documentation and more info is available **[here](https://github.com/sophiabrandt/markdown-preview)**.
  ")


(def app-state (atom {:value inital-value}))
