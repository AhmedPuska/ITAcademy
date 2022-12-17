package javaapplication17;

public class JavaApplication17 {
    public static void main(String[] args) {
        Tank t= new Tank("Batman");
        dps d= new dps("Ahmed");
        t.show();
        d.show();
        t.hit(d);
        d.show();
        t.show();
        
        /*Hero h = new Hero("Hulk","data:image/jpeg;base64/pxopKr+/==",06.f);
        h.show();
        Hero h1=new Hero("Spiderman","...");
        h1.show();
        Hero h2=new Hero();
        h2.show();*/
    }
    
}
