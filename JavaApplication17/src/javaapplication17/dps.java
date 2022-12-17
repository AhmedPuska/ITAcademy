package javaapplication17;
public class dps extends Hero {
    
    public dps(String name) {
        super(name);
        this.damage=30;
        this.health =100;
        this.mana=100;
        
    }
    void hitCost (){
        this.mana-=20;
    }
    void show(){
        System.out.println("Dps: " + this.name +" "+ this.health+" "+this.damage);
    }
    
}
