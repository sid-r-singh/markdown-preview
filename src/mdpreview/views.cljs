(ns mdpreview.views
  (:require [mdpreview.state :refer [app-state]]
            [mdpreview.events :refer [update-preview]]
            ["react-markdown" :as ReactMarkdown]))

(def placeholder
  "")

(defn header
  []
  [:div.tc.ma3
   [:h.f1 "Markdown Preview"]])

(defn textarea
  []
  [:div.flex.center.justify-center
   [:textarea.fl.w-90.h5.ma3.pa2.br3.b--black-20
    {:placeholder (:value @app-state)
     :value (:value @app-state)
     :on-change #(update-preview %)}]])

(defn preview
  []
  [:div.flex.center.justify-center
   [:div#preview.br3.ma3.pa2.bw2.fl.w-90
    [:> ReactMarkdown {:source (:value @app-state)}]]])

(defn app []
  [:div
   [header]
   [textarea]
   [preview]])