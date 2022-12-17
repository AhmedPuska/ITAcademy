package javaapplication317;

/**
 *
 * @author user
 */
class StaticTest {
    static int i = 47;
}

public class Vjezba {
    static void uvecaj() {
        StaticTest.i++;
        
        System.out.println();
    }
    int a;
    float b;
    int skladiste(String s) {
        return s.length() * 2;
    }
}
