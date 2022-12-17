
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
    
    
  public class ViewModel1 {  
      
    List<ViewModel1> listaProdaja;  
      
    private final IntegerProperty brzina = new SimpleIntegerProperty(this,"brzina");  
    private final ObjectProperty protok = new SimpleObjectProperty(this,"protok");  
    private final IntegerProperty ugovor = new SimpleIntegerProperty(this,"ugovor");  
    private final IntegerProperty id = new SimpleIntegerProperty(this,"id");  
    private final StringProperty imePrezime = new SimpleStringProperty(this,"imePrezime");  
    private final StringProperty adresa = new SimpleStringProperty(this,"adresa");  
    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());  
       
    public ViewModel1() {}  
      
    public ViewModel1(int brzina,Object protok,int ugovor,int id,String imePrezime,String adresa) {  
      this.brzina.set(brzina);  
      this.protok.set(protok);  
      this.ugovor.set(ugovor);  
      this.id.set(id);  
      this.imePrezime.set(imePrezime);  
      this.adresa.set(adresa);  
    }  
      
    public int getBrzina() {return brzina.get();}  
    public void setBrzina(int brzina) {this.brzina.set(brzina);}  
    public IntegerProperty brzinaProperty() {return brzina;}  
      
    public Object getProtok() {return protok.get();}  
    public void setProtok(Object protok) {this.protok.set(protok);}  
    public ObjectProperty protokProperty() {return protok;}  
      
    public int getUgovor() {return ugovor.get();}  
    public void setUgovor(int ugovor) {this.ugovor.set(ugovor);}  
    public IntegerProperty ugovorProperty() {return ugovor;}  
      
    public int getId() {return id.get();}  
    public void setId(int id) {this.id.set(id);}  
    public IntegerProperty idProperty() {return id;}  
      
    public String getImePrezime() {return imePrezime.get();}  
    public void setImePrezime(String imePrezime) {this.imePrezime.set(imePrezime);}  
    public StringProperty imePrezimeProperty() {return imePrezime;}  
      
    public String getAdresa() {return adresa.get();}  
    public void setAdresa(String adresa) {this.adresa.set(adresa);}  
    public StringProperty adresaProperty() {return adresa;}  
      
    public ObjectProperty<ArrayList<String>> errorsProperty() {return errorList;}  
      
    public boolean isValid() {  
       boolean isValid = true;  
     
      if (imePrezime.get() == null) {  
        errorList.getValue().add(" Ime i prezime moraju biti uneti!");  
        isValid = false;  
      }  
      if (adresa.get() == null) {  
        errorList.getValue().add(" Adresa mora biti uneta!");  
        isValid = false;  
      }  
      if (protok.get() == null) {  
        errorList.getValue().add(" Protok mora biti odabran!");  
        isValid = false;  
      }  
      if (ugovor.get() == 0) {  
        errorList.getValue().add(" Trajanje ugovora mora biti odredjeno!");  
        isValid = false;  
      }  
      if (brzina.get() == 0) {  
        errorList.getValue().add(" Brzina protoka mora biti odabrana!");  
        isValid = false;  
      }   
      return isValid;  
    }  
      
    public String save() throws ClassNotFoundException {   
        
      String poruka = "Unos uspesno obavljen";  
        
      if (isValid()) {  
        Class.forName("com.mysql.jdbc.Driver");   
        try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi","root","");) {  
        PreparedStatement st = conn.prepareStatement("insert into prodaja (prodajaId, imePrezime,adresa,ugovor,brzina,protok) values (?,?,?,?,?,?)");  
        st.setString(1, Integer.toString(id.get()));  
        st.setString(2, imePrezime.get());  
        st.setString(3, adresa.get());  
        st.setString(4, Integer.toString(ugovor.get()));  
        st.setString(5, Integer.toString(brzina.get()));  
        st.setString(6, protok.get().toString());  
        st.execute();   
              
      } catch (SQLException e) {  
        poruka = "GRESKA! " + e.getMessage();  
      }  
      }  
      return poruka;  
    }   
      
    @Override  
    public String toString() {  
      return   
          "ID: " + id.get() + "\n" +   
          "Ime i prezime: " + imePrezime.get() + "\n" +   
          "Adresa: " + adresa.get() + "\n" +   
          "Ugovor: " + ugovor.get() + " god." + "\n" +   
          "Brzina: " + brzina.get() + " Mbit" +"\n" +   
          "Protok: " + protok.get() + " GB";  
    }  
      
  }