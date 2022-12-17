package zadatak;
import java.util.Arrays;
public class Zadatak {
    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int br_pozitivni=0;
        int br_negativni=0;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    System.out.println("Dupli elementi su : " + array[i]);
                }
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < array.length - 1; i++) 
        {
            int ponoviti = 1;
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] == array[j]) 
                {
                    ponoviti++;
                }
            }
            if(ponoviti > 1)
                System.out.println("Broj " + array[i] + " se ponavlja " + ponoviti + " puta");
        }
        
       System.out.println("");
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < 0) 
            {
                br_negativni++;
            }
            else if(array[i] > 0)
                br_pozitivni++;
        }
        
        int[] negativni=new int [br_negativni];
        int[] pozitivni=new int [br_pozitivni];
        
        for (int i = 0, n = 0, p = 0; i < array.length; i++) 
        {
            if (array[i] < 0) 
            {
                negativni[n++] = array[i];
            }
            else if(array[i] > 0)
                pozitivni[p++] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(pozitivni));
        System.out.println(Arrays.toString(negativni));
    }
}
