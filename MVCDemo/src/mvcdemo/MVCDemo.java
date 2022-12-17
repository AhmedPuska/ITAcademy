
package mvcdemo;

import java.net.URL;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MVCDemo extends Application {

    private double dragOffsetX;
    private double dragOffsetY;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        URL fxmlUrl = getClass().getClassLoader().getResource("view/add_person.fxml");
        GridPane root = FXMLLoader.<GridPane>load(fxmlUrl);
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("view/buttonstyles.css");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        
        primaryStage.show();
        
        
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                dragOffsetX = event.getScreenX() - primaryStage.getX();
                dragOffsetY = event.getScreenY() - primaryStage.getY();
            }
        });
        
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - dragOffsetX);
                primaryStage.setY(event.getScreenY() - dragOffsetY);
            }
        });
        
        
        
    }
}