package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import sample.Database.Dbhandler;
import sample.model.Task;

public class UpdateCellController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField updatetaskfield;

    @FXML
    private JFXTextField updatetaskdescriptionfield;

    @FXML
    public JFXButton updatebutton;

    @FXML
    void initialize() {
//        updatebutton.setOnMouseClicked(event -> {
//            Task task=new Task();
//            Calendar calendar = Calendar.getInstance();
//
//            java.sql.Timestamp timestamp =
//                    new java.sql.Timestamp(calendar.getTimeInMillis());
//            Dbhandler dbhandler=new Dbhandler();
//            try {
//                dbhandler.updatecell(timestamp,getUpdatetaskdescriptionfield(),getUpdatetaskfield(),task.getTaskid());
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        });



    }



    public String getUpdatetaskfield() {
        return updatetaskfield.getText().trim();
    }

    public void setUpdatetaskfield(String updatetaskfield) {
        this.updatetaskfield.setText(updatetaskfield);
    }

    public String getUpdatetaskdescriptionfield() {
        return updatetaskdescriptionfield.getText().trim();
    }

    public void setUpdatetaskdescriptionfield(String updatetaskdescriptionfield) {
        this.updatetaskdescriptionfield.setText(updatetaskdescriptionfield);
    }
}
