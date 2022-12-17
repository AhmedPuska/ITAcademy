
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Model;

public class ProdajaController implements Initializable {
    
    @FXML
    private TextField tfImePrezime;
    @FXML
    private TextField tfAdresa;
    @FXML
    private ComboBox cbBrzina;
    @FXML
    private ComboBox cbProtok;
    @FXML
    private ComboBox cbUgovor;
    
    @FXML
    private Button deleteBtn;
    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    
    @FXML
    TableView<Model> tabelView = new TableView<>();
    
    
    private URL location;
    @FXML
    private ResourceBundle resources;
    
    ObservableList<Model> models = FXCollections.<Model>observableArrayList();
    Model model;
    
    
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new Model();
        
        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);
        cbBrzina.valueProperty().bindBidirectional(model.brzinaProperty());
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");
        cbProtok.valueProperty().bindBidirectional(model.protokProperty());
        cbUgovor.getItems().addAll(1, 2);
        cbUgovor.valueProperty().bindBidirectional(model.ugovorProperty());
        tfImePrezime.textProperty().bindBidirectional(model.imePrezimeProperty());
        tfAdresa.textProperty().bindBidirectional(model.adresaProperty());
        
        
        TableColumn<Model, String> imePrezimeColumn = new TableColumn<>("Ime & Prezime");
        imePrezimeColumn.setMinWidth(100);
        imePrezimeColumn.setCellValueFactory(new PropertyValueFactory<>("imePrezime"));
        
        TableColumn<Model, String> adresaColumn = new TableColumn<>("Adresa");
        adresaColumn.setMinWidth(125);
        adresaColumn.setCellValueFactory(new PropertyValueFactory<>("adresa"));
        
        TableColumn<Model, Object> brzinaColumn = new TableColumn<>("Brzina");
        brzinaColumn.setMinWidth(100);
        brzinaColumn.setCellValueFactory(new PropertyValueFactory<>("brzina"));
        
        TableColumn<Model, Object> protokColumn = new TableColumn<>("Protok");
        protokColumn.setMinWidth(100);
        protokColumn.setCellValueFactory(new PropertyValueFactory<>("protok"));
        
        TableColumn<Model, Object> ugovorColumn = new TableColumn<>("Ugovor");
        ugovorColumn.setMinWidth(100);
        ugovorColumn.setCellValueFactory(new PropertyValueFactory<>("ugovor"));
        
        tabelView.getColumns().addAll(imePrezimeColumn, adresaColumn, brzinaColumn, protokColumn, ugovorColumn);
        
    }

    @FXML
    private void savePerson()
    {
	if(model.isValid())
	{
	    models = tabelView.getItems();
            models.add(new Model(tfImePrezime.getText(), tfAdresa.getText(), cbBrzina.getValue(), cbUgovor.getValue(), cbProtok.getValue()));
	    
	    tabelView.setItems(models);
        }
        else {
            StringBuilder errMsg = new StringBuilder();

	    ArrayList<String> errList = model.errorsProperty().get();
	    for(String errList1 : errList)
		errMsg.append(errList1);

	    Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setTitle("User can be saved!");
	    alert.setHeaderText(null);
	    alert.setContentText(errMsg.toString());
	    alert.showAndWait();
	    errList.clear();
        }
	
    }
    
    @FXML
    private void deletePerson()
    {
	models = tabelView.getItems();
	int index = tabelView.selectionModelProperty().getValue().getSelectedIndex();
	models.remove(index);
	tabelView.setItems(models);
    }
}
