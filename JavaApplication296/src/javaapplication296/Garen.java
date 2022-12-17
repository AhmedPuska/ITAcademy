package javaapplication296;

public class Garen implements Runnable {

    int x = 0;

    @Override
    public void run() {
        while (true) {
            x++;
            System.out.println("Garen je na poziciji: " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
