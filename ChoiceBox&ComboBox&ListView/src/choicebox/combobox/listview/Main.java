package choicebox.combobox.listview;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
@Override
    public void start(Stage primaryStage) throws Exception {

        Label info = new Label("Persons:");
        ListView<Person> persons = getPersonListView();

        GridPane root = new GridPane();
        root.addColumn(0, info, persons);
        Insets margin = new Insets(10);
        GridPane.setMargin(persons, margin);
        GridPane.setMargin(info, margin);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public ListView<Person> getPersonListView() {
        ListView<Person> persons = new ListView<>();
        persons.setPrefSize(200, 120);
        persons.setEditable(true);
        persons.getItems().addAll(new Person("John", "Jacobs", 33),
                new Person("Donna", "Duncan", 25),
                new Person("Layne", "Estes", 11),
                new Person("Mason", "Boyd", 65));

        PersonStringConverter converter = new PersonStringConverter();
        Callback<ListView<Person>, ListCell<Person>> cellFactory = TextFieldListCell.forListView(converter);
        persons.setCellFactory(cellFactory);

        persons.setOnEditStart(new EventHandler<ListView.EditEvent<Person>>() {

            @Override
            public void handle(ListView.EditEvent<Person> event) {

                int index = event.getIndex();
                System.out.println("Edit of item at index " + index + " started");
            }
        });

        persons.setOnEditCommit(new EventHandler<ListView.EditEvent<Person>>() {

            @Override
            public void handle(ListView.EditEvent<Person> event) {
                int index = event.getIndex();
                Person p = event.getNewValue();
                System.out.println("Edit of item at index " + index + " finished");

                PersonStringConverter converter = new PersonStringConverter();
                System.out.println("New value is " + converter.toString(p));
            }
        });

        persons.setOnEditCancel(new EventHandler<ListView.EditEvent<Person>>() {

            @Override
            public void handle(ListView.EditEvent<Person> event) {
                int index = event.getIndex();
                System.out.println("Edit of item at index " + index + " canceled");
            }
        });

        return persons;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        
//        
//        Label info = new Label("Select person:");
//        Label selection_text = new Label("Selected person: ");
//        Label selection = new Label("none");
//
//        ObservableList<Person> personList = FXCollections.observableArrayList(
//                new Person("John", "Jacobs", 33), new Person("John", "Deen", 21), new Person("Frederic", "Rust", 15), new Person("Michael", "Breed", 54));
//
//        ComboBox<Person> personas = new ComboBox(personList);
//
//        personas.setConverter(new PersonStringConverter());
//        personas.setEditable(true);
//
//        personas.setOnAction(e -> {
//            Person p = personas.getValue();
//            String name = p.getLastName() + ", " + p.getFirstName();
//            selection.setText(name);
//
//        });
//
//        personas.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Person>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
//                System.out.println("Selected item changed. New selected item is " + newValue);
//            }
//        });
//
//        personas.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("Selected index changed. New selected index is " + newValue);
//            }
//        });
//
//        GridPane root = new GridPane();
//
//        root.addRow(0, info, personas);
//        root.addRow(1, selection_text, selection);
//
//        Insets margin = new Insets(10);
//        GridPane.setMargin(info, margin);
//        GridPane.setMargin(personas, margin);
//        GridPane.setMargin(selection_text, margin);
//        GridPane.setMargin(selection, margin);
//
//        Scene scene = new Scene(root, 300, 100);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        
//        
//        
////        Label info = new Label("Select person:");
////        Label selection_text = new Label("Selected person: ");
////        Label selection = new Label();
////
////        ObservableList<Person> personList = FXCollections.<Person>observableArrayList(
////                new Person("John", "Jacobs", 33), new Person("John", "Deen", 21), new Person("Frederic", "Rust", 15), new Person("Michael", "Breed", 54));
////        ChoiceBox personas = new ChoiceBox(personList);
////
////        personas.setConverter(new PersonStringConverter());
////
////        personas.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Person>() {
////
////            @Override
////            public void changed(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
////
////                PersonStringConverter converter = new PersonStringConverter();
////
////                if (newValue != null) {
////                    selection.setText(converter.toString(newValue));
////                }
////
////            }
////        });
////
////        GridPane root = new GridPane();
////
////        root.addRow(0, info, personas);
////        root.addRow(1, selection_text, selection);
////
////        Insets margin = new Insets(10);
////        GridPane.setMargin(info, margin);
////        GridPane.setMargin(personas, margin);
////        GridPane.setMargin(selection_text, margin);
////        GridPane.setMargin(selection, margin);
////
////        Scene scene = new Scene(root, 300, 100);
////        primaryStage.setScene(scene);
////        primaryStage.show();
//        
//        
////        Label info = new Label("Choose your size:");
////        Label selection_text = new Label("Your size: ");
////        Label selection = new Label();
////
////        ObservableList<String> sizeList = FXCollections.<String>observableArrayList("S", "M", "L", "XL");
////        ChoiceBox sizes = new ChoiceBox(sizeList);
////
////        selection.textProperty().bind(sizes.valueProperty());
////
////        sizes.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, Object oldValue, Object newValue) -> {
////            System.out.println("Itemchanged: old = " + oldValue + ", new = " + newValue);
////        });
////
////        GridPane root = new GridPane();
////
////        root.addRow(0, info, sizes);
////        root.addRow(1, selection_text, selection);
////
////        Insets margin = new Insets(10);
////        GridPane.setMargin(info, margin);
////        GridPane.setMargin(sizes, margin);
////        GridPane.setMargin(selection_text, margin);
////        GridPane.setMargin(selection, margin);
////
////        Scene scene = new Scene(root, 300, 100);
////        primaryStage.setScene(scene);
////        primaryStage.show();
//    }
}