
package perzistencijademo2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import perzistencijademo2.ui.Ui;

public class Controller {
    
    public Db db;
    public Ui ui;
    
    public void deleteZaposleni() throws SQLException {
        int id = ui.getZaposleniId();
        db.deleteZaposleni(id);
    }
    
    public void deleteZaposleniKriterij() throws SQLException {
        System.out.println("Brisanje zaposlenog na osovnu:\n 1. Imena\n 2. Id ");
        Scanner sc = new Scanner(System.in);
        int ok = sc.nextInt();
        switch(ok) {
            case 1:
                deleteZaposleniIme();
                break;
            case 2:
                deleteZaposleni();
                break;
        }
    }
    
    public void deleteZaposleniIme() throws SQLException {
        String ime = ui.getZaposleniIme();
        db.deleteZaposleniIme(ime);
    }
    
    public void updateZaposleni() throws SQLException {
        int id = ui.getZaposleniId();
        PerzistencijaDemo2 pd2 = db.getZaposleni(id);
        if (pd2 == null) {
            System.out.println("Zaposleni does not exist in databse");
            return;
        } else {
            ui.updateZaposleni(pd2);
            db.updateZaposleni(pd2);
        }
    }
    
    public void addZaposleni() throws SQLException {
        PerzistencijaDemo2 toAdd = ui.getZaposleni();
        db.insertZaposleni(toAdd);
    }
    
    public void showZaposleni() throws SQLException {
        ArrayList allZaposleni = db.getAllZaposleni();
        System.out.println("Id\tIme\t\tGodine\t\tAdresa\tDohodak");
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }System.out.println("");
        
        for (Object allZaposleni1 : allZaposleni) {
            PerzistencijaDemo2 pd2 = (PerzistencijaDemo2)allZaposleni1;
            System.out.println(pd2);
        }
    }
    
    
    
//    private List<PerzistencijaDemo2> listaZaposlenih;
//    
//    public Controller() {
//        this.listaZaposlenih = new ArrayList();
//    }
//    
//    public int unesiNovogUposlenika(PerzistencijaDemo2 ped) {
//        this.listaZaposlenih.add(ped);
//        return this.listaZaposlenih.size();
//    }
//    
//    public int count() {
//        return this.listaZaposlenih.size();
//    }
//    
//    public PerzistencijaDemo2 getZaposleni(int index) {
//        if (index < 0 || index >= count()) {
//            return null;
//        }
//        return this.listaZaposlenih.get(index);
//    }
//    
//    public boolean removeProduct(int id) {
//        int index = -1;
//        for (int i = 0; i < count(); i++) {
//            if (this.listaZaposlenih.get(i).getId() == id) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            this.listaZaposlenih.remove(index);
//            return true;
//        }
//        return false;
//    }
}