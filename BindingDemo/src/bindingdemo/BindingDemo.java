
package bindingdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindingDemo extends Application{

    public static void main(String[] args) {
        launch(args);
    } 

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Slider radiusSlider = new Slider(10, 300, 50);
        
        Circle c = new Circle();
        
        Group root = new Group(radiusSlider, c);
        
        Scene scene = new Scene(root, 800, 600);
        
        c.radiusProperty().bind(radiusSlider.valueProperty());
        c.centerXProperty().bind(scene.widthProperty().divide(2));
        c.centerYProperty().bind(scene.heightProperty().divide(2));
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //dva slidera se pomjeraju sa pomjeranjem jednim
//        Slider slider1 = new Slider(10, 300, 50);
//        Slider slider2= new Slider(10, 300, 50);
//        
//        HBox box = new HBox(slider1, slider2);
//        
//        slider1.valueProperty().bindBidirectional(slider2.valueProperty());
//        
//        Scene scena = new Scene(box, 300, 100);
//        primaryStage.setScene(scena);
//        primaryStage.show();
    }
}