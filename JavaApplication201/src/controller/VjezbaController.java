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
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.VjezbaModelController;
/**
 * FXML Controller class
 *
 * @author user
 */
public class VjezbaController /*implements Initializable */{

    public VjezbaController() {
        
    }
    
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
    
    VjezbaModelController prodaja;
    
    ObservableList<VjezbaModelController> prodajaLista = FXCollections.observableArrayList();
    
    private ObservableList<VjezbaModelController> prikaz() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        ObservableList<VjezbaModelController> prodajaLista1 = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/vjezba_form", "root", "");) {
            Statement st = conn.createStatement();
            st.executeQuery("select * from users");
            ResultSet rs =st.getResultSet();
            
            while(rs.next()) {
                VjezbaModelController prodaja = new VjezbaModelController(
                Integer.parseInt(rs.getString("brzina")),
                rs.getString("protok"),
                Integer.parseInt(rs.getString("ugovor")),
                Integer.parseInt(rs.getString("id")),
                rs.getString("imePrezime"),
                rs.getString("adresa"));
                prodajaLista1.add(prodaja);
                prodajaLista = prodajaLista1;
            }
        } catch (SQLException ex) {
            System.out.println("GRESKA: " + ex.getMessage());
        }
        return prodajaLista1;
    }
    
    @FXML
    public void initialize() throws ClassNotFoundException {
        prodaja = new VjezbaModelController();
        
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
        
        for(VjezbaModelController mod : prodajaLista) {
            if (selIdx == prodajaLista.indexOf(mod)) {
                modId = Integer.toString(mod.getId());
            }
        }
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/vjezba_form", "root", "");) {
            PreparedStatement st = conn.prepareStatement("delete from users where id=?");
            st.setString(1, modId);
            st.execute();
            tableView.setItems(prikaz());
        } catch (SQLException ex) {
            System.out.println("GRESKA! " + ex.getMessage());
        }
    }
    
    @FXML
    protected void prodaj(ActionEvent event) throws ClassNotFoundException {
        if(prodaja.isValid()) {
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
            alert.setTitle("Prodaja se ne moze izvristi!");
            alert.setHeaderText(null);
            alert.setContentText(errMsg.toString());
            alert.showAndWait();
            errList.clear();
        }
    }
    
}
