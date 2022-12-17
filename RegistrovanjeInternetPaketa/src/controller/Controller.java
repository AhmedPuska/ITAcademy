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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Prodaja;

public class Controller {
    
//    public static Connection conn() throws SQLException {
//        
//        return DriverManager.getConnection("jdbc:mysql://localhost/vjezba_form","root","");
//    }
    
    @FXML 
    private ComboBox cbBrzina;
    @FXML
    private ComboBox cbProtok;
    @FXML
    private ComboBox cbUgovor;
    @FXML
    private TextField tfImePrezime;
    @FXML
    private TextField tfAdresa;
    @FXML
    private TableView tableView;
    
    ObservableList<Prodaja> prodajaLista = FXCollections.<Prodaja>observableArrayList();
    
    Prodaja prodaja;
    
    public Controller() {
        
    }
    private ObservableList<Prodaja> prikaz() throws ClassNotFoundException {  
     Class.forName("com.mysql.jdbc.Driver");  
      ObservableList<Prodaja> prodajaLista1 = FXCollections.observableArrayList();  
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        Statement st = conn.createStatement();  
        st.executeQuery("select * from prodaja");  
        ResultSet rs = st.getResultSet();  
    
       while (rs.next()) {  
         Prodaja prodaja = new Prodaja(  
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
        prodaja = new Prodaja();
        
        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);
        cbBrzina.valueProperty().bindBidirectional(prodaja.brzinaProperty());
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");
        cbProtok.valueProperty().bindBidirectional(prodaja.protokProperty());
        cbUgovor.getItems().addAll(1, 2);
        cbUgovor.valueProperty().bindBidirectional(prodaja.protokProperty());
        tfImePrezime.textProperty().bindBidirectional(prodaja.imePrezimeProperty());
        tfAdresa.textProperty().bindBidirectional(prodaja.adresaProperty());
        prikaz();
        tableView.setItems(prodajaLista);
        
    }
    
    @FXML  
    private void obrisiProdaju() throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");  
    
      int selIdx = tableView.getSelectionModel().getSelectedIndex();  
      String modId = null;  
    
      for (Prodaja mod : prodajaLista) {  
        if (selIdx == prodajaLista.indexOf(mod)) {  
          modId = Integer.toString(mod.getId());  
       }  
      }  
    
     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        PreparedStatement st = conn.prepareStatement("delete from prodaja where prodajaId=?");  
        st.setString(1, modId);  
        st.execute();  
       tableView.setItems(prikaz());  
   
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
    
    }
 
    @FXML  
    private void prodaj() throws ClassNotFoundException {  
    
      if (prodaja.isValid()) {  
    
        prodaja.setId(prodajaLista.size() + 1);  
        prodaja.save();  
        tableView.setItems(prikaz());  
    
      } else {  
       StringBuilder errMsg = new StringBuilder();  
    
       ArrayList<String> errList = prodaja.errorsProperty().get();  
   
       for (String errList1 : errList) {  
         errMsg.append(errList1);  
        }  
    
        Alert alert = new Alert(Alert.AlertType.ERROR);  
       alert.setTitle("Prodaja se ne moze izvrsiti!");  
        alert.setHeaderText(null);  
        alert.setContentText(errMsg.toString());     
        alert.showAndWait();  
        errList.clear();  
    
      }  
    }  
//    @FXML
//    private void sell() {
//        if (prodaja.isValid()) {
//            prodaja.save();
//        } else {
//
//            StringBuilder errMsg = new StringBuilder();
//
//            ArrayList<String> errList = prodaja.errorsProperty().get();
//
//            for (String errList1 : errList) {
//                errMsg.append(errList1);
//            }
//
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Person can be saved!");
//            alert.setHeaderText(null);
//            alert.setContentText(errMsg.toString());
//            alert.showAndWait();
//            errList.clear();
//
//        }
//    }
////    public static ObservableList<Product> getProducts() {
////        Connection conn = null;
////        ObservableList<Product> res = FXCollections.observableArrayList();
////        try {
////            conn = conn();
////            ResultSet rs = conn.createStatement().executeQuery("select * from products");
////            while(rs.next()) {
////
//////                for (int i = 0; i < 20; i++) {
////            Product p = new Product();
////            p.setId(rs.getInt("id"));
////            p.setName(rs.getString("name"));
////            p.setPrice(rs.getDouble("price"));
////            res.add(p);
////            //}
////
////            }
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        } finally {
////            if(conn!=null) {
////                try {
////                    conn.close();
////                } catch (SQLException ex) {
////                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
////            conn = null;
////        }
////        return res;
////    }
//    private void addPerson() {
////        Prodaja p = null;
////        Connection conn = null;
////        try {
////            conn = conn();
////            PreparedStatement st = conn.prepareStatement("insert into users values (null, ? ,?, ?, ?, ?)");
////            st.setString(1, p.getImePrezime());
////            st.setString(2, p.getAdresa());
////            st.setObject(3, p.getUgovor());
////            st.setObject(4, p.getBrzina());
////            st.setObject(5, p.getProtok());
////            st.execute();
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        } finally {
////            if(conn!=null) {
////                try {
////                    conn.close();
////                } catch (SQLException ex) {
//////                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
////            conn = null;
////        }
//    }
////    @FXML
////    private void addPerson(String name, String adresa, String ugovor, String brzina, String protok) {
////        Connection conn = null;
////        try {
////            conn = conn();
////            PreparedStatement st = conn.prepareStatement("insert into users values (null, ? ,?, ?, ?, ?)");
////            st.setString(1, name);
////            st.setString(2, adresa);
////            st.setString(3, ugovor);
////            st.setString(4, brzina);
////            st.setString(5, protok);
////            st.execute();
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        } finally {
////            if(conn!=null) {
////                try {
////                    conn.close();
////                } catch (SQLException ex) {
//////                    Logger.getLogger(Podaci.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
////            conn = null;
////        }
////    }
}