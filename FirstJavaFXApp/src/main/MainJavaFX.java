package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainJavaFX extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//        Label label = new Label("Enter your name: ");
//        TextField tx = new TextField();
//        Button b = new Button("OK");
        VBox root = new VBox(/*label, tx, b*/);
//        Text msg = new Text("Hello from JavaFX");
//        root.getChildren().add(msg);
        Label nameLbl = new Label("Enter your name:");
        TextField nameFld = new TextField();
        Button sayHelloBtn = new Button("Say Hello");
        sayHelloBtn.setOnAction((ActionEvent event) -> {

            String msg = "";

            String name = nameFld.getText();
            if (name.trim().length() > 0) {
                msg = "Hello " + name;
            } else {
                msg = "Hello there";
            }
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText(msg);
            alert.showAndWait();

        });
        root.getChildren().addAll(nameLbl, nameFld, sayHelloBtn);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("First JavaFX App");
        primaryStage.show();
    }
}