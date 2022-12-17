
package javaapplication82;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Person {
    String name;
    String lastName;
    LocalDate dateTime;
    String place;
    
    Person(String name, String lastName, String place, LocalDate dateTime){
        this.name=name;
        this.lastName=lastName;
        this.place=place;
        this.dateTime=dateTime;
    }    
    
    @Override
    public String toString(){
        
         DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd.MMM yyyy.");  
          return ( "Name: " + name + " / " + "Lastname: " + lastName + " / " +   
          "Date of birth: " + dateTime.format(form2) + " / " +   
          "Place of birth: " + place);
    }
//        String[] textArray = text.split("[ ./]+");
//        System.out.println(Arrays.toString(textArray));
        
//        String datee = "05051988";
// 
///* metodom parse() parsiramo datum iz stringa oblika 'yyyyMMdd' u LocalDate */
//LocalDate date = LocalDate.parse(text, DateTimeFormatter.BASIC_ISO_DATE);
// 
//System.out.println(datee);   /* rezultat je u obliku 'yyyy-MM-dd' */
    
}