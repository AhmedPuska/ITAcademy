package javaapplication286;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baza {

    public void hiscoreList() {
        Scanner sc = new Scanner(System.in);
        List hisscoreList = new ArrayList();
        while (true) {
            hisscoreList.add(sc.nextLine());
            for (Object ok : hisscoreList) {
                System.out.println(ok);
            }
        }
    }
//    public void getConnection() {
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/baza", "root", "");
//            Statement st = conn.createStatement();
//            st.executeQuery("select * from prodaja");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }

}
