package anchorpane.textflow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
//        TextFlow tflow = new TextFlow();
//        tflow.setLineSpacing(5);
//        tflow.setTextAlignment(TextAlignment.CENTER);
        
        TextField nameFld = new TextField();
        nameFld.setPromptText("Your Name");

        Text tx1 = new Text("I, ");
        Text tx2 = new Text(" in full conscience and with sound mind, declare... \n\n Sincerely,\n");
        TextFlow tflow = new TextFlow();
        tflow.getChildren().addAll(tx1,nameFld, tx2);
        
//        Text tx1 = new Text("TextFlow layout pane is cool! ");
//        Text tx2 = new Text("It supports rich text display.");
//        TextFlow tflow = new TextFlow(tx1, tx2);
        
//        TextFlow tflow = new TextFlow();
//        tflow.getChildren().addAll(tx1, tx2);
        
        
        
        Scene scene = new Scene(tflow);

        primaryStage.setScene(scene);
        primaryStage.show();
        
//        Button okBtn = new Button("OK");
//
//        AnchorPane apane = new AnchorPane();
//        apane.getChildren().addAll(okBtn);
//
//        AnchorPane.setLeftAnchor(okBtn, 10.0);
//        AnchorPane.setRightAnchor(okBtn, 10.0);
//
//        Scene scene = new Scene(apane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
//        Button okBtn = new Button("OK");
//        Button cancelBtn = new Button("Cancel");
//        AnchorPane apane = new AnchorPane(okBtn, cancelBtn);
////        apane.getChildren().addAll(okBtn, cancelBtn);        
//        
//        AnchorPane.setLeftAnchor(okBtn, 10.0);
//        AnchorPane.setLeftAnchor(cancelBtn, okBtn.getWidth() + 15.0);
//        
//        
//        Scene scene = new Scene(apane);
//        
//        primaryStage.setScene(scene);
//        primaryStage.show();

    }
}