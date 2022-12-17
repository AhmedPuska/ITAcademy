package javaapplication114;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CameraTracker {
    
    private List<IPolaznikNePrati> slusaci = new ArrayList<IPolaznikNePrati>();
    public void addPolaznikNePratiEventListener(IPolaznikNePrati slusac){
        slusaci.add(slusac);
    }
    public void removePolaznikNePratiEventListener(IPolaznikNePrati slusac){
        slusaci.remove(slusac);
    }
    void firePolaznikNePratiEvent(){
        for (IPolaznikNePrati slusac : slusaci){
            slusac.detektovanoNepracenje();
        }
    }
    
    public void prati() throws InterruptedException{
        System.out.println("Pracenje je zapoceto...");
        Random r = new Random();
        while(true){
            if (r.nextInt(8)==1) {
                firePolaznikNePratiEvent();
            }
            Thread.sleep(1000);
        }
    }
}