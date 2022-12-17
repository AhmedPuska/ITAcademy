/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John", "Strus", 67);
//        
//        System.out.println("First name: " + p.firstNameProperty().get());
//        System.out.println("Last name: " + p.lastNameProperty().get());
//        System.out.println("Weight: " + p.weightProperty().get());
        
//        p.weightProperty().addListener(new InvalidationListener() {
//            @Override
//            public void invalidated(Observable observable) {
//                System.out.println("invalidation");
//            }
//        });
        
        p.weightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("change");
            }
        });
        
        p.weightProperty().setValue(33);
        p.weightProperty().setValue(33);
        p.weightProperty().setValue(67);
//        
//        p.ageProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("change");
//            }
//        });
//        
//        p.ageProperty().setValue(25);
//        p.ageProperty().setValue(25);
//        p.ageProperty().setValue(35);
   }
}