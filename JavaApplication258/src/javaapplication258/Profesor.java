package javaapplication258;

public class Profesor extends Person {

    public String className;

    public Profesor(String firstName, String lastName, String className) {
        super(firstName, lastName);
        this.className = className;
    }

    @Override
    public void show() {
        System.out.println("Profesor " + firstName + " " + lastName + " teaches: " + className);
    }

}
