(ns mdpreview.state
  (:require [reagent.core :refer [atom]]))

(def inital-value
  "## Welcome to Markdown Preview!
Type in some [Markdown text](https://daringfireball.net/projects/markdown/), e.g. in *italic*.

#### About this site

> Markdown Preview was built with Clojurescript and Reagent.

Documentation and more info for this site is available **[HERE](https://github.com/sophiabrandt/markdown-preview)**.
")

(defonce app-state (atom {:value inital-value}))
