package javaapplication17;
public class Tank extends Hero{
    Tank(String name){
      super(name);
      this.damage=15;
      this.health=200;
      this.mana=70;
    }
    void show(){
        System.out.println("Tank: "+this.name+ " "+this.health+" "+this.damage +" "+this.mana);
    }
    void hit(dps source){
        this.health-=source.damage;
        source.hitCost();
    }
}
