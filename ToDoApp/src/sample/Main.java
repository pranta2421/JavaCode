package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Database.Dbhandler;
import sample.controller.AddItemController;
import sample.controller.AddItemFormController;
import sample.model.Task;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        primaryStage.setTitle("2DO");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        launch(args);



//        Dbhandler dbhandler=new Dbhandler();
//        dbhandler.getConnection();
//        System.out.println("connected to "+dbhandler.getConnection().getCatalog());
    }
}