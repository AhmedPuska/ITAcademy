package javaapplication118;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaApplication118 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class mojaKlasa = Class.forName("javaapplication118.Ahmed");
        
        IMetodF objekat = (IMetodF)mojaKlasa.newInstance();
        objekat.f();
    }
}