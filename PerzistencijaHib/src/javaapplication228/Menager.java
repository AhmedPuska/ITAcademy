
package javaapplication228;

import java.sql.SQLException;

public class Menager {
    
    public static void start() throws SQLException {
        Controller ctrl = new Controller();
        ctrl.db = new Db();
        ctrl.menu = new Menu();
        
        while (true) {
            switch (ctrl.menu.menu()) {
                case Menu.ExitProgram:
                    System.exit(0);
                    break;
                case Menu.ShowZaposleni: 
                    ctrl.showZaposleni(); 
                    break;
                case Menu.AddZaposleni:
                    ctrl.addZaposleni();
                    break;
                case Menu.UpdateZaposleni:
                    ctrl.updateZaposleni();
                    break;
                case Menu.DeleteZaposleni:
                    ctrl.deleteZaposleni();
                    break;
            }
        }
    }
}