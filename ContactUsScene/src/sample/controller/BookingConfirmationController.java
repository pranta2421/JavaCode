package sample.controller;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class BookingConfirmationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label HiName;

    @FXML
    private Hyperlink MailHyperlink;

    @FXML
    void initialize() {
        MailHyperlink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.gmail.com"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


    }

    void setname(String name,String mail){
        HiName.setText("Hi "+name);
        MailHyperlink.setText(String.valueOf(mail));

    }
}
