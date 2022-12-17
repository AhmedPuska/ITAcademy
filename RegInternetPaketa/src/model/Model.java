package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty imeIprezime = new SimpleStringProperty(this, "imeIprezime");
    private final StringProperty adresa = new SimpleStringProperty(this, "adresa");
    private final IntegerProperty brzina = new SimpleIntegerProperty(this, "brzina");
    private final IntegerProperty ugovor = new SimpleIntegerProperty(this, "ugovor");
    private final ObjectProperty protok = new SimpleObjectProperty(this, "protok");
    
    public Model() {
        
    }
    
    public Model(int id, String imeIprezime, String adresa, int brzina, int ugovor, int protok) {
        this.id.set(id);
        this.imeIprezime.set(imeIprezime);
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

    public String getImeIprezime() {
        return imeIprezime.get();
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime.set(imeIprezime);
    }

    public StringProperty imeIprezimeProperty() {
        return imeIprezime;
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
    
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
    
    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }
    
    public boolean isValid() {
        boolean  isValid = true;
        
        if (imeIprezime.get() == null) {
            errorList.getValue().add("Ime i prezime mora biti uneseno!");
            isValid = false;
        }
        if (adresa.get() == null) {
            errorList.getValue().add("Adresa mora biti unesena!");
            isValid = false;
        }
        if (ugovor.get() == 0) {
            errorList.getValue().add("Trajanje ugovora mora biti odredjeno!");
            isValid = false;
        }
        if (brzina.get() == 0) {
            errorList.getValue().add("Brzina protoka mora biti izabrana!");
            isValid = false;
        }
        if (protok.get() == null) {
            errorList.getValue().add("Protok mora biti izabran!");
            isValid = false;
        }
        return isValid;
    }
    
    public String save() throws ClassNotFoundException {
        
        String msg = "Unos je obavljen";
        
        if (isValid()) {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/reg_internet_paketa","root","");){
                PreparedStatement st = conn.prepareStatement("insert into podaci (id, ime_prezime,adresa,ugovor,protok,brzina) values (?,?,?,?,?,?)");
                st.setString(1, Integer.toString(id.get()));
                st.setString(2, imeIprezime.get());  
                st.setString(3, adresa.get());  
                st.setString(4, Integer.toString(ugovor.get()));  
                st.setString(5, protok.get().toString()); 
                st.setString(6, Integer.toString(brzina.get()));
                
                st.execute();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return msg;
    }
}