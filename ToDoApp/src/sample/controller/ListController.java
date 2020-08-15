package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListCell;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import sample.Database.Dbhandler;
import sample.model.Task;

public class ListController {
    private ResultSet resultSet;

    @FXML
    private ResourceBundle resources;

    @FXML
    private ImageView listrefreshbutton;

    @FXML
    private URL location;

    @FXML
    private AnchorPane additemformtitle;

    @FXML
    private JFXListView<Task> listlistview;

    @FXML
    private JFXTextField listtaskfield;

    @FXML
    private JFXTextField listdescriptionfield;

    @FXML
    private JFXButton listsavetaskbutton;

   private ObservableList<Task> list;
    private ObservableList<Task> refreshlist;


    @FXML
    void initialize() {
        Dbhandler dbhandler = new Dbhandler();

        list=FXCollections.observableArrayList();

         resultSet=dbhandler.getalltaskbyuserid(LoginController.UserId);


        try {
            while (resultSet.next()) {
                Task task=new Task();
                task.setTaskid(resultSet.getInt("taskid"));
                task.setTask(resultSet.getString("task"));
                task.setDescription(resultSet.getString("description"));
                task.setDatecreated(resultSet.getTimestamp("datecreated"));
                list.addAll(task);


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        listlistview.setItems(list);
        listlistview.setCellFactory(CellController->new CellController());

        listsavetaskbutton.setOnAction(event -> {
            addtask();
        });
        listrefreshbutton.setOnMouseClicked(event -> {
            refreshtask();
        });

    }

    private void refreshtask() {
        Dbhandler dbhandler = new Dbhandler();

        refreshlist=FXCollections.observableArrayList();

        resultSet=dbhandler.getalltaskbyuserid(LoginController.UserId);


        try {
            while (resultSet.next()) {
                Task task=new Task();
                task.setTaskid(resultSet.getInt("taskid"));
                task.setTask(resultSet.getString("task"));
                task.setDescription(resultSet.getString("description"));
                task.setDatecreated(resultSet.getTimestamp("datecreated"));
                refreshlist.addAll(task);


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        listlistview.setItems(refreshlist);
        listlistview.setCellFactory(CellController->new CellController());

    }

    private void addtask() {
        if (!listtaskfield.getText().equals("")||!listdescriptionfield.getText().equals("")){
            Task newtask=new Task();
            newtask.setTask(listtaskfield.getText().trim());
            newtask.setDescription(listdescriptionfield.getText().trim());
            newtask.setUserid(LoginController.UserId);
            java.sql.Timestamp timestamp=new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());
            newtask.setDatecreated(timestamp);

            Dbhandler dbhandler=new Dbhandler();
            dbhandler.inserttask(newtask);

            listtaskfield.setText("");
            listdescriptionfield.setText("");
            initialize();
        }
    }


//
//    static class JFXCell extends JFXListCell<String>{
//        HBox hBox=new HBox();
//        Label task=new Label();
//        Button button=new Button("Hello");
//        Pane pane=new Pane();
//        Image iconimg=new Image("/sample/assets/additem.png");
//        ImageView imageView=new ImageView(iconimg);
//
//        public JFXCell() {
//            super();
//
//            hBox.getChildren().addAll(task,button);
//            hBox.setHgrow(pane, Priority.ALWAYS);
//
//
//        }
//        public void updateItem(String taskname,boolean empty){
//            super.updateItem(taskname,empty);
//            setText(null);
//            setGraphic(null);
//
//            if (taskname!=null|| !empty){
//                task.setText(taskname);
//                setGraphic(hBox);
//            }
//        }
//
//    }
}
