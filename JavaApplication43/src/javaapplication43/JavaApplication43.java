package javaapplication43;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JavaApplication43 {
    public static String[]add(String[] players, String member){
        String[] newArr = new String[players.length+1];
        for(int i = 0; i<players.length;i++){
            newArr[i]= players[i];
        }
        
        newArr[players.length]=member;
        return newArr;
    }
    public static void main(String[] args) {
        
        Date vrijeme = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("y.M.d h:m:s");
        System.out.println(vrijeme);
        String datumString = sdf.format(vrijeme);
        System.out.println(datumString);
        
//       for (int i = 12; i >= 1; i--) 
//        {
//            for (int j = 12; j > i; j--) 
//                System.out.print(" ");
//            
//            for (int k = 1; k < (i*2); k++) 
//                System.out.print("\n");
//            
//        }
//        int rc=5,starcount=5;
//        for (int i = 0; i < rc; i++) {
//            System.out.println();
//            for (int j = 0; j < starcount; j++) {
//                System.out.print("*");
//            }
//            starcount--;
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        int num=5,spacecounter =4, starcounter=1;
//        for (int i = 1; i <= num; i++) {
//            System.out.println();
//            for (int j=1; j<=spacecounter; j++) {
//                System.out.print(" ");}
//                for (int k = 1; k <= starcounter; k++) {
//                    System.out.print("*");}
//                    spacecounter--;
//                    starcounter+=2;
//                }
            
        

        
        
//        Arraylist arrayy =new ArrayList();
//        int [] arrayy ={2,-5,5,12,54,-2,-5,150  };
//        int [] pozitivni ={};
//        int [] neg={};
//        for(int i=0;i<arrayy.length;i++){
//            if(arrayy[i]<0){
//               neg = ArrayUtils.add(neg, 3);
//                neg.toArray(arrayy[i]);
//            
//            }
//        }
        
//       Podatak igrac1 =new Podatak("Ahmed");
//       Podatak igrac2 =new Podatak("Dalia");    
//       igrac1.next = igrac2;
//       Podatak igrac3 =new Podatak("Marko");
//       igrac2.next = igrac3;
//        System.out.println(igrac1.next.next.value);
    }
    
}
