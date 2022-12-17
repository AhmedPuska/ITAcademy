package javaapplication33;
import java.io.IOException;
public class JavaApplication33 {
    public static void main(String[] args) {
        Tank t = new Tank("Spajdermen");
        Dps d = new Dps("Ahmo");
        t.show();
        d.show();
        t.hit(d);
        
        t.show();
        d.show();
//        Game g = new Game();
//        g.p1=t;
//        g.p2=d;
//        g.hith2();
        
//        Hero h = new Hero("Hulk","https://upload.wikimedia.org/wikipedia/en/5/59/Hulk_%28comics_character%29.png",0.6F);
//        Hero h1 = new Hero("Spiderman","------");
//        Hero h2 = new Hero("HAJDE AJDE");
//        h2.show();
//        h1.show();
//        h.show();
        
//        h.display();    
    }
    
}
