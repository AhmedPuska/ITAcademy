package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
//import model.Gender;
import model.Person;

/**
 *
 * @author Dreshke
 */
public class PersonController {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private TextField address;
    @FXML
    private TextField country;

    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    @FXML
    private Button closeBtn;

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;

    ObservableList<Person> persons = FXCollections.<Person>observableArrayList();
    Person person;

    public PersonController() {
    }

    @FXML
    private void initialize() {

        person = new Person();

        firstName.textProperty().bindBidirectional(person.firstNameProperty());
        lastName.textProperty().bindBidirectional(person.lastNameProperty());
        email.textProperty().bindBidirectional(person.emailProperty());
        address.textProperty().bindBidirectional(person.addressProperty());
        country.textProperty().bindBidirectional(person.countryProperty());

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
//
//        System.out.println("Location = " + location);
//        System.out.println("Resources = " + resources);
    }

    @FXML
    private void savePerson() {
        if (person.isValid()) {
            person.save();
        } else {

            StringBuilder errMsg = new StringBuilder();

            ArrayList<String> errList = person.errorsProperty().get();

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

        person.firstNameProperty().set("");
        person.lastNameProperty().set("");
        person.emailProperty().set("");
        person.addressProperty().set("");
        person.countryProperty().set("");

    }

}