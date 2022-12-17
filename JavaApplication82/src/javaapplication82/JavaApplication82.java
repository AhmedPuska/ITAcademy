
package javaapplication82;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import sun.util.calendar.Gregorian;
public class JavaApplication82 {
    public static void main(String[] args) {
        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        String[] textArray = text.split(" ");
        ArrayList personList = new ArrayList();
        
        Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/y HH:m:s");
            System.out.println(sdf.format(date));
            
            GregorianCalendar cal = new GregorianCalendar();
            System.out.println(cal.getTime());
            
        for (int i = 0; i < textArray.length; i++) {
            String [] textArray2 = textArray[i].replace(".","/").split("/");
            
        DateTimeFormatter form = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate datum = LocalDate.parse(textArray2[2], form); 
        
        Person p = new Person (textArray2[0], textArray2[1], textArray2[3], datum);  
        
        personList.add(p);
        }
        for (Object l : personList)
        System.out.println(l.toString());
    
//        for (int i = 0; i < arrayText.length; i++) {
//            System.out.println(arrayText[i]);
//        }
//        System.out.printf("%s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(),ldt.getYear(), ldt.getHour(), ldt.getMinute());
}
}