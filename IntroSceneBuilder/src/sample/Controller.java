package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button ClickMeButton;

    @FXML
    private Label Mylabel;

    @FXML
    private JFXButton MaterialButton;

    @FXML
    private JFXTextField TextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        MaterialButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked!");
                String text=TextField.getText();
                Mylabel.setText(text);
            }
        });

    }
}
