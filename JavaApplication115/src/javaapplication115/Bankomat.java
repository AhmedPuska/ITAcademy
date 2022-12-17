package javaapplication115;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bankomat {
    
    int ukupnoTransakcija = 0;
    boolean active = true;
    
    private List<IIsplata> slusaci = new ArrayList<>();
    void addIsplataEventListener(IIsplata slusac){
        slusaci.add(slusac);
    }
    void removeIsplataEventListener(IIsplata slusac){
        slusaci.remove(slusac);
    }
    void fireIsplataEvent(int suma){
        for(IIsplata slusac : slusaci){
            slusac.isplatio(new BankomatTransactionEvent(this, suma, ukupnoTransakcija));
        }
    }
    public void start(){
        System.out.println("Bankomat je startovan");
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!(line=sc.nextLine()).isEmpty()){
            if (!active) {
                System.out.println("Bankomat nije u funkciji, transakcija nije prihvacena");
                continue;
            }
            ukupnoTransakcija++;
            int para = Integer.parseInt(line);
            this.fireIsplataEvent(para);
        }
        System.out.println("Bankomat je iskljucen");
    }
}