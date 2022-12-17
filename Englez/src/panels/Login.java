package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Podaci;

public class Login extends VBox {
    public Login() {
        
        setPadding(new Insets(10));
        Label usernameLabel = new Label("Username: ");
        Label passwordLabel = new Label("Password: ");
        
        TextField usernameTF = new TextField();
        PasswordField passwordTF = new PasswordField();
        
        Button LoginBTN = new Button("Login");
        LoginBTN.setOnAction(evt->{
            
            String username = usernameTF.getText();
            String password = passwordTF.getText();
            
            if(Podaci.login(username, password)) {
                englez.Englez.switchScene("Main");
                
            } else {
                Alert err = new Alert(Alert.AlertType.ERROR, "Invalid user", ButtonType.OK);
                err.show();
            }
        });
        
        HBox hbBottom = new HBox(LoginBTN);
        hbBottom.setAlignment(Pos.CENTER_RIGHT);
        hbBottom.setPadding(new Insets(10));
        
        getChildren().addAll(usernameLabel, usernameTF, passwordLabel, passwordTF, hbBottom);
    }
}