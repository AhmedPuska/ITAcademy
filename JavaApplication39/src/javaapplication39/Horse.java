package javaapplication39;
public class Horse {
    int x = 0;
    int speed =1;
    String spriter = ">";
    String spritel = "<";
    void toogleDirection(){
        this.speed*=-1;
    }
    void render (){
        System.out.print(this.speed<0?this.spritel:this.spriter);
    }
    void update(){
        this.x = this.x + this.speed;
    }
}
