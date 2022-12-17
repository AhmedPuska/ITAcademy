package javaapplication91;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import panels.Login;

public class JavaApplication91 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene s = new Scene(new Login());
        primaryStage.setScene(s);
        
        primaryStage.show();
    }
    
}
