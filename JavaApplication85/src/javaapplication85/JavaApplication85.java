/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;

/**
 *
 * @author user
 */
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringProperty igrac1 = new SimpleStringProperty();
        igrac1.setValue("Vladimir");
        
//        igrac1.addListener(new ChangeListener<String>);
                
        System.out.println(igrac1.getValue());
    }
    
}
