package com.example.demo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class MainApplication : Application() {
   /* override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("MainView.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }*/
    private lateinit var primaryStage: Stage
    private lateinit var mainScene: Scene

    override fun start(primaryStage: Stage) {
        this.primaryStage = primaryStage

        val initialFXML = "MainView.fxml"
        navigateToScene(initialFXML)

        primaryStage.title = "Single Page Application"
        primaryStage.show()
    }

    private fun navigateToScene(fxmlFile: String) {
        val fxmlLoader = FXMLLoader()
        val fxmlUrl = javaClass.getResource(fxmlFile)
        fxmlLoader.location = fxmlUrl

        val sceneLayout = fxmlLoader.load<Pane>()
        val sceneController = fxmlLoader.getController<SceneController>()

        sceneController.setNavigationCallback { fxmlFile ->
            navigateToScene(fxmlFile)
        }

        mainScene = Scene(sceneLayout)
        primaryStage.scene = mainScene
    }

}

fun main() {
    Application.launch(MainApplication::class.java)
}

class SceneController {
    private lateinit var navigationCallback: (String) -> Unit

    fun setNavigationCallback(callback: (String) -> Unit) {
        navigationCallback = callback
    }

    fun navigateToScene(fxmlFile: String) {
        navigationCallback.invoke(fxmlFile)
    }
}