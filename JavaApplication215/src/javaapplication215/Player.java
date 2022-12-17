/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication215;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Player implements Serializable{
    public String name;
    public int x;
    public int y;
    
    public static Player deserialize(String ulaz) {
        String[] ulazParts = ulaz.split(", ");
        Player p = new Player();
        p.name = ulazParts[0];
        p.x = Integer.parseInt(ulazParts[1]);
        p.y = Integer.parseInt(ulazParts[2]);
        
        return p;
    }
    public String serialize() {
        return this.name + ", " + this.x + ", " + this.y;
    }
    
    public String toString() {
        return this.serialize();
    }
}
