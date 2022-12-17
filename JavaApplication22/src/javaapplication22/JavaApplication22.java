package javaapplication22;
import java.util.Scanner;
public class JavaApplication22 {
    public static void main(String[] args)
    {
        
        int x=10;
        int y=20;
        boolean res;
        y++;
        res =(
        (x<9&&x!=25&&y>19&&x!=10) ||
        y!=20&&y==10||(x==1&&x==2&&x==3)
         ||true
                );
//        boolean res = (x==11 && ++y==20);
        System.out.println(res);
        System.out.println(y);
//          int target_tank_x = 4;
//        int projectile_x = 0; 
//        projectile_x++;
//        System.out.println("Collission: " + (projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collission: " + (projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collission: " + (projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collission: " + (projectile_x>target_tank_x));
//        projectile_x++;
//        System.out.println("Collission: " + (projectile_x>target_tank_x)); 
//        
//        Integer x = 5;
// 
//// metoda getClass() vraća klasu objekta nad kojim je pozvana
//System.out.println(x.getClass());
    }
}

//    Scanner reader = new Scanner (System.in); {
//    
//    char ch;
//    ch= 'X';
//    System.out.println(ch);
    
//    int decVal = 46;
//    int octVal = 056;       // 2 * 8^0 + 3 * 8^1 = 2 + 24 = 26
//    int hexVal = 0x2e;      // 10 * 16^0 + 1 * 16^1 = 10 + 16 = 26
//    int binVal = 0b101110;   // 2^1 + 2^3 + 2^4 = 2 + 8 + 16 = 26
//    System.out.println(decVal+"\t"+octVal+"\t"+hexVal+"\t"+binVal);
//    double PI =3.14;
//    System.out.println(PI);
        /*Java 7 donosi novinu kada je reč o upotrebi karaktera donja crta (_) u okviru brojčanih promenljivih.
    Donja crta se može koristiti za razdvajanje grupa cifara u okviru jedne brojčane promenljive,
    što može poboljšati preglednost i čitljivost koda. Donja crta neće biti tretirana od strane prevodioca,
    tako da će broj imati istu vrednost koju je imao i pre.*/
//        //
//        long creditCardNumber = 1234_5678_9012_3456L;
//        long socialSecurityNumber = 999_99_9999L;
//        float pi = 3.14_15F;
//        long hexBytes = 0xFF_EC_DE_5E;
//        long hexWords = 0xCAFE_BABE;
//        long maxLong = 0x7fff_ffff_ffff_ffffL;
//        byte nybbles = 0b0010_0101;
//        long bytes = 0b11010010_01101001_10010100_10010010;
//        System.out.println(creditCardNumber);
//        System.out.println(hexBytes+" "+hexWords+ " "+ maxLong+ " "+ bytes+ "\t "+nybbles);
//        //
        /*Donja crta se može postaviti samo između cifara. Na sledeće pozicije se ne može postaviti donja crta:
⦁	na početak ili kraj broja,
⦁	pored decimalne tačke,
⦁	pre F ili L sufiksa.*/
    

