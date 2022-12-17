package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Prodaja {
    public Prodaja () {
        
    }
    
//    public static Connection conn() throws SQLException {
//        
//        return DriverManager.getConnection("jdbc:mysql://localhost/vjezba_form","root","");
//    }
//    
    List<Prodaja> listaProdaja;
    
    private final ObjectProperty brzina = new SimpleObjectProperty(this,"brzina");
    private final ObjectProperty protok = new SimpleObjectProperty(this,"protok");
    private final ObjectProperty ugovor = new SimpleObjectProperty(this,"ugovor");
    private final IntegerProperty id = new SimpleIntegerProperty(this,"id");
    private final StringProperty imePrezime = new SimpleStringProperty(this,"imePrezime");
    private final StringProperty adresa = new SimpleStringProperty(this,"adresa");
    
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
    
    public Prodaja(Object brzina,Object protok,Object ugovor,int id,String imePrezime,String adresa) {  
      this.brzina.set(brzina);  
      this.protok.set(protok);  
      this.ugovor.set(ugovor);  
      this.id.set(id);  
      this.imePrezime.set(imePrezime);  
      this.adresa.set(adresa);  
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
    public Object getProtok() {
        return protok.get();
    }
    public void setProtok(Object protok) {
        this.protok.set(protok);
    }
    public ObjectProperty protokProperty() {
        return protok;
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
    
    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }
    
    public boolean isValid() {

        boolean isValid = true;

        if (imePrezime.get() != null && imePrezime.get().equals("")) {
            errorList.getValue().add("Ime&Prezime name can't be empty!");
            isValid = false;
        }
        if (brzina.get().equals("")) {
            errorList.getValue().add("Brzina can't be empty!");
            isValid = false;
        }
        if (ugovor.get().equals("")) {
            errorList.getValue().add("Ugovor can't be empty!");
            isValid = false;
        }
        if (protok.get().equals("")) {
            errorList.getValue().add("Protok can't be empty!");
            isValid = false;
        }
        if (adresa.get().equals("")) {
            errorList.getValue().add("Adress can't be empty!");
            isValid = false;
        }

        return isValid;
    }

    public void save() {
////        ObservableList<Prodaja> getProducts() {
//
//            Connection conn = null;
//            ObservableList<Prodaja> res = FXCollections.observableArrayList();
//            try {
//                conn = conn();
//
//                ResultSet rs = conn.createStatement().executeQuery("select * from products");
//
//                while(rs.next()) {
//    //                for (int i = 0; i < 20; i++) {
//                        Prodaja p = new Prodaja();
//                        p.setId(rs.getInt("id"));
//                        p.setBrzina(rs.getObject("brzina"));
//                        p.setProtok(rs.getObject("protok"));
//                        p.setUgovor(rs.getObject("ugovor"));
//                        p.setImePrezime(rs.getString("imePrezime"));
//                        p.setAdresa(rs.getString("adresa"));
//                        res.add(p);
//    //                }
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            } finally {
//                if(conn!=null) {
//                    try {
//                        conn.close();
//                    } catch (SQLException ex) {
//                        Logger.getLogger(Prodaja.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                conn = null;
//            }
//            return res;
//        }
}

    @Override
    public String toString() {
        return "Brzina: " + brzina.get() + "\n" +
                "Protok: " + protok.get() + "\n" +
                "Trajanje ugovora: " + ugovor.get() + "\n" +
                "Unikatni id: " + id.get() + "\n" +
                "Ime i prezime korisnika: " + imePrezime.get() + "\n" +
                "Adresa korisnika: " + adresa.get();
    }
}