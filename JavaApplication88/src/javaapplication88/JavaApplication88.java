package javaapplication88;


import static java.awt.PageAttributes.ColorType.COLOR;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaApplication88 extends Application {
    
    static void setSizes(Pane otac){
        for(Node taster : otac.getChildren()){ 
            if("javafx.scene.control.Button".equals(taster.getClass().getName())){
                ((Button)taster).setPrefSize(100, 50);
            }
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {  
        
        BorderPane roott = new BorderPane();
        
        StackPane stckpn= new StackPane();
        
        Button sok = new Button("Kola");
        Button sok1 = new Button("Koka");
        
        sok1.setLayoutX(100);
        sok1.setLayoutY(100);
        
        Rectangle rect = new Rectangle(200, 50);
        rect.setFill(Color.LAVENDER);
        Text text = new Text("A Rectangle");
        stckpn.getChildren().addAll(rect, text);
        Insets margin = StackPane.getMargin(text);
        stckpn.getChildren().addAll(sok1,sok);
        
        Button taster = new Button("dodaj");
        Button tasterTop = new Button("Gore");
        Button tasterBottom = new Button("Dole");
        roott.setCenter(taster);
        roott.setTop(tasterTop);
        roott.setBottom(tasterBottom);
        
        MainMenu root = new MainMenu();
        
        
        Scene scena = new Scene(stckpn); 
        
        
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scena); 
        primaryStage.show();
        
        
    }
    
}