package javaapplication84;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MojInt {
    int vrijednost;
    
    List<Consumer<Integer>> slusaci = new ArrayList<Consumer<Integer>>();
            
            public void povezi(MojInt izvor){
                izvor.slusaci.add(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer t) {
                        
                    }
                    });
                }
                    
    public void setVal(int v){
        this.vrijednost=v;
        for(Consumer<Integer> slusac:slusaci){
            slusac.accept(v);
        }
    }
    public int getVal(){
        return this.vrijednost;
    }
}
