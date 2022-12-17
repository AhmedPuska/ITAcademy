package javaapplication302;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javaapplication304.Player;

public class ReadXml {

    public static void main(String[] args) throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("c:/wamp64/www/player.xml"));
        Player p = (Player) decoder.readObject();
        System.out.println(p);
    }
}
