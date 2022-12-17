package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import model.Model;
//import main.Gender;
//import main.Person;

/**
 *
 * @author Dreshke
 */
public class ModelController {

    @FXML private TableView<Model> tableView;
    @FXML private ChoiceBox cbBrzina;
    @FXML private ComboBox cbProtok;
    @FXML private ComboBox cbUgovor;
    @FXML private TextField tfImePrezime;
    @FXML private TextField tfAdresa;@FXML private TextField tffirstName;@FXML private TextField tflastName;
    @FXML private TextField tfemail;

    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;

    ObservableList<Model> persons = FXCollections.<Model>observableArrayList();
    Model model;

    public ModelController() {
    }

    @FXML
    private void initialize() {

        model = new Model();

        cbBrzina.getItems().addAll(2, 5, 10, 20, 50, 100);
        cbBrzina.valueProperty().bindBidirectional(model.brzinaProperty());
        cbProtok.getItems().addAll(1, 5, 10, 100, "Flat");
        cbProtok.valueProperty().bindBidirectional(model.protokProperty());
        cbUgovor.getItems().addAll(1, 2);
        cbUgovor.valueProperty().bindBidirectional(model.ugovorProperty());
        tfAdresa.textProperty().bindBidirectional(model.adresaProperty());
        tfImePrezime.textProperty().bindBidirectional(model.imePrezimeProperty());

        
        TableColumn idColumn = new TableColumn("Id");
        idColumn.setMinWidth(20);
//        idColumn.setCellValueFactory(new PropertyValueFactory<Model, Integer>("id"));
//        numberCol.setCellValueFactory(new Callback<CellDataFeatures<Person, Person>, ObservableValue<Person>>() {
//            @Override public ObservableValue<Person> call(CellDataFeatures<Person, Person> p) {
//                return new ReadOnlyObjectWrapper(p.getValue());
//            }
//        });
        idColumn.setCellValueFactory(new Callback<CellDataFeatures<Model, Model>, ObservableValue<Model>>() {
            @Override public ObservableValue<Model> call(CellDataFeatures<Model, Model> p) {
                return new ReadOnlyObjectWrapper(p.getValue());
            }
        });
        idColumn.setCellFactory(new Callback<TableColumn<Model, Model>, TableCell<Model, Model>>() {
            @Override public TableCell<Model, Model> call(TableColumn<Model, Model> param) {
                return new TableCell<Model, Model>() {
                    @Override protected void updateItem(Model item, boolean empty) {
                        super.updateItem(item, empty);

                        if (this.getTableRow() != null && item != null) {
                            setText(this.getTableRow().getIndex()+"");
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
        
        TableColumn<Model, String> firstColumn = new TableColumn<>("First Name");
        firstColumn.setMinWidth(100);
        firstColumn.setCellValueFactory(new PropertyValueFactory<Model, String>("firstName"));
//        tableView = new TableView<>();
        tableView.setItems(getModel());
        tableView.getColumns().addAll(idColumn, imePrezimeColumn, adresaColumn, brzinaColumn, protokColumn, ugovorColumn, firstColumn);
        
        
        
//        gender.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//
//                if (newValue != null) {
//
//                    ToggleButton selected = (ToggleButton) newValue;
//
//                    switch (selected.getId()) {
//                        case "male":
//                            person.genderProperty().set(Gender.MALE);
//                            break;
//                        case "female":
//                            person.genderProperty().set(Gender.FEMALE);
//                            break;
//                    }
//                }
//            }
//        });

        System.out.println("Location = " + location);
        System.out.println("Resources = " + resources);
    }
    
    private ObservableList<Model> getModel() {
        ObservableList<Model> models = FXCollections.observableArrayList();
        models.add(new Model(1, "Puska Ahmed", "Ahmica", 2, "", 100));
        models.add(new Model(2, "Puska Ahmed", "Ahmica", 2, "", 100));
        models.add(new Model(3, "Puska Ahmed", "Ahmica", 3, "", 100));
        models.add(new Model(4, "Puska Ahmed", "Ahmica", 4, "", 100));
        models.add(new Model(5, "Puska Ahmed", "Ahmica", 5, "", 100));
        return models;
    }

    @FXML
    private void savePerson() {
        if (model.isValid()) {
            ObservableList<Model> data = tableView.getItems();
        data.add(new Model(0, tfImePrezime.getText(), tfAdresa.getText(), cbBrzina.setConverter(new Model()), cbUgovor.getValue(), cbProtok.getValue()));
//            ObservableList<Model> data = tableView.getItems();
//        data.add(new Model(tffirstName.getText(),
////                tfImePrezime.getText(),
//            tflastName.getText(),
//            tfemail.getText()
//        ));
        

//            ObservableList<Model> data = tableView.getItems();
//        data.add(new Model(tffirstName.getText(),
////                tfImePrezime.getText(),
//            tflastName.getText(),
//            tfemail.getText()
//        ));
//        
//        tffirstName.setText("");
//        tflastName.setText("");
//        tfemail.setText("");  
        } else {

            StringBuilder errMsg = new StringBuilder();

            ArrayList<String> errList = model.errorsProperty().get();

            for (String errList1 : errList) {
                errMsg.append(errList1);
            }

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Person can be saved!");
            alert.setHeaderText(null);
            alert.setContentText(errMsg.toString());
            alert.showAndWait();
            errList.clear();

        }
    }

    @FXML
    private void closeForm() {
        Platform.exit();
    }

    @FXML
    private void clearPerson() {

        model.firstNameProperty().set("");
        model.lastNameProperty().set("");
        model.emailProperty().set("");
//        person.genderProperty().set(Gender.FEMALE);

//        if (gender.getSelectedToggle() != null) {
//            gender.getSelectedToggle().setSelected(false);
//        }

    }

}