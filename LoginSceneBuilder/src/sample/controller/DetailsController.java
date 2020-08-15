package sample.controller;

import java.awt.*;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label DetailsWelcome;

    @FXML
    private Label DetailsName;

    @FXML
    private Label DetailsAge;

    @FXML
    private Label DetailsProfession;

    @FXML
    private Hyperlink Detailsmailaddress;

    @FXML
    void initialize() {
        Detailsmailaddress.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.gmail.com"));

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });


    }
    public void setname(String name, String profession, int age){
        DetailsName.setText("Name: "+name);
        DetailsWelcome.setText("Welcome "+ name);
        DetailsProfession.setText("Profession: "+profession);
        DetailsAge.setText("Age: "+ String.valueOf(age));

    }
}
