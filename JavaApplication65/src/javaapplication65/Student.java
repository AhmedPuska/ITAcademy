/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/*klasa Student koja nasleđuje klasu Person*/
public class Student extends Person
{
    public String indexNumber;  // broj indeksa
    
    public Student(String firstName, String lastName, String indexNumber)
    {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
    }
    //
    /*Metodu show() možemo da reimplementiramo i u okviru klase Student:*/
    @Override
    public void show()
    {
        System.out.println("Student: " + firstName + " " + lastName + " ID No. " + indexNumber);
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}


