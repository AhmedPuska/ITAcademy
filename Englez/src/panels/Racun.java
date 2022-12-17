package panels;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class Racun extends VBox{
    VBox root;
    public Racun() {
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/racun.fxml"));
            getChildren().add(root);
        } catch (IOException ex) {
            Logger.getLogger(Racun.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}