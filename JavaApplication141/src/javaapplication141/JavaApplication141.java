
package javaapplication141;

public class JavaApplication141 {
    
    public static void main(String[] args) {
        System.out.println("Thread class instantiated");
        Runnable proces = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        };
        Thread nit = new Thread(proces);
        nit.start();
    }   
}