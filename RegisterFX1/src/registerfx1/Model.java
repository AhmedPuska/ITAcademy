package registerfx1;

import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private final StringProperty firstName = new SimpleStringProperty(this, "firstName");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName");
    private final StringProperty email = new SimpleStringProperty(this, "email");
    private final StringProperty password = new SimpleStringProperty(this, "password");
    private final ObjectProperty bday = new SimpleObjectProperty(this, "bday");
    private final ObjectProperty gender = new SimpleObjectProperty(this, "gender");

    public Model() {}

    public Model(String firstName, String lastName, String email, String password, Object bday, Object gender) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.email.set(email);
        this.password.set(password);
        this.bday.set(bday);
        this.gender.set(gender);
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

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public Object getBday() {
        return bday.get();
    }

    public void setBday(Object bday) {
        this.bday.set(bday);
    }

    public ObjectProperty bdayProperty() {
        return bday;
    }

    public Object getGender() {
        return gender.get();
    }

    public void setGender(Object gender) {
        this.gender.set(gender);
    }

    public ObjectProperty genderProperty() {
        return gender;
    }

    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    public boolean isValid() {
        boolean isValid = true;

        if (firstName.get() == null || firstName.get().isEmpty()) {
            errorList.getValue().add("First name can't be empty!");
            isValid = false;
        }
        if (lastName.get() == null || lastName.get().isEmpty()) {
            errorList.getValue().add("Last name can't be empty!");
            isValid = false;
        }
        if (email.get() == null || email.get().isEmpty()) {
            errorList.getValue().add("Email can't be empty!");
            isValid = false;
        }
        if (password.get() == null || password.get().isEmpty()) {
            errorList.getValue().add("Password can't be empty!");
            isValid = false;
        }
        if (bday.get() == null) {
            errorList.getValue().add("Birthday can't be empty!");
            isValid = false;
        }
        if (gender.get() == null) {
            errorList.getValue().add("Gender can't be empty!!");
            isValid = false;
        }
        return isValid;
    }

}
