package gallerydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static final double DEFAULT_THUMBNAIL_WIDTH = 100;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        HBox hBox = new HBox();
        Pane imageContainer = new FlowPane(10, 10);
        ScrollPane pane = new ScrollPane(imageContainer);
        
        TextField folderPath = new TextField();
        HBox.setHgrow(folderPath, Priority.ALWAYS);
        Button loadBtn = new Button("Load");
        
        pane.fitToHeightProperty().set(true);
        pane.fitToWidthProperty().set(true);
        
        Scene scene = new Scene(root);
        pane.prefViewportHeightProperty().bind(scene.heightProperty());
        
        loadBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (folderPath.getText().equals("")) {
                    return;
                }
                
                File folder = new File(folderPath.getText());
                
                if (folder.isDirectory() && folder.exists()) {
                    
                    List<File> imageFiles = loadImgs(folder);
                    
                    ImageView imageView = null;
                    for (File file : imageFiles) {
                        
                        try {
                            imageView = createImageView(file);
                        } catch (FileNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        }
                        imageContainer.getChildren().add(imageView);
                    }
                }
            }
        });
        
        hBox.getChildren().addAll(folderPath, loadBtn);
        
        root.getChildren().addAll(hBox, pane);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private ImageView createImageView(final File imageFile) throws FileNotFoundException {
        
        final Image image = new Image(new FileInputStream(imageFile), DEFAULT_THUMBNAIL_WIDTH, 0, true, true);
        final ImageView imageView = new ImageView(image);
        
        imageView.setOnMouseEntered(entered);
        imageView.setOnMouseExited(exited);
        
        return imageView;
    }
    
    EventHandler<MouseEvent> entered = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            ImageView imageView = (ImageView) event.getTarget();
            
            if (imageView != null) {
                imageView.setEffect(new DropShadow());
            }
        }
    };
    
    EventHandler<MouseEvent> exited = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            ImageView imageView = (ImageView) event.getTarget();
            
            if (imageView != null) {
                imageView.setEffect(null);
            }
        }
    };
    
    List<File> imageFiles;
        
        private List<File> loadImgs(File folder) {
            
            imageFiles  = new ArrayList<>();
            
            File[] files = folder.listFiles();
            
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    loadImgs(files[i]);
                } else {
                    imageFiles.add(files[i]);
                }
            }
            return imageFiles;
        }
}