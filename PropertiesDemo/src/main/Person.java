package main;

//import javafx.beans.property.IntegerProperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
//    private final IntegerProperty weight = new SimpleIntegerProperty(this, "weight", 0);
    private IntegerProperty weight;
    
    private int _weight = 88;
            
    public Person() {
        
    }
    
    public Person(String firstName, String lasteName, int weight) {
        this.firstName.set(firstName);
        this.lastName.set(lasteName);
        this.weight.set(weight);
    }
    
    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    public String getFirstName() {
        return firstName.get();
    }
    
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    public StringProperty lastNameProperty() {
        return lastName;
    }
    
    public String getLastName() {
        return lastName.get();
    }
    
    public void setlastName(String lastName) {
        this.lastName.set(lastName);
    }
    
    
    
    public IntegerProperty weightProperty() {
        if (this.weight == null) {
            weight = new SimpleIntegerProperty(this, "weight", _weight);
        }
        return weight;
    }
    
    public int getWeight() {
        return (weight == null) ? _weight : weight.get();
    }
    
    public void setWeight(int weight) {
        // full lazy
        if (this.weight == null) {
            _weight = weight;
        } else {
            this.weight.set(weight);
        }
        // hall lazy
//        if(this.weight != null || !(_weight == weight)) {
//            weightProperty().set(weight);
//        }
    }
//    private IntegerProperty age;
//    private int _age = 80;
//    
//    public Person() {
//        
//    }
//    
//    public Person(String firstName, String lastName, int age) {
//        this.firstName.set(firstName);
//        this.lastName.set(lastName);
//        this.age.set(age);
//    }
//    
//    public StringProperty firstNameProperty() {
//        return firstName;
//    }
//    
//    public String getFirstName() {
//        return firstName.get();
//    }
//    
//    public void setFirstName(String firstName) {
//        this.firstName.set(firstName);
//    }
//    
//    public StringProperty lastNameProperty() {
//        return lastName;
//    }
//    
//    public String getLastName() {
//        return lastName.get();
//    }
//    
//    public void setLastName(String lastName) {
//        this.lastName.set(lastName);
//    }
//    
//    public IntegerProperty ageProperty() {
//        if (age == null) {
//            age = new SimpleIntegerProperty(this, "age", _age);
//        }
//        return age;
//    }
//    
//    public int getAge() {
//        return (age == null)?_age:age.get();
//    }
//    
//    public void setAge(int age) {
//        if (this.age == null) {
//            _age = age;
//        }
//        else {
//            this.age.set(age);
//        }
//    }
}