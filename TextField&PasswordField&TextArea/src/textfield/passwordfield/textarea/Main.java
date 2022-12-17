
package textfield.passwordfield.textarea;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        TextField textFld = new TextField();
        textFld.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
            System.out.println(newValue);
        });

        textFld.setText("New Text");

        textFld.setOnAction((ActionEvent event) -> {
            System.out.println("Enter pressed!");
        });

        ContextMenu cm = new ContextMenu();
        MenuItem dummyItem1 = new MenuItem("MenuItem1");
        MenuItem dummyItem2 = new MenuItem("MenuItem2");
        MenuItem dummyItem3 = new MenuItem("MenuItem3");
        cm.getItems().addAll(dummyItem1, dummyItem2, dummyItem3);

        textFld.setContextMenu(cm);

        GridPane root = new GridPane();
        root.addColumn(0, textFld);
        Insets margin = new Insets(10);
        GridPane.setMargin(textFld, margin);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
//        TextField nameFld = new TextField();
//        Label anchorLbl = new Label("");
//        Label caretLbl = new Label("");
//        Label lengthLbl = new Label("");
//        Label selectedTextLbl = new Label("");
//        Label selectionLbl = new Label("");
//        Label textLbl = new Label("");
//
//        anchorLbl.textProperty().bind(nameFld.anchorProperty().asString());
//        caretLbl.textProperty().bind(nameFld.caretPositionProperty().asString());
//        lengthLbl.textProperty().bind(nameFld.lengthProperty().asString());
//        selectedTextLbl.textProperty().bind(nameFld.selectedTextProperty());
//        selectionLbl.textProperty().bind(nameFld.selectionProperty().asString());
//        textLbl.textProperty().bind(nameFld.textProperty());
//        GridPane root = new GridPane();
//        root.setHgap(10);
//        root.setVgap(5);
//        root.addRow(0, new Label("Name:"), nameFld);
//        root.addRow(1, new Label("Anchor Position:"), anchorLbl);
//        root.addRow(2, new Label("Caret Postion:"), caretLbl);
//        root.addRow(3, new Label("Length:"), lengthLbl);
//        root.addRow(4, new Label("Selected Text:"), selectedTextLbl);
//        root.addRow(5, new Label("Selection:"), selectionLbl);
//        root.addRow(6, new Label("Text:"), textLbl);
//
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Text Input Control Properties");
//        primaryStage.show();
    }
}