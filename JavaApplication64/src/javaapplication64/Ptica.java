/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

public class Ptica extends Zivotinja
{
    private String ime;

    public Ptica(String ime)
    {
        super("Ptica");
        this.ime = ime;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nZove se " + ime;
    }

    @Override
    public int kretanje()
    {
        /*Način kretanja se definiše kao kombinacija konstanti primenom bitske disjunkcije.*/
        return HODA | LETI;
    }

    @Override
    public void oglasiSe()
    {
        System.out.println("Specificno oglasavanje.");
    }
}