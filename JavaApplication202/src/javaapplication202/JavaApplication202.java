/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication202;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author user
 */
public class JavaApplication202 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        URL fxmlUrl = getClass().getClassLoader().getResource("view/fxml_tableview.fxml");
        GridPane root = FXMLLoader.<GridPane>load(fxmlUrl);
        
        Scene scene = new Scene(root);
//        scene.getStylesheets().add("view/buttonstyles.css");
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
//        primaryStage.setTitle("FXML TableView Example");
////        GridPane myPane = (GridPane)FXMLLoader.load(getClass().getClassLoader().getResource("view/fxml_tableview.fxml"));
//        URL fxmlUrl = getClass().getClassLoader().getResource("view/fxml_tableview.fxml");
//        System.out.println(fxmlUrl);
//        GridPane myPane = FXMLLoader.<GridPane>load(fxmlUrl);
////        Pane myPane = (Pane)FXMLLoader.load(getClass().getClassLoader().getResource("view/fxml_tableview.fxml"));
//        System.out.println(myPane);
//        Scene myScene = new Scene(myPane);
//        primaryStage.setScene(myScene);
//        primaryStage.show();
    }
    
}
