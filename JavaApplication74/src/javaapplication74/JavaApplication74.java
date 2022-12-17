package javaapplication74;
import java.util.Scanner;
public class JavaApplication74 {
    
    
    public static void main(String[] args)
    {
        String string = String.valueOf(new char[]{'H','e','l','l','o'});
        
        System.out.println(string);
        String wordd = "Kada je to dobro . ";
        String word [] = wordd.split(" ");
//        word=word.replace("--", "ja");
//        System.out.println(word.replace("-", "*")); // menja sve pojave - sa *
        for (String ks:word)
            System.out.println(ks);
        
    }
}