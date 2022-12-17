package main;

public class Main
{

    public static void main(String[] args)
    {
        final double PI = 3.14;
        double r= 5;
        double p=(r*r)*PI;
        System.out.println(p);
        
        // operatori za operacije nad bitovima primitivnih tipova
        // šift operatori i bit OR, AND i XOR operatori
        //
        /*Šift operatori (<< i >>) omogućavaju pomeranje bitova na levu ili desnu stranu, unutar 1 bajta.*/
//        int a = 10;
//        int b = a << 1;
//
//        System.out.println(a);  // 10
//        System.out.println(b);  // 20
//
//        /*metoda toBinaryString() vraca binarnu string reprezentaciju celog broja (u osnovi 2)*/
//        System.out.println(Integer.toBinaryString(a));  // 1010
//        System.out.println(Integer.toBinaryString(b));  // 10100
//        //
//        /*Binarno ne (komplement) (~) je operator koji invertuje sadržaj bajtova aktuelne promenljive.*/
//        b = ~10;
//        System.out.println(b);  // -11
//        System.out.println(Integer.toBinaryString(b));  // 11111111111111111111111111110101
//        //
//        /*Binarno i (&) daje rezultat kao vrednost koja se sastoji od zajedničkih bitova sa vrednošću
//        1 poređenih vrednosti.*/
//        System.out.println(Integer.toBinaryString(5 & 11));    // 1
//        //
//        /*Binarno ili (|) daje rezultat kao vrednost koja se sastoji od svih bitova gde bar jedna od poređenih 
//        vrednosti ima vrednost 1.*/
//        System.out.println(Integer.toBinaryString(5 | 11));    // 1111
//        //
//        /*Binarno XOR (exclusive or) (^) operator uzima u obzir samo bitove u kojima jedna ili druga promenljiva 
//        imaju vrednost 1, ali ne i ukoliko obe istovremeno imaju ovu vrednost.*/
//        System.out.println(Integer.toBinaryString(10 ^ 8));    // 10
//        //
//        int c = 10 ^ 20;
//        System.out.println(c);  // 30
//        System.out.println(Integer.toBinaryString(c));  // 11110
    }
}
