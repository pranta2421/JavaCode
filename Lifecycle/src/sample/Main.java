package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Start begins");
        primaryStage.setTitle("Life Cycle");
        FlowPane root=new FlowPane(5.0,5.0);
        root.setAlignment(Pos.CENTER);
        Scene scene=new Scene(root,700,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init Begins");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop invoked");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
