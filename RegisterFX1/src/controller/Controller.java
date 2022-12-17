package controller;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import registerfx1.Db;
import registerfx1.Model;

public class Controller implements Initializable {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private DatePicker bday;
    @FXML
    private ToggleGroup gender;
    @FXML
    private Button register;

    Model model;

    public Controller() {
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new Model();
        firstName.textProperty().bindBidirectional(model.firstNameProperty());
        lastName.textProperty().bindBidirectional(model.lastNameProperty());
        email.textProperty().bindBidirectional(model.emailProperty());
        password.textProperty().bindBidirectional(model.passwordProperty());
        bday.valueProperty().bindBidirectional(model.bdayProperty());
        gender.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (newValue != null) {
                    RadioButton selected = (RadioButton) newValue;

                    switch (selected.getId()) {
                        case "m":
                            model.genderProperty().set('m');
                            break;
                        case "f":
                            model.genderProperty().set('f');
                            break;
                    }
                }
            }
        });

    }

    @FXML
    private void register() throws SQLException {

        if (model.isValid()) {

            Db db = new Db();
            LocalDate selectDate = bday.getValue();
            RadioButton selected = (RadioButton) gender.getSelectedToggle();
            switch (selected.getId()) {
                case "m":
                    db.registration(firstName.getText(), lastName.getText(), email.getText(), password.getText(), selectDate, 'm');
                    break;
                case "f":
                    db.registration(firstName.getText(), lastName.getText(), email.getText(), password.getText(), selectDate, 'f');
                    break;
            }
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Unijeli ste podatke u bazu");
            alert.showAndWait();

        } else {

            StringBuilder errMsg = new StringBuilder();

            ArrayList<String> errList = model.errorsProperty().get();
            for (String errList1 : errList) {
                errMsg.append(errList1);
            }

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText(errMsg.toString());
            alert.showAndWait();
            errList.clear();
        }
    }

}
