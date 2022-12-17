/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

//Klasa Sendvic, nasledjuje klasu Proizvod
public class Sandwitch extends Product
{

    public Sandwitch(String name, double price)
    {
        //Dodeljuju se parametri (naziv i cena) kroz konstruktor
        this.additions = new String[10];    // najviše 10 dodataka
        this.name = name;
        this.price = price;
    }

    @Override
    public double countPrice()
    {
        //Izracunava se cena proizvoda, sa porezom od 15%
        return this.price + this.price * 0.15;  // = this.price * 1.15
    }
}