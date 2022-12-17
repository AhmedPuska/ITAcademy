/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication144;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class JavaApplication144 {
    
    public static class MyThread extends Thread {
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
    
    public static void main(String[] args) throws InterruptedException {
        
        Server s = new Server();
        Klijent k = new Klijent();
        s.start();
        k.start(); 
        
        
//        MyThread mt = new MyThread();
//            mt.start();
//            Thread.sleep(3000);
//            synchronized(mt)
//            {
//                mt.hold = false;
//                mt.notify();
//            }
    }
}