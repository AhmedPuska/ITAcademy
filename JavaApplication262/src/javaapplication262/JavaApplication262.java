package javaapplication262;

public class JavaApplication262 {

    public static void main(String[] args) throws InterruptedException {

        
        MyThread mt = new MyThread();
        for(int i=0;i<10;i++)
        {
            Thread t = new Thread(mt);
            t.start();
        }
        
//        MyThread mt = new MyThread();
//        mt.start();
//        synchronized(mt) {
//            mt.hold = false;
//            mt.notify();
//        }

//        MyThread mt = new MyThread();
//        mt.setDaemon(true);
//        mt.start();
//        MyThread mt = new MyThread();
//        Thread t = new Thread(mt);
//        t.start();
//        Thread.sleep(2000);
//        t.suspend();
//        Thread.sleep(4000);
//        t.resume();
//        String[] messages
//                = {
//                    "message1",
//                    "message2",
//                    "message3",
//                    "message4"
//                };
//
//        for (String message : messages) {
//
//            Thread.sleep(1000);
//            System.out.println(message);
//        }
//        MyThread mt = new MyThread();
//        mt.start();
//        for (int i = 0; i < 5; i++) {
//            myThread.moj();
//        }
    }

}
