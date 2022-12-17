package javaapplication116;

import java.util.ArrayList;
import java.util.List;

public class Projektil {
    private List<IProjektilHit> slusaci = new ArrayList<>();
    public void addHitListener(IProjektilHit slusac){
        this.slusaci.add(slusac);
    }
    public void removeHitListener(IProjektilHit slusac){
        this.slusaci.remove(slusac);
    }
    public void fireHitEvent(){
        ProjektilHitEvent evt = new ProjektilHitEvent(this, x);
        for (IProjektilHit slusac : slusaci){
            slusac.hit(evt);
        }
    }
    int x;
    public void update(){
        this.x++;
        System.out.println("Projektil leti " + this.x);
        if (this.x >= 30) {
            fireHitEvent();
        }
    }
}