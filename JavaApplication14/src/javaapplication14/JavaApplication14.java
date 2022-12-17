package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int g;
        String p;
        Scanner input =new Scanner(System.in);
        System.out.println("Da li ste musko ili zensko: ");
        p = input.next();
        System.out.println("Unesite vase godine");
        g = input.nextInt();
        if( g >= 70)
        {
            System.out.print("Ulaz je zabranjen ako ste stariji od 70");
        }
        else if(p.equals("musko"))
        {
            if (g<=18){
            System.out.println("Ulaz je zabranjen ako ste mladji od 18");
            }else {
                System.out.println("Ulaz je dozvoljen");
            }
        }
        
        else if(g<=16)
        {
            System.out.println("Ulaz je zabranjen ako ste mladji od 16g!!!");
        }
        else 
        {
            System.out.println("Ulaz je dozvoljen1");
        }
    }
    
}
