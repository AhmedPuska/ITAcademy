/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

public abstract class Zivotinja
{
    /*Statičke konstante HODA, PLIVA, LETI opisuju moguće načine kretanja raznih vrsta životinja. Binarna reprezentacija svake od njih sastoji se od jedne jedinice i nula, pri čemu su sve reprezentacije međusobno različite. Na ovaj način se omogućava njihovo jednostavno kombinovanje. Takođe, iz date kombinacije jednostavno se zaključuje koji načini kretanja čine kombinaciju.*/
    public static final int HODA = 1 << 1;	// 0010
    public static final int PLIVA = 1 << 2;	// 0100
    public static final int LETI = 1 << 3;	// 1000

    // Clanica je deklarisana kao private, pa se ne nasledjuje
    private String vrsta;

    public Zivotinja(String vrsta)
    {
        this.vrsta = vrsta;
    }

    @Override
    public String toString()
    {
        return "Ovo je " + vrsta;
    }

    // Metodi koji ce biti predefinisan u izvedenim klasama
    public abstract void oglasiSe();
    public abstract int kretanje();

    public static void ispisiKretanja(int naciniKretanja)
    {
        /*Koji sve načini kretanja čine datu kombinaciju kretanja, zaključuje se primenom bitske konjunkcije na kombinaciju i konkretan način kretanja.*/
        if((naciniKretanja & HODA) == HODA)
            System.out.print("hoda ");
        if((naciniKretanja & PLIVA) == PLIVA)
            System.out.print("pliva ");
        if((naciniKretanja & LETI) == LETI)
            System.out.print("leti ");
        System.out.println();
    }
}
