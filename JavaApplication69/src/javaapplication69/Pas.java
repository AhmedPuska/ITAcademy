/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

/**
 *
 * @author user
 */
public class Pas implements Kretanje, Oglasavanje {
    public static String ime,rasa;
    public Pas(String ime, String rasa)
    {
        this.ime = ime;
        this.rasa = rasa;
    }

    public void oglasiSe()
    {
        System.out.println("Av, av.");
    }

    public int kreciSe()
    {
        return HODA;
    }

    public String toString()
    {
        return "pas " + ime + ", " + rasa;
    }
}
