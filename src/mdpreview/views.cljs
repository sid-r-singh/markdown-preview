(ns mdpreview.views
  (:require [mdpreview.state :refer [app-state]]
            [mdpreview.events :refer [update-preview]]
            ["react-markdown" :as ReactMarkdown]))

(def placeholder
  "")

(defn header
  []
  [:div
   [:h1 "Markdown Preview"]])

(defn textarea
  []
  [:div
   [:textarea {:placeholder (:value @app-state)
               :value (:value @app-state)
               :on-change #(update-preview %)}]])

(defn preview
  []
  [:> ReactMarkdown {:source (:value @app-state)}])

(defn app []
  [:div
   [header]
   [textarea]
   [preview]])
