package ak;

import java.util.ArrayList;

public class AK {

    public static void main(String[] args) {
        ArrayList<Robot> roboti = new ArrayList<>();

        roboti.add(new AutoRobot(100, "Auto 1", "test332", 45));
        roboti.add(new LeteciRobot(2, "letjelica 1", "test211", 600));
        roboti.add(new TajniRobot(300, "Super Tajni Robot", "9"));
        roboti.add(new LeteciRobot(3.5, "Lazni robot 1", "test211", 1200));

        for (Robot r : roboti) {
            System.out.println("Tvoje ime? " + r.getIme());
            System.out.println("Tezina je " + r.getTezinaKG());
        }

    }

}
