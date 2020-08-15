package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
    private Button rotate;
    private Button blur;
    private Button scale;
    private Rotate rotation;
    private double angle;
    private BoxBlur boxBlur;
    private double blurval;
    private double scalefactor;
    private Scale scalefx;
    private Reflection reflection;




    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Transformation");
        rotate=new Button("Rotate");
        blur=new Button("Blur");
        scale=new Button("Scale");
        rotate.setOnAction(this);
        blur.setOnAction(this);
        scale.setOnAction(this);
        angle=0.0;
        blurval=1.0;
        scalefactor=0.4;
        rotation=new Rotate();
        boxBlur=new BoxBlur(1.0,1.0,1);
        scalefx=new Scale(scalefactor,scalefactor);
        reflection=new Reflection();

        Label myLabel=new Label("This is a label");
        FlowPane pane=new FlowPane(5,5);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(rotate,blur,scale,myLabel);

        Scene scene=new Scene(pane,250,250);
        primaryStage.setScene(scene);


        primaryStage.show();
        rotate.getTransforms().add(rotation);
        scale.getTransforms().add(scalefx);
       // blur.setEffect(boxBlur);
        reflection.setBottomOpacity(.3);
        reflection.setTopOpacity(.7);
        myLabel.setEffect(reflection);
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        if (event.getSource().equals(rotate)){
            angle+=15.0;
            rotation.setAngle(angle);
            rotation.setPivotX(rotate.getWidth()/2);
            rotation.setPivotY(rotate.getHeight()/2);



            System.out.println("Clicked");
        }
        if (event.getSource().equals(blur)){
            if(blurval==10.0){
                blur.setEffect(null);
                blurval=1.0;
                blur.setText("OFF");
            }else{
                blurval++;
                blur.setEffect(boxBlur);
                blur.setText("ON");
            }
            boxBlur.setWidth(blurval);
            boxBlur.setHeight(blurval);
        }
        if (event.getSource().equals(scale)){
            scalefactor+=.1;
            if (scalefactor>2.0) scalefactor=0.4;
            scalefx.setX(scalefactor);
            scalefx.setY(scalefactor);

        }

    }
}
