package javaapplication33;

//import java.io.FileWriter/*;
//import java.io.IOException;*/

public class Hero {
    String name;
    int damage;
    int health;
    int mana;
    
    Hero (String name){
        this.name = name;
    }
//    
//    Hero (String name, String image){
//        this.name = name;
//        this.image = image;
//    }
//    Hero(String name, String image, float loading ){
//        this.name = name;
//        this.image = image;
//        this.loading = loading;
//    }
//    
//    void display() throws IOException{
//        String output = "<h3>"+this.name+"</h3>";
//        output+="<img src='"+this.image+"'width=200 />";
//        output+="Loaded: "+ this.loading;
//        
//        FileWriter fw = new FileWriter("hero.html");
//        fw.write(output);
//        fw.close();
//    }
    void show(){
        System.out.println(this.name);
    }
    
}
