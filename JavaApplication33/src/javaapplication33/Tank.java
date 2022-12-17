package javaapplication33;
public class Tank extends Hero{
    Tank (String name){
        super(name);
        this.damage=15;
        this.health=200;
        this.mana = 70;
    }
    void show (){
        System.out.println("Tank: "+ this.name+ " Health: "+ this.health + " Damage: "+ this.damage+ " Mana: "+this.mana);
    }
    void hit(Dps source){
        this.health-=source.damage;
        source.hitCost();
    }
}
