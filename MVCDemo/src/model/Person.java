/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final StringProperty email = new SimpleStringProperty(this, "email", "");
    private final StringProperty address = new SimpleStringProperty(this, "address", "");
    private final StringProperty country = new SimpleStringProperty(this, "country", "");
//    private final ObjectProperty<Gender> gender = new SimpleObjectProperty(this, "gender", Gender.FEMALE);

    public Person() {

    }

    public Person(String firstName) {
        this.firstName.set(firstName);
    }

    public Person(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }
    
    public Person(String firstName, String lastName, String email, String address, String country) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.email.set(email);
        this.address.set(address);
        this.country.set(country);

    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public StringProperty addressProperty() {
        return address;
    }
    
    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public StringProperty countryProperty() {
        return country;
    }
    
    public String getCountry() {
        return country.get();
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    public boolean isValid() {

        boolean isValid = true;

        if (firstName.get() != null && firstName.get().equals("")) {
            errorList.getValue().add("First name can't be empty!");
            isValid = false;
        }
        if (lastName.get().equals("")) {
            errorList.getValue().add("Last name can't be empty!");
            isValid = false;
        }
        if (email.get().equals("")) {
            errorList.getValue().add("Email can't be empty!");
            isValid = false;
        }

        return isValid;
    }

    public boolean save() {

        if (isValid()) {
            System.out.println("Person with details: \n" + this + "\nsaved!");
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "First name: " + firstName.get() + "\n" + "Last name: " + lastName.get() + "\n" + "Email: " + email.get() + "\n" + "Address: " + address.get().toString() + "\n" + "Country: " + country.get();
    }
}