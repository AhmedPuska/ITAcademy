package javaapplication89;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication89{
      static int hello(int a, int b){
          return a+b;
      }
        public static void main(String[] args) {
        int expected = 5, p1 = 2, p2 = 3;
        int res = hello(p1, p2);
            if (res==expected) {
                System.out.println("Test passed");
            }else
                System.out.println("Test failed");
    }
}