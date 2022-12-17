/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication183;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class JavaApplication183 extends Application {

    public static void main(String[] args) {
//        launch(args);
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.add(new Clock());
        frame.setVisible(true);
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
        Group g = new Group();
        Scene scene = new Scene(g);
        Button b = new Button("Premjesti");
        
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                b.setLayoutX(100);
                b.setText("Premjesten");
            }
        });
        primaryStage.setScene(scene);
        g.getChildren().add(b);
    }
}