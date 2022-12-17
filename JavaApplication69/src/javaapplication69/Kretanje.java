/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;


public interface Kretanje
{
    /*Za svaki način kretanja (hodanje, plivanje, letenje) definisana je po 1 konstanta tipa int. Konstante su izabrane tako da su sve međusobno različite i u bitovskoj reprezentaciji svake od njih tačno 1 bit je jedinica, dok su svi preostali nule. Ovakav izbor je pogodan jer se korišćenjem bitovskog operatora | (ili) ove konstante jednostavno kombinuju, a rezultat je ponovo vrednost tipa int. Takođe, ako imamo neku kombinaciju konstanti dobijenu korišćenjem operatora |, primenom operatora & (i) moguće je ispitati da li je određena konstanta uključena u tu kombinaciju.*/
    int HODA = 1 << 1;
    int PLIVA = 1 << 2;
    int LETI = 1 << 3;

    int kreciSe();
}