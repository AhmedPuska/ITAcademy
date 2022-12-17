/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication208;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author user
 */
public class Model {
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty imePrezime = new SimpleStringProperty(this, "imePrezime");
    private final StringProperty adresa = new SimpleStringProperty(this, "adresa");
    private final IntegerProperty brzina = new SimpleIntegerProperty(this, "brzina");
    private final IntegerProperty ugovor = new SimpleIntegerProperty(this, "ugovor");
    private final ObjectProperty protok = new SimpleObjectProperty(this, "protok");
    
    public Model() {
        
    }
    
    public Model(int id, String imePrezime, String adresa, int brzina, int ugovor, Object protok) {
        this.id.set(id);
        this.imePrezime.set(imePrezime);
        this.adresa.set(adresa);
        this.brzina.set(brzina);
        this.ugovor.set(ugovor);
        this.protok.set(protok);
    }
    
    List<Model> listaPodaci;
    

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
    
    public int getUgovor() {
        return ugovor.get();
    }

    public void setUgovor(int ugovor) {
        this.ugovor.set(ugovor);
    }
    
    public IntegerProperty ugovorProperty() {
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
    
//    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
//    
//    public ObjectProperty<ArrayList<String>> errorsProperty() {
//        return errorList;
//    }
    
//    public boolean isValid() {
//        boolean  isValid = true;
//        
//        if (imePrezime.get() == null) {
//            errorList.getValue().add("Ime i prezime mora biti uneseno!");
//            isValid = false;
//        }
//        if (adresa.get() == null) {
//            errorList.getValue().add("Adresa mora biti unesena!");
//            isValid = false;
//        }
//        if (ugovor.get() == 0) {
//            errorList.getValue().add("Trajanje ugovora mora biti odredjeno!");
//            isValid = false;
//        }
//        if (brzina.get() == 0) {
//            errorList.getValue().add("Brzina protoka mora biti izabrana!");
//            isValid = false;
//        }
//        if (protok.get() == null) {
//            errorList.getValue().add("Protok mora biti izabran!");
//            isValid = false;
//        }
//        return isValid;
//    }
}
