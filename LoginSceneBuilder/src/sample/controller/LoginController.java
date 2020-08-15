package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField LoginUserName;

    @FXML
    private JFXPasswordField LoginPassword;

    @FXML
    private JFXButton LoginButton;

    @FXML
    void initialize() {
        LoginUserName.setStyle("-fx-text-inner-color: #a0a2ab");
        LoginPassword.setStyle("-fx-text-inner-color: #a0a2ab");
        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               // System.out.println("Login Button was clicked");
                loginuser();
            }
        });

    }
    private void loginuser(){
        LoginButton.getScene().getWindow().hide();
        if (!LoginUserName.getText().toString().trim().equals("")&&!LoginPassword.getText().toString().trim().equals("")){
           FXMLLoader loader=new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/view/Details.fxml"));
            Stage stage=new Stage();
            try {
                Parent root=loader.load();
                stage.setScene(new Scene(root));
                stage.setResizable(false);

            }catch (Exception e){
                e.printStackTrace();
            }
//            loader.setLocation(getClass().getResource("/sample/view/Details.fxml"));
//            try {
//                loader.load();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
            DetailsController detailsController=loader.getController();
            detailsController.setname(LoginUserName.getText(), "Student",26);
            stage.show();






        }
    }
}
