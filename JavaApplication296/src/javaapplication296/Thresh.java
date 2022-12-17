package javaapplication296;

public class Thresh extends Thread {

    public Thresh() {
        super();
        setName("Thresova nit");
    }

    int x;

    @Override
    public void run() {
        while (true) {
            x++;
            System.out.println("Thresh is at: " + x);
            try {
                Thread.sleep(1100);
            } catch (InterruptedException ex) {
            }
        }
    }

}
