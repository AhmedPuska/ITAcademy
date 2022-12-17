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
  import javafx.scene.control.TextField;  
  import model.ProdajaModel;  
    
  public class ProdajaController {  
    
    ProdajaModel prodaja;  
   
    public ProdajaController() {  
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
   private ListView listView;
   ObservableList<ProdajaModel> prodajaLista = FXCollections.observableArrayList();  
    
    private ObservableList<ProdajaModel> prikaz() throws ClassNotFoundException {  
     Class.forName("com.mysql.jdbc.Driver");  
      ObservableList<ProdajaModel> prodajaLista1 = FXCollections.observableArrayList();  
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        Statement st = conn.createStatement();  
        st.executeQuery("select * from podaci");  
        ResultSet rs = st.getResultSet();  
    
       while (rs.next()) {  
         ProdajaModel prodaja = new ProdajaModel(  
              Integer.parseInt(rs.getString("brzina")),  
             rs.getString("protok"),  
              Integer.parseInt(rs.getString("ugovor")),  
              Integer.parseInt(rs.getString("id")),  
              rs.getString("ime_prezime"),  
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
        prodaja = new ProdajaModel();  
    
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
    
      for (ProdajaModel mod : prodajaLista) {  
        if (selIdx == prodajaLista.indexOf(mod)) {  
          modId = Integer.toString(mod.getId());  
       }  
      }  
    
     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        PreparedStatement st = conn.prepareStatement("delete from podaci where id=?");  
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