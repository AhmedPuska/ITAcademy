package javaapplication107;
public class Student extends Person {
    public String idNumber;
    
    public Student (String name, String idNumber){
        super("Ime", "Prezime");
        this.idNumber = idNumber;
    }
    }
