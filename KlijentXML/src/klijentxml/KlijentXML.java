
package klijentxml;

import javaapplication251.Sabiranje;
import javaapplication251.SabiranjeService;

public class KlijentXML {

    public static void main(String[] args) {
        SabiranjeService servis = new SabiranjeService();
        Sabiranje sabiranje = servis.getSabiranjePort();
        System.out.println(sabiranje.saberi(4, 2));
    }
    
}