package panels;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import model.Podaci;

public class NewProduct extends VBox{
    
    String slika = "";
    
    public NewProduct() {
        
        setPadding(new Insets(10));
        
        Label lblName        = new Label("Baverage: ");
        Label lblPrice       = new Label("Price: ");
        Label lblLabelType   = new Label("Type:");
        Label lblPicture     = new Label("Picture: ");

        TextField tfName     = new TextField();
        TextField tfPrice    = new TextField();

        CheckBox cbInStock   = new CheckBox("In stock:");

        RadioButton rbPivo   = new RadioButton("Pivo");
        RadioButton rbVino   = new RadioButton("Vino");
        RadioButton rbRakija = new RadioButton("Rakija");

        rbPivo.setSelected(true);

        ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(rbPivo,rbVino,rbRakija);

        Button btnUpload    = new Button("Load image");
        btnUpload.setOnAction(evt->{
            
            FileChooser fc = new FileChooser();
            File selectedFile = fc.showOpenDialog(getScene().getWindow());

            String nazivSlike = System.currentTimeMillis()+"_"+selectedFile.getName();
            slika = nazivSlike;

            try {
                Files.copy(selectedFile.toPath(), new FileOutputStream("C:\\Users\\user\\Desktop\\barpictures\\"+nazivSlike));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Button save = new Button("Save");
        save.setOnAction(evt->{
            String name = tfName.getText();
            double price = Double.parseDouble(tfPrice.getText());
            boolean naStanju = cbInStock.isSelected();
            String tip = "";
            
            for(Toggle tgl : group.getToggles()){
                if(tgl.isSelected()){
                     tip = ((RadioButton)tgl).getText();
                }
            }
            Podaci.insert(name, price, slika, naStanju, tip);
        
        });
        
        getChildren().addAll(lblName,tfName,lblPrice,tfPrice,cbInStock,lblLabelType,rbPivo,rbVino,rbRakija,btnUpload,save);
    }
}