/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

public class Professor extends Person
{
    public String className;    // naziv predmeta

    public Professor(String firstName, String lastName, String className)
    {
        super(firstName, lastName);
        this.className = className;
    }
    //
    /*U objektno orijentisanom programiranju polimorfizam se oslikava se kroz 2 pojma: overriding i overloading.*/
    //
    /*Overriding se ogleda u tome da svaka klasa koja nasleđuje neku klasu, a samim tim i metodu, može da definiše sopstvenu implementaciju nasleđene metode.*/
    //
    @Override   /*metoda iz roditeljske klase je „pregažena“ metodom iz klase naslednika*/
    public void show()
    {
        System.out.println("Professor " + firstName + " " + lastName + " teaches: " + className);
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}