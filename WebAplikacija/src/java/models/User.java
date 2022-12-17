package models;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

public class User {
    
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    @NotEmpty
    private String pid;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String country;
    @NotEmpty
    private String city;
    @NotEmpty
    private String postal;

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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
    
    
}
