package com.example.demojava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private StackPane contentArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("home.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);

        } catch (IOException ex) {
            //Logger.getLogger(HelloController.class.getName()).log(Level.SERVE, null, ex));
        }
    }

    public void closeApp() {
        System.exit(0);
    }

    public void homeButtonAction() throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("Home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

    }

    public void teams() throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("Teams.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

    }
    public void page2ButtonAction() throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("Gameplan.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);

    }


}


