package javaapplication30;
public class Profesor extends Person {
    public String className;
    public Profesor (String firstName, String lastName, String className){
        super(firstName, lastName);
    }
    @Override
    public void show(){
        System.out.println("Profeor: " + firstName + " " + lastName + " " + className);
    }
    
}
