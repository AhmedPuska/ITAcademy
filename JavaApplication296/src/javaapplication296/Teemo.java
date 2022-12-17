package javaapplication296;

public class Teemo implements Runnable {

    int x;

    boolean isStopped;
    
    @Override
    public void run() {
        while (!isStopped) {
            x++;
            System.out.println("Teemo is on position: " + x);
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {}
        }
    }
}
