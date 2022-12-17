/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;
class InvalidEmailException extends Exception
{
}

class InvalidFirstNameException extends Exception
{
}

class InvalidIdException extends Exception
{
}

class InvalidLastNameException extends Exception
{
}

public class Main
{
    public int id;
    public String firstName;
    public String lastName;
    public String email;

    public Main(int id, String firstName, String lastName, String email) throws InvalidIdException, InvalidFirstNameException, InvalidLastNameException, InvalidEmailException
    {
        if(id > 100)
            throw new InvalidIdException();
        else
            this.id = id;

        if(firstName.isEmpty())
            throw new InvalidFirstNameException();
        else
            this.firstName = firstName;

        if(lastName.isEmpty())
            throw new InvalidLastNameException();
        else
            this.lastName = lastName;

        if(email.isEmpty())
            throw new InvalidEmailException();
        else
            this.email = email;
    }
}
