package javaapplication116;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JavaApplication116 {
    static List<Projektil> projektili = new ArrayList<Projektil>();
    static Queue<Projektil> zaBrisanje = new LinkedList<>();
    public static void main(String[] args) throws InterruptedException {
        Projektil p = new Projektil();
        p.addHitListener(new IProjektilHit() {
            @Override
            public void hit(ProjektilHitEvent evt) {
                System.out.println("Projektil je pogodio zid");
                zaBrisanje.add((Projektil)evt.getSource());
            }
        });
        projektili.add(p);
        
        while(true){
            for (Projektil pr : projektili){
                pr.update();
            }
            Projektil br;
            while((br=zaBrisanje.poll())!=null){
                projektili.remove(br);
            }
            Thread.sleep(100);
        }
    }
}