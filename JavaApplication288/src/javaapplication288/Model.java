package javaapplication288;

import java.util.Date;
import javax.swing.JOptionPane;


public class Model {
    private int id;
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

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public boolean isValid() {
        boolean isValid = true;
        if (firstName.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "First name can't be empty!!!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno ime");
            return false;
        }

        if (lastName.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "lastname name can't be empty!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno lastname");
            return false;
        }
        
        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "email name can't be empty!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno email");
            return false;
        }
        
        if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "password name can't be empty!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno password");
            return false;
        }
        
        if (birthday.equals("")&&birthday==null) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "bdate name can't be empty!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno bdate");
            return false;
        }
        
        if (gender==0) {
            JOptionPane.showMessageDialog(null, "ErrorMsg", "gender name can't be empty!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Ovo je prazno gender");
            return false;
        }

        return isValid;
    }
}
