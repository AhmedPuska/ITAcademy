/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Model;

/**
 * FXML Controller class
 *
 * @author user
 */
public class controller_ui_fxml {
    
    @FXML private TableView tableView;
    @FXML private ComboBox cbBrzina;
    @FXML private ComboBox cbProtok;
    @FXML private ComboBox cbUgovor;
    @FXML private TextField tfImePrezime;
    @FXML private TextField tfAdresa;
    
    private ObservableList<Model> modelLista = FXCollections.<Model>observableArrayList();
    Model model;

    
    private ObservableList<Model> prikaz() throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver"); 
        ObservableList<Model> modelLista1 = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/reg_internet_paketa", "root", "");) {
            
            ResultSet rs = conn.createStatement().executeQuery("select * from podaci");
            
            while(rs.next()) {
                    Model model = new Model();
                    model.setId(rs.getInt("id"));
                    model.setImeIprezime(rs.getString("ime_prezime"));
                    model.setAdresa(rs.getString("adresa"));
                    model.setBrzina(rs.getInt("brzina"));
                    model.setProtok(rs.getObject("protok"));
                    model.setUgovor(rs.getInt("ugovor"));
                    modelLista1.add(model);
                    modelLista = modelLista1;
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return modelLista1;
    }
    
    @FXML
    public void initialize() throws ClassNotFoundException {
        model = new Model();
        
        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);
        cbBrzina.valueProperty().bindBidirectional(model.brzinaProperty());
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");
        cbProtok.valueProperty().bindBidirectional(model.protokProperty());
        cbUgovor.getItems().addAll(1, 2);
        cbUgovor.valueProperty().bindBidirectional(model.ugovorProperty());
        tfImePrezime.textProperty().bindBidirectional(model.imeIprezimeProperty());
        tfAdresa.textProperty().bindBidirectional(model.adresaProperty());
        prikaz();
        tableView.setItems(modelLista);
    }
    
    @FXML
    private void add() throws ClassNotFoundException {
        if (model.isValid()) {
            model.setId(modelLista.size() + 1);
            model.save();
            tableView.setItems(prikaz());
        } else {
            StringBuilder errMsg = new StringBuilder();
            
            ArrayList<String> errList = model.errorsProperty().get();
            
            for(String errList1 : errList) {
                errMsg.append(errList1);
            }
            Alert error = new Alert(Alert.AlertType.ERROR);
            error.setTitle("Sells se ne moze izvrsiti");
            error.setHeaderText(null);  
            error.setContentText(errMsg.toString());     
            error.showAndWait();  
            errList.clear();  
        }
    }
    
    @FXML
    private void delete() throws ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver"); 
        int selIdx = tableView.getSelectionModel().getSelectedIndex();
        String modId = null;
        
        for(Model mod : modelLista) {
            if (selIdx == modelLista.indexOf(mod)) {
                modId = Integer.toString(mod.getId());
            }
        }
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/reg_internet_paketa","root","");) {
            PreparedStatement st = conn.prepareStatement("delete from podaci where id=?");  
            st.setString(1, modId);  
            st.execute();  
            tableView.setItems(prikaz());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
