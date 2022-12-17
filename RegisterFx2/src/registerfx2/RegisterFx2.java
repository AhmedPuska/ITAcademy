package registerfx2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RegisterFx2 extends Application {

    Label label1;
    TextField textfield1;
    TextField textfield2;
    TextField textfield3;
    PasswordField password1;
    DatePicker bday;
    ToggleGroup group = new ToggleGroup();
    RadioButton radiobutton1;
    RadioButton radiobutton2;
    Button register;
    char gender;

    public void start(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        GridPane gpane = new GridPane();
        gpane.setAlignment(Pos.CENTER);
        gpane.setHgap(10);
        gpane.setVgap(10);
        gpane.setPadding(new Insets(5, 10, 5, 10));

        label1 = new Label("Registration");
        label1.setFont(new Font(26));
        label1.setPadding(new Insets(5, 10, 5, 10));
        textfield1 = new TextField();
        textfield2 = new TextField();
        textfield3 = new TextField();
        password1 = new PasswordField();

        bday = new DatePicker();

        radiobutton1 = new RadioButton();
        radiobutton1.setText("male");
        radiobutton2 = new RadioButton();
        radiobutton2.setText("female");

        group.getToggles().addAll(radiobutton1, radiobutton2);
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (group.getSelectedToggle().equals(radiobutton1)) {
                    gender = 'm';
                }
                if (group.getSelectedToggle().equals(radiobutton2)) {
                    gender = 'f';
                }
            }
        });

        register = new Button();

        textfield1.setPromptText("First Name");
        textfield2.setPromptText("Last Name");
        textfield3.setPromptText("Email");
        password1.setPromptText("password");
        register.setText("Create a New Account");

        HBox radioButton = new HBox(10);

        GridPane.setConstraints(textfield1, 0, 0);
        GridPane.setConstraints(textfield2, 1, 0);
        GridPane.setConstraints(textfield3, 0, 1);
        GridPane.setConstraints(password1, 1, 1);
        GridPane.setConstraints(bday, 0, 2);
        GridPane.setConstraints(radioButton, 1, 2);
        GridPane.setConstraints(register, 1, 3);

        radioButton.getChildren().addAll(radiobutton1, radiobutton2);

        gpane.getChildren().addAll(textfield1, textfield2, textfield3, password1, bday, radioButton, register);
        root.getChildren().addAll(label1, gpane);

        register.setOnAction(e -> btnClicked(e));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setWidth(350);
        primaryStage.setHeight(350);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void btnClicked(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/podaci", "root", "");
            Statement st = conn.createStatement();

            LocalDate selectDate = bday.getValue();

            String query = "insert into registration values (null, '"
                    + textfield1.getText()
                    + "', '" + textfield2.getText()
                    + "', '" + textfield3.getText()
                    + "', '" + password1.getText()
                    + "', '" + selectDate
                    + "', '" + gender
                    + "')";
            st.execute(query);
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
