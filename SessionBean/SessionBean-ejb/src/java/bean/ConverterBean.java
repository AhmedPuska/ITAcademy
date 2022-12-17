/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class ConverterBean implements Converter {

    @Override
    public double calculate(double value, convertType type) {

        if (type == convertType.C2F) {
            return value * 2 + 30;
        }

        return (value - 32) / 1.8;

    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
