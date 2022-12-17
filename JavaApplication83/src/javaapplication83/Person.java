
package javaapplication83;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public String lastName;
    public String place;
    public LocalDate date;
    
    public String toString(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM yyyy");
    return ( "Name: " + name + " / " + "Lastname: " + lastName + " / " +   
          "Date of birth: " + date.format(dtf) + " / " +   
          "Place of birth: " + place);
    }
}
