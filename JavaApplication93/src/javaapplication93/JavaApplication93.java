/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.io.*;

public class JavaApplication93 {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        
        File index = new File("C:\\Users\\user\\Desktop\\Select\\fol");
        if (!index.exists()) {
            index.mkdir();
        } else {
            index.delete();
            if (!index.exists()) {
                index.mkdir();
            }
        }
        
        
        
//       // kopiranje sadrzaja fajla
//        File aFile = new File("E:\\rad\\java vjezbe\\JavaApplication93\\text.txt");
//        File bFile = new File("E:\\rad\\java vjezbe\\JavaApplication93\\test\\text.txt");
//        
//        try(FileInputStream inStream = new FileInputStream(aFile);
//                FileOutputStream outStream = new FileOutputStream(bFile))
//        {
//            byte[] buffer = new byte[1024];
//            int length;
//            while((length = inStream.read(buffer)) > 0){
//                outStream.write(buffer, 0 , length);
//            }
//            System.out.println("File is copied successfuly!");
//        }
//        catch(IOException ex){
//            System.out.println(ex); 
//        }
        
        
        
        
        
        
        
//        //Promjena naziva fajla/foldera
//        File oldFile = new File("E:\\rad\\java vjezbe\\JavaApplication93\\tekst.txt");
//        File newFile = new File("E:\\rad\\java vjezbe\\JavaApplication93\\text.txt");
//        if (!oldFile.exists()) {
//            System.out.println("File doesn't exists!");
//            return;
//        }
//        if (newFile.exists()) {
//            System.out.println("File with desired name already exists");
//            return;
//        }
//        if (oldFile.renameTo(newFile)) {
//            System.out.println("Rename succesful");
//        }
//        else{
//            System.out.println("Rename failed");
//        }

        
        
//        File file = new File("E:\\rad\\vjezba");
//            if (file.exists()) {
//                file.delete();
//                System.out.println("File successfully deleted!");
//            }else
//            {
//                System.out.println("Cannot delete " + file.getName() + " because " + file.getName() + " does not exist.");
//            }
        
        
        
        
//        //Create directory
//        File testDirectory = new File("E:\\rad\\vjezba");
//        try{
//        if (!testDirectory.exists()) {
//            testDirectory.mkdir();
//            System.out.println("Created a directory called " + testDirectory.getName());
//        }else{
//            System.out.println("Directory called " + testDirectory.getName() + " already exists.");
//        }
//    }catch(Exception ex)
//    {
//        System.out.println("Coludn't create a directory called " + testDirectory.getName());
//    }
        
        
        
//        File path = new File("E:\\Rad\\java vjezbe\\Javaapplication93\\");
//        if (path.exists()&&path.isDirectory()) {
//            File[] files = path.listFiles();
//            for (int i = 0; i < files.length; i++) {
//                System.out.println(files[i].getName());
//            }
//        }
//            String[] strings = path.list();
//            for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//            }
//        }

//        File file = new File("E:\\rad\\java vjezbe\\JavaApplication93\\tekst.txt");
//        if (file.exists()) {
//            System.out.println("Is file = " + file.isFile());
//            System.out.println("Is directory = " + file.isDirectory());
//            System.out.println("Length = " + file.length());
//            
//            Instant instant = Instant.ofEpochMilli(file.lastModified());
//            
//            LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
//            
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd. MMM yyyy. HH:mm:ss");
//            
//            System.out.println("Last modified = " + dateTime.format(dtf));
//            
//            file.setReadOnly();
//        }
        
        
//        File roots = new File("text.txt");
//        System.out.println("Absolute path = " + roots.getAbsolutePath());
//        System.out.println("Name = " + roots.getName());
//        System.out.println("Parent = " + roots.getParent());
//        System.out.println("Path = " + roots.getPath());
//        System.out.println("Is absolute = " + roots.isAbsolute());
         
        
        
//       System.out.println("LIST, INFO, CREATE_DIR, RENAME, COPY, MOVE, DELETE");  
//       System.out.print("Select the desired operation: ");  
//       Scanner s = new Scanner (System.in);  
//       String input = s.nextLine();  
//        
//       try {   
//        Operacije op = Operacije.valueOf(input);  
//        System.out.print("Operation accepted ");  
//        switch (op){  
//          case LIST :  
//            Manipulacije.list();  
//            break;  
//          case INFO :  
//            Manipulacije.info();  
//            break;  
//          case CREATE_DIR :  
//            Manipulacije.createDir();  
//            break;  
//          case RENAME :  
//            Manipulacije.rename();  
//            break;  
//          case COPY :  
//            Manipulacije.copy();  
//            break;  
//          case MOVE :  
//            Manipulacije.move();  
//            break;  
//          case DELETE :  
//            Manipulacije.delete();  
//            break;  
//          default :  
//            System.out.println("*");  
//            break;  
//        }  
//      } catch (Exception e) {   
//        System.out.println("Operation does not exist." + "\nTry again.");   
//     }  
    }
}
