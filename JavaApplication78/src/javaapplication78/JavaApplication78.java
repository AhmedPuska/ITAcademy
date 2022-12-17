/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.util.ArrayList;
import static javaapplication78.Student.show;

public class JavaApplication78 {

    public static void main(String[] args) {
        
        ArrayList<Person> arrayList = new ArrayList();
        Person p1 = new Person("John", "Davidson");
        Person p2 = new Person("Clive", "Robertson");
        
        arrayList.add(p1);
        arrayList.add(p2);
        for(Person p : arrayList){
            System.out.println("Name: " + p.name + " Surname: " + p.surname);
        }
        
        
        
//        MyClass<Integer> myClass1 = new MyClass<>();
//        myClass1.t = 15;
//        MyClass<Double> myClass2 = new MyClass<>();
//        myClass2.t = 15.0;
//        myClass2.showResult();
        

//        MyClass<Integer, String, Boolean> myClass = new MyClass<>(35, "My text", true);
//        System.out.println(myClass.t+" "+myClass.s + " " + myClass.u);
//        MyClass<Integer, String, Boolean> myClass1 = new MyClass<>(35, "My text", true);
//        MyClass<Integer, Integer, Integer> myClass2 = new MyClass<>(35, 15, 22);
//        System.out.println(myClass1.getClass().equals(myClass2.getClass()));
//        System.out.println(myClass1.equals(myClass2));



//        ArrayList <Student> listStudent = new ArrayList<>();
//        ArrayList <Person> listPerson = new ArrayList<>();
//        Person o = new Person();
//        o.name = "John";
//        Student s = new Student();
//        s.name = "David";
//        s.idNumber="25/25";
//        listPerson.add(o);
//        listStudent.add(s);
//        show(listStudent);
    }
    
}
