package javaapplication184;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaApplication184 extends Application {
    static void setSize(Pane otac) {
         for(Node taster : otac.getChildren()) {
            if ("javafx.scene.control.Button".equals(taster.getClass().getName())) {
                ((Button)taster).setPrefSize(100, 50);   
            }
        }
    }
   public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        MainMenu root = new MainMenu();
        
        HBox root = new HBox(10);
        VBox roote = new VBox();
        roote.getChildren().add(new Button("Klikni"));
        
        root.setAlignment(Pos.TOP_LEFT);
        roote.setVgrow(roote, Priority.ALWAYS);
        root.getChildren().addAll(new Button("Klik"), new Button("Klik"), roote);
        root.setStyle("-fx-background-color : #FFFF00");
        roote.setStyle("-fx-background-color : #FF0000");
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}