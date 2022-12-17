/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/*final možemo dodeliti i klasi. Tada njeno nasleđivanje neće biti moguće.*/
//public final class Person
public abstract class Person
{
    public String firstName, lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show()
    {
        System.out.println("Person: " + firstName + " " + lastName);
    }
    public abstract String getLastName();
}
