package sample;

import javafx.application.Application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;




public class Main extends Application implements EventHandler {
    private Label mylabel;
    private CheckBox banana;
    private CheckBox orange;
    private CheckBox mango;
    private CheckBox grape;
    private Label response;
    private Label selected;
    private String fruits;
    @Override
    public void start(Stage primaryStage) throws Exception{
        mylabel=new Label();
        mylabel.setText("What is your favourite fruit");
        banana=new CheckBox("Banana");
        orange=new CheckBox("Orange");
        mango=new CheckBox("Mango");
        grape=new CheckBox("Grape");
        banana.setOnAction(this);
        orange.setOnAction(this);
        mango.setOnAction(this);
        grape.setOnAction(this);
        response=new Label("");
        selected=new Label("");


        FlowPane pane=new FlowPane(Orientation.VERTICAL,5,5);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(mylabel);
        pane.getChildren().addAll(banana,orange,mango,grape,response,selected);
        Scene scene=new Scene(pane,500,600);
        primaryStage.setTitle("Fruit App");
        primaryStage.setScene(scene);
        primaryStage.show();
        showall();


    }

     void showall(){
        fruits="";
        if (banana.isSelected()) fruits=" Banana";
        if (orange.isSelected()) fruits+=" Orange";
        if (mango.isSelected())  fruits+=" Mango";
        if (grape.isSelected())  fruits+=" Grape";
        selected.setText("Selected fruit is: "+fruits);

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        Object o=event.getSource();
        if (orange.equals(o)){
            if (orange.isSelected()){
                response.setText("Response is Orange");
            }else response.setText("Orange Cleared");
            showall();
        }
        if (banana.equals(o)) {
            if (banana.isSelected()) {
                response.setText("Banana is the response");
            } else response.setText("Banana Cleared");
            showall();
        }
        if (mango.equals(o)) {
            if (mango.isSelected()) {
                response.setText("Mango is the response");
            } else response.setText("Mango Cleared");
            showall();
        }
        if (grape.equals(o)) {
            if (grape.isSelected()) {
                response.setText("Grape is the response");
            } else response.setText("Grape Cleared");
            showall();
        }
    }
}
