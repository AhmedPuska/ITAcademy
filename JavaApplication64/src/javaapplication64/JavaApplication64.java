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
public class JavaApplication64 {
public static void main(String[] args)
    {
        Zivotinja niz[] =
        {
            new Pas("Max", "labrador"),
            new Riba("Nemo", "riba klovn"),
            new Ptica("Tweety"),
            new ZlatniRetriver("Zak"),
            new Riba("Pongo"),
            new Pas("Lee")
        };

        int i = 1;
        for(Zivotinja z : niz)
        {
            System.out.println((i++) + ". " + z);

            Zivotinja.ispisiKretanja(z.kretanje());
            z.oglasiSe();

            System.out.println();
        }
    }
}