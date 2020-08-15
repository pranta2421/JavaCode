package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

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

public class UserDetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField UserName;

    @FXML
    private JFXTextField UserEmailAddress;

    @FXML
    private JFXTextField UserMobileNumber;

    @FXML
    private JFXButton ConfirmButton;

    @FXML
    void initialize() {
        UserName.setStyle("-fx-text-inner-color:White");
        UserEmailAddress.setStyle("-fx-text-inner-color:White");
        UserMobileNumber.setStyle("-fx-text-inner-color:White");
        ConfirmButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Valid();
            }
        });

    }

    private void Valid() {
        ConfirmButton.getScene().getWindow().hide();
        if (!UserName.getText().toString().trim().equals("")&&!UserEmailAddress.getText().toString().trim().equals("")&&!UserMobileNumber.getText().toString().trim().equals("")) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/BookingConfirmation.fxml"));
            Stage ConfirmationStage=new Stage();
            try {
                Parent root=loader.load();
                BookingConfirmationController bookingConfirmationController=loader.getController();
                bookingConfirmationController.setname(UserName.getText(),UserEmailAddress.getText());
                ConfirmationStage.setScene(new Scene(root));
                ConfirmationStage.show();
                ConfirmationStage.setResizable(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
