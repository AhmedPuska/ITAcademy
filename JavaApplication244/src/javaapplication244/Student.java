package javaapplication244;

public class Student extends Person {
    
    public String idNumber;
    
//    public String name = "";
//    public int age = 0;
//    public String major = "Undeclared";
//    public boolean fulltime = true;

    public Student(String name, String idNumber) {
        super(name);
        this.idNumber = idNumber;
    }
//    public void display() {
//        System.out.println("Name " + name + " Major: " + major);
//    }
//    public boolean isFullTime() {
//        return fulltime;
//    }
    
}