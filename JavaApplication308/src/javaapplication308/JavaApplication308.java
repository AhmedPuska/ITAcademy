package javaapplication308;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication308 {

    public static void start() {
        Dao<Profa> profa = new ProfaDao();
        while (true) {
            menu();
            Scanner sc = new Scanner(System.in);
            int br = sc.nextInt();
            switch (br) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Profa profaList : profa.getAll()) {
                        System.out.println(profaList.getId() + " " + profaList.name + " " + profaList.salary);
                    }
                    profa.getAll();

                    break;
                case 2:
                    Scanner insert = new Scanner(System.in);
                    System.out.println("Unesite ime : platu");
                    Profa addProfa = new Profa(insert.nextLine(), insert.nextDouble());
                    profa.save(addProfa);
                    break;
                case 3:

                    for (Profa profaList : profa.getAll()) {
                        System.out.println(profaList.getId() + " " + profaList.name + " " + profaList.salary);
                    }
                    profa.getAll();

                    Scanner update1 = new Scanner(System.in);
                    System.out.println("Unesite id korisnika");

                    Profa update = profa.getAll().get(update1.nextInt());
                    System.out.println("Novo ime profesora je");
                    update.setName(update1.nextLine());
                    update.setSalary(update1.nextDouble());

//                Scanner update = new Scanner(System.in);
//                Profa updateProfa = new Profa();
//                Scanner broj = new Scanner(System.in);
//
//                System.out.println("Ako zelis update sve podatke pritisni 1 \nAko zelis samo ime br 2\nAko zelis samo platu br 3");
//                int broj1 = broj.nextInt();
//                if (broj1 == 1) {
//                    System.out.println("Unesite ime i platu");
//                    updateProfa.setName(update.nextLine());
//                    updateProfa.setSalary(update.nextDouble());
//                }
//                if (broj1 == 2) {
//                    System.out.println("Unestie ime");
//                    updateProfa.setName(update.nextLine());
//                }
//                if (broj1 == 3) {
//                    System.out.println("Unesite platu");
//                    updateProfa.setSalary(update.nextDouble());
//                }
//                profa.update(updateProfa);
                    break;
                case 4:
                    Scanner delete = new Scanner(System.in);
                    System.out.println("Unesite id za brisanje");
                    Profa pro = profa.get(delete.nextInt());
                    profa.delete(pro);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("*********************************");
        System.out.println("0. for exit program");
        System.out.println("1. for print all profa");
        System.out.println("2. to add new profa");
        System.out.println("3. to update existing profa");
        System.out.println("4. to delete profa");
        System.out.println("*********************************");
    }

    public static void main(String[] args) throws SQLException {

        start();
//        
//
//        Connection dp = DataProvider.getConnection();
//        Statement st = dp.createStatement();
//        st.execute("select * from podaci");
//        ResultSet rs = st.executeQuery("select * from podaci");
//        if (rs.next()) {
//            System.out.println(rs.getString("usernname"));
//        }
    }
}
