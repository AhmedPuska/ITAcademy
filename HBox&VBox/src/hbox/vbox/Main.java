package hbox.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox vbox2 = new VBox(10);
        
        Button button1 = new Button("First Button");
        Button button2 = new Button("Second Button");
        button1.setMaxHeight(Double.MAX_VALUE);
        button1.setMaxWidth(Double.MAX_VALUE);

        
        VBox vbox3 = new VBox(10,button1, button2);
        VBox.setVgrow(button1, Priority.ALWAYS);
        
        Insets margin = new Insets(5);
        VBox.setMargin(button1, margin);
        
        vbox3.setAlignment(Pos.CENTER_RIGHT);
        
//        Button button1 = new Button("Yes");
//        Button button2 = new Button("No");
//        button1.setMaxHeight(Double.MAX_VALUE);
//        button1.setMaxWidth(Double.MAX_VALUE);
        
//        Insets margin = new Insets(20, 10, 20, 10);
//        HBox.setMargin(button1, margin);
        
//        HBox hbox = new HBox(10, button1, button2);
//        hbox.setAlignment(Pos.BOTTOM_RIGHT);
//        HBox.setHgrow(button1, Priority.ALWAYS);
//        hbox.setFillHeight(true);
        
//        Scene scene = new Scene(hbox);
        Scene scene = new Scene(vbox3);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}