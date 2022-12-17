/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Local;

/**
 *
 * @author user
 */
public interface Converter {

    public enum convertType {

        C2F, F2C
    };

    public double calculate(double value, convertType type);
}