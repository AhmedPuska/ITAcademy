package registrastion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String birthday;
    private char gender;

    public Model() {
        Db db = new Db();
        try {
            db.registration(firstName, lastName, email, password, email, gender);
        } catch (SQLException ex) {
            System.out.println("GRESKA!!! ");
            ex.printStackTrace();
        }
    }

    public Model(String firstName, String lastName, String email, String password, String birthday, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.gender = gender;
    }

    public boolean emailValidation() {
        Pattern emailPattern = Pattern.compile("[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,4}");
        Matcher matcher = emailPattern.matcher(email);
        return matcher.find();
    }

    public boolean isValid() {
        boolean isValid = true;
        if (firstName.equals("")) {
            return false;
        }

        if (lastName.equals("")) {
            return false;
        }

        if (!emailValidation() && email.equals("")) {
            return false;
        }

        if (password.equals("")) {
            return false;
        }

        if (birthday.equals("") && birthday == null) {
            return false;
        }

        if (gender == 0) {
            return false;
        }

        return isValid;
    }
}
