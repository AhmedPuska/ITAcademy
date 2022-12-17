/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication209;

/**
 *
 * @author user
 */
public class HeroFactory {
    final static int MAGE_DRAING = 1;
    final static int OFF_TANK_AD = 2;
    public static Hero hero(int type) {
        switch(type) {
            case MAGE_DRAING:
                return new DeathProphet();
            case OFF_TANK_AD:
                return new Huskar();
            default:
                return null;
        }
    }
}
