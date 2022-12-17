package javaapplication287;

public class Card {

    private double balance = 2000;
    public double useMoney;

    public Card(double useMoney) {
        this.useMoney = useMoney;
    }

    public void charge() {
        if (balance > 0) {
            System.out.println("Na racunu imate " + balance);
            balance-=useMoney;
        System.out.println("Charger "+this.useMoney);
            System.out.println("Vas trenutni balans je " + balance);
        } else if (balance < 1) {
            System.out.println("Ne mozes podici novac, prazan racun!!!");
            balance = 0;
        }
    }
}
