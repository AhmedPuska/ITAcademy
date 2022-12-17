package javaapplication172;
class MyThread extends Thread {
    boolean hold = true;
    @Override
    public  void run() {
            synchronized (this) {
                while (hold) {
                    try {
                        wait();
                    } catch (Exception e) { }
                }
            }
            System.out.println("Hello from thread");
    }
}