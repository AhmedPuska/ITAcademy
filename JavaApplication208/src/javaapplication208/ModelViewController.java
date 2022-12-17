/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication208;

import com.sun.javafx.beans.IDProperty;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ModelViewController implements Initializable {

    
//    @FXML
//    private TextField tfImePrezime;
//    @FXML
//    private TextField tfAdresa;
//    @FXML
//    private ComboBox cbBrzina;
//    @FXML
//    private ComboBox cbProtok;
//    @FXML
//    private ComboBox cbUgovor;
    
    @FXML
    private Button deleteBtn;
    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    
    @FXML
    TableView<Model> tabelView;
    
    private URL location;
    @FXML
    private ResourceBundle resources;
    
    ObservableList<Model> models = FXCollections.<Model>observableArrayList();
    Model model;
    
    public ModelViewController() {
        
    }
    
    /**
     * Initializes the controller class.
     */
    
    private ObservableList<Model> getModel() {
        models.add(new Model(1, "Ime Prezime1", "Zmaja od Bosne 1", 50, 1, "Flat"));
        models.add(new Model(2, "Ime Prezime2", "Zmaja od Bosne 2", 50, 2, "Flat"));
        models.add(new Model(3, "Ime Prezime3", "Zmaja od Bosne 3", 100, 2, "Flat"));
        return models;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new Model();
        
//        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);
//        cbBrzina.valueProperty().bindBidirectional(model.brzinaProperty());
//        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");
//        cbProtok.valueProperty().bindBidirectional(model.protokProperty());
//        cbUgovor.getItems().addAll(1, 2);
//        cbUgovor.valueProperty().bindBidirectional(model.ugovorProperty());
//        tfImePrezime.textProperty().bindBidirectional(model.imePrezimeProperty());
//        tfAdresa.textProperty().bindBidirectional(model.adresaProperty());
        
        TableColumn IDColumn = new TableColumn("ID");
        IDColumn.setMinWidth(40);
        IDColumn.setCellValueFactory(new PropertyValueFactory<Model, Integer>("id"));
        
        
        TableColumn idColumn = new TableColumn("Id");
        idColumn.setMinWidth(20);
//        idColumn.setCellValueFactory(new PropertyValueFactory<Model, Integer>("id"));
//        numberCol.setCellValueFactory(new Callback<CellDataFeatures<Person, Person>, ObservableValue<Person>>() {
//            @Override public ObservableValue<Person> call(CellDataFeatures<Person, Person> p) {
//                return new ReadOnlyObjectWrapper(p.getValue());
//            }
//        });
        idColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Model, Model>, ObservableValue<Model>>() {
            @Override public ObservableValue<Model> call(TableColumn.CellDataFeatures<Model, Model> p) {
                return new ReadOnlyObjectWrapper(p.getValue());
            }
        });
        idColumn.setCellFactory(new Callback<TableColumn<Model, Model>, TableCell<Model, Model>>() {
            @Override public TableCell<Model, Model> call(TableColumn<Model, Model> param) {
                return new TableCell<Model, Model>() {
                    @Override protected void updateItem(Model item, boolean empty) {
                        super.updateItem(item, empty);

                        if (this.getTableRow() != null && item != null) {
                            setText(this.getTableRow().getIndex()+1+"");
                        } else {
                            setText("");
                        }
                    }
                };
            }
        });
        
        TableColumn<Model, String> imePrezimeColumn = new TableColumn<>("Ime & Prezime");
        imePrezimeColumn.setMinWidth(100);
        imePrezimeColumn.setCellValueFactory(new PropertyValueFactory<Model, String>("imePrezime"));
        
        TableColumn<Model, String> adresaColumn = new TableColumn<>("Adresa");
        adresaColumn.setMinWidth(100);
        adresaColumn.setCellValueFactory(new PropertyValueFactory<Model, String>("adresa"));
        
        TableColumn<Model, Integer> brzinaColumn = new TableColumn<>("Brzina");
        brzinaColumn.setMinWidth(100);
        brzinaColumn.setCellValueFactory(new PropertyValueFactory<Model, Integer>("brzina"));
        
        TableColumn<Model, Object> protokColumn = new TableColumn<>("Protok");
        protokColumn.setMinWidth(100);
        protokColumn.setCellValueFactory(new PropertyValueFactory<Model, Object>("protok"));
        
        TableColumn<Model, Integer> ugovorColumn = new TableColumn<>("Ugovor");
        ugovorColumn.setMinWidth(100);
        ugovorColumn.setCellValueFactory(new PropertyValueFactory<Model, Integer>("ugovor"));
        
        
        tabelView.setItems(getModel());
        tabelView.getColumns().addAll(idColumn, IDColumn, imePrezimeColumn, adresaColumn, brzinaColumn, protokColumn, ugovorColumn);
        
        System.out.println("Location = " + location);
        System.out.println("Resources = " + resources);
    }
    
//    @FXML private void savePerson() {
//        if (model.isValid()) {
//            ObservableList<Model> data = tabelView.getItems();
//        data.add(new Model(0, tfImePrezime.getText(), tfAdresa.getText(), (int) cbBrzina.getValue(), (int) cbUgovor.getValue(), cbProtok.getValue()));
//        if(model.isValid()) {
//            models = tabela.getItems();
////            ObservableList<Model> data = tabela.getItems();
////            data.add(new Model(0, tfImePrezime.getText(), tfAdresa.getText(), cbBrzina.getSelectionModel().getSelectedIndex(), cbUgovor.getSelectionModel().getSelectedIndex(), cbProtok));
//            tabela.setItems(models);
//        }else {
//            StringBuilder errMsg = new StringBuilder();
//
//	    ArrayList<String> errList = model.errorsProperty().get();
//	    for(String errList1 : errList)
//		errMsg.append(errList1);
//
//	    Alert alert = new Alert(Alert.AlertType.ERROR);
//	    alert.setTitle("Person can be saved!");
//	    alert.setHeaderText(null);
//	    alert.setContentText(errMsg.toString());
//	    alert.showAndWait();
//	    errList.clear();
//        }
//    }


//    @FXML
//    private void savePerson()
//    {
//	if(person.isValid())
//	{
//	    /* SAVE + LIST */
//	    persons = tabela.getItems();
//	    ToggleButton selected = (ToggleButton) gender.getSelectedToggle();
//	    switch(selected.getId())
//	    {
//		case "male":
//		    persons.add(new Person(firstName.getText(), lastName.getText(), email.getText(), Gender.MALE));
//		    break;
//		case "female":
//		    persons.add(new Person(firstName.getText(), lastName.getText(), email.getText(), Gender.FEMALE));
//		    break;
//	    }
//	    tabela.setItems(persons);
//	    /* SAVE + LIST */
	
	

    @FXML
    private void closeForm()
    {
	Platform.exit();
    }
//
//    @FXML
//    private void clearPerson()
//    {
//	model.imePrezimeProperty().set("");
//	model.adresaProperty().set("");
//	model.brzinaProperty().set(0);
//	model.ugovorProperty().setValue(0);
//        model.protokProperty().set("");
//
//    }

    @FXML
    private void deletePerson()
    {
	models = tabelView.getItems();
	int index = tabelView.selectionModelProperty().getValue().getSelectedIndex();
	models.remove(index);
	tabelView.setItems(models);
    }
    
}
