
package model;

import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    private final StringProperty imePrezime = new SimpleStringProperty(this, "imePrezime");
    private final StringProperty adresa = new SimpleStringProperty(this, "adresa");
    private final ObjectProperty brzina = new SimpleObjectProperty(this, "brzina");
    private final ObjectProperty ugovor = new SimpleObjectProperty(this, "ugovor");
    private final ObjectProperty protok = new SimpleObjectProperty(this, "protok");
    
    public Model() {
        
    }
    
    public Model(String imePrezime, String adresa, Object brzina, Object ugovor, Object protok) {
        this.imePrezime.set(imePrezime);
        this.adresa.set(adresa);
        this.brzina.set(brzina);
        this.ugovor.set(ugovor);
        this.protok.set(protok);
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
    
    public Object getBrzina() {
        return brzina.get();
    }

    public void setBrzina(Object brzina) {
        this.brzina.set(brzina);
    }

    public ObjectProperty brzinaProperty() {
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
    
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
    
    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }
    
    public boolean isValid() {
        boolean  isValid = true;
        
        if (imePrezime.get() == null) {
            errorList.getValue().add("Ime i prezime mora biti uneseno!");
            isValid = false;
        }
        if (adresa.get() == null) {
            errorList.getValue().add("Adresa mora biti unesena!");
            isValid = false;
        }
        if (ugovor.get() == null) {
            errorList.getValue().add("Trajanje ugovora mora biti odredjeno!");
            isValid = false;
        }
        if (brzina.get() == null) {
            errorList.getValue().add("Brzina protoka mora biti izabrana!");
            isValid = false;
        }
        if (protok.get() == null) {
            errorList.getValue().add("Protok mora biti izabran!");
            isValid = false;
        }
        return isValid;
    }
}
