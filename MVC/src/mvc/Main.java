package mvc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
//import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        URL fxmlUrl = getClass().getClassLoader().getResource("view/add_person.fxml");
//        GridPane root = FXMLLoader.<GridPane>load(fxmlUrl);
        VBox root = FXMLLoader.<VBox>load(fxmlUrl);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}