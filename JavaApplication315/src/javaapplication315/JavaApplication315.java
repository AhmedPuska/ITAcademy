package javaapplication315;

import javaapplication314.Sabiranje;
import javaapplication314.SabiranjeService;

public class JavaApplication315 {

    public static void main(String[] args) {
        SabiranjeService servis = new SabiranjeService();
        Sabiranje sabiranje = servis.getSabiranjePort();
        System.out.println(sabiranje.saberi(5, 4));
    }
    
}
