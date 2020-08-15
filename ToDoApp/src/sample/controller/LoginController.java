package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.cj.xdevapi.AddResult;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Database.Dbhandler;
import sample.animations.Shaker;
import sample.model.User;

public class LoginController {
    public static int UserId;
    public static String name;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField loginusername;

    @FXML
    private JFXPasswordField loginpassword;

    @FXML
    private JFXButton loginbutton;

    @FXML
    private JFXButton loginsignupbutton;

    @FXML
    void initialize() {


        loginsignupbutton.setOnAction(event -> {
            loginsignupbutton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/signup.fxml"));
            try {
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        loginbutton.setOnAction(event -> {
            loginuser();
        });


    }

    private void loginuser() {
        String username=loginusername.getText().trim();
        String password=loginpassword.getText().trim();
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        Dbhandler dbhandler=new Dbhandler();
        ResultSet  resultSet=dbhandler.getloginuser(user);

        int count=0;
        try {
            while(resultSet.next()){
                count++;

                name=resultSet.getString("firstname");
                System.out.println("Welcome "+name);
                LoginController.UserId=resultSet.getInt("userid");




            }
            if (count==1){
                additempage();
                System.out.println("login successful!");
            }else {
                System.out.println("Invalid Credentials!");
                Shaker usernameshaker=new Shaker(loginusername);
                usernameshaker.shake();
                Shaker passwordshaker=new Shaker(loginpassword);
                passwordshaker.shake();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public void additempage(){
        loginbutton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/view/additem.fxml"));
        try {
            Parent root=loader.load();
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            /**
             * to add in task table if public static is not used
             */



//           AddItemController addItemController=loader.getController();
//            addItemController.setUserName(name);

            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
