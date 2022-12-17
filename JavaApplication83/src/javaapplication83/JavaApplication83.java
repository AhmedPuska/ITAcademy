/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication83;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class JavaApplication83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String[] textArray = text.split(" ");
        ArrayList personList = new ArrayList();
        
        for (int i = 0; i < textArray.length; i++) {
            String[] textArray2 = textArray[i].replace(".","/").split("/");
        
      try {
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
             
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MMM.yyyy");
        LocalDate date = LocalDate.parse(textArray2[2], formatter);
        /* metoda format() vraća String (datum sa tekstualnim nazivom meseca) */
        System.out.println(date.format(formatter2));
        } 
        catch (Exception exc) {
        System.out.println(exc);
        }   
        }
        for (Object l : textArray)
            System.out.println(l);
}
}