package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import sample.animations.Fading;
import sample.animations.Shaker;

public class AddItemController {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label welcometext;

    @FXML
    private ImageView additembutton;

    @FXML
    private Label notasklable;

    @FXML
    private AnchorPane rootpane;
    @FXML
    private AnchorPane rootrootpane;

    @FXML
    void initialize() {
        welcometext.setText("Welcome "+LoginController.name);

        additembutton.addEventHandler(MouseEvent.MOUSE_CLICKED,event -> {
            Shaker additembuttonshaker=new Shaker(additembutton);
            additembuttonshaker.shake();

            additembutton.relocate(0,45);
            notasklable.relocate(0,145);

            additembutton.setOpacity(0f);
            notasklable.setOpacity(0f);

            Fading additembuttonfade=new Fading(additembutton);
            additembuttonfade.fade();
            Fading notasklablefade=new Fading(notasklable);
            notasklablefade.fade();


            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/additemform.fxml"));


            try {
                AnchorPane pane= loader.load();
                /**
                 * to add in task table if public static is not used
                 */
//                AddItemFormController addItemFormController=loader.getController();
//                addItemFormController.setUserid(getUserid());
                rootrootpane.getChildren().setAll(pane);


                Fading rootfade=new Fading(rootrootpane);
                rootfade.fade();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("Added Clicked!");
        });

    }

//    public void setUserName(String name) {
//        welcometext.setText("Welcome "+name);
//
//    }
    /**
     * to add in task table if public static is not used
     */

//    public int getUserid() {
//      //  System.out.println(this.userid);
//
//        return userid;
//    }
//
//    public void setUserid(int userid) {
//        this.userid = userid;
//        System.out.println("UserId:"+this.userid);
//    }
}
