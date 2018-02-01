(defproject space-invader "0.0.1-SNAPSHOT"
  :description "Space Invader Game"
  
  :dependencies [[com.badlogicgames.gdx/gdx "1.9.6"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.9.6"]
                 [com.badlogicgames.gdx/gdx-box2d "1.9.6"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.9.6"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.9.6"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.9.6"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.9.6"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.9.0"]
                 [play-clj "1.1.1"]]
  
  :source-paths ["src" "src-common"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  :aot [space-invader.core.desktop-launcher]
  :main space-invader.core.desktop-launcher)
