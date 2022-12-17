/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication140;
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