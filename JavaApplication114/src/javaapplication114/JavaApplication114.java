package javaapplication114;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication114 {
    public static void main(String[] args) throws InterruptedException {
        
        CameraTracker ct = new CameraTracker();
        IPolaznikNePrati sss = new IPolaznikNePrati() {
            @Override
            public void detektovanoNepracenje() {
                System.out.println("Polaznik ne prati...doneti kukuruz i poslati polaznika u cosak!!!");
            }
        };
        ct.addPolaznikNePratiEventListener(sss);
        ct.addPolaznikNePratiEventListener(new IPolaznikNePrati() {
            @Override
            public void detektovanoNepracenje() {
                System.out.println("Predavac obavjesten o nepracenju ");
            }
        });
        ct.removePolaznikNePratiEventListener(sss);
        new Thread(()->{
            try {
                ct.prati();
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication114.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
//        Game g = new Game();
//        g.start();
    }
}