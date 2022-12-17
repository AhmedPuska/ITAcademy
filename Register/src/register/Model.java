package register;

import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "ErrorMsg", "First name can't be empty!!!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (lastName.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "lastname name can't be empty!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "email name can't be empty!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "password name can't be empty!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (birthday.equals("") && birthday == null) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "bdate name can't be empty!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (gender == 0) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "gender name can't be empty!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return isValid;
    }
}
