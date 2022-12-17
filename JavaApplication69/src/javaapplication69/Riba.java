/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

public class Riba implements Kretanje
{
    private String ime, vrsta;

    public Riba(String ime, String vrsta)
    {
        this.ime = ime;
        this.vrsta = vrsta;
    }

    public int kreciSe()
    {
        return PLIVA;
    }

    public String toString()
    {
        return "riba " + ime + ", " + vrsta;
    }
}
