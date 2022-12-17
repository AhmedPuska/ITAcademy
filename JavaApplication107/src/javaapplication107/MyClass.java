/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication107;
public class MyClass<T extends Number> {
    public T t;
    public void showResult()
    {
        if(t.getClass().equals(Integer.class))
        System.out.println(t.intValue()*t.intValue());
        if(t.getClass().equals(Double.class))
        System.out.println(t.doubleValue()*t.doubleValue());
    }
}