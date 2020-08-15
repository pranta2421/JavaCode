package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Label mylabel;
    private TextField field;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button button=new Button("Click!");
        mylabel=new Label();
        mylabel.setText("This is my label");
        field=new TextField();
        field.setPromptText("Enter name");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked");
                button.setText("Yes! Clicked");
               // mylabel.setText("Clicked by someone");
                String name;
                name=field.getText();
                mylabel.setText(name);
            }
        });
        FlowPane pane=new FlowPane(10,10);
        pane.setAlignment(Pos.CENTER);
       // StackPane pane=new StackPane();
        //another way if more then one element then add manually like the next line
        pane.getChildren().add(button);
        pane.getChildren().add(mylabel);
        pane.getChildren().add(field);
        Scene scene=new Scene(pane,200,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FX App");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
