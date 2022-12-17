package services;

import annotations.ConstraintValidator.Pid;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
    
    @NotEmpty(message = "First name can not be left empty")
    private String first_name;

    @NotEmpty
    private String last_name;

    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date_of_birth;

    @Pid
    private String pid;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String country;

    @NotEmpty
    private String city;

    @NotEmpty
    private String postal;
//    private String first_name;
//    private String last_name;
//  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//    private LocalDate date_of_birth;
//    private String pid;
//    private String email;    
//    private String country;
//    private String city;
//    private String postal;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
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