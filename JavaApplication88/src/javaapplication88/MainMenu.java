package javaapplication88;

import static javaapplication88.JavaApplication88.setSizes;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class MainMenu extends VBox{
    public MainMenu(){ 
        
        HBox top    = new HBox(); 
        
        this.setSpacing(10);
        this.setAlignment(Pos.TOP_CENTER);
        
        
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); 
        
        Button logout   = new Button("Logout");   
        
        Button kasa     = new Button("Kasa");
        
        top.getChildren().addAll(logout,spacer,kasa);
        top.setSpacing(10);
        top.setAlignment(Pos.TOP_CENTER);
        
        Button magacin  = new Button("Magacin");
        Button stolovi  = new Button("Stolovi");
        this.getChildren().addAll(top,magacin,stolovi);
        
        JavaApplication88.setSizes(top);
        JavaApplication88.setSizes(this);
        
    }
}