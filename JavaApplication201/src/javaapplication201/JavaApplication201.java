/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication201;

import java.net.URL;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaApplication201 extends Application {
    
    private double dragOffsetX;
    private double dragOffsetY;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        primaryStage.setTitle("FXML TableView Example");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getClassLoader().getResource
        ("view/tableview.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show(); 
       
//        URL fxmlUrl = getClass().getClassLoader().getResource("view/vjezba.fxml");
//        GridPane root = FXMLLoader.<GridPane>load(fxmlUrl);
////        BorderPane root = FXMLLoader.<BorderPane>load(fxmlUrl);
//        
//        Scene scene = new Scene(root);
//        scene.getStylesheets().add("view/vjezba.css");
////        primaryStage.initStyle(StageStyle.UNDECORATED);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        
//        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                dragOffsetX = event.getScreenX() - primaryStage.getX();
//                dragOffsetY = event.getScreenY() - primaryStage.getY();
//            }
//        });
//        
//        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
//
//            @Override
//            public void handle(MouseEvent event) {
//                primaryStage.setX(event.getScreenX() - dragOffsetX);
//                primaryStage.setY(event.getScreenY() - dragOffsetY);
//            }
//        });
        
    }
}