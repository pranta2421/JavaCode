package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
    private Label title;
    private Label response;
    private Label selected;
    private CheckBox bananaCB;
    private CheckBox orangeCB;
    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Favourite Fruit");
        title=new Label("What is your favourite fruit");
        response=new Label("");
        selected=new Label("");
        bananaCB=new CheckBox("Banana");
        orangeCB=new CheckBox("Orange");
        bananaCB.setOnAction(this);



        FlowPane root=new FlowPane(Orientation.VERTICAL,5,5);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(title);
        root.getChildren().add(bananaCB);
        root.getChildren().add(orangeCB);
        root.getChildren().add(response);
        root.getChildren().add(selected);

        Scene scene=new Scene(root,400,250);
        primaryStage.setScene(scene);
        primaryStage.show();
        showall();


    }
    void showall(){
        fruits="";

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        Object frittered=event.getSource();
        if (bananaCB.equals(frittered)){
            if (bananaCB.isSelected()){
                response.setText("Banana is the response");

            }else response.setText("Banana cleared");
            showall();
        }

    }
}
