package label.button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    
    Label message = null;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Hyperlink itaLink = new Hyperlink("Link Group");
        WebView webview = new WebView();
        itaLink.setOnAction(e -> webview.getEngine().load("http://www.saff.ba"));

        GridPane gridPane = new GridPane();

        gridPane.add(itaLink, 0, 0, 1, 1);
        gridPane.addRow(1, webview);

        Scene scene = new Scene(gridPane);

        primaryStage.setScene(scene);
        primaryStage.show();
        
        
//        message = new Label("nothing clicked...");
//
//        Button normalButton = new Button("_Normal");
//        normalButton.setId("normalButton");
//
//        Button defaultButton = new Button("_Default");
//        defaultButton.setDefaultButton(true);
//        defaultButton.setId("defaultButton");
//
//        Button cancelButton = new Button("_Cancel");
//        cancelButton.setCancelButton(true);
//        cancelButton.setId("cancelButton");
//
//        normalButton.setOnAction(e -> btnClicked(e));
//        defaultButton.setOnAction(e -> btnClicked(e));
//        cancelButton.setOnAction(e -> btnClicked(e));
//
//        GridPane gridPane = new GridPane();
//
//        gridPane.add(message, 0, 0, 3, 1);
//        gridPane.addRow(1, normalButton, defaultButton, cancelButton);
//
//        Scene scene = new Scene(gridPane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
//        Button button = new Button("This is button");
//        
//        TextField firstNameField = new TextField();    
//        TextField lastNameField = new TextField();
//
//        Label firstNameLbl = new Label("_First Name:");
//        Label lastNameLbl = new Label("_Last Name:");
//
//        firstNameLbl.setLabelFor(firstNameField);
//        firstNameLbl.setMnemonicParsing(true);
//
//        lastNameLbl.setLabelFor(lastNameField);
//        lastNameLbl.setMnemonicParsing(true);
//
//        GridPane gridPane = new GridPane();
//
//        gridPane.addRow(0, firstNameLbl, firstNameField);
//        gridPane.addRow(1, lastNameLbl, lastNameField);
//        
//        Scene scene = new Scene(gridPane);
//        
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    
    private void btnClicked(ActionEvent e) {

        Button button = (Button) e.getSource();

        if (null != button.getId()) {
            switch (button.getId()) {
                case "normalButton":
                    message.setText("normal...");
                    break;
                case "defaultButton":
                    message.setText("default...");
                    break;
                case "cancelButton":
                    message.setText("cancel...");
                    break;
            }
        }
    }
}