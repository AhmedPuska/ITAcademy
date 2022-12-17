
package javaapplication182;

import java.util.function.Consumer;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaApplication182 /*extends Application */{

    long lastFrame = System.nanoTime();
    
    public static void main(String[] args) {
        MojInt spozicijaX = new MojInt();
        spozicijaX.setVal(250);
        MojInt pozicijaX = new MojInt();
        pozicijaX.setVal(spozicijaX.getVal());
        
        pozicijaX.povezi(spozicijaX);
//        spozicijaX.slusaci.add(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer t) {
//                pozicijaX.setVal(t);
//            }
//        });
        
        System.out.println("Pozicija scout " + spozicijaX.getVal());
        System.out.println("Pozicija vlada " + pozicijaX.getVal());
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        AnimationTimer timer = new AnimationTimer() {
//            @Override
//            public void handle(long now) {
//                long delta = now - lastFrame;
//                System.out.println(delta);
//                lastFrame = now;
//            }
//        };
//        timer.start();
//    }
}