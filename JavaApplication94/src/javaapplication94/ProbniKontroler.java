package javaapplication94;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ProbniKontroler implements Initializable {
    
    public ProbniKontroler(){
      
    }
    
    @FXML
    Button taster;
    
    @FXML
    public void klik(ActionEvent evt){
        System.out.println("Hello");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         this.taster.setText("Click me!!!");
    }
}
