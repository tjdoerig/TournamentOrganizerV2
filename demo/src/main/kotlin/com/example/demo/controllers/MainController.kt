package com.example.demo.controllers

//import com.example.demo.controllers.ftp.client.FtpController
import com.example.demo.MainApplication
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.Pane


open class MainController {

    @FXML
    private var btnOverview: Button? = null

    @FXML
    private var btnTeams: Button? = null

    @FXML
    private var btnGameplan: Button? = null

    @FXML
    private var btnTournament: Button? = null

    @FXML
    private var btnSettings: Button? = null

    @FXML
    private var pnlOverview: Pane? = null

    @FXML
    private var pnlSettings: Pane? = null

class SceneController {
    private lateinit var navigationCallback: (String) -> Unit

    fun setNavigationCallback(callback: (String) -> Unit) {
        navigationCallback = callback
    }

    fun navigateToScene(fxmlFile: String) {
        navigationCallback.invoke(fxmlFile)
    }
}


@FXML
    private fun handleClicks(){
        btnOverview?.setOnAction { event ->
            /*pnlSettings?.style = "-fx-background-color: #1620A1"
            pnlOverview?.toFront()*/
            val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("MainView.fxml"))
            val scene = Scene(fxmlLoader.load(), 320.0, 240.0)

        }
        btnSettings?.setOnAction { event ->
            /*pnlSettings?.style = "-fx-background-color: #464F67"
            pnlSettings?.toFront()*/
            val fxmlLoader = FXMLLoader(MainApplication::class.java.getResource("Settings.fxml"))
            val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        }
    }
}