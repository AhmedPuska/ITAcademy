package javaapplication39;
public class JavaApplication39 {
    public static void main(String[] args)throws InterruptedException {
        
        Horse h = new Horse();
        
        
        int w = 50;
//        int o = 5;
        boolean gameRunning = true;
        while (gameRunning)
            h.update();
        if(h.x>=w){
            h.toogleDirection();
        }
        for(int x=0;x<w;x++){
            if(x==h.x){
            h.render();
            }else{
                System.out.print(" ");
            }
//            for(int y=0;y<o;y++){
//                if(y==h.x){
//                h.render();
//                }
//                System.out.print(" ");
//            }System.out.print(" ");
        }System.out.print("");
        
        Thread.sleep(1000);
        
    }
    
}
