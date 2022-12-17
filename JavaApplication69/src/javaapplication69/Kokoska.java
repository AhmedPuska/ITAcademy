/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

public class Kokoska implements Oglasavanje, Kretanje
{
    private String ime, rasa;

    public Kokoska(String ime, String rasa)
    {
        this.ime = ime;
        this.rasa = rasa;
    }

    public void oglasiSe()
    {
        System.out.println("Kokoda.");
    }

    public int kreciSe()
    {
        return HODA | LETI;
    }

    public String toString()
    {
        return "kokoska " + ime + ", " + rasa;
    }
}
