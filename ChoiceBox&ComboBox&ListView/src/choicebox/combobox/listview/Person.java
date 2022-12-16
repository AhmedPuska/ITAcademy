
package choicebox.combobox.listview;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final IntegerProperty age = new SimpleIntegerProperty(this, "age", 0);

    public Person() {

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.age.set(age);

    }

    public Person(String firstName) {
        this.firstName.set(firstName);
    }

    public Person(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);

    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public int getAge() {
        return age.get();
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public IntegerProperty ageProperty() {
        return age;
    }
}