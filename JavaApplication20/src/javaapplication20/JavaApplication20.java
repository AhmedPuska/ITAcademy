package javaapplication20;
public class JavaApplication20 {
    public static void main(String[] args) throws InterruptedException {
        
        Staza staza = new Staza();
        staza.naziv = "kostsa";
        staza.podloga = 2;
        staza.sirina = 20;
        staza.duzina = 200;
        
        
        Horse jolly = new Horse();
        jolly.ime = "Jolly jummper";
        jolly.pos = 18;
        jolly.staza = "kosutnjak";
        System.out.println(jolly.ime+" \n" +jolly.pos+" \n"+jolly.staza);
//        
//        Staza staza     = new Staza();
//        staza.naziv     = "Kosutnjak";
//        staza.podloga   = 2;
//        staza.sirina    = 20;
//        staza.duzina    = 200;
        
        
        
        
//        jolly.ime       = "Jolly Jumper";
//        jolly.brzina    =50;
//        jolly.rasa      = "Mustang";
//    //  jolly.godine    = 5;
//        
//        System.out.println(jolly.ime);
        
    }
    
}
