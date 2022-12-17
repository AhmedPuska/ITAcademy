/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SayHelloController {
    @FXML
    private Label msgLbl;

    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;

    public SayHelloController() {
    }

    @FXML
    private void initialize() {
       System.out.println("Initializing SayHelloController...");
       System.out.println("Location = " + location);
       System.out.println("Resources = " + resources);
    }

    @FXML
    private void sayHello() {
       msgLbl.setText("Hello from FXML!");
    }
}