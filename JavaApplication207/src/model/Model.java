/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final StringProperty email = new SimpleStringProperty(this, "email", "");
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty imePrezime = new SimpleStringProperty(this, "imePrezime", "");
    private final StringProperty adresa = new SimpleStringProperty(this, "adresa", "");
    private final IntegerProperty brzina = new SimpleIntegerProperty(this, "brzina");
    private final ObjectProperty ugovor = new SimpleObjectProperty(this, "ugovor");
    private final ObjectProperty protok = new SimpleObjectProperty(this, "protok", "");
//    private final ObjectProperty<Gender> gender = new SimpleObjectProperty(this, "gender", Gender.FEMALE);

    public Model() {

    }

    public Model(int id, String imePrezime, String adresa, int brzina, Object ugovor, Object protok) {
        this.id.set(id);
        this.imePrezime.set(imePrezime);
        this.adresa.set(adresa);
        this.brzina.set(brzina);
        this.ugovor.set(ugovor);
        this.protok.set(protok);
    }
    
    public Model(String firstName, String lastName, String email/*, Gender gender*/) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.email.set(email);
//        th4is.gender.set(gender);

    }

    public Model(String firstName) {
        this.firstName.set(firstName);
    }

    public Model(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
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
    
    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }
    
    public IntegerProperty idProperty() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime.get();
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime.set(imePrezime);
    }

    public StringProperty imePrezimeProperty() {
        return imePrezime;
    }
    
    public String getAdresa() {
        return adresa.get();
    }

    public void setAdresa(String adresa) {
        this.adresa.set(adresa);
    }

    public StringProperty adresaProperty() {
        return adresa;
    }
    
    public int getBrzina() {
        return brzina.get();
    }

    public void setBrzina(int brzina) {
        this.brzina.set(brzina);
    }

    public IntegerProperty brzinaProperty() {
        return brzina;
    }
    
    public Object getUgovor() {
        return ugovor.get();
    }

    public void setUgovor(Object ugovor) {
        this.ugovor.set(ugovor);
    }
    
    public ObjectProperty ugovorProperty() {
        return ugovor;
    }

    public Object getProtok() {
        return protok.get();
    }

    public void setProtok(Object protok) {
        this.protok.set(protok);
    }
    
    public ObjectProperty protokProperty() {
        return protok;
    }

//    public Gender getGender() {
//        return gender.get();
//    }
//
//    public void setGender(Gender gender) {
//        this.gender.set(gender);
//    }
//
//    public ObjectProperty<Gender> genderProperty() {
//        return gender;
//    }

    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    public boolean isValid() {

        boolean isValid = true;

        if (imePrezime.get() == null) {
            errorList.getValue().add("First name can't be empty!");
            isValid = false;
        }
        if (adresa.get().equals("")) {
            errorList.getValue().add("Last name can't be empty!");
            isValid = false;
        }
        if (protok.get()==null) {
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
        return "First name: " + firstName.get() + "\n" + "Last name: " + lastName.get() + "\n" + "Email: " + email.get() + "\n" + "Gender: " /*+ gender.get().toString()*/;
    }
}