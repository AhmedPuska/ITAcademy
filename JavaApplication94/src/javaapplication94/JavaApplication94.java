
package javaapplication94;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaApplication94 extends Application{

    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = (Pane)FXMLLoader.load(getClass().getResource("/javaapplication94/proba.fxml"));
        
        
        
        Scene scena = new Scene(pane);
                
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
}
