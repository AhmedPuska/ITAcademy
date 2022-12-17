
package javaapplication228;

import java.sql.SQLException;
import java.util.List;

public class Controller {
    public Menu menu;
    public Db db;
    
    public void updateZaposleni() throws SQLException {
        int id = menu.getZaposleniId();
        Zaposleni zaposleni = db.getZaposleni(id);
        if (zaposleni == null) {
            System.out.println("Zaposleni doesn't exist in databse");
            return;
        } else {
            menu.updateZaposleni(zaposleni);
            db.updateZaposleni(zaposleni);
        }
    }
    
    public void deleteZaposleni() throws SQLException {
        int id = menu.getZaposleniId();
        db.deleteZaposleni(id);
    }
    
    public void addZaposleni() throws SQLException {
        Zaposleni toAdd = menu.getZaposleni();
        db.insertZaposleni(toAdd);
    }
    
    public void showZaposleni() throws SQLException {
        List allZaposleni = db.getAllZaposleni();
        System.out.println("");
        for (Object allZaposleni1 : allZaposleni) {
            Zaposleni zaposleni = (Zaposleni)allZaposleni1;
            System.out.println(zaposleni);
        }
    }
    
}