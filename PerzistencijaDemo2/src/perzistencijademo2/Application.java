package perzistencijademo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import perzistencijademo2.ui.Ui;

public class Application {
    private Scanner sc;
    private static Controller ctrl;
    
    public static void launch() throws SQLException {
        System.out.println("Zaposleni editor v.0.0.1 is running");
        ctrl = new Controller();
        ctrl.db = new Db();
        ctrl.ui = new Ui();
        
        while (true) {
            switch (ctrl.ui.menu1()) {
                case Ui.ShowZaposleni: 
                    ctrl.showZaposleni(); 
                    break;
                case Ui.AddZaposleni:
                    ctrl.addZaposleni();
                    break;
                case Ui.UpdateZaposleni:
                    ctrl.updateZaposleni();
                    break;
                case Ui.DeleteZaposleni:
                    ctrl.deleteZaposleniKriterij();
//                    System.out.println("1=na osnovu id \n 2=na osnovu imena");
//                    Scanner sc1 = new Scanner(System.in);
//                    int k = sc1.nextInt();
//                    if (k==1) {
//                        ctrl.deleteZaposleni();
//                    } else if(k==2) {
//                    ctrl.deleteZaposleniIme();
//                    }
                    break;
                case Ui.ExitProgram:
                    System.exit(0);
                    break;
                    
            }
        }
        
    }
    
//    public Application() {
//        this.sc = new Scanner(System.in);
//        this.po2 = new Controller();
//    }
    
//    private int menu() {
//        System.out.println("----Product Menu----");
//        System.out.println("1. Add all product");
//        System.out.println("2. Show all product");
//        System.out.println("3. Remove product");
//        System.out.println("4. Show all product");
//        System.out.println("0. Exit");
//        int choice = readInt(1, 4);
//        return choice;
//    }
//    
//    public void start() {
//        while (true) {
//            int choice = menu();
//            switch (choice) {
//                case 0:
//                    System.exit(0);
//                    break;
//                case 1:
//                    addProduct();
//                    break;
//                case 2:
//                    showAll();
//                    break;
//                case 3:
//                    removeProduct();
//                    break;
//                case 4:
//                    ListZaposleni();
//                    break;
//            }
//            
//        }
//    }
    
//    private int readInt(int min, int max) {
//        int choice;
//        while (true) {
//            try {
//                choice = Integer.parseInt(sc.nextLine());
//                if (choice >= min && choice <= max) {
//                    break;
//                }
//            } catch (Exception ex) {
//                ex.getMessage();
//            }
//        }
//        return choice;
//    }
//
//    private float readFloat(int min, float max) {
//        float price;
//        while (true) {
//            try {
//                price = Float.parseFloat(sc.nextLine());
//                if (price >= min && price <= max) {
//                    break;
//                }
//            } catch (Exception ex) {
//                System.out.println("Invalid value. Try to enter a float value");
//            }
//        }
//        return price;
//    }
//    
//    private void addProduct() {
//        System.out.println("Enter product ID: ");
//        int id = readInt(0, Integer.MAX_VALUE);
//        System.out.println("Enter product name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter product price");
//        float price = readFloat(0, Float.MAX_VALUE);
//        PerzistencijaDemo2 p = new PerzistencijaDemo2(1, "2", 1, "2", 1);
//        this.perzOpcije.unesiNovogUposlenika(p);
//    }
//    
//    private void showAll() {
//        System.out.println("--All product---");
//        System.out.println("ID\tname\tprice");
//        for (int i = 0; i < this.perzOpcije.count(); i++) {
//            PerzistencijaDemo2 p = this.perzOpcije.getZaposleni(i);
//            System.out.println(p.getId() + "\t" + p.getIme() + "\t" + p.getGodine());
//        }
//    }
//    
//    private void removeProduct() {
//        System.out.println("Enter ID of product");
//        int id = readInt(0, Integer.MAX_VALUE);
//        boolean result = this.perzOpcije.removeProduct(id);
//        if (result) {
//            System.out.println("Product was removed");
//        } else {
//            System.out.println("Product not found");
//        }
//    }
    
//    public ArrayList<PerzistencijaDemo2> ListZaposleni(/*String prikaz*/) {
//        ArrayList<PerzistencijaDemo2> zaposleniList = new ArrayList<>();
//        
//        Statement st;
//        ResultSet rs;
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/perzistencija", "root", "");
//            st = conn.createStatement();
//            rs = st.executeQuery("select * from zaposleni");
//            
//            PerzistencijaDemo2 pd2;
//            
//            while (rs.next()) {
//                pd2 = new PerzistencijaDemo2(
//                        rs.getInt("id"),
//                        rs.getString("ime"),
//                        rs.getInt("godine"),
//                        rs.getString("adresa"),
//                        rs.getInt("dohodak")
//                );
//                zaposleniList.add(pd2);
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        } 
//        
//        return zaposleniList;
//    }
}