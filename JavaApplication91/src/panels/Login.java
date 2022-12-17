package panels;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
public class Login extends VBox{
    public Login(){
        
        setPadding(new Insets(10));
        
        Label lblUsername = new Label("Username: ");
        Label lblPassword = new Label("Password: ");
        
        TextField tfUsername = new TextField();
        TextField tfPassword = new TextField();
        
        Button btnLogin = new Button("Login");
        btnLogin.setOnAction(evt->{
            
            String username = tfUsername.getText();
            String password = tfPassword.getText();
            Alert err = new Alert(Alert.AlertType.CONFIRMATION, "Hello man", ButtonType.OK);
            err.showAndWait();
            
        });
        
        HBox hbButton   = new HBox(btnLogin);
        hbButton.setPadding(new Insets(10));
        hbButton.setAlignment(Pos.CENTER_RIGHT);
                
        getChildren().addAll(lblUsername,tfUsername, lblPassword, tfPassword, hbButton);
    }
}
