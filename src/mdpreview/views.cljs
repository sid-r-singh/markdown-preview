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
     [:label.w-90.ma3.br3.b--black-20.outline-0
      [:textarea.w-100.h5.pa2.br3
       {:placeholder text
        :value text
        :on-focus #(clear-textarea %)
        :on-change #(update-preview %)}]]]))

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
