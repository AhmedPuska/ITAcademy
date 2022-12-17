/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.util.ArrayList;

public class Student extends Person {
    String idNumber;
    
    static void show(ArrayList<?> os ){
        for(Object o : os){
            System.out.println(((Person)o).name);
        }
    }

    public Student(String surname, String name) {
        super(surname, name);
    }
}
