package javaapplication89;
class idException extends Exception{}
class firstNameException extends Exception{}
class lastNameException extends Exception{}
class emailException extends Exception{}
public class MyUncheckedException  {
    public int id;
    public String firstName;
    public String lastName;
    public String email;
    
    

    public MyUncheckedException(int id, String firstName, String lastName, String email)throws idException, firstNameException, lastNameException, emailException
    {    
        if (id>100) {
            throw new idException();
        }else
        this.id=id;
        if (firstName.isEmpty()) {
            throw new firstNameException();
        }else
        this.firstName=firstName;
        if (lastName.isEmpty()) {
            throw new lastNameException();
        }else
        this.lastName=lastName;
        if (email.isEmpty()) {
            throw new emailException();
        }else
        this.email=email;
    }
}
