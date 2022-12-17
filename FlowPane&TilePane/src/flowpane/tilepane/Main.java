package flowpane.tilepane;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        List<Node> controls = new ArrayList();

        Node node;

        for (int i = 0; i < 50; i++) {
            node = new Button("Button" + i);
            controls.add(node);
        }

        TilePane tilePane = new TilePane();

        tilePane.getChildren().addAll(controls);
        tilePane.setAlignment(Pos.TOP_RIGHT);
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setOrientation(Orientation.HORIZONTAL);
        tilePane.setPrefColumns(8);
        tilePane.setPrefTileWidth(40);
        tilePane.setPrefTileHeight(40);

        Scene scene = new Scene(tilePane);

        primaryStage.setScene(scene);
        primaryStage.show();
        
        
//        List<Node> controls = new ArrayList();
//        
//        Node node;
//        
//        for (int i = 0; i < 50; i++) {
//            node = new Button("Button" + i);          
//            controls.add(node);
//        }
//
////        FlowPane flowPane = new FlowPane();
//        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
//        flowPane.getChildren().addAll(controls);
//        
//
//        Scene scene = new Scene(flowPane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
}