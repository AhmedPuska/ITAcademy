package javaapplication244;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication244 {
    
    public static void main(String[] args) {
        
        File afile = new File("forCopy.txt");
        File bfile = new File("toCopy.txt");
        
        try(FileInputStream inStream = new FileInputStream(afile);
                FileOutputStream outStream = new FileOutputStream(bfile);) {
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        
        
        int[] array = {1, 2, 3, 4, 5};
        System.arraycopy(array, 2, array, 1, 2);
        System.out.println(Arrays.toString(array));
//        JavaApplication244 myScope = new JavaApplication244();
//        int z = 6;
//        System.out.println(z);
//        myScope.doStuff();
//        System.out.println(z);
//        System.out.println(myScope.z);
        
//        Student peter = new Student();
//        Student sally = new Student();
//        peter.name = "Peter";
//        peter.age = 32;
//        sally = peter;
//        sally.name = "Sally";
//        System.out.println("Peter's Name: " + peter.name);
        
//        int [] [] array2D = {{0, 1, 2}, {3, 4, 5, 6}};
//        System.out.println(array2D[0].length + " ");
//        System.out.println(array2D[1].getClass().isArray() + " ");
//        System.out.println(array2D[0][1]);
    }
    
//    void doStuff() {
//        int z = 5;
//        doStuff2();
//        System.out.println(z);
//    }
//    
//    void doStuff2() {
//        int z = 4;
//    }
}