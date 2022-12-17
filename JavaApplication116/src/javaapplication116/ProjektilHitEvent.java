package javaapplication116;

import java.util.EventObject;

public class ProjektilHitEvent extends EventObject {
    int x;
    public ProjektilHitEvent(Object o, int x) {
        super(o);
        this.x = x;
    }
    
}