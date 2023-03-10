package javaapplication106;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funkcije {
    
    public static String pathInput() {
        System.out.print("Input desired path: ");
        Scanner u = new Scanner (System.in);
        String input = u.nextLine();
        return input;
    }
    public static void list() {
      System.out.println("Folder view");
      File path = new File (pathInput());
      if (path.exists() && path.isDirectory()) {
        String[] strings = path.list();
        for(int i=0; i<strings.length; i++)
          System.out.println(strings[i]);
      } else
        System.out.println("The selected folder does not exist.");
    }
    
    public static void info() {
      System.out.println("Info view");
      File path = new File (pathInput());
      if (path.exists()) {
        System.out.println("Name: " + path.getName());
        System.out.println("Path: " + path.getPath());
        System.out.println("Size: " + path.length() + " bytes");
        Instant inst = Instant.ofEpochMilli(path.lastModified());
        LocalDateTime dateTime = LocalDateTime.ofInstant(inst, ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd. MMM yyyy.");
        System.out.println("Last modified: " + dateTime.format(dateTimeFormatter));
      } else
        System.out.println("Selected file/folder does not exist.");
    }
    
    
    public static void createDir() {
      System.out.println("Folder creating");
      File path = new File (pathInput());
      if(!path.exists()) {
        path.mkdir();
        System.out.println("Folder " + path.getName() + " Successfully created.");
      } else
        System.out.println("Folder can not be created " + path.getName());
    }
    
    
    
    public static void delete() {
     System.out.println("Delete");
      File path = new File(pathInput());
      System.out.print("Are you sure you want to delete " + path.getName() + " ? Y/N: ");
        Scanner scanner = new Scanner(System.in);
        String izbor = scanner.nextLine();
      switch (izbor) {
        case "Y" :
          if(path.exists() && path.isDirectory()) {
            if(path.length() != 0){
              for(String x : path.list()){
                File xFile = new File(path, x);
                xFile.delete();
              }
            }
            path.delete();
            System.out.println("Folder " + path.getName() + " successfully deleted.");
          }
          if(path.exists() && path.isFile()) {
            path.delete();
            System.out.println("File " + path.getName() + " successfully deleted."); 
          }
          break;
        case "N" :
          System.out.println(path.getName() + " not deleted.");
          break;
        default :
          System.out.println("You should simply select Y or N");
          System.out.println(path.getName() + " not deleted.");
          break;
      }
    }
    
    
    
     public static void rename() {
      System.out.println("Rename");
      File oldPath = new File (pathInput());
      File newPath = new File (pathInput());
      if(!oldPath.exists()) {
      System.out.println(oldPath.getName() + " does not exist.");
      return;
      }
      if(newPath.exists()) {
        System.out.println(newPath.getName() + " already exists.");
        return;
      }
        if(oldPath.renameTo(newPath)) {
        System.out.println("Rename successfully executed.");
        }
     else {
        System.out.println("Rename has failed");
        }
    }
    
     
     
    public static void copy() {
      System.out.println("Copy");
      File oldPath = new File (pathInput());
      File newPath = new File (pathInput());
      if (oldPath.exists() && oldPath.isDirectory()) {    
        newPath.mkdir();
        for (String f : oldPath.list()) {
          File newFile1 = new File(oldPath, f);
          File newFile2 = new File(newPath, f);
          try(FileInputStream inStr = new FileInputStream(newFile1);
            FileOutputStream outStr = new FileOutputStream(newFile2);) {
              byte[] buffer = new byte[1024];
              int length;
              while((length=inStr.read(buffer))>0) {
                outStr.write(buffer,0,length);
              }
          } catch (IOException e) {
            System.out.println("Copying folder " + oldPath.getName() + " has failed.");  
          }
        }
        System.out.println("Folder " + oldPath.getName() + " successfully copied.");
      }
      if(oldPath.exists() && oldPath.isFile()) {
        try (FileInputStream inS = new FileInputStream(oldPath);
           FileOutputStream ouS = new FileOutputStream(newPath);) {
          byte[] buffer = new byte[1024];
          int len;
          while((len=inS.read(buffer))>0) {
            ouS.write(buffer,0,len);
          }
          System.out.println("File " +oldPath.getName() + " successfully copied.");
        } catch (IOException e) {
          System.out.println("Copying file " + oldPath.getName()+ " has failed.");
        }
      }
    }

    
       public static void move() {
        System.out.println("Move");
        File oldPath = new File(pathInput());
        File newPath = new File(pathInput());
        if (oldPath.exists() && oldPath.isDirectory()) {
          newPath.mkdir();
          for (String f: oldPath.list()) {
            File newFile1 = new File(oldPath, f);
            File newFile2 = new File(newPath, f);
            try (FileInputStream inStr = new FileInputStream(newFile1);
                    FileOutputStream outStr = new FileOutputStream(newFile2);) {
              byte[] buffer = new byte[1024];
              int length;
              while ((length = inStr.read(buffer)) > 0) {
                outStr.write(buffer, 0, length);
              }
            } catch (IOException e) {
              System.out.println("Moving foldera " + oldPath.getName() + " has failed.");
            }
          }
          if (oldPath.length() != 0) {
            for (String x: oldPath.list()) {
              File xFile = new File(oldPath, x);
              xFile.delete();
            }
          }
          oldPath.delete();
          System.out.println("Moving foldera " + oldPath.getName() + " was successfully executed.");
        }
        if (oldPath.exists() && oldPath.isFile()) {
          try (FileInputStream inS = new FileInputStream(oldPath);
                  FileOutputStream ouS = new FileOutputStream(newPath);) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inS.read(buffer)) > 0) {
              ouS.write(buffer, 0, length);
            }
            
          } catch (IOException e) {
            System.out.println("Moving file " + oldPath.getName() + " has failed.");
          }
          oldPath.delete();
          System.out.println("File " + oldPath.getName() + " successfully moved.");
        }
       }
}