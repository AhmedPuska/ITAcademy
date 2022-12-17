package javaapplication29;
public class JavaApplication29 {
    public static void main(String[] args) throws InterruptedException {
        
        Horse pony = new Horse();
        pony.damage = 20;
        BlassterHorse jolly = new BlassterHorse();
        jolly.health = 100;
//        jolly.health -= pony.damage;
        pony.hit(jolly);
        System.out.println(jolly.health);
        
        
        
        
        
//       Staza staza = new Staza();
//       staza.naziv      = "Kosutnjak";
//       staza.podloga    = 2;
//       staza.sirina     = 20;
//       staza.duzina     = 200;
//       
//       Horse jolly = new Horse();
//       jolly.ime           ="Jolly Jumper";
//       jolly.pos_x         = 18;
//       jolly.staza         = staza;
//       jolly.sjheight      = 30;
//       jolly.sjstamia      = 50;
//       
//       Horse1 hajde = new Horse1();
//       hajde.ime = "jaja";
//       hajde.brzina = 20;
//       
//       BlassterHorse myLittlePony = new BlassterHorse();
//       
//       myLittlePony.ime     = "My little pony";
//       myLittlePony.ammo    = 10;
//       
//        System.out.println(jolly.ime);
//        System.out.println(jolly.staza.naziv);
//        System.out.println(jolly.pos_x);
//        System.out.println(jolly.sjheight);
//        System.out.println(jolly.sjstamia);
//        
//        System.out.println(hajde.ime);
//        System.out.println(hajde.brzina);
//        System.out.println(hajde.health);
//        
//        System.out.println(myLittlePony.ime);
//        System.out.println(myLittlePony.ammo);
//        
//        
//        staza=null;
//        jolly.staza=null;
//        
//        Thread.sleep(1000);
//        Object o = new Object();
//        Horse jolly = new Horse();
//        jolly.ime           ="Jolly Jumper";
//        jolly.brzina        =50;
//        jolly.rasa          ="Mustang";
////        Horse sarenko = new Horse();
////        jolly=sarenko;
//        
//        System.out.println(jolly.ime);
    }
    
}
