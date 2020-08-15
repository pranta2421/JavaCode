package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Database.Dbhandler;
import sample.animations.Fading;
import sample.model.Task;

public class AddItemFormController {
    private int userid;
    Dbhandler dbhandler;

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane rootpane;

    @FXML
    private Label successtasktext;

    @FXML
    private JFXButton todoshowbutton;

    @FXML
    private URL location;

    @FXML
    private JFXTextField taskfield;

    @FXML
    private JFXTextField descriptionfield;
    @FXML
    private JFXButton savetaskbutton;

    @FXML
    void initialize() {

        savetaskbutton.setOnAction(event -> {
            dbhandler=new Dbhandler();

            String tasks=taskfield.getText().trim();
            String description=descriptionfield.getText().trim();
            java.sql.Timestamp timestamp=new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());








            Task task=new Task();
            if (!tasks.equals("")||!description.equals("")) {
                task.setTask(tasks);
                task.setDescription(description);
                task.setDatecreated(timestamp);
                task.setUserid(LoginController.UserId);

                dbhandler.inserttask(task);
                taskfield.setText("");
                descriptionfield.setText("");

                successtasktext.setVisible(true);
                Fading fadingsuccesstext=new Fading(successtasktext);
                fadingsuccesstext.fade();
//                int tasknumber=2;
               ResultSet set= dbhandler.getalltask(LoginController.UserId);
              try {
                  int count=0;
                  while (set.next()){
                   count=set.getInt(1);


                  }
                  todoshowbutton.setText("My 2do's: "+count);

              }catch (Exception e){
                  e.printStackTrace();
              }

                todoshowbutton.setVisible(true);

                todoshowbutton.setOnAction(event1 -> {

                    FXMLLoader loader=new FXMLLoader();
                    loader.setLocation(getClass().getResource("/sample/view/list.fxml"));



                    try {
                        Parent   root = loader.load();
                        Stage stage=new Stage();
                        stage.setScene(new Scene(root));
                        stage.showAndWait();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }



                });
                System.out.println("Task added successfully!");
            }else {
                System.out.println("Task empty!");
            }



        });


    }

    /**
     * to add in task table if public static is not used
     */

//    public int getUserid() {
//      //  System.out.println(userid);
//
//        return userid;
//    }
//
//    public void setUserid(int userid) {
//        this.userid = userid;
//        System.out.println("UserId:"+this.userid);
//    }
}
