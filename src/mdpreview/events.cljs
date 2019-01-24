(ns mdpreview.events
  (:require [mdpreview.state :refer [app-state]]))

(defn update-preview [event]
  (.preventDefault event)
  (swap! app-state assoc :value (.. event -target -value)))

(defn clear-textarea [event]
  (.preventDefault event)
  (reset! app-state nil))
