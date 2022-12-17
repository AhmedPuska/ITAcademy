package zadatak2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String [] textArray = text.split(" ");
        ArrayList personList = new ArrayList();
        
        for (int i=0; i<textArray.length; i++){
            String [] textArray2 = textArray[i].replace(".","/").split("/"); 
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy"); 
            LocalDate ld = LocalDate.parse(textArray2[2], dtf);
            
            Person p = new Person (textArray2[0], textArray2[1], textArray2[3], ld); 
            personList.add(p);  
        }
        for (Object p : personList)  
            System.out.println(p.toString());
    }   
}
