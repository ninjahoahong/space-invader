(ns space-invader.core.desktop-launcher
  (:require [space-invader.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. space-invader-game "space-invader" 800 600)
  (Keyboard/enableRepeatEvents true))
