package registration;

import entitiy.Config;
import entitiy.DataProvider;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named(value = "user")
@SessionScoped
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date birthday;
    private char gender;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String registration() {
        
        int i = 0;
        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sbf.format(birthday);

        Connection conn = null;
        PreparedStatement ps;

        try {
            conn = DataProvider.getConnection();
            ps = conn.prepareStatement("insert into registration(firstname, lastname, email, password, birthday, gender) values (?,?,?,md5(?),?,?)");
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, date);
            ps.setString(6, String.valueOf(gender));
            i = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (i > 0) {
            return "success.xhtml";
        } else {
            return "unsuccess.xhtml";
        }
    }

    public User() {
    }

}
