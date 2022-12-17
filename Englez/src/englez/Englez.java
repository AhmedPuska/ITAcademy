package englez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import panels.Login;
import panels.Main;

public class Englez extends Application{

    static Stage pozornica;
    
    public static void switchScene(String newScene) {
        
        try {
            
            Pane panel = (Pane)Class.forName("panels." + newScene).newInstance();
            Scene scene= new Scene(panel);
            pozornica.setScene(scene);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Englez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Englez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Englez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        pozornica = primaryStage;
        
//        Login root = new Login();
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
        
        switchScene("Racun");
        primaryStage.show();
        
    }
}