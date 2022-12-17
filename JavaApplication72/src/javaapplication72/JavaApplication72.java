/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class JavaApplication72 {
    
    public static void main(String[] args) {
        
        
        String str = "This is a sentence.  This is a question, right?  Yes!  It is.";

        System.out.println("Return Value :");

        /* vrši se podela stringa po svim karakterima iz uglastih zagrada */
        String[] wordArray = str.split("[ .,?!]+");

        for(int i = 0; i < wordArray.length; i++) {
        System.out.println(wordArray[i]);
        }

       /* String str = "Welcome-to-ITAcademy";

        System.out.println("Return Value :");

        /* vraća niz od 3 reči * /
        String[] wordArray1 = str.split("-");

        for(int i = 0; i < wordArray1.length; i++) {
        System.out.println(wordArray1[i]);
        }

        System.out.println("Return Value :");

        /* vraća niz od samo 2 reči * /
        String[] wordArray2 = str.split("-", 2);

        for(int i = 0; i < wordArray2.length; i++) {
        System.out.println(wordArray2[i]);
        }
        /*
        String word = "--Hello--";
 
/* menja sve pojave karaktera "-" u stringu word karakterom "*" * /
System.out.println(word.replace("-", "*"));

        String str = "This is string!";
boolean retVal;
 
// testira da li se string završava navedenim sufiksom
retVal = str.endsWith("string!");
System.out.println("Returned Value = " + retVal);
 
retVal = str.endsWith("This");
System.out.println("Returned Value = " + retVal);

        /*String str = "Welcome to ITAcademy";
 
        // proverava da li string počinje datim prefiksom
        System.out.print("Return Value :");
        System.out.println(str.startsWith("Welcome"));

        System.out.print("Return Value :");
        System.out.println(str.startsWith("ITAcademy"));

        // provera ne počinje od početka, nego od datog indeksa
        System.out.print("Return Value :");
        System.out.println(str.startsWith("ITAcademy", 11));
/*
        String str1 = "First value";
        String str2 = "Second value";

        String str3 = new String("First value");
        String str4 = new String("Second value");

        /* stringovi str1 i str3 imaju istu vrednost, iako nisu kreirani na isti način * /
        boolean retVal;
        retVal = str1.equals(str3);
        System.out.println(retVal);

        // stringovi str1 i str2 imaju različitu vrednost
        retVal = str1.equals(str2);
        System.out.println(retVal);
        System.out.println(str1==str1);
        
        /*
        String str = "Welcome to ITAcademy";
 
        System.out.print("Return Value :");
        System.out.println(str.substring(11));

        System.out.print("Return Value :");
        System.out.println(str.substring(11, 14));  
        // dužina podstringa je 3 karaktera
         
        String s = "This is string";
 
// vraća karakter na traženoj poziciji (počevši od nulte)
char result = s.charAt(8);
        System.out.println(s.length()-1);
System.out.println(result);

//        String str = "Welcome to ITAcademy";
        String subStr1 = "ITAcademy";
        String subStr2 = "ITAcademy.com";
       
        System.out.print("Found Index :");
        System.out.println(str.indexOf('o'));
        
        System.out.print("Found Index :");
        System.out.println(str.indexOf('o', 5));
        
        // vraća indeks prve pojave podstringa u stringu
        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr1));
        
        // kao prethodno, ali počevši od date pozicije
        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr1, 15));
        
        
        // ako podstring nije pronađen, metoda vraća -1
        System.out.print("Found Index :");
        System.out.println(str.indexOf(subStr2));

        /*
        StringBuilder sb = new StringBuilder();
        sb.append("My");
        sb.append(" string");
        System.out.println(sb);
        
        String word = "Hello";
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        int len = word.length();
        System.out.println(len);
        
        String str = "   Welcome to ITA!   ";
 
        
        
System.out.print("Return Value : ");
 
/* pretvara sva slova u velika slova * /
System.out.println(str.toUpperCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(str.trim());
*/
    }
    
}
