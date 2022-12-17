package db;

public class Model {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String birthday;
    private char gender;

    public Model() {
    }
    
    public Model(String firstName, String lastName, String email, String password, String birthday, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.gender = gender;
    }
   

    public boolean isValid() {
        boolean isValid = true;
        if (firstName.equals("")) {
            return false;
        }

        if (lastName.equals("")) {
            return false;
        }

        if (email.equals("")) {
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
