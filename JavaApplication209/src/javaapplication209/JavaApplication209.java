/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication209;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author user
 */
public class JavaApplication209 {
    
    static void f1() throws SQLException {
        DbConnection dbConn = DbConnection.getInstance();
        Connection conn = dbConn.conn;
        System.out.println("pozvana metoda f1");
    }
    
    static void f2() throws SQLException {
        DbConnection dbConn = DbConnection.getInstance();
        Connection conn = dbConn.conn;
        System.out.println("pozvana metoda f2");
    }
    
    public static void main(String[] args) throws SQLException {
        Hero h = HeroFactory.hero(HeroFactory.OFF_TANK_AD);
        Hero h1 = HeroFactory.hero(HeroFactory.MAGE_DRAING); 
        h.hit();
        h1.hit();
        
//        Pule pule1 = new Pule();
//        
//        DbConnection.getInstance().pule = pule1;
//        
//        pule1 = null;
//        
//        Random r = new Random();
//        for (int i = 0; i < 1050; i++) {
//            if (r.nextBoolean()) {
//                f1();
//            }
//            if (r.nextBoolean()) {
//                f2();
//            }
//        }
    }
}