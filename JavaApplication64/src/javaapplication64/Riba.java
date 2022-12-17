/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

public class Riba extends Zivotinja
{
    private String ime, podvrsta;

    public Riba(String ime)
    {
        super("riba");
        this.ime = ime;
        podvrsta = "nepoznata";
    }

    public Riba(String ime, String podvrsta)
    {
        super("riba");
        this.ime = ime;
        this.podvrsta = podvrsta;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nZove se " + ime + ", a podvrsta je " + podvrsta;
    }

    @Override
    public void oglasiSe()
    {
        System.out.println("Riba se ne oglasava.");
    }

    @Override
    public int kretanje()
    {
        return PLIVA;
    }
}