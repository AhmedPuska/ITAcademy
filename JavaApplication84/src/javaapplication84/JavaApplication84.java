package javaapplication84;

import java.util.function.Consumer;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaApplication84{
    
    static long lastFrame = System.nanoTime();
    
    public static void main(String[] args) {
        MojInt spozicijaX = new MojInt();
        spozicijaX.setVal(250);
        MojInt pozicijaX = new MojInt();
        pozicijaX.setVal(spozicijaX.getVal());
        
        pozicijaX.povezi(spozicijaX);
        
        System.out.println("Pozicija scout " + spozicijaX);
        System.out.println("Pozicija vlada " + pozicijaX);
        
        spozicijaX.setVal(300);
        
        System.out.println("Pozicija scout " + spozicijaX);
        System.out.println("Pozicija vlada " + pozicijaX);
        
        MojInt treciIgrac = new MojInt();
        treciIgrac.povezi(spozicijaX);
        
        spozicijaX.setVal(400);
        System.out.println("Pozicija scout " + spozicijaX);
        System.out.println("Pozicija vlada " + pozicijaX);
        System.out.println(treciIgrac);
    }
    
}
