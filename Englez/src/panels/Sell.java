package panels;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import javafx.util.StringConverter;
import model.Podaci;
import model.Product;

public class Sell extends VBox {
    
    Button sellBtn;
    TableView<Product> productList;
    
    public Sell() throws IOException {
        
        setPadding(new Insets(10));
        
        URL fxmlUrl = getClass().getClassLoader().getResource("fxml/taster.fxml");
        Button root = FXMLLoader.<Button>load(fxmlUrl);
//        URL url = getClass().getResource("taster.fxml");
//        Object taster = FXMLLoader.load(url);
        
        
        sellBtn= root;
        productList = new TableView();
        
        TableColumn tc_id = new TableColumn("Id");
        tc_id.setCellValueFactory(new PropertyValueFactory<Product, String>("id"));
        
        TableColumn tc_name = new TableColumn("Name");
        tc_name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        
        TableColumn tc_price = new TableColumn("Price");
        tc_price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
        
        productList.getColumns().addAll(tc_id, tc_name, tc_price);
        
        
        productList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 
        
//        productList.setCellFactory(new Callback<ListView<Product>, ListCell<Product>>() {
//            @Override
//            public ListCell<Product> call(ListView<Product> param) {
//                ListCell<Product> listCell = new ComboBoxListCell<>();
//                listCell.setGraphic(new ImageView("1531835930599_03040385l.gif"));
//                listCell.ser
//                return listCell;
//            }
//        });
        
        ObservableList<Product> prods = Podaci.getProducts();
        
        productList.setItems(prods);
        
//        productList.setConverter(new StringConverter() {
//            @Override
//            public String toString(Object object) {
//                Product prod = (Product) object;
//                
//                return prod.name;
//            }
//
//            @Override
//            public Object fromString(String string) {
//                return null;
//            }
//        });
                
//        for(String prod : prods) {
//            productList.getItems().add(prod);
//        }
        
//        productList.getItems().add("Rakija od Pere Lozaca");
//        productList.getSelectionModel().selectFirst();
                
        sellBtn.setOnAction((evt)->{
            
//            productList.getSelectionModel().getSelectedItem();
            Product p = productList.getSelectionModel().getSelectedItem();
            
            if (p==null) {
                return;
            }
            
            Podaci.sell(p.getId(), p.getId()); 
            Alert succes = new Alert(Alert.AlertType.CONFIRMATION, "Kupio si: " + p.getName() , ButtonType.OK);
            succes.show();
        });
        
        getChildren().addAll(productList, sellBtn);
    }
}