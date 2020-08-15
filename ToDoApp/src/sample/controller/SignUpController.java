package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Database.Dbhandler;
import sample.model.User;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField signupusername;

    @FXML
    private JFXTextField signupfirstname;

    @FXML
    private JFXTextField signuplastname;

    @FXML
    private JFXPasswordField signuppassword;

    @FXML
    private JFXCheckBox signupcheckboxmale;

    @FXML
    private JFXCheckBox signupcheckboxfemale;

    @FXML
    private JFXTextField signuplocation;

    @FXML
    private JFXButton signupbutton;

    @FXML
    void initialize() {
        Dbhandler dbhandler=new Dbhandler();

        signupbutton.setOnAction(event -> {

            try {
                createuser();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            signupbutton.getScene().getWindow().hide();
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/login.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
//            try {
//                dbhandler.signupuser(signupusername.getText(),signupfirstname.getText(),signuplastname.getText(),
//                        signuppassword.getText(),signuplocation.getText(),"male");
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }


        });


    }

    private void createuser() throws SQLException, ClassNotFoundException {
        Dbhandler dbhandler=new Dbhandler();
        String username=signupusername.getText();
        String firstname=signupfirstname.getText();
        String lastname=signuplastname.getText();
        String password=signuppassword.getText();
        String location=signuplocation.getText();
        String gender;
        if (signupcheckboxfemale.isSelected()){
            gender="female";
        }else{
            gender="male";
        }
        User user=new User(username,firstname,lastname,password,location,gender);
        dbhandler.signupuser(user);
    }
}
