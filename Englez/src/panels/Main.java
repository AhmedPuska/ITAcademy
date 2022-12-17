/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Main extends VBox{
    public Main() {
        getChildren().add(new Button("Hello"));
    }
}