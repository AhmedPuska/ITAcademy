/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication212;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author user
 */
public class Decoder {
    public static void main(String[] args) throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("c:/wamp64/www/player.xml"));
        Player p = (Player)decoder.readObject();
        System.out.println(p);
    }
    
}
