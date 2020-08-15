package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXListCell;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Database.Dbhandler;
import sample.model.Task;

public class CellController extends JFXListCell<Task> {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootanchorpane;

    @FXML
    private ImageView iconimage;

    @FXML
    private Label celltasklabel;

    @FXML
    private Label celltaskdescription;

    @FXML
    private Label celldatecreated;

    @FXML
    private ImageView celldeletebutton;
    @FXML
    private ImageView cellupdatebutton;

    FXMLLoader loader;

    @FXML
    void initialize() {


    }

    @Override
    public void updateItem(Task task, boolean empty) {
        super.updateItem(task, empty);
        if (empty || task==null){
            setText(null);
            setGraphic(null);
        }else {
            if (loader == null) {
                loader=new FXMLLoader(getClass().getResource("/sample/view/cell.fxml"));
               loader.setController(this);



                try {
                    loader.load();

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


            celltasklabel.setText(task.getTask());
            celldatecreated.setText(task.getDatecreated().toString());
            celltaskdescription.setText(task.getDescription());
            cellupdatebutton.setOnMouseClicked(event -> {
                loader=new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/updatecell.fxml"));
                try {
                  loader.load();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                UpdateCellController updateCellController=loader.getController();
                updateCellController.setUpdatetaskfield(task.getTask());
                updateCellController.setUpdatetaskdescriptionfield(task.getDescription());

                updateCellController.updatebutton.setOnMouseClicked(event1 -> {
                    Calendar calendar = Calendar.getInstance();

                    java.sql.Timestamp timestamp =
                            new java.sql.Timestamp(calendar.getTimeInMillis());
                    Dbhandler dbhandler=new Dbhandler();
                    try {
                        dbhandler.updatecell(timestamp,updateCellController.getUpdatetaskdescriptionfield(),updateCellController.getUpdatetaskfield(),task.getTaskid());
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });
                Parent root=loader.getRoot();
                Stage stage=new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });
            celldeletebutton.setOnMouseClicked(event -> {
                Dbhandler dbhandler=new Dbhandler();
                int taskid=task.getTaskid();
                try {
                    dbhandler.deletecell(LoginController.UserId,taskid);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                getListView().getItems().remove(getItem());
            });

            setText(null);
            setGraphic(rootanchorpane);
        }
    }
}
