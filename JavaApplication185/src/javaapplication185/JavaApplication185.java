package javaapplication185;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

public class JavaApplication185 extends Application {


    @Override 
    public void start(Stage primaryStage) throws Exception {
        
        BorderPane bpane = new BorderPane();
        bpane.setTop(new Text("Top"));
        bpane.setRight(new Text("Right"));
        bpane.setBottom(new Text("Bottom"));
        bpane.setLeft(new Text("Left"));
        bpane.setCenter(new Text("Center"));

        Button center = new Button("CENTER");
        Button top = new Button("TOP");
        Button right = new Button("RIGHT");
        Button bottom = new Button("BOTTOM");
        Button left = new Button("LEFT");

        top.setMaxWidth(Double.MAX_VALUE);
        bottom.setMaxWidth(Double.MAX_VALUE);
        

//        BorderPane bpane = new BorderPane(center, top, right, bottom, left);
        
        Scene scene = new Scene(bpane);
        
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
//        TilePane tilePane = new TilePane();
//
//        tilePane.getChildren().addAll(controls);
//
//        Scene scene = new Scene(tilePane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
        
//        List<Node> controls = new ArrayList();
//        
//        Node node;
//        
//        for (int i = 0; i < 50; i++) {
//            node = new Button("Button" + i);          
//            controls.add(node);
//        }
//
//        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
//        flowPane.getChildren().addAll(controls);
//
//        Scene scene = new Scene(flowPane);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        
//        Button yes = new Button("Yes");
//        Button no = new Button("No");
//        
//        no.layoutYProperty().bind(yes.layoutYProperty());
//        no.layoutXProperty().bind(yes.layoutXProperty().add(yes.widthProperty().add(10)));
//        
//        Group group = new Group(yes, no);
//        
//        group.setEffect(new DropShadow());
//        
//        Scene scene = new Scene(group);
//        
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
    }

    public static void main(String[] args) { 
            Application.launch(args);
    }
}