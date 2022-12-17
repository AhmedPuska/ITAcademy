
package regristovanje;

import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Regristovanje extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getClassLoader().getResource("view/ModelView.fxml");
	HBox root = FXMLLoader.<HBox>load(fxmlUrl);
        
	Scene scene = new Scene(root);
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    
}
