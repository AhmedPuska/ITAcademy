package javaapplication28;
public class JavaApplication28 {
    public static void main(String[] args) {
        
        int proj_x          = 8;
        int proj_y          = 7;
        int target_x        = 5;
        int target_w        = 3;
        int target_y        = 4;
        int target_h        = 2;
        boolean tankEmpty   = true;
        boolean dead        = false;
        int lives           = 3;
        
        boolean pogodak = proj_x >= target_x && proj_x <=(target_x + target_w)&&
                          proj_y>=target_y&&proj_y<=(target_y+target_h);
        
        dead=pogodak || tankEmpty || lives-- ==0;
        
        System.out.println("Korisnik je umro: "+dead+"\n"+lives);
    }
    
}
