
package javaapplication178;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaApplication178 extends Application{

    public static void main(String[] args) {
        launch(args);
//        App p = new App();
//        p.run(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.show();
        
        Engine root = new Engine();
        Scene scena = new Scene(root);
        stage.setScene(scena);
        
        root.init();
        
        Bat b1 = new Bat(root);
        b1.x = 100;
        b1.y = 100;
        
        Bat b2 = new Bat(root);
        b2.x = 200;
        b2.y = 100;
        
        root.actors.add(b1);
        root.actors.add(b2);
        
        Enemy e = new Enemy(root);
        
        root.actors.add(e);
        
        
    }
}