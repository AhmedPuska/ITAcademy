/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;

import java.io.Serializable;

public class CarBean implements Serializable {
   
    private String make;
    private String model;
   
    public CarBean()
    {
       
    }
   
    public String getMake()
    {
        return make;
    }
   
    public void setMake(String value)
    {
        make = value;
    }
   
   
    public String getModel()
    {
        return model;
    }
   
    public void setModel(String value)
    {
        model = value;
    }
}