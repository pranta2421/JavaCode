package sample.controller;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpeningController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton OpeningButton;

    @FXML
    void initialize() {
        OpeningButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                UserDetails();
            }
        });

    }

    private void UserDetails(){
        OpeningButton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        Stage UserDetailsStage=new Stage();
        loader.setLocation(getClass().getResource("/sample/view/UserDetails.fxml"));
        try {
            Parent root=loader.load();
            UserDetailsStage.setScene(new Scene(root));
            UserDetailsStage.show();
            UserDetailsStage.setResizable(false);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
