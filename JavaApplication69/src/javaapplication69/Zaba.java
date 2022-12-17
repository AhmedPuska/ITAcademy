/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;
public class Zaba implements Oglasavanje, Kretanje
{
    private String ime;

    public Zaba(String ime)
    {
        this.ime = ime;
    }

    public void oglasiSe()
    {
        System.out.println("Kre, kre.");
    }

    public int kreciSe()
    {
        return PLIVA;
    }

    public String toString()
    {
        return "zaba " + ime;
    }
}
