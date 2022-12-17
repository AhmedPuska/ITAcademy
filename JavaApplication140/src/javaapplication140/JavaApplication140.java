package javaapplication140;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication140 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        String[] texts = { "Optimum pH of your water is between 6.0 and 7.0.  However Oscars are okay in a pH up to 8.0.",
//            "The Oscar fish is not a difficult fish to look after if you give it a suitable enviroment to live in. You may start having problems such as health issues if you keep your Oscar in an unsuitably small tank or feed it on a poor diet",
//            "The Oscar has the potential to reach 18 inchies. However in captivity Oscars normally grow to between 8 and 12 inchies" };
//        for (int i = 0; i < texts.length; i++) {
//            if (texts[i].length()>25) {
//                String tmpTxt = texts[i].substring(0, 22);
//                tmpTxt = tmpTxt.concat("...");
//                System.out.println(tmpTxt);
//            }
//        }
//            
//            String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };
//            for (int i = 0; i < files.length; i++) {
//                if (files[i].endsWith(".jpg")) {
//                    System.out.println(files[i]);
//                }
//                if (files[i].endsWith(".png")) {
//                    System.out.println(files[i]);
//                }
//                if (files[i].endsWith(".gif")) {
//                    System.out.println(files[i]);
//                }
//        }

//        NodeList list = new NodeList();
//        list.add(1);
//        list.add(5);
//        list.add(10);
//        System.out.println(list.getValue(2));
        
//        String users = "Ime: Vladimir|Prezime: Vladimirovic|Ime: Jovan|Prezime: Jovanovic|Ime: Petar|Prezime: Petrovic";
//        String[] usersArray = users.split("\\|");
//        for (int i = 0; i < usersArray.length; i+=2) {
//            String firstName = usersArray[i].split(" ")[1];
//            String lastName = usersArray[i+1].split(" ")[1];
//            System.out.println("ime korisnika je: "+firstName + ", prezime korisnika je: " + lastName);
//        }
        
        
//        String[] forbidenChars =
//        {
//            "<", ">", "'"
//        };
//        String input = "<div>moj 'div' tag</div>";
//        String output = input;
//        for (int i = 0; i < forbidenChars.length; i++) {
//            output = output.replace(forbidenChars[i], "");
//        }
//        System.out.println(output);
        
        
//        String text = "Kad naidjes na coveka s kojim vredi govoriti i s njim ne govoris, izgubio si ga. Kad naidjes na coveka s kojim ne vredi govoriti i s njim govoris, izbubio si reci. Mudrac ne gubi ni coveka ni reci.";
//
//        /*Za svaku od reči uvodi se po 1 brojač koji se inicijalizuje na 0, a zatim inkrementira prilikom pronalaženja svake pojave reči.*/
//        int covekNum = 0;
//        int reciNum = 0;
//
//        int index;     // pozicija u tekstu koji se analizira
//        
//        String covekStr = "covek";
//        String reciStr = "reci";
//        
//        index = text.indexOf(covekStr);
//        while(index>=0) {
//            ++covekNum;
//            index += covekStr.length();
//            index = text.indexOf(covekStr, index);
//        }
//        index = text.lastIndexOf(reciStr);
//        while(index >= 0)
//        {
//            ++reciNum;
//            index -= reciStr.length();
//            index = text.lastIndexOf(reciStr, index);
//        }
//
//        System.out.println("Zadati tekst sadrzi " + covekNum + " pojave reci \"covek\" i " + reciNum + " pojave reci \"reci\".");
        
        
        
//        String myText = "Hello World how are you";
//        try(FileOutputStream fs = new FileOutputStream("myFile.txt")) {
//            fs.write(myText.getBytes());
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
        
//        try(FileInputStream fs = new FileInputStream("myFile.txt")) {
//            int content = fs.read();
//            while(content != -1) {
//                System.out.println((char) content);
//                content = fs.read();
//            }
//        }
//        catch (IOException ex) {
//            System.out.println(ex);
//        }
        
        
//        String myText = "Hello World how are you";
//        try(FileWriter fw = new FileWriter("myFile.txt")) {
//            fw.write(myText);
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
        
        
        
//        try(FileReader fr = new FileReader("myFile.txt")) {
//            int c;
//            while ((c = fr.read()) != -1) {
//                System.out.println((char)c);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
        
        
        
//        try(BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))) {
//            String line;
//            while((line = br.readLine()) != null)
//                System.out.println(line);
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
        
        
        
        
//        BufferedReader br = new BufferedReader(new FileReader("users.txt"));  
//            String line;
//            while ((line = br.readLine()) != null){
//                String[] user = line.split("\\|");
//                System.out.println("User id: " + user[0].split("\\:")[1]);
//                System.out.println("First name: " + user[1].split("\\:")[1]);
//                System.out.println("Last name: " + user[2].split("\\:")[1]);
//                System.out.println("Jmbg: " + user[3].split("\\:")[1]);
//                System.out.println("-----------------------------------");
//            }
//            br.close();            
            
            
            
//        String tmpLine;
//        BufferedWriter bw = new BufferedWriter(new FileWriter("treciFajl.txt"));
//        
//        BufferedReader br = new BufferedReader(new FileReader("prviFajl.txt"));
//        while((tmpLine = br.readLine()) != null)
//            bw.write(tmpLine + "\n");
//        br.close();
//        
//        br = new BufferedReader(new FileReader("drugiFajl.txt"));
//        while((tmpLine = br.readLine()) != null)
//            bw.write(tmpLine + "\n");
//        br.close();
//        
//        bw.close();
        
        
        
        
//        // testiranje serijalizacije
//        User u = new User();
//        u.setId(5);
//        u.setEmail("mail@mail.ml");
//        u.setPassword("123");
//        u.serializeXml("myXml.xml");
//
//        // testiranje deserijalizacije
//        u = User.deserializeXml("myXml.xml");
//        System.out.println(u);
        
        
        
        
        
//        MyThread myThread = new MyThread();
//        for(int i=0;i<5;i++)
//        {
//        Thread t = new Thread(myThread);
//        t.start();
//        t.setPriority(Thread.MAX_PRIORITY);
//        }
//        
//        Thread t1 = new Thread(myThread);
//        System.out.println(Thread.activeCount());
        
        
        
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
        
        
//        new Thread(new MyThread(false)).start();
//        new Thread(new MyThread(true)).start();
        
//        new MyThread(false).start();
//        new MyThread(true).start();
        
        
//        MyThread mt = new MyThread(false);
//        MyThread mt1 = new MyThread(true);
//        new Thread(mt).start();
//        new Thread(mt1).start();
//        Thread.sleep(3000);
//        mt.setDecrement(true);
        
//        MyThread mt = new MyThread();
//        Thread t = new Thread(mt);
//        t.start();
//        Thread.sleep(2000);
//        t.suspend();
//        Thread.sleep(4000);
//        t.resume();
        


//        MyThread mt = new MyThread();
//        mt.setDaemon(true);
//        mt.start();
        
        
        
        
        MyThread mt = new MyThread();
        mt.start();
        Thread.sleep(3000);
        synchronized(mt)
        {
            mt.hold = false;
            mt.notify();
        }
        
    }
}