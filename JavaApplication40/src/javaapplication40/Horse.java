package javaapplication40;
public class Horse {
    int x = 0;
    int speed =1;
    String spriter = ">";
    String spritel = "<";
    int trackWidth;
    void toggleDirection(){
        this.speed*=-1;
    }
    void render (int x){
        if(x==this.x){
            System.out.print(this.speed<0?this.spritel:this.spriter);
            }else{
                System.out.print(" ");
            }
        
        
    }
    void update(){
        this.x = this.x + this.speed;
        if(x>=this.trackWidth||x<0){
                this.toggleDirection();
            }
    }
}
