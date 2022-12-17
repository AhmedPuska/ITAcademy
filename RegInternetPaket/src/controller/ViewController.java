/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.ViewModel;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ViewController {
    
    public static Connection conn() throws SQLException {
        
        return DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi","root","");
    }
    
    @FXML private TableView tableView;
    @FXML private ComboBox cbBrzina;
    @FXML private ComboBox cbProtok;
    @FXML private ComboBox cbUgovor;
    @FXML private TextField tfImePrezime;
    @FXML private TextField tfAdresa;
    
    ObservableList<ViewModel> podaciList = FXCollections.<ViewModel>observableArrayList();
    ViewModel podaci;
    
     private ObservableList<ViewModel> prikaz() {
        
        Connection conn = null;
        ObservableList<ViewModel> podaciLista1 = FXCollections.observableArrayList();
        try {
            conn = conn();
            
            ResultSet rs = conn.createStatement().executeQuery("select * from podaci");
            
            while(rs.next()) {
                    ViewModel podaci = new ViewModel();
                    podaci.setId(rs.getInt("id"));
                    podaci.setIme_prezime(rs.getString("ime_prezime"));
                    podaci.setAdresa(rs.getString("adresa"));
                    podaci.setBrzina(rs.getInt("brzina"));
                    podaci.setProtok(rs.getObject("protok"));
                    podaci.setUgovor(rs.getInt("ugovor"));
                    podaciLista1.add(podaci);
                    podaciList = podaciLista1;
            }
            
            
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
        return podaciLista1;
    }
//    private ObservableList<ViewModel> prikaze() throws ClassNotFoundException {  
//     Class.forName("com.mysql.jdbc.Driver");  
//      ObservableList<ViewModel> podaciLista1 = FXCollections.observableArrayList();  
//      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
//        Statement st = conn.createStatement();  
//        st.executeQuery("select * from podaci");  
//        ResultSet rs = st.getResultSet();  
//    
//       while (rs.next()) {  
//         ViewModel podaci = new ViewModel(  
//              Integer.parseInt(rs.getString("id")),  
//              Integer.parseInt(rs.getString("brzina")),  
//             rs.getString("protok"),  
//              Integer.parseInt(rs.getString("ugovor")),  
//              rs.getString("ime_prezime"),  
//             rs.getString("adresa"));  
//          podaciLista1.add(podaci);  
//         podaciList = podaciLista1;  
//        }  
//    
//      } catch (SQLException e) {  
//       System.out.println("GRESKA: " + e.getMessage());  
//      }  
//    
//    return podaciLista1;  
//    }  
   
   @FXML  
    private void initialize() throws ClassNotFoundException {
        podaci = new ViewModel();  
    
        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);  
        cbBrzina.valueProperty().bindBidirectional(podaci.brzinaProperty());  
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");  
        cbProtok.valueProperty().bindBidirectional(podaci.protokProperty());  
        cbUgovor.getItems().addAll(1, 2);  
        cbUgovor.valueProperty().bindBidirectional(podaci.ugovorProperty());  
        tfImePrezime.textProperty().bindBidirectional(podaci.ime_prezimeProperty());  
        tfAdresa.textProperty().bindBidirectional(podaci.adresaProperty());  
        prikaz();  
        tableView.setItems(podaciList);  
    
    }  
    
    @FXML  
    private void obrisiProdaju() throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");  
    
      int selIdx = tableView.getSelectionModel().getSelectedIndex();  
      String modId = null;  
    
      for (ViewModel mod : podaciList) {  
        if (selIdx == podaciList.indexOf(mod)) {  
          modId = Integer.toString(mod.getId());  
       }  
      }  
    
     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        PreparedStatement st = conn.prepareStatement("delete from podaci where id=?");  
        st.setString(1, modId);  
        st.execute();  
       tableView.setItems(prikaz());  
   
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
    
    }
 
    
    public static void insert(String name, double price, String picture, boolean inStock, String tip) {
        Connection conn = null;
        try {
            conn = conn();
            
            PreparedStatement st = conn.prepareStatement("insert into products values (null, ? ,?, ?, ?, ?)");
            
            st.setString(1, name);
            st.setDouble(2, price);
            st.setString(3, picture);
            st.setString(4, tip);
            st.setBoolean(5, inStock);           
 
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
    }
    
    @FXML  
    private void prodaj() throws ClassNotFoundException {  
    
      if (podaci.isValid()) {  
    
        podaci.setId(podaciList.size() + 1);  
        podaci.save();  
        tableView.setItems(prikaz());  
    
      } else {  
       StringBuilder errMsg = new StringBuilder();  
    
       ArrayList<String> errList = podaci.errorsProperty().get();  
   
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
    
    
    
}
