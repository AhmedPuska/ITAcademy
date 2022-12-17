package javaapplication111;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class JavaApplication111 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        
         class MyClass {
            public int x;
            public int y;
        }
        MyClass mc = new MyClass();
        Class cl = MyClass.class;
        Class cl1 = mc.getClass();   
        Class cl2 = Class.forName("javaapplication111.JavaApplication111$1MyClass");
        System.out.println(cl==cl1&&cl1==cl2);
        
        System.out.println(" ");
        
        //Get fields
        for(Field f : cl.getFields()){
            System.out.println("Field name: " + f.getName());
        }  
        System.out.println(" ");
        //Get methods
        for(Method m : cl.getMethods()){
            System.out.println("Method name: " + m.getName());
        }
        
        
       
//        Class c = Class.forName("javaapplication111.MyClass");
//        
//        MyClass class1 = new MyClass();
//        
//        Method[] methods = c.getDeclaredMethods();
//        
//        for(Method method : methods){
//            System.out.println(method.getName() + ": ");
//            if (method.getParameterCount() == 0) {
//                method.invoke(class1);
//            } else if(method.getParameterCount() == 1){
//                if (method.getParameters()[0].getType().equals(String.class)) {
//                    method.invoke(class1, "User");
//                }
//            }
//        }
        
        
        
//        Class c = Class.forName("javaapplication111.MyClass");
        
//        MyClass mc = new MyClass();
//
//        Method method1 = c.getMethod("method1");
//        method1.invoke(mc);
        



//        Class c = Class.forName("javaapplication111.MyClass");
        
//        MyClass myClass = new MyClass();
//       
//        String stringValue = "This is string value.";
//        int intValue = 10;
//        
//        Class myCls = myClass.getClass();
//        Field[] myClsFields = myCls.getFields();
//
//        for (Field field : myClsFields) {
//        if(field.getType().equals(String.class))
//        {
//        field.set(myClass, stringValue);
//        }
//        else if(field.getType().equals(int.class))
//        {
//        field.set(myClass, intValue);
//        }
//        }
//        
//        System.out.println("field1: " + myClass.field1);
//        System.out.println("field2: " + myClass.field2);
        
        
                
//        MyClass myClass = new MyClass();
//        
//        Class myCls = myClass.getClass();
//        Field field1 = myCls.getField("field1");
//        field1.set(myClass, "This is field1 value.");
//        
//        System.out.println(myClass.field1);
        
//     Class myClass = Class.forName("javaapplication111.MyClass");
//     for(Field field : myClass.getFields()){
//         System.out.println(field.getName());
//     }
    }
}