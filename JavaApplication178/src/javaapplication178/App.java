/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication178;

import java.util.List;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class App extends Application{

    public static void run(String[] args) {
        launch(args);
    }
    
    int x = 0;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        Scene scena = new Scene(root);
        
        Button taster = new Button("Pozdrav");
        taster.setLayoutX(50);
        List deca = root.getChildren();
        deca.add(taster);
        Label l = new Label("Pozdrav iz label-a");
        Canvas c = new Canvas(600, 400);
        GraphicsContext grafika = c.getGraphicsContext2D();
        
        AnimationTimer at = new AnimationTimer() {
            @Override
            public void handle(long now) {
//                for (int i = 0; i < 10; i++) {
                grafika.clearRect(0, 0, 600, 400);
                grafika.fillRect(x, 0, 50, 50);
                x++;
//                Thread.sleep(1000);
//        }
            }
        };
        at.start();
        
//        for (int i = 0; i < 10; i++) {
//            grafika.fillRect(i, 0, 50, 50);
//            Thread.sleep(1000);
//        }
        grafika.setFill(Color.RED);
        root.getChildren().addAll(/*taster, l,*/ c);
        
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    
}
