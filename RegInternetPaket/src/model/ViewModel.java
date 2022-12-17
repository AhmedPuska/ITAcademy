package model;

import static controller.ViewController.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class ViewModel {
    
    public static Connection conn() throws SQLException {
        
        return DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi","root","");
    }
    
    List<ViewModel> listaPodaci;
            
    private final IntegerProperty id = new SimpleIntegerProperty(this,"id");
    private final IntegerProperty brzina = new SimpleIntegerProperty(this,"brzina");  
    private final ObjectProperty protok = new SimpleObjectProperty(this,"protok");  
    private final IntegerProperty ugovor = new SimpleIntegerProperty(this,"ugovor");  
    private final StringProperty ime_prezime = new SimpleStringProperty(this,"ime_prezime");  
    private final StringProperty adresa = new SimpleStringProperty(this,"adresa");  

    public ViewModel() {
    }
    
    public ViewModel(int id, int brzina, Object protok, int ugovor, String ime_prezime, String adresa) {
        
        this.id.set(id);
        this.brzina.set(brzina);
        this.protok.set(protok);
        this.ugovor.set(ugovor);
        this.ime_prezime.set(ime_prezime);
        this.adresa.set(adresa);
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

    public int getBrzina() {
        return brzina.get();
    }

    public void setBrzina(int brzina) {
        this.brzina.set(brzina);
    }
    
    public IntegerProperty brzinaProperty() {
        return brzina;
    }

    public Object getProtok() {
        return protok;
    }

    public void setProtok(Object protok) {
        this.protok.set(protok);
    }

    public ObjectProperty protokProperty() {
        return protok;
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

    public String getIme_prezime() {
        return ime_prezime.get();
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime.set(ime_prezime);
    }
    
    public StringProperty ime_prezimeProperty() {
        return ime_prezime;
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
    
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());
    
    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    public boolean isValid() {

        boolean isValid = true;

        if (ime_prezime.get() != null && ime_prezime.get().equals("")) {
            errorList.getValue().add("ime_prezime name can't be empty!");
            isValid = false;
        }
        if (adresa.get().equals("")) {
            errorList.getValue().add("adresa name can't be empty!");
            isValid = false;
        }
        if (brzina.get() == 0) {
            errorList.getValue().add("brzina can't be empty!");
            isValid = false;
        }
        if (ugovor.get() == 0) {
            errorList.getValue().add("ugovor can't be empty!");
            isValid = false;
        }
        if (protok.get() == null) {
            errorList.getValue().add("protok can't be empty!");
            isValid = false;
        }

        return isValid;
    }
    
//    public static void save() {

//        if (isValid()) {
//            
//            System.out.println("Person with details: \n" + this + "\nsaved!");
//            return true;
//        }
//
//        return save(imePrezime.get(), adresa.get(), ugovor.get(), brzina.get(), protok.get());

//    }
    
    
    
    public String save() {
        
        String msg = "Unos uspjesno obavljen";
        
        Connection conn = null;
        try {
            conn = conn();
            
           PreparedStatement st = conn.prepareStatement("insert into podaci (id, ime_prezime,adresa,ugovor,protok,brzina) values (?,?,?,?,?,?)");  
        st.setString(1, Integer.toString(id.get()));  
        st.setString(2, ime_prezime.get());  
        st.setString(3, adresa.get());  
        st.setString(4, Integer.toString(ugovor.get()));  
        st.setString(5, protok.get().toString()); 
        st.setString(6, Integer.toString(brzina.get()));  
        
        st.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            conn = null;
        }
        return msg;
    }
    
//    public String save() throws ClassNotFoundException {   
//        
//      String poruka = "Unos uspesno obavljen";  
//        
//      if (isValid()) {  
//        Class.forName("com.mysql.jdbc.Driver");   
//        try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi","root","");) {  
//        PreparedStatement st = conn.prepareStatement("insert into podaci (id, ime_prezime,adresa,ugovor,protok,brzina) values (?,?,?,?,?,?)");  
//        st.setString(1, Integer.toString(id.get()));  
//        st.setString(2, ime_prezime.get());  
//        st.setString(3, adresa.get());  
//        st.setString(4, Integer.toString(ugovor.get()));  
//        st.setString(5, protok.get().toString()); 
//        st.setString(6, Integer.toString(brzina.get()));  
//        st.execute();   
//              
//      } catch (SQLException e) {  
//        poruka = "GRESKA! " + e.getMessage();  
//      }  
//      }  
//      return poruka;  
//    }   
    
    @Override  
    public String toString() {  
      return
              "ID: " + id.get() + "\n" +   
              "Ime i prezime: " + ime_prezime.get() + "\n" +   
              "Adresa: " + adresa.get() + "\n" +   
              "Ugovor: " + ugovor.get() + " god." + "\n" +
              "Protok: " + protok.get() + " GB" + "\n" + 
              "Brzina: " + brzina.get() + " Mbit";
    }  
    
    
//    public String save(String name, String adresa, int ugovor, int brzina, Object protok) {
//        String poruka = "Unos uspesno obavljen";  
//        Connection conn = null;
//        try {
//            conn = conn();
//            
//            PreparedStatement st = conn.prepareStatement("insert into products values (null, ? ,?, ?, ?, ?)");
//            
//            st.setString(1, name);
//            st.setString(2, adresa);
//            st.setInt(3, ugovor);
//            st.setInt(4, brzina);
//            st.setObject(5, protok);           
// 
//            st.execute();
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            if(conn!=null) {
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    System.out.println(ex.getMessage());
////                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            conn = null;
//        }
//        return poruka;
//    }
}