/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

/**
 *
 * @author user
 */
public class Pas extends Zivotinja {
     private String ime, rasa;
 
    public Pas(String ime)
    {
        super("pas");
        this.ime = ime;
        rasa = "nepoznata";
    }
 
    public Pas(String ime, String rasa)
    {
        super("pas");
        this.ime = ime;
        this.rasa = rasa;
    }
 
    @Override
    public String toString()
    {
        return super.toString() + "\nZove se " + ime + ", a rasa je " + rasa;
    }
 
    @Override
    public void oglasiSe()
    {
        System.out.println("AV AV");
    }
 
    @Override
    public int kretanje()
    {
        return HODA;
    }
}
