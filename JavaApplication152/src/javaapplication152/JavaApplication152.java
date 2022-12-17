/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication152;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication152 extends Frame implements ActionListener{
//
    static Label l1,l2,l3,l4;
    static TextField t1,t2;
    static Button b1,b2;
// static Button b, b1;
    static Frame f;
    static Frame f2;
    static Button b3;
//    static Label l1, l2;
    static TextField tf1, tf2, tfr;
    static TextField text1, text2, racunica;
 JavaApplication152()
 {
   super("Addition of two numbers");
   setLayout(null);
   setSize(500,400);
   setVisible(true);
   l1=new Label("Enter the first no:");
   l2=new Label("Enter the second no:");
   l3=new Label("The sum is:");
   l4=new Label(null);
   t1=new TextField();
   t2=new TextField();
   b1=new Button("ADD");
   b2=new Button("Clear");
   l1.setBounds(100,50,120,20);
   add(l1);
   t1.setBounds(240,50,50,20);
   add(t1);
   l2.setBounds(100,80,130,20);
   add(l2);
   t2.setBounds(240,80,50,20);
   add(t2);
   l3.setBounds(100,110,100,20);
   add(l3);
   l4.setBounds(210,110,60,20);
   add(l4);
   b1.setBounds(200,150,50,20);
   add(b1);
   b2.setBounds(270,150,50,20);
   add(b2);
   b1.addActionListener(this);
   b2.addActionListener(this);
   
   addWindowListener( new WindowAdapter() {
    public void windowClosing(WindowEvent we)
    {
     System.exit(0);
    }
   });
 }

 public void actionPerformed(ActionEvent ae)
 {
  float a,b,c;
  if(ae.getSource()==b1)
  {
   a=Float.parseFloat(t1.getText().trim());
   b=Float.parseFloat(t2.getText().trim());
   c=a+b;
   l4.setText(Float.toString(c));
  }
  else
  {
   t1.setText(null);
   t2.setText(null);
   l4.setText(null);
  }
 }

    public static void main(String s[]) {
        
        
  JavaApplication152 ob=new JavaApplication152();
//  
//  f = new Frame("DEMO-Klijent-Server-DEMO");
//        GridBagLayout gridBagLayout = new GridBagLayout();
//        GridBagConstraints controlGBC = new GridBagConstraints();
//        f.setLayout(gridBagLayout);
//        
//        //controls goes here
//        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
// });
//        text1 = new TextField("");
//        text2 = new TextField("");
//        f.add(text1);
//        f.add(text2);
//        text1.getText();
//        text2.getText();
//        racunica = new TextField();  
//        racunica.setBackground(Color.darkGray);  
//        racunica.setForeground(Color.yellow);  
//        controlGBC.fill = GridBagConstraints.HORIZONTAL;  
//        controlGBC.gridx = 2;  
//        controlGBC.gridy = 4;  
//        controlGBC.gridwidth = 4;  
//        controlGBC.insets = new Insets(5,0,0,0);  
//        f.add(racunica, controlGBC);
////        f.setLocation(x-250, y-200);  
//        f.setSize(500,400);  
//        
//        b = new Button("Izadji");
//     b.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent ae) {
//             System.exit(0);
//         }
//     });
//     f.add(b);
//     f.setVisible(true);
//        b = new Button("Izracunaj");
//        b.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent ae) {
//               try(Socket sc = new Socket("localhost", 1000);
//                       BufferedOutputStream bos = new BufferedOutputStream(sc.getOutputStream());) {
//                   bos.write((text1.getText()).getBytes());
//                   bos.write((",").getBytes());
//                   bos.write((text2.getText()).getBytes());
//                   bos.flush();
//                   
//               }catch (IOException ex) {
//                   System.out.println(ex.getMessage());
//               }
//           }
//       });
//        controlGBC.gridx = 3;
//        controlGBC.gridy = 8;
//        controlGBC.gridwidth = 2;
//        controlGBC.insets = new Insets(20,0,0,0);
//        
//        f.add(b, controlGBC);
//        f.setVisible(true);
//        
//        while(true) {
//            try (ServerSocket sS = new ServerSocket(1001);
//                    Socket cn = sS.accept();
//                    BufferedReader br = new BufferedReader(new InputStreamReader(cn.getInputStream()));){
//                racunica.setText(br.readLine());
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//           }
//        }
//f2 = new Frame();
//     LayoutManager layoutManager = new FlowLayout();
//     f2.setLayout(layoutManager);
//     f2.setSize(300,300);
//     
//     b3 = new Button("Izadji");
//     b3.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent ae) {
//             System.exit(0);
//         }
//     });
//     f2.add(b3);
//     f2.setVisible(true);
     
     
        f2 = new Frame();
        LayoutManager layoutManager = new FlowLayout();
        f2.setLayout(layoutManager);
        f2.setSize(300,300);
        l1 = new Label("Unesite prvi broj:");
        l2 = new Label("Unesite drugi broj:");
        l3 = new Label("Rezultat je:");
        l4 = new Label(null);
        t1 = new TextField();
        t2 = new TextField();
        l1.setBounds(100,50,120,20);
        f2.add(l1);
        t1.setBounds(240,50,50,20);
        f2.add(t1);
        l2.setBounds(100,80,130,20);
        f2.add(l2);
        t2.setBounds(240,80,50,20);
        f2.add(t2);
        l3.setBounds(100,110,100,20);
        f2.add(l3);
        l4.setBounds(210,110,60,20);
        f2.add(l4);
        b1 = new Button("Izadji");
        b1.setBounds(200,150,50,20);
        f2.add(b1);
        b2 = new Button("Izracunaj");
        b2.setBounds(270,150,50,20);
        
        b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                        System.exit(0);
                }
        });
        b2.addActionListener(new ActionListener() {
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
        f2.add(b1);
        f2.add(b2);
        f2.setVisible(true);
        
        
//        text1 = new TextField();
//        text2 = new TextField();
//        f2.add(text1);
//        f2.add(text2);
//        text1.getText();
//        text2.getText();
//        racunica = new TextField();
//        f2.add(racunica);
//        b3 = new Button("Izracunaj");
//        b3.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent ae) {
//             try (Socket cn = new Socket("localhost", 1000);
//             InputStream input = cn.getInputStream();
//             BufferedOutputStream bos = new BufferedOutputStream(cn.getOutputStream());) {
//                 bos.write((text1.getText()).getBytes());
//                 bos.write((",").getBytes());
//                 bos.write((text2.getText()).getBytes());
//             } catch(IOException ex) {
//                 System.out.println(ex.getMessage());
//             }
//         }
//     });
//        f2.add(b3);
//        f2.setVisible(true);
        
        
        while(true) {
            try(ServerSocket sS = new ServerSocket(1001);
                    Socket cn = sS.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(cn.getInputStream()));) {
                l4.setText(br.readLine());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
         }
        }
//        try (Socket cn = new Socket("localhost", 1000);
//             InputStream input = cn.getInputStream();
//             OutputStream output = cn.getOutputStream();
//             BufferedReader bis = new BufferedReader(new InputStreamReader(input));)
//        {
//            racunica.setText(bis.readLine());
////            output.write("Dobar dan\r\n".getBytes());
////            System.out.println("Server kaze");
////            System.out.println(bis.readLine());
////            
////            Scanner sc = new Scanner(System.in);
////            System.out.println(bis.readLine());
////            System.out.println(bis.readLine());
////            System.out.println("Unesite prvi operand");
////            String num1 = sc.nextLine();
////            
////            System.out.println("Unesite drugi operand");
////            String num2 = sc.nextLine();
////            
////            String poruka = (num1.trim() + "," + num2.trim()) + "\r\n";
////            output.write(poruka.getBytes());
////            
////            
////            output.write("Dobar dan\r\n".getBytes());
////            System.out.println("Rezulat je: " + bis.readLine());
//        }
//        catch(IOException exception)
//        {
//            System.out.println(exception.getMessage());
//        }

    }
}

