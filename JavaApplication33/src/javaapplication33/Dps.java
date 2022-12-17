package javaapplication33;
public class Dps extends Hero {
    
    public Dps(String name) {
        super(name);
        this.damage = 30;
        this.health = 100;
        this.mana = 100;
    }
    void hitCost(){
        this.mana-=20;
    }
    void show(){
        System.out.println("Dps: "+ this.name+" Health: "+this.health+" Damage: "+this.damage+" Mana: "+this.mana);
    }
}
