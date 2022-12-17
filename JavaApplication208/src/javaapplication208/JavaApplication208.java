/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication208;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class JavaApplication208 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getClassLoader().getResource("javaapplication208/ModelView.fxml");
        URL fxmlUl = getClass().getResource("javaapplication208/ModelView.fxml");
        System.out.println(fxmlUrl);
        System.out.println(fxmlUl);
	HBox root = FXMLLoader.<HBox>load(fxmlUrl);
        
	Scene scene = new Scene(root);
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    
}
