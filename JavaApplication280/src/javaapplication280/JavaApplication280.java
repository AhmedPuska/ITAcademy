package javaapplication280;

import java.util.HashMap;
import java.util.Map;

public class JavaApplication280 {

    public static void main(String[] args) {
        Exercises ex = new Exercises();
//        ex.main();
        int[] dodaj = new int[2];
        dodaj[0] = 1;
        dodaj[1] = 1;
//        dodaj[2]=6;
        int[] sum1 = new int[]{1, 1};
        int[] sum2 = new int[]{1};
        int[] sum3 = {};
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
//        map.put("c", "meh");
//        map.put("d", "hi");
        String[] ok = new String[5];
        ok[0]="Okk";
        ok[1]="moon";
        ok[2]="mood";
        ok[3]="night";
        ok[4]="nothing";
        System.out.println(ex.firstChar(ok));
//        System.out.println(ex.sum2(sum1));
//        System.out.println(ex.sum2(sum2));
//        System.out.println(ex.sum2(sum3));
//        missingChar("kucaodstakla", 2);
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        System.out.println("Naprijed: " + front + " Nazad: " + back);
        return front + back;
    }

}
