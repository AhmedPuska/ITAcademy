/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;
public class Pingvin implements Kretanje
{
    private String ime;

    public Pingvin(String ime)
    {
        this.ime = ime;
    }

    public int kreciSe()
    {
        return PLIVA | HODA;
    }

    public String toString()
    {
        return "pingvin " + ime;
    }
}
