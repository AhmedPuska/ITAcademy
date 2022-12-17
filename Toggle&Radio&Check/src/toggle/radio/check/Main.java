package toggle.radio.check;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    //checkBox
    Label info;
    CheckBox crazyCbx;
    
    
//    //radioButton
//    RadioButton s_radio;
//    RadioButton m_radio;
//    RadioButton l_radio;
//    RadioButton xl_radio;
//
//    Label info;
//    Label header;
    
    //toggleButton
//    ToggleButton onOff = null;
//    ToggleButton s_toggle;
//    ToggleButton m_toggle;
//    ToggleButton l_toggle;
//    ToggleButton xl_toggle;
//
//    Label info;
//    Label header;

//     //RadioButton  
//     private void toggle(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//
//        if (newValue != null) {
//            ToggleButton toggleButton = (ToggleButton) newValue;
//            info.setText("Your size is " + toggleButton.getText() + "!");
//        }
//    }
    
    //CheckBox
    public void changed(ObservableValue<? extends Boolean> observable,
            Boolean oldValue,
            Boolean newValue) {

        if (crazyCbx.isIndeterminate()) {
            info.setText("You are not sure if you are crazy!");
        } else if (crazyCbx.isSelected()) {
            info.setText("You are crazy! Congratulation!");
        } else {
            info.setText("You are not crazy! Are you sure?");
        }

    }
    
    public static void main(String[] args) {
        launch(args);
    }    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        info = new Label("Please, choose your answer...");

        crazyCbx = new CheckBox("Are you crazy?");
        crazyCbx.setAllowIndeterminate(true);

        crazyCbx.selectedProperty().addListener(this::changed);
        crazyCbx.indeterminateProperty().addListener(this::changed);

        VBox root = new VBox(10, crazyCbx, info);

        Insets margin = new Insets(10);
        VBox.setMargin(crazyCbx, margin);
        VBox.setMargin(info, margin);

        Scene scene = new Scene(root, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
//        header = new Label("Choose your size: ");
//        info = new Label();
//
//        s_radio = new RadioButton("S");
//        m_radio = new RadioButton("M");
//        l_radio = new RadioButton("L");
//        xl_radio = new RadioButton("XL");
//
//        s_radio.setPrefWidth(50);
//        m_radio.setPrefWidth(50);
//        l_radio.setPrefWidth(50);
//        xl_radio.setPrefWidth(50);
//
//        ToggleGroup group = new ToggleGroup();
//        group.getToggles().addAll(s_radio, m_radio, l_radio, xl_radio);
//        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> toggle(observable, oldValue, newValue));
//
//        GridPane gridPane = new GridPane();
//        gridPane.setVgap(10.0);
//        gridPane.setHgap(10.0);
//        gridPane.add(header, 0, 0, 4, 1);
//        gridPane.addRow(1, s_radio, m_radio, l_radio, xl_radio);
//        gridPane.add(info, 0, 2, 4, 1);
//
//        Scene scene = new Scene(gridPane);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        s_radio.setSelected(true);
//        
        
        
//        header = new Label("Choose your size: ");
//        info = new Label();
//
//        s_toggle = new ToggleButton("S");
//        m_toggle = new ToggleButton("M");
//        l_toggle = new ToggleButton("L");
//        xl_toggle = new ToggleButton("XL");
//
//        s_toggle.setPrefWidth(50);
//        m_toggle.setPrefWidth(50);
//        l_toggle.setPrefWidth(50);
//        xl_toggle.setPrefWidth(50);
//
//        ToggleGroup group = new ToggleGroup();
//        group.getToggles().addAll(s_toggle, m_toggle, l_toggle, xl_toggle);
//        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> toggle(observable, oldValue, newValue));
//
//        GridPane gridPane = new GridPane();
//        gridPane.setVgap(10.0);
//        gridPane.setHgap(10.0);
//        gridPane.add(header, 0, 0, 4, 1);
//        gridPane.addRow(1, s_toggle, m_toggle, l_toggle, xl_toggle);
//        gridPane.add(info, 0, 2, 4, 1);
//
//        Scene scene = new Scene(gridPane);
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
//        onOff = new ToggleButton("Power OFF");
//        onOff.setOnAction(e -> toggle(e));
//
//        GridPane gridPane = new GridPane();
//        gridPane.add(onOff, 0, 0, 1, 1);
//        Scene scene = new Scene(gridPane);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
//    private void toggle(ActionEvent e) {
//
//        if (onOff.isSelected()) {
//            onOff.setText("Power ON");
//        } else {
//            onOff.setText("Power OFF");
//        }
//    }
    
    //ToggleButton
//    private void toggle(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//
//        if (oldValue != null && newValue == null) {
//            info.setText("You didn't select anything!");
//        }
//
//        if (newValue != null) {
//            ToggleButton toggleButton = (ToggleButton) newValue;
//            info.setText("You selected " + toggleButton.getText() + " size!");
//        }
//    }
    
}