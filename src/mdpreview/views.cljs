(ns mdpreview.views
  (:require [mdpreview.state :refer [app-state]]
            [mdpreview.events :refer [update-preview, clear-textarea]]
            ["react-markdown" :as ReactMarkdown]))

(defn header
  []
  [:div
   [:h1.f1.dark-blue.tc.ma3 "Markdown Preview"]])

(defn textarea
  []
  (let [text (:value @app-state)]
    [:div.flex.center.justify-center
     [:textarea.fl.w-90.h5.ma3.pa2.br3.b--black-20.outline-0.
      {:placeholder text
       :label "markdown input"
       :html-for "markdown input"
       :value text
       :on-focus #(clear-textarea %)
       :on-change #(update-preview %)}]]))

(defn preview
  []
  [:div.flex.center.justify-center
   [:div.fl.w-90.br3.ma3.pa2
    [:> ReactMarkdown {:source (:value @app-state)}]]])


(defn app []
  [:div
   [header]
   [textarea]
   [preview]])
