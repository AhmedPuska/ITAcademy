package javaapplication17;
public class Hero {

    String name;
    String image;
    float loading;
    int damage;
    int health;
    int mana;
    
    Hero (String name){
       this.name=name;
    }
    /*Hero(){
        
    }
    
    Hero(String name){
        this.name=name;
    }
    
    Hero(String name, String image){
        this.name=name;
        this.image=image;
    }
    
    Hero(String name, String image, float loading){
        this.name =name;
        this.image= image;
        this.loading=loading;
    }*/
    void show(){
        System.out.println(this.name);
    }
}
