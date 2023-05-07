package com.example.demo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage
import javafx.stage.StageStyle

class MainApplication : Application() {
   override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("MainView.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        stage.title = "Tournament Organizer"
        stage.scene = scene
        stage.show()

       root.set
    }

}

fun main() {
    Application.launch(MainApplication::class.java)
}
