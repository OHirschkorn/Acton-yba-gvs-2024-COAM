package ps.oriisac.com.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(HelloApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader, Screen.getPrimary().getBounds().getWidth()-20, Screen.getPrimary().getBounds().getHeight()-40);
        stage.setTitle("Carbon Tracker");


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static addbutton CurrentButton;
    @FXML
    private TextArea textArea;


    public static TextArea k;
    public void addButton() throws Exception {
        k = textArea;
        if(CurrentButton != null){
        CurrentButton.stage.close();
        }
        CurrentButton = new addbutton();
        CurrentButton.start(new Stage());
    }

}