package javaapplication24;
public class JavaApplication24 {
    public static void main(String[] args) throws InterruptedException {
        
        
        
//        Horse h = new Horse();
//        h.render();
//        h.update();
//        h.render();
//        h.toggleDirrections();
//        h.render();
//        h.update();
//        h.render();
        
        Horse h = new Horse();
        Horse h1 = new Horse();
        h1.speed = 2;
        int w       = 20;
        h.trackWidth =w;
        h1.trackWidth =w;
        boolean gameRunning = true;
        
        while (gameRunning){
            h.update();
            h1.update();
            
        for(int x=0;x<w;x++){
            h.render(x);
            h1.render(x);
            
        }System.out.print("\r");
        
        Thread.sleep(300);
        }

    }
    
}
