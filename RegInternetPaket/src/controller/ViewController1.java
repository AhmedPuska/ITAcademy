package controller;  
   
  import java.sql.Connection;  
  import java.sql.DriverManager;  
  import java.sql.PreparedStatement;  
  import java.sql.ResultSet;  
  import java.sql.SQLException;  
  import java.sql.Statement;  
  import java.util.ArrayList;  
  import javafx.collections.FXCollections;  
  import javafx.collections.ObservableList;  
  import javafx.fxml.FXML;  
  import javafx.scene.control.Alert;  
  import javafx.scene.control.Alert.AlertType;  
  import javafx.scene.control.ChoiceBox;  
  import javafx.scene.control.ListView;  
import javafx.scene.control.TableView;
  import javafx.scene.control.TextField;  
  import model.ViewModel1;  
    
  public class ViewController1 {  
    
    ViewModel1 prodaja;  
   
    public ViewController1() {  
    }  
    
   @FXML  
    private ChoiceBox cbBrzina;  
    @FXML  
    private ChoiceBox cbProtok;  
    @FXML  
    private ChoiceBox cbUgovor;  
    @FXML  
    private TextField tfImePrezime;  
    @FXML  
    private TextField tfAdresa;  
    @FXML  
   private TableView listView;
   ObservableList<ViewModel1> prodajaLista = FXCollections.observableArrayList();  
    
    private ObservableList<ViewModel1> prikaz() throws ClassNotFoundException {  
     Class.forName("com.mysql.jdbc.Driver");  
      ObservableList<ViewModel1> prodajaLista1 = FXCollections.observableArrayList();  
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        Statement st = conn.createStatement();  
        st.executeQuery("select * from prodaja");  
        ResultSet rs = st.getResultSet();  
    
       while (rs.next()) {  
         ViewModel1 prodaja = new ViewModel1(  
              Integer.parseInt(rs.getString("brzina")),  
             rs.getString("protok"),  
              Integer.parseInt(rs.getString("ugovor")),  
              Integer.parseInt(rs.getString("prodajaId")),  
              rs.getString("imePrezime"),  
             rs.getString("adresa"));  
          prodajaLista1.add(prodaja);  
         prodajaLista = prodajaLista1;  
        }  
    
      } catch (SQLException e) {  
       System.out.println("GRESKA: " + e.getMessage());  
      }  
    
    return prodajaLista1;  
    }  
   
   @FXML  
    private void initialize() throws ClassNotFoundException {
        prodaja = new ViewModel1();  
    
        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);  
        cbBrzina.valueProperty().bindBidirectional(prodaja.brzinaProperty());  
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");  
        cbProtok.valueProperty().bindBidirectional(prodaja.protokProperty());  
        cbUgovor.getItems().addAll(1, 2);  
        cbUgovor.valueProperty().bindBidirectional(prodaja.ugovorProperty());  
        tfImePrezime.textProperty().bindBidirectional(prodaja.imePrezimeProperty());  
        tfAdresa.textProperty().bindBidirectional(prodaja.adresaProperty());  
        prikaz();  
        listView.setItems(prodajaLista);  
    
    }  
    
    @FXML  
    private void obrisiProdaju() throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");  
    
      int selIdx = listView.getSelectionModel().getSelectedIndex();  
      String modId = null;  
    
      for (ViewModel1 mod : prodajaLista) {  
        if (selIdx == prodajaLista.indexOf(mod)) {  
          modId = Integer.toString(mod.getId());  
       }  
      }  
    
     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        PreparedStatement st = conn.prepareStatement("delete from prodaja where prodajaId=?");  
        st.setString(1, modId);  
        st.execute();  
       listView.setItems(prikaz());  
   
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
    
    }
 
    @FXML  
    private void prodaj() throws ClassNotFoundException {  
    
      if (prodaja.isValid()) {  
    
        prodaja.setId(prodajaLista.size() + 1);  
        prodaja.save();  
        listView.setItems(prikaz());  
    
      } else {  
       StringBuilder errMsg = new StringBuilder();  
    
       ArrayList<String> errList = prodaja.errorsProperty().get();  
   
       for (String errList1 : errList) {  
         errMsg.append(errList1);  
        }  
    
        Alert alert = new Alert(AlertType.ERROR);  
       alert.setTitle("Prodaja se ne moze izvrsiti!");  
        alert.setHeaderText(null);  
        alert.setContentText(errMsg.toString());     
        alert.showAndWait();  
        errList.clear();  
    
      }  
    }  
    
  }