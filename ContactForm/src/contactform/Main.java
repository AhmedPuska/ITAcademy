
package contactform;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }   

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        GridPane grid = new GridPane();
        
        Label firstNameLabel = new Label("First name:");
        TextField firstName = new TextField();
        grid.addRow(0, firstNameLabel, firstName);
        
        Label lastNameLabel = new Label("Last name:");
        TextField lastName = new TextField();
        grid.addRow(1, lastNameLabel, lastName);
        
        Label emailLabel = new Label("Email: ");
        TextField email = new TextField();
        grid.addRow(2, emailLabel, email);
        
        
        Label questionLabel = new Label("Question:");
        grid.add(questionLabel, 0, 3);
        TextArea question = new TextArea();
        grid.add(question, 0, 4, 2, 1);
//        grid.addRow(3, questionLabel, question);

        GridPane.setHgrow(firstName, Priority.ALWAYS);
        GridPane.setVgrow(question, Priority.ALWAYS);
        
        Button btn = new Button("Send");
        GridPane.setHalignment(btn, HPos.RIGHT);
        grid.add(btn, 1, 5, 2, 1);
        
//        grid.setGridLinesVisible(true);
        
        
        
        Scene scene = new Scene(grid);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}