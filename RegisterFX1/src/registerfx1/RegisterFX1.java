package registerfx1;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterFX1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlUrl = getClass().getClassLoader().getResource("view/View.fxml");
//        GridPane root = FXMLLoader.<GridPane>load(fxmlUrl);
        VBox root = FXMLLoader.<VBox>load(fxmlUrl);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setWidth(350);
        primaryStage.setHeight(350);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
