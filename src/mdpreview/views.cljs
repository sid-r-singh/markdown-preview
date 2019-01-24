(ns mdpreview.views
  (:require [mdpreview.state :refer [app-state]]
            [mdpreview.events :refer [update-preview]]
            ["react-markdown" :as ReactMarkdown]))

(def placeholder
  "")

(defn header
  []
  [:div.tc.ma3
   [:h1.f1.dark-blue "Markdown Preview"]])

(defn textarea
  []
  (let [text (:value @app-state)]
    [:div.flex.center.justify-center.
     [:textarea.fl.w-90.h5.ma3.pa2.br3.b--black-20.outline-0
      {:placeholder text
       :value text
       :on-change #(update-preview %)}]]))

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