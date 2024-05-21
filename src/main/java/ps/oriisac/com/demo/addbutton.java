package ps.oriisac.com.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static ps.oriisac.com.demo.HelloApplication.*;

public class addbutton extends Application implements Initializable {
    public Stage stage;


    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addElement.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400 , 224);
        stage.setTitle("Carbon Tracker");



        stage.setScene(scene);
        stage.show();
        this.stage = stage;
    }

    @FXML
    private ChoiceBox movement;
    @FXML
    private ChoiceBox TimeMovment;
    @FXML
    private ChoiceBox AmountOnIron;
    @FXML
    private ChoiceBox AmountOfElectronics;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        movement.getItems().add("רכב");
        movement.getItems().add("אוטובוס");
        movement.getItems().add("אחר");

        TimeMovment.getItems().add("לא נסעתי היום");
        TimeMovment.getItems().add("פחות משעה");
        TimeMovment.getItems().add("בין שעה לשעתיים");
        TimeMovment.getItems().add("בין שעתיים לשלוש");
        TimeMovment.getItems().add("יותר משלוש שעות");

        AmountOnIron.getItems().add("לא השתמשתי");
        AmountOnIron.getItems().add("השתמשתי בין 1-2 פחיות שימורים");
        AmountOnIron.getItems().add("השתמשתי בין 2-3 פחיות שימורים");
        AmountOnIron.getItems().add("השתמשתי בין 3-4 פחיות שימורים");
        AmountOnIron.getItems().add("השתמשתי ביותר מ4 פחיות שימורים");


        AmountOfElectronics.getItems().add("לא השתמשתי במוצרי חשמל");
        AmountOfElectronics.getItems().add("השתמשתי בין שעה לשעתיים במוצרי חשמל");
        AmountOfElectronics.getItems().add("השתמשתי בין שעתיים לשלוש שעות במוצרי חשמל");
        AmountOfElectronics.getItems().add("השתמשתי יותר משלוש שעות במוצרי חשמל");
    }


    public void cancel(ActionEvent e){
        CurrentButton.stage.close();
        CurrentButton = null;
    }

    public void send(ActionEvent e){
        String mov = (String) movement.getSelectionModel().getSelectedItem();
        String movTime = (String) TimeMovment.getSelectionModel().getSelectedItem();
        String iron = (String) AmountOnIron.getSelectionModel().getSelectedItem();
        String electronics = (String) AmountOfElectronics.getSelectionModel().getSelectedItem();
        int energy=
                    movement.getSelectionModel().getSelectedIndex()+
                    TimeMovment.getSelectionModel().getSelectedIndex()+
                    AmountOnIron.getSelectionModel().getSelectedIndex()+
                    AmountOfElectronics.getSelectionModel().getSelectedIndex()+ 4;

        if(k.getText()==null){
            k.setText("");
        }

        k.setText(k.getText()+"השתמשת היום ב: "+energy+" אנרגיות "+"\n");
        cancel(e);
    }
}
