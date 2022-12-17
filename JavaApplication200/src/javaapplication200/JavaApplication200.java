package javaapplication200;

import java.net.URL;  
  import javafx.application.Application;  
  import javafx.fxml.FXMLLoader;  
  import javafx.scene.Scene;  

import javafx.scene.layout.BorderPane;  
  import javafx.stage.Stage; 

public class JavaApplication200 extends Application{ 

 
          
    public static void main(String[] args) {  
      launch(args);  
    }  
    
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        
      URL fxmlUrl = getClass().getClassLoader().getResource("view/ProdajaView.fxml");  
      BorderPane root = FXMLLoader.<BorderPane>load(fxmlUrl);  
      Scene scene = new Scene(root);  
      primaryStage.setScene(scene);  
      primaryStage.setTitle("Registrovanje prodaje internet-paketa");  
      primaryStage.centerOnScreen();  
      primaryStage.setResizable(false);  
      primaryStage.show();  
        
    }  
      
  }  
    
