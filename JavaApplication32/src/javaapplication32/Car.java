package javaapplication32;
public class Car {
    String naziv;
    private int posx;
   
    
    Car (int x, String naziv){
        posx= x;
        this.naziv = naziv;
    }
    void move (){
    
    posx++;
}
    void show(){
            System.out.println(naziv+ " : " + posx);
}
    
}
