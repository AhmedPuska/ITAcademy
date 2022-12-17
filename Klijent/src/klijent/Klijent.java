/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Klijent extends Frame{
    
    static Frame f;
    static Label l1, l2, l3, l4;
    static TextField t1, t2;
    static Button b1, b2;
    
    public static void main(String[] args) {
        f = new Frame("Klijent-Server");
        f.setLayout(null);
        f.setSize(400, 300);
        l1 = new Label("Unesite prvi broj:");
        l2 = new Label("Unesite drugi broj:");
        l3 = new Label("Rezultat je:");
        b1 = new Button("Izracunaj");
        t1 = new TextField();
        t2 = new TextField();
        l4 = new Label();
        l1.setBounds(100,50,120,20);
        t1.setBounds(240,50,50,20);
        l2.setBounds(100,80,130,20);
        t2.setBounds(240,80,50,20);
        l3.setBounds(100,110,100,20);
        l4.setBounds(240,110,50,20);
        b1.setBounds(280,150,55,30);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
                {
                 System.exit(0);
                }
});
        b1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent ae) {
		try(Socket cn = new Socket("localhost", 1000);
		InputStream input = cn.getInputStream();
		BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
			bos.write((t1.getText()).getBytes());
			bos.write((",").getBytes());
			bos.write((t2.getText()).getBytes());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
                }
        }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(l4);
        f.add(b1);
        f.setVisible(true);
        
        while(true) {
            try(ServerSocket sS = new ServerSocket(1001);
                    Socket cn = sS.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(cn.getInputStream()));) {
                l4.setText(br.readLine());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }   
}