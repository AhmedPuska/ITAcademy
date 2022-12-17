package javaapplication292;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication292 extends Panel {

    int[][] points = {
        {20, 40}, {10, 50}, {60, 60}, {30, 20}, {0, 0}, {5, 5}, {6, 6}, {7, 7}, {8, 8}, {9, 9}, {52, 52}, {56, 26}, {37, 47}, {18, 68}, {79, 49}
    };

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setColor(Color.yellow);
        for (int i = 0; i < points.length; i++) {
            g2.fillRect(points[i][0], points[i][1], 10, 10);
        }
    }

    static String parseRequest(Socket socket) throws IOException {
        InputStream stream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        String document = line.split("/|HTTP/")[1].trim();
        return document;
    }

    static void response(Socket socket, String doc) throws IOException {
        OutputStream oStream = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(oStream);
        File html_file = new File(doc);
        FileInputStream fis;
        if (!html_file.exists()) {
            osw.write("HTTP/1.1 404 Not Found\r\n\r\n");
            osw.close();
            return;
        } else {
            fis = new FileInputStream(html_file);
            osw.write("HTTP/1.1 200 OK\r\n");
            osw.write("Content-type: text/html\r\n");
            osw.write("Content-length: " + fis.getChannel().size() + "\r\n");
            osw.write("\r\n");

        }
        InputStreamReader isr = new InputStreamReader(fis);
        int b;
        while ((b = isr.read()) != -1) {
            osw.write(b);
        }
        isr.close();
        osw.close();
    }
//    
//    static String cleanIncomingString(String input){
//        input = input.replace("[{", "");
//        input = input.replace("]}", "");
//        input = input.replace("},{", "#");
//        return input;
//    }
//    

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, InterruptedException {

        
        FileInputStream[] streams = {
            new FileInputStream("prviFajl.txt"),
            new FileInputStream("drugiFajl.txt")

        };
        FileOutputStream fos = new FileOutputStream("treciFajl.txt");
        int b;
        for (int i = 0; i < streams.length; i++) {
            while ((b = streams[i].read()) != -1) {
                fos.write(b);
            }
            streams[i].close();
        }
        fos.close();
//        
//        
        // Parsiranje txt fajla
//        BufferedReader br = new BufferedReader(
//                new FileReader("testfile.txt")
//        );
//        String line = null;
//
//        while ((line = br.readLine()) != null) {
//            String[] parse = line.split("\\|");
//            String id = parse[0].split(":")[1];
//            String fName = parse[1].split(":")[1];
//            String lName = parse[2].split(":")[1];
//            String jmbg = parse[3].split(":")[1];
//            System.out.print("User id: " + id + "\n" + "First name: " + fName + "\n" + "Last name: " + lName + "\n" + "Jmbg: " + jmbg + "\n");
//            System.out.println("-------------------------------");
//        }
//        
//        
//        FileOutputStream fos_same_type = new FileOutputStream("testfile.txt");
//        BufferedOutputStream bos_same_type = new BufferedOutputStream(fos_same_type);
//        DataOutputStream dos_same_type = new DataOutputStream(bos_same_type);
//        dos_same_type.writeInt(10);
//        dos_same_type.writeInt(15);
//        dos_same_type.writeInt(25);
//        dos_same_type.close();
//        
//        /* same type data stream reading */
//        FileInputStream fis_same_type = new FileInputStream("testfile.txt");
//        BufferedInputStream bis_same_type = new BufferedInputStream(fis_same_type);
//        DataInputStream dis_same_type = new DataInputStream(bis_same_type);
//        System.out.println(dis_same_type.readInt());
//        System.out.println(dis_same_type.readInt());
//        System.out.println(dis_same_type.readInt());
//        dis_same_type.close();
//        
//        /* automatic data stream reading */
//        FileInputStream fis_auto_read = new FileInputStream("testfile.txt");
//        BufferedInputStream bis_auto_read = new BufferedInputStream(fis_auto_read);
//        DataInputStream dis_auto_read = new DataInputStream(bis_auto_read);
//        try {
//            while(true){
//                System.out.println(dis_auto_read.readInt()); 
//            }
//        } catch(EOFException e){
//                System.out.println("Stream reading finished"); 
//        } finally {
//            dis_auto_read.close();
//        }

        /* different type data stream writing */
//        FileOutputStream fos_diff_type = new FileOutputStream("testfile.txt");
//        BufferedOutputStream bos_diff_type = new BufferedOutputStream(fos_diff_type);
//        DataOutputStream dos_diff_type = new DataOutputStream(bos_diff_type);
//        dos_diff_type.writeInt(10);
//        dos_diff_type.writeFloat(15.5f);
//        dos_diff_type.writeChar(65);
//        dos_diff_type.writeUTF("ČĆŠĐčćšđ");
//        dos_diff_type.close();
//        
//        /* different type data stream reading */
//        FileInputStream fis_diff_type = new FileInputStream("testfile.txt");
//        BufferedInputStream bis_diff_type = new BufferedInputStream(fis_diff_type);
//        DataInputStream dis_diff_type = new DataInputStream(bis_diff_type);
//        System.out.println(dis_diff_type.readInt());
//        System.out.println(dis_diff_type.readFloat());
//        System.out.println(dis_diff_type.readChar());
//        System.out.println(dis_diff_type.readUTF());
//        dis_diff_type.close();
//        
//        
//        BufferedWriter bw = new BufferedWriter(
//                new FileWriter("testfile.txt")
//        );
//        
//        bw.write("Hello"); 
//        bw.flush();
//        Thread.sleep(5000);
//        bw.write("World");
//        bw.close();
//        
//        BufferedReader br = new BufferedReader(
//                new FileReader("testfile.txt")
//        );
//        String line = null;
//        while((line=br.readLine())!=null){
//            System.out.println(line);
//        }
//        
//        
        //pisanje i citanje pomocu fileWriter & FileReader klasa
//        FileWriter fw = new FileWriter("testfile.txt");
//        fw.write("Hello world");
//        fw.close();
//        FileReader fr = new FileReader("testfile.txt");
//        int b;
//        while ((b=fr.read())!=-1) {            
//            System.out.print((char)b);
//        }fr.close();
//        
//        // Cita bajtove sa fajla
//        FileInputStream fis = new FileInputStream("testfile.txt");
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        fis.close();
//        
//        System.out.println("");
//        // automatski citanje bajtova sa fajla
//        FileInputStream fis1 = new FileInputStream("testfile.txt");
//        int b;
//        while ((b=fis1.read())!=-1) {            
//            System.out.println(b);
//        }
//        fis.close();
//        
//        
        // pisanje karaktera u txt fajl
//        FileOutputStream fos = new FileOutputStream("testfile.txt");
//        fos.write(104);
//        fos.write(101);
//        fos.write(108);
//        fos.write(108);
//        fos.write(111);
//        fos.close();
//        
//        MyStream ms = new MyStream();
//        ms.write(1970496882);
//        ms.write(1850485843);
//        
//        
//        while (true) {
//            try {
//                Scanner sc = new Scanner(System.in);
//                Scanner sc1 = new Scanner(System.in);
//                int x = sc.nextInt();
//                int y = sc1.nextInt();
//                int result = x+y;
//                System.out.println(result);
//            } catch(Exception ex) {
//                System.out.println("Unesite ponovno");
//            }
//        }
//        String message = "22052014,43.84864,18.35644,051230,123143124122";
//        World w = World.parse(message);
//        System.out.println(w);
//        GregorianCalendar cal  = new GregorianCalendar(2019,4,10);
//        GregorianCalendar cal1  = new GregorianCalendar();
//        cal1.add(Calendar.HOUR, -24);
//        System.out.println(cal1.before(cal));
//        
//        
//        while(true) {
//            System.out.println(System.currentTimeMillis()+"\r");
//        }
//        
//        String incoming_string = "[{id:10,x:10,y:20},{id:5,x:30,y:40},{id:2,x:2,y:7}]";
//        
//        ArrayList userPositions = new ArrayList();
//        String clean_users = cleanIncomingString(incoming_string);
//        String[] users_strings = clean_users.split("#");  
//        //id:10,x:10,y:20#id:5,x:30,y:40#id:2,x:2,y:7 -> id:10,x:10,y:20 
//                                                       //id:5,x:30,y:40
//                                                       //id:2,x:2,y:7
//        
//        
//        for(int i=0;i<users_strings.length;i++){
//            userPositions.add(UserPosition.parse(users_strings[i]));
//        }
//        for(Object up : userPositions){
//            System.out.println(up);
//        } 
//        
//
//        String incoming_string = "1-peter-150"; 
//        User user = User.parse(incoming_string); 
//        System.out.println(user);
//        
//        Pattern email = Pattern.compile("[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,4}");
//        Matcher m = email.matcher("ahmed_pule@htomail.com");
//        if (m.find()) {
//            System.out.println("Phone is valid");
//        }
//
//        FileReader fr = new FileReader("config");
//        Properties props = new Properties();
//        props.load(fr);
//        ServerSocket sSocket = new ServerSocket(Integer.parseInt(props.getProperty("port")));
//        int requests = 0;
//        while (true) {
//            Socket socket = sSocket.accept();
//            String doc = parseRequest(socket);
//            response(socket, props.getProperty("path") + doc);
//            System.out.print("request: " + (++requests) + "\r");
//            socket.close();
//        }
//        
//        
//        Frame f = new Frame();
//        f.add(new JavaApplication292());
//        f.setSize(400, 400);
//        f.setVisible(true);
//        String[][] p = {
//            {"1", "Hamo", "Hully", "150.2"},
//            {"2", "Ramo", "Mully", "190.2"},
//            {"3", "Mujo"},
//            {"4", "Mujo"},
//            {"5", "Mujo"},
//            {"5", "Mujo"},};
//        for (int i = 0; i < p.length; i++) {
//            for (int j = 0; j < p[i].length; j++) {
//                System.out.print(p[i][j] + "\t");
//            }
//            System.out.println("");
//        }
//        int width = 20;
//        int height = 10;
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                boolean exist = false;
//                for (int k = 0; k < points.length; k++) {
//                    if (points[k][0] == j && points[k][1] == i) {
//                        exist = true;
//                    }
//                }
//                System.out.print(exist ? "X" : "O");
//            }
//            System.out.println("");
//        }
    }
}
