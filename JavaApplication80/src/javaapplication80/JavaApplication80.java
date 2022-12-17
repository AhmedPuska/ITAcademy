/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JavaApplication80 {
    public static void main(String[] args) throws InterruptedException
    {

       //Šta će se prikazati na izlazu ukoliko enumeraciji pristupimo na sledeći način:
System.out.println(DaysOfWeek.values()[1]);

        LocalDate localDate = LocalDate.of(2000, 06, 30);
System.out.println(localDate.minusDays(1).getDayOfMonth());
        


//        Instant instant = Instant.now();       
//        Thread.sleep(1000);
//
//        // 2. parametar metode until() je vremenska jedinica
//        long period = instant.until(Instant.now(), ChronoUnit.SECONDS);
//        long day = instant.until(Instant.now(), ChronoUnit.NANOS);
//        System.out.println(period);
//        
//        System.out.println(day);
//        System.out.println(" ");
        
//        
//        LocalTime time1 = LocalTime.now();
//    Thread.sleep(1000);
//    LocalTime time2 = LocalTime.now();
// 
///* Klasa Duration označava količinu vremena u sekundama. Njena metoda between() računa vreme između 2 objekta iz java.time paketa. */
//    Duration duration = Duration.between(time1, time2);
//    System.out.println(duration.getSeconds());
//        LocalDate now = LocalDate.now();
//        LocalDate birthday = LocalDate.of(1996, Month.AUGUST, 13);
//
//        /* Klasa Period označava količinu vremena u smislu broja godina, meseci i dana. Njena metoda between() vraća period između 2 datuma. */
//        Period p = Period.between(birthday, now);
//
//        /* Enumeracija ChronoUnit obuhvata standardni skup vremenskih jedinica. Njena metoda between() vraća količinu vremena između 2 datuma u odgovarajućoj jedinici vremena. */
//        long p2 = ChronoUnit.DAYS.between(birthday, now);
//        long p3 = ChronoUnit.MONTHS.between(birthday, now);
//
//        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old. (" + p2 + " days total or " + p3 + " months)");



        
        
//        LocalDate now = LocalDate.now();
//        
//        System.out.println(now.getYear());
//        
//        LocalDate date = LocalDate.of(2000, Month.SEPTEMBER, 20);
//        System.out.println(date);
//        
//        // statička metoda now() vraća trenutno vreme
//        LocalTime time = LocalTime.now();
//
//        /* metode getHour(), getMinute() i getSecond() vracaju int vrednosti (sat, minut i sekundu, respektivno) */
//        System.out.println("Hour: " + time.getHour() + " Minutes: " + time.getMinute() + " Seconds: " + time.getSecond());
//
//        System.out.println(LocalDateTime.now());
//        
//        LocalDateTime dateTime = LocalDateTime.now();
// 
//        int year = dateTime.getYear();
//        int month = dateTime.getMonthValue();  // vrednost između 1 i 12
//        int day = dateTime.getDayOfMonth(); // vrednost između 1 i 31
//
//        int hour = dateTime.getHour();      // vrednost između 0 i 23
//        int minutes = dateTime.getMinute(); // vrednost između 0 i 59
//        int seconds = dateTime.getSecond(); // vrednost između 0 i 59
//
//        // metoda getMonth() vraća objekat tipa enum Month
//        System.out.println("Today is " + dateTime.getMonth() + " " + day + ", " + year);
//
//        System.out.println("It is " + hour + " hours " + minutes + " minutes and " + seconds + " seconds");
//
///* metode plusMonths() i minusMonths() vraćaju objekat tipa LocalDateTime (parametar je broj meseci koji se dodaje tj. oduzima) */
//        System.out.println("6 months from now: " + dateTime.plusMonths(6));
//        System.out.println("6 months ago: " + dateTime.minusMonths(6));
//        
//        System.out.println("");
//        LocalDate localDate = LocalDate.of(1996, 8, 13);
// 
//    /* metoda of() postavlja LocalTime na osnovu 2 int parametra (sat i minut) */
//LocalTime localTime = LocalTime.of(17, 50);
// 
//    /* 1. način: parametri metode LocalDateTime.of() su objekti klasa LocalDate i LocalTime */     
//LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//    
//System.out.println(localDateTime);

       
        
        
        
//        
//        ListaCvorova cvorovi = new ListaCvorova();
//        cvorovi.dodaj(1);
//        cvorovi.dodaj(5);
//        cvorovi.dodaj(10);
//        System.out.println(cvorovi.vratiVrednost(2));
//        System.out.println(LocalDateTime.now());
        
        
        
//        ArrayList myList = new ArrayList();
//        myList.add("kako");
//        myList.add("dobro");
//        myList.add("da ne");
////        myList.add(123);
////      myArray.remove(1);
//        System.out.print(myList);
////        System.out.println(myArray.get(2));
//        System.out.println("");
//        for(int i=0;i<myList.size();i++)
//        System.out.println(myList.get(i));
//        for (Object o : myList)
//        {
//            System.out.println(o);
//        }
//        System.out.println("");
//        for(Object s : myList)
//        if(s.equals("name"))
//        System.out.println("Value exists");
//        else if(s.equals("da ne"))
//        System.out.println("Value doesn't exists,,its exist ;) ");
//        System.out.println(myList.contains("kako"));
//        
////        String [] niz = new String[myList.size()];
////        for (int i = 0; i < myList.size(); i++) {
////            niz[i]= (String) myList.get(i);
////        }
//        
//        String[] niz = (String[]) myList.toArray(new String[myList.size()]);
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(niz);
//        
//        System.out.println(" ");
//        ArrayList users = new ArrayList();
//        users.add(new Node(4,"Goran"));
//        users.add(new Node(2,"Ilija"));
//        users.add(new Node(6,"Nikola"));
//        users.add(new Node(1, "Petar"));
//        users.add(new Node(2, "Jovan"));
//        users.add(new Node(3, "Zoran"));
//        
//        
//        System.out.println(" ");
//        
//        NodeList list = new NodeList();
////        list.add(1);
////        list.add(5);
////        list.add(10);
////        System.out.println(list.getValue(2));
//        
//        HashMap hashMap = new HashMap();
//        hashMap.put("1234567890123", "John Davidson");
//        hashMap.put("1234567890124", "Mia Parkinson");
//        hashMap.put("1234567890124", "Tom Dvorak");    // "gazi" prethodni
//        System.out.println(hashMap.get("1234567890124"));
//        System.out.println(hashMap.get("1234567890124"));
    }
}
