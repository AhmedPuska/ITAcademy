///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package controller;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
//import model.Person;
//
///**
// *
// * @author user
// */
//public class FXMLTableViewController {
//    Person prodaja;
//    
//    public FXMLTableViewController() {
//        
//    }
//    @FXML  
//    private ComboBox cbBrzina;  
//    @FXML  
//    private ComboBox cbProtok;  
//    @FXML  
//    private ComboBox cbUgovor;  
//    @FXML  
//    private TextField tfImePrezime;  
//    @FXML  
//    private TextField tfAdresa;  
//    
//    @FXML private TableView tableView;
////    @FXML private TextField firstNameField;
////    @FXML private TextField lastNameField;
////    @FXML private TextField emailField;
////    @FXML private TableView tableView;
//    
//    ObservableList<Person> prodajaLista = FXCollections.observableArrayList();  
//    
//    private ObservableList<Person> prikaz() throws ClassNotFoundException {  
//     Class.forName("com.mysql.jdbc.Driver");  
//      ObservableList<Person> prodajaLista1 = FXCollections.observableArrayList();  
//      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
//        Statement st = conn.createStatement();  
//        st.executeQuery("select * from prodaja");  
//        ResultSet rs = st.getResultSet();  
//    
//       while (rs.next()) {  
//         Person prodaja = new Person(  
//              Integer.parseInt(rs.getString("brzina")),  
//             rs.getString("protok"),  
//              Integer.parseInt(rs.getString("ugovor")),  
//              Integer.parseInt(rs.getString("prodajaId")),  
//              rs.getString("imePrezime"),  
//             rs.getString("adresa"));  
//          prodajaLista1.add(prodaja);  
//         prodajaLista = prodajaLista1;  
//        }  
//    
//      } catch (SQLException e) {  
//       System.out.println("GRESKA: " + e.getMessage());  
//      }  
//    
//    return prodajaLista1;  
//    }
//   
//   @FXML  
//    private void initialize() throws ClassNotFoundException {  
//      prodaja = new Person();  
//    
//            cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);  
//      cbBrzina.valueProperty().bindBidirectional(prodaja.brzinaProperty());  
//      cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");  
//      cbProtok.valueProperty().bindBidirectional(prodaja.protokProperty());  
//      cbUgovor.getItems().addAll(1, 2);  
//      cbUgovor.valueProperty().bindBidirectional(prodaja.ugovorProperty());  
//      tfImePrezime.textProperty().bindBidirectional(prodaja.imePrezimeProperty());  
//      tfAdresa.textProperty().bindBidirectional(prodaja.adresaProperty());  
//      prikaz();  
//      tableView.setItems(prodajaLista);
//    }  
//    
//    @FXML  
//    private void obrisiProdaju() throws ClassNotFoundException {  
//      Class.forName("com.mysql.jdbc.Driver");  
//    
//      int selIdx = tableView.getSelectionModel().getSelectedIndex();  
//      String modId = null;  
//    
//      for (Person mod : prodajaLista) {  
//        if (selIdx == prodajaLista.indexOf(mod)) {  
//          modId = Integer.toString(mod.getId());  
//       }  
//      }  
//    
//     try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
//        PreparedStatement st = conn.prepareStatement("delete from prodaja where prodajaId=?");  
//        st.setString(1, modId);  
//        st.execute();  
//       tableView.setItems(prikaz());  
//   
//      } catch (SQLException e) {  
//        System.out.println("GRESKA! " + e.getMessage());  
//      }  
//    
//    }
//    
//    @FXML
//    protected void addPerson(ActionEvent event) throws ClassNotFoundException {
//        if (prodaja.isValid()) {
//            prodaja.setId(prodajaLista.size() + 1);
//            prodaja.save();
//            tableView.setItems(prikaz());
//        } else {
//            StringBuilder errMsg = new StringBuilder();
//            
//            ArrayList<String> errList = prodaja.errorsProperty().get();
//            
//            for (String errList1 : errList) {
//                errMsg.append(errList1);
//            }
//            
//            Alert alert = new Alert(Alert.AlertType.ERROR);  
//            alert.setTitle("Prodaja se ne moze izvrsiti!");  
//            alert.setHeaderText(null);  
//            alert.setContentText(errMsg.toString());     
//            alert.showAndWait();  
//            errList.clear();  
//    
//        }
//         
//    }
////    
////    @FXML
////    protected void removePerson(ActionEvent event) {
////        ObservableList<Person> data = tableView.getItems();
////        data.removeAll(tableView.getSelectionModel().getSelectedItem());
////    }
//    
//}import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.*;

public class FXMLTableViewController {
    
    Person prodaja;
    
    public FXMLTableViewController() {
        
    }
    
//    @FXML private TableView<Person> tableView;
    
    @FXML private ComboBox cbBrzina;  
    @FXML private ComboBox cbProtok;  
    @FXML private ComboBox cbUgovor;  
    @FXML private TextField tfImePrezime;  
    @FXML private TextField tfAdresa;  
//    @FXML private TextField firstNameField;
//    @FXML private TextField lastNameField;
//    @FXML private TextField emailField;
    @FXML private TableView tableView;
    
    ObservableList<Person> prodajaLista = FXCollections.observableArrayList();
    
    private ObservableList<Person> prikaz() throws ClassNotFoundException {  
     Class.forName("com.mysql.jdbc.Driver");  
      ObservableList<Person> prodajaLista1 = FXCollections.observableArrayList();  
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internet_paketi", "root", "");) {  
        Statement st = conn.createStatement();  
        st.executeQuery("select * from prodaja");  
        ResultSet rs = st.getResultSet();  
    
       while (rs.next()) {  
         Person prodaja = new Person(  
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
      prodaja = new Person();  
    
            cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);  
      cbBrzina.valueProperty().bindBidirectional(prodaja.brzinaProperty());  
      cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");  
      cbProtok.valueProperty().bindBidirectional(prodaja.protokProperty());  
      cbUgovor.getItems().addAll(1, 2);  
      cbUgovor.valueProperty().bindBidirectional(prodaja.ugovorProperty());  
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
    
      for (Person mod : prodajaLista) {  
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
    protected void addPerson(ActionEvent event) throws ClassNotFoundException {
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
}