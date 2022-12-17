package javaapplication256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import java.util.Scanner;

public class JavaApplication256 {

    public static int daaj = 20;

    public void test() {
        int daj = 120;
        System.out.println(daj);
    }

    public static Integer ucitajInteger() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String read = bf.readLine();
        Integer x = Integer.parseInt(read);

        return x;
    }

    static class Kalkulator {

        double operand1, operand2;
        char operator;

        public double calculate() {
            double result;
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand1 == 0 || operand2 == 0) {
                        System.out.println("Djeljenje sa 0 nije moguce!");
                        result = 0;
                    } else {
                        result = operand1 / operand2;
                    }
                    break;
                default:
                    result = 0;
                    System.out.println("");
                    break;
            }
            return result;
        }
    }

//    public static class Circle {
//
//        public double r;
//
//        public Circle(double r) {
//            this.r = r;
//        }
//    }
//    public static class Rectangle {
//
//        public double a, b;
//
//        public Rectangle(double a, double b) {
//            this.a = a;
//            this.b = b;
//        }
//    }
//    public static class Calc {
//
//        public static double area(Object shape) {
//            if (shape.getClass() == Circle.class) {
//                return Math.pow(((Circle) shape).r, 2) * Math.PI;
//            }
//            if (shape.getClass() == Rectangle.class) {
//                return ((Rectangle) shape).a * ((Rectangle) shape).b;
//            }
//            return 0;
//        }
//    }
    class Shape {

        double x, y, P;
        String color;

        void povrsina() {

        }
    }

    public static class Circle extends Shape {

        public final double PI = 3.14;
        public double r;

        public double area() {
            return r * r * PI;	// r^2 * PI

            /* može se koristiti i ugrađena konstanta Math.PI iz paketa java.lang */
            //return r * r * Math.PI;
        }

    }

    public static class Square extends Shape {

        public double a;

        public double area() {
            return a * a;	// a^2
        }

    }

    public static abstract class Zivotinja {

        public static final int HODA = 1 << 1;	// 0010
        public static final int PLIVA = 1 << 2;	// 0100
        public static final int LETI = 1 << 3;

        private String vrsta;

        public void Zivotinja(String vrsta) {
            this.vrsta = vrsta;
        }

        @Override
        public String toString() {
            return "Ovo je " + vrsta;
        }

        public abstract void oglasiSe();

        public abstract int kretanje();

        public static void ispisiKretanja(int naciniKretanja) {
            /*Koji sve načini kretanja čine datu kombinaciju kretanja, zaključuje se primenom bitske konjunkcije na kombinaciju i konkretan način kretanja.*/
            if ((naciniKretanja & HODA) == HODA) {
                System.out.print("hoda ");
            }
            if ((naciniKretanja & PLIVA) == PLIVA) {
                System.out.print("pliva ");
            }
            if ((naciniKretanja & LETI) == LETI) {
                System.out.print("leti ");
            }
            System.out.println();
        }

    }

    public static class Pas extends Zivotinja {

        @Override
        public void oglasiSe() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int kretanje() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public static class ZlatniRetriver extends Pas {

    }

    public static class Riba extends Zivotinja {

        @Override
        public void oglasiSe() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int kretanje() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public static class Pingvin extends Zivotinja {

        @Override
        public void oglasiSe() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int kretanje() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    static int calculate(int a, int b, String op) {
        if (op.equals("+")) {
            return a + b;
        }
        if (op.equals("-")) {
            return a - b;
        }
        if (op.equals("/")) {
            return a / b;
        }
        if (op.equals("*")) {
            return a * b;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Integer> al = new ArrayList();
        al.add(1);
//        al.add("John");
        Integer fromList = al.get(0);
        System.out.println(fromList);

//        LocalTime time = LocalTime.now();
//
//        System.out.println(LocalDateTime.now());
//
//        /* metode getHour(), getMinute() i getSecond() vracaju int vrednosti (sat, minut i sekundu, respektivno) */
//        System.out.println("Hour: " + time.getHour() + " Minutes: " + time.getMinute() + " Seconds: " + time.getSecond());
//
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        int year = dateTime.getYear();
//        int month = dateTime.getMonthValue();	// vrednost između 1 i 12
//        int day = dateTime.getDayOfMonth();	// vrednost između 1 i 31
//
//        int hour = dateTime.getHour();		// vrednost između 0 i 23
//        int minutes = dateTime.getMinute();	// vrednost između 0 i 59
//        int seconds = dateTime.getSecond();	// vrednost između 0 i 59
//
//// metoda getMonth() vraća objekat tipa enum Month
//        System.out.println("Today is " + dateTime.getMonth() + " " + day + ", " + year);
//
//        System.out.println("It is " + hour + " hours " + minutes + " minutes and " + seconds + " seconds");
//
//        /* metode plusMonths() i minusMonths() vraćaju objekat tipa LocalDateTime (parametar je broj meseci koji se dodaje tj. oduzima) */
//        System.out.println("6 months from now: " + dateTime.plusMonths(6));
//        System.out.println("6 months ago: " + dateTime.minusMonths(6));
//
//        LocalDate localDate = LocalDate.of(1999, 12, 13);
//
//        /* metoda of() postavlja LocalTime na osnovu 2 int parametra (sat i minut) */
//        LocalTime localTime = LocalTime.of(17, 50);
//
//        /* 1. način: parametri metode LocalDateTime.of() su objekti klasa LocalDate i LocalTime */
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
//
//        System.out.println(localDateTime);
//
//        LocalTime time1 = LocalTime.now();
//        Thread.sleep(1000);
//        LocalTime time2 = LocalTime.now();
//
//        /* Klasa Duration označava količinu vremena u sekundama. Njena metoda between() računa vreme između 2 objekta iz java.time paketa. */
//        Duration duration = Duration.between(time1, time2);
//        System.out.println(duration.getSeconds());
//
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
//        ArrayList users = new ArrayList();
//        users.add(new Person(4, "Goran"));
//        users.add(new Person(2, "Ilija"));
//        users.add(new Person(6, "Nikola"));
//        users.add(new Person(1, "Petar"));
//        users.add(new Person(2, "Jovan"));
//        users.add(new Person(3, "Zoran"));
//        int min;    // čuva minimalni id korisnika
//        Person tmp;	// čuva korisnika sa najmanjim id-jem
// prolazi kroz listu svih korisnika...
//        for (int i = 0; i < users.size(); i++) {
//            min = i;
//            for (int u = i; u < users.size(); u++) // ...i traži korisnika sa najmanjim id-jem
//            {
//                if (((Person) users.get(u)).id < ((Person) users.get(min)).id) {
//                    min = u;
//                }
//            }
//
//            /* swapuje korisnika sa minimalnim id-jem sa tekućim korisnikom */
//            tmp = (Person) users.get(min);
//            users.set(min, (Person) users.get(i));
//            users.set(i, tmp);
//        }
//
//        for (Object o : users) {
//            Person u = (Person) o;
//            System.out.println(u.id + ":" + u.ime);
//        }
//        int min;
//        Person tmp;
//        for (int i = 0; i < users.size(); i++) {
//            min = i;
//            for (int j = i; j < users.size(); j++) 
//                if (((Person) users.get(j)).id < ((Person) users.get(min)).id) {
//                    min = j;
//                }
//            tmp = (Person) users.get(min);
//            users.set(min, (Person) users.get(i));
//            users.set(i, tmp);
//        }
//        
//        for (Object user : users) {
//            Person p = (Person)user;
//            System.out.println(p.id + ":" + p.ime);
//        }
//        ArrayList usersToAdd = new ArrayList();
//        usersToAdd.add(new Person(4, "Goran"));
//        usersToAdd.add(new Person(2, "Ilija"));
//        usersToAdd.add(new Person(6, "Nikola"));
//        ArrayList users = new ArrayList();
//        users.add(new Person(1, "Petar"));
//        users.add(new Person(2, "Jovan"));
//        users.add(new Person(3, "Zoran"));
//        for (int i = 0; i < users.size(); i++) {
//            for (int j = 0; j < usersToAdd.size(); j++) {
//                if (((Person) users.get(i)).id == ((Person) usersToAdd.get(j)).id) {
//                    users.remove(j);
//                }
//            }
//        }
//        
//        users.addAll(usersToAdd);
//        
//        for (Object o : users) {
//            Person p = (Person) o;
//            System.out.println(p.id + ":" + p.ime);
//        }
//        for (int i = 0; i < users.size(); i++) {
//            for (int u = 0; u < usersToAdd.size(); u++) {
//                if (((Person) users.get(i)).id == ((Person) usersToAdd.get(u)).id) {
//                    users.remove(u);
//                }
//            }
//        }
// metoda addAll() nadovezuje elemente jedne liste na kraj druge
//        users.addAll(usersToAdd);
//
//        for (Object o : users) {
//            Person u = (Person) o;
//            System.out.println(u.id + ":" + u.ime);
//        }
//        for (int i = 0; i < usersToAdd.size(); i++) {
//            boolean userExists = false;
//            for (int u = 0; u < users.size(); u++) {
//                if (((Person) users.get(u)).id == ((Person) usersToAdd.get(i)).id) {
//                    users.set(u, (Person) usersToAdd.get(i));
//                    userExists = true;
//                }
//            }
//            if (!userExists) {
//                users.add(usersToAdd.get(i));
//            } else {
//                userExists = false;
//            }
//        }
//        for (Object user : users) {
//            Person p = (Person) user;
//            System.out.println(p.id + ":" + p.ime);
//        }
//        String word = "Proba1-tekst.Proba";
//        
//        String[] niz = word.split("[-.]");
//        
//        for (int i = 0; i < niz.length; i++) {
//            System.out.println(niz[2]);
//        }
//        String text = "Kad naidjes na coveka s kojim vredi govoriti i s njim ne govoris, izgubio si ga. Kad naidjes na coveka s kojim ne vredi govoriti i s njim govoris, izbubio si reci. Mudrac ne gubi ni coveka ni reci.";
//        
//        int covjekNum = 0;
//        int rijeciNum = 0;
//        
//        int index;
//        
//        String covekStr = "covek";
//        String reciStr = "reci";
//        
//        index = text.indexOf(covekStr);
//        
//        while(index >= 0)
//        {
//            ++covjekNum;
//            index += covekStr.length();
//            index = text.indexOf(covekStr, index);
//        }
//        
//        index = text.lastIndexOf(reciStr);
//        while(index >= 0)
//        {
//            ++rijeciNum;
//            index -= reciStr.length();
//            index = text.lastIndexOf(reciStr, index);
//        }
//        
//        System.out.println("Zadati tekst sadrzi " + covjekNum + " pojave reci \"covek\" i " + rijeciNum + " pojave reci \"reci\".");
//        String[] forbidenChars = {"<", ">", "'"};
//        String input = "<div>moj 'div' tag</div>";
//        String output = input;
//
//        for (int i = 0; i < forbidenChars.length; i++) {
//            output = input.replace(forbidenChars[i], "");
//        }
//
//        System.out.println(output);
//        String users = "Ime: Vladimir|Prezime: Vladimirovic|Ime: Jovan|Prezime: Jovanovic|Ime: Petar|Prezime: Petrovic";
//        
//        String [] userArray = users.split("\\|");
//        
//        for (int i = 0; i < userArray.length; i+=2) {
//            String firstName = userArray[i].split(" ")[1];
//            String lastName = userArray[i+1].split(" ")[1];
//            System.out.println("ime korisnika je : " + firstName + ", prezime korisnika je: " + lastName);
//        }
//        String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };
//        
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].endsWith("jpg")) {
//                System.out.println("Fajl: " + files[i] + " je tipa jpg");
//            } else if (files[i].endsWith("png")) {
//                System.out.println("Fajl: " + files[i] + " je tipa png");
//            } else if (files[i].endsWith("gif")) {
//                System.out.println("Fajl: " + files[i] + " je tipa gif");
//            }
//        }
//        String[] texts = { "Optimum pH of your water is between 6.0 and 7.0.  However Oscars are okay in a pH up to 8.0.",
//      "The Oscar fish is not a difficult fish to look after if you give it a suitable environment to live in. You may start having problems such as health issues if you keep your Oscar in an unsuitably small tank or feed it on a poor diet",
//      "The Oscar has the potential to reach 18 inches. However in captivity Oscars normally grow to between 8 and 12 inches" };
//
//        for(int i = 0; i < texts.length; i++) {
//            if (texts.length<25) {
//                String karak = texts[i].substring(0,22);
//                karak = karak.concat("...");
//                System.out.println(karak);
//            }
//        }
//        char re = s1.charAt(5);
//        char[] charArray = s1.toCharArray();
//        
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i]);
//        }
//        Circle c = new Circle();
//        c.x = 33;
//        c.y = 22;
//        c.color = "crvena";
//        c.r = 5;
//        System.out.println(c.area());	// 452.16 
//        int redovi = 5;
//        int kolone = 5;
//        
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j<10-i||i<10-j) {
//                    System.out.print("*");
//                }else System.out.print(" ");
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= redovi; i++) {
//            for (int j = 1; j <= redovi; j++) {
//                if (i+j>=6) {
//                    System.out.print("*");
//                } else System.out.print(" ");
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= redovi; i++) {
//            for (int j = 1; j <= kolone - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(k);
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < redovi; i++) {
//            for (int j = kolone; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < redovi; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= redovi; i++) {
//            for (int j = 1; j <= kolone - i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < 7; i++) {
//            for (int j = 7; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                if (i==4 || k==0 || k==i) {
//                    System.out.print(" " + '*');
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println("");
//        }
//        System.out.print("Enter a number: ");
//        int n = 11;
//        System.out.println("");
//        for (int x = 0; x < n; x++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int x = n - 3; x >= 0; x--) {
//            for (int y = x; y >= 0; y--) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//        for (int x = 0; x < n; x++) {
//            System.out.print("*");
//        }
//        Circle c = new Circle(4);
//        System.out.println(Calc.area(c));
//        
//        Rectangle r = new Rectangle(2, 3);
//        System.out.println(Calc.area(r));
//        Kalkulator k = new Kalkulator();
//        k.operand1 = 3;
//        k.operand2 = 1;
//        k.operator = '/';
//        System.out.println(k.calculate());
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int x = 0;
//        
//        while (x<arr.length) {
//            System.out.println(arr[x]);
//            x++;
//        }
//        do{
//            System.out.println(arr[x]);
//            x++;
//        }
//        while (x<arr.length); 
        //        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //        
        //        int x = ucitajInteger();
        ////            System.out.println(x);
        //        
        //        
        //        
        //        int[] n = new int[x];
        //        for (int i = 0; i < x; i++) {
        //            n[i] = ucitajInteger();
        //        }
        //        
        //        int b =0 ;
        //        for (int on : n) {
        //            System.out.println( b++ + ": " + on);
        //        }
        //        int visinaPiramide=6;
        //        int brojznakova = 12;
        //        int kolona = 6, red = 6;
        //        for (int i = visinaPiramide; i > 0; i--) {
        //            for (int j = visinaPiramide; j > i; j--) {
        //                System.out.print(" ");
        //            }
        //            for (int k = 1; k < brojznakova; k++) {
        //                System.out.print("*");
        //            }
        //            brojznakova-=2;
        //                System.out.println("");
        //        }
        //        for (int i = 0; i < visinaPiramide; i++) {
        ////            for (int j = 0; j < visinaPiramide - i; j++) {
        ////                System.out.print(" ");
        ////            }
        //            for (int k = 0; k < i; k++) {
        //                System.out.print("*");
        //            }
        ////            brojznakova-=2;
        //            System.out.println("");
        //        }
        //        for (int i = 0; i < visinaPiramide; i++) {
        //            for (int j = 0; j < visinaPiramide-i; j++) {
        //                System.out.print(" ");
        //            }
        //            for (int k = 0; k < brojznakova; k++) {
        //                System.out.print("&");
        //            }
        ////            System.out.println("");
        //            brojznakova+=2;
        //            System.out.println("");
        //        }
        //        System.out.println(brojznakova);
        //        for (int i = 0; i < visinaPiramide; i++) {
        //            for (int j = 0; j < visinaPiramide - i; j++) 
        //                System.out.print(" ");
        //            for (int k = 0; k < brojznakova; k++) 
        //                System.out.print("*");
        //            brojznakova += 2;
        //            System.out.println("");
        //        }
        //        int red = 5, kolona = 5;
        //        for (int i = 0; i < red; i++) {
        //            for (int j = 0; j < kolona; j++) {
        //                System.out.print(i*j + " ");
        //            }
        //            System.out.println("");
        //        }
        //        int red=6, kolona=6;
        //        for (int i = 0; i < red; i++) {
        //            for (int j = 0; j < kolona; j++) {
        //                if (j<kolona-i) {
        //                    System.out.print("*");
        //                } else {
        //                    System.out.print(" ");
        //                }
        //            }
        //            System.out.println("");
        //        }
        //        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        //        String[] textArray = text.split(" ");
        //        ArrayList personList = new ArrayList();
        //
        //        for (int i = 0; i < textArray.length; i++) {
        //            String[] textArray2 = textArray[i].replace(".", "/").split("/");
        //
        //            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
        //            LocalDate ld = LocalDate.parse(textArray2[2], dtf);
        //
        //            Person p = new Person(textArray2[0], textArray2[1], textArray2[3], ld);
        //            personList.add(p);
        //        }
        //        for (Object personList1 : personList) {
        //            System.out.println(personList1);
        //        }
        //        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87}, pos, hc;
        //
        //        int positive = 0, negative = 0;
        //
        ////        Arrays.sort(array);
        //        for(int ok : array) {
        //            System.out.print(ok + ", ");
        //        }
        //        
        //        for (int i = 0; i < array.length; i++) {
        //            if (array[i] > 0) {
        //                positive += 1;
        //            } else if (array[i] < 0) {
        //                negative += 1;
        //            }
        //        }
        //
        //        pos = new int[positive];
        //        hc = new int[negative];
        //
        //        positive = 0;
        //        negative = 0;
        //
        //        int p, p1, n, n1;
        //
        //        for (p = 0, p1 = 0, n = 0, n1 = 0; p < array.length; p++, n++) {
        //            if (array[p] > 0) {
        //                pos[p1] = array[p];
        //                p1++;
        //            } else if (array[n] < 0) {
        //                hc[n1] = array[n];
        //                n1++;
        //            }
        //        }
        //
        //        int[] array1 = new int[array.length];
        //        System.arraycopy(array, 0, array1, 0, array.length);
        //        Arrays.sort(array1);
        //        int d = array1[0];
        //        int d1 = -1;
        //        for (int j : array1) {
        //            if (j == d) {
        //                d1++;
        //                continue;
        //            } else if (d1 > 1) {
        //                System.out.printf("Element %d shows up %d times.\n", d, d1);
        //            }
        //            d1 = 1;
        //            d = j;
        //        }
        //
        //        System.out.println("Array of positive elements: "
        //                + Arrays.toString(pos));
        //        System.out.println("Array of negative elements: "
        //                + Arrays.toString(hc));
        //        int r;
        //        for (int i = 0; i < 10; i++) {
        //            for (int j = 0; j < 10; j++) {
        //                r = i * j;
        //                System.out.println(i + " * " + j + " = " + r);
        //            }
        //            System.out.println("");
        //        }
        //        System.out.println("N\t10*N\t100*N\t1000*N\n");
        //        for (int i = 1; i <= 5; i++) {
        //            for (int j = 1; j <= 1000; j*=10) {
        //                System.out.print(i*j + "\t");
        //            }
        //            System.out.println("");
        //        }
        //        char znak;
        //        int visina, sirina;
        //        System.out.println("Unesi znak");
        //        Scanner sc = new Scanner(System.in);
        //        znak = sc.next().charAt(0);
        //        System.out.println("Koliko polja zelite");
        //        Scanner sc1 = new Scanner(System.in);
        //        Scanner sc2 = new Scanner(System.in);
        //        visina = sc1.nextInt();
        //        sirina = sc2.nextInt();
        //        for (int i = 0; i < visina; i++) {
        //            for (int j = 0; j < i; j++) {
        //                System.out.print(znak + " ");
        //            }
        //            System.out.println("");
        //        }
        //        for (int i = 0; i < visina; i++) {
        //            for (int j = 0; j < visina - i; j++) {
        //                System.out.print(znak + "");
        //            }
        //            System.out.println("");
        //        }
        //        for (int i = visina; i > 0; i--) {
        //            for (int j = 0; j < visina - i; j++) {
        //                System.out.print(" ");
        //            }
        //            for (int k = 0; k < i; k++) {
        //                System.out.print(znak);
        //            }
        //            System.out.println("");
        //        }
        //        final char c = (char) 65;
        //        System.out.println(c);
        //        
        //        Scanner sc = new Scanner(System.in);
        //        char znak ;
        //        System.out.println("Unesite slovo engleske abecede");
        //        
        //        znak = sc.next().charAt(0);
        //        int res = ((znak >= 97) && (znak <= 122))?((char)znak - 32):((char)znak +32);
        //        System.out.println((char)res);
        //        System.out.println(((znak >= 97) && (znak <= 122))?((char)znak - 32):((char)znak +32));
        //        System.out.println(((znak>=97)&&(znak<=122))?char (znak-32):char(znak+32));
        //        ((znak >= 'a') && (znak <= 'z')) ? cout << char(znak - 32) : cout << char(znak +32);
        {

        }
    }

}
