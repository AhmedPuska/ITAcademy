package objekntozadatak;
public class ObjekntoZadatak {
    public static void main(String[] args) {
        Chocolate cokolada = new Chocolate("Milka ",1987654320,5,0);
        Wine vino = new Wine("Zilavka ",1234567890,5,0);
        System.out.println(cokolada);
        System.out.println(cokolada.racunanjeCijene());
        System.out.println(vino);
        System.out.println(vino.racunanjeCijene());
    }
    
}
