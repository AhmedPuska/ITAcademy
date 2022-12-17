/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication179;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class JavaApplication179 {
    
    
    static class Address {
        private StringProperty zip = new SimpleStringProperty("36106");
        public StringProperty zipProperty() {
        return zip;
        }
    }
    
    static class Person {
        private ObjectProperty<Address> addr = new SimpleObjectProperty(new Address());
        public ObjectProperty<Address> addrProperty() {
        return addr;
        }
     }
    
    public static void main(String[] args) {
        ObjectProperty<Person> p = new SimpleObjectProperty(new Person());

//        Person p = new Person();
        StringBinding zipBinding = Bindings.selectString(p, "addr", "zip");
        System.out.println(zipBinding);
//        StringBinding zipBinding = Bindings.selectString(p, "addr", "zip");
        // upotreba unidirectional bindinga.
//        IntegerProperty x = new SimpleIntegerProperty(10);
//        IntegerProperty y = new SimpleIntegerProperty(20);
//        IntegerProperty z = new SimpleIntegerProperty(60);
//        
//        z.bind(x.add(y));
//        
//        System.out.println("Intial value of z = " + z.get());
//        
//        System.out.println("changing dependencies...");
//        x.set(15);
//        y.set(19);
//        System.out.println("After changing x and y, z = " + z.get());
//        
//        System.out.println("unbinding...");
//        z.unbind();
//        
//        System.out.println("changing dependencies...");
//        x.set(100);
//        y.set(200);
//        System.out.println("After unbinding z " + z.get());

        // upotreba bidirectional bindinga.
//        IntegerProperty x = new SimpleIntegerProperty(1);
//        IntegerProperty y = new SimpleIntegerProperty(2);
//        IntegerProperty z = new SimpleIntegerProperty(3);
//        
//        System.out.println("Before binding:");
//        System.out.println("x=" + x.get() + ", y=" + y.get() + ", z=" + z.get());
//        
//        x.bindBidirectional(y);       
//        System.out.println("After binding x to y:");        
//        System.out.println("x=" + x.get() + ", y=" + y.get() + ", z=" + z.get());        
//        
//        x.bindBidirectional(z);        
//        System.out.println("After binding x to z:");
//        System.out.println("x=" + x.get() + ", y=" + y.get() + ", z=" + z.get());        
//        
//        System.out.println("After changing z:");        
//        z.set(19);        
//        System.out.println("x=" + x.get() + ", y=" + y.get() + ", z=" + z.get());
//
//        x.unbindBidirectional(y);
//        x.unbindBidirectional(z);
//        System.out.println("After unbinding and changing them separately:");        
//        x.set(100);
//        y.set(200);
//        z.set(300);
//        System.out.println("x=" + x.get() + ", y=" + y.get() + ", z=" + z.get());
        
        //sabiranje double and int property-a
        
//        DoubleProperty x = new SimpleDoubleProperty(200.65);
//        IntegerProperty y = new SimpleIntegerProperty(100);
//
//        NumberBinding sum = x.add(y);
//        int value = sum.intValue();
//        
//        System.out.println(value);
        
        
        DoubleProperty radius = new SimpleDoubleProperty(9.0);
        DoubleProperty area = new SimpleDoubleProperty(0);
        StringProperty initStr = new SimpleStringProperty("Radius is ");

        area.bind(radius.multiply(radius).multiply(Math.PI));

        StringExpression desc = initStr.concat(radius.asString())
                .concat(", Area is ")
                .concat(area.asString("%.2f"));
        System.out.println(desc.getValue());

        radius.set(16.0);
        System.out.println(desc.getValue());
        
    }
}