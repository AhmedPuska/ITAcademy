package javaapplication293;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication293 {

    public static String url(String url) throws MalformedURLException, IOException {
        URL page = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(page.openStream()));
        String inputLine;
        StringBuffer bfr = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            bfr.append(inputLine);
        }
        in.close();
        return bfr.toString();
    }

    static String parseHlink(String page, int pos) {
        StringBuilder output = new StringBuilder();
        pos += 6;
        char ch = page.charAt(pos);
        while ((ch = page.charAt(pos++)) != '"') {
            output.append(ch);
        }
        return output.toString();
    }

    static List parse(String page) {
        List res = new ArrayList();
        int lastPos = page.length();
        while (lastPos != -1) {
            lastPos = page.lastIndexOf("href", lastPos - 1);
            String adr = parseHlink(page, lastPos);
            System.out.println(adr);
        }
        return res;
    }

    public static void main(String[] args) throws SQLException, IOException {
        
        
//        url("https://www.google.com");
        parse(url("https://www.facebook.com"));
//        MysqlDataSource ds = new MysqlDataSource();
//        ds.setURL("jdbc:mysql://localhost");
//        ds.setDatabaseName("podaci");
//        ds.setUser("root");
//        ds.setPassword("");
//        
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/podaci","root",""); //ds.getConnection(); //
//        
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("select * from registration");
//        
//        DatabaseMetaData db_metadata = conn.getMetaData();
//        ResultSet databases = db_metadata.getCatalogs();
//        while (databases.next()) {            
//            System.out.println("Database: " + databases.getString(1));
//        }
//        System.out.println("TABLE METADATA");
//        ResultSetMetaData rs_metadata = rs.getMetaData();
//        System.out.println("Database: " + rs_metadata.getCatalogName(1));
//        System.out.println("Table: " + rs_metadata.getTableName(0));
//        
//        
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("select * from registration");
//        String[] columns = new String[rs.getMetaData().getColumnCount()];
//        for (int i = 0; i < columns.length; i++) {
//            System.out.print((columns[i] = rs.getMetaData().getColumnName(i + 1)) + "\t");
//        }
//        System.out.println("");
//        while (rs.next()) {            
//            for (int i = 0; i < columns.length; i++) {
//                System.out.print(rs.getString(columns[i])+"\t");
//            }
//            System.out.println("");
//        }
//
//        System.out.println(!conn.isClosed() ? "Successfully connected to database" : "Failed to connect");
//
//        conn.close();
//
//
//
//        while(true){
//            MenuOption selected_option = MainMenu.RenderMenu();
//            DataAccess da = new DataAccess();
//            da.connect();
//            switch(selected_option){
//                case New:
//                    Scanner scanner = new Scanner(System.in);
//                    while(true){
//                        try {
//                            System.out.print("Enter pruduct name: ");
//                            String product_name = scanner.nextLine();
//                            System.out.print("Enter pruduct price: ");
//                            double product_price = scanner.nextDouble();
//                            da.insertBill(product_name, product_price);
//                            break;
//                        } catch(Exception ex){
//                            System.out.println("invalid entry, try again");
//                            scanner.next();
//                        }
//                    }
//                break;
//                case List:
//                    da.listAllBills();
//                break;
//                case Delete:
//                    Scanner scanner1 = new Scanner(System.in);
//                    while(true){
//                        try {
//                            System.out.print("Enter pruduct id: ");
//                            int product_id = scanner1.nextInt();
//                            da.deleteBill(product_id);
//                            break;
//                        } catch(Exception ex){
//                            System.out.println("invalid entry, try again");
//                            scanner1.next();
//                        }
//                    }
//                break;
//                case Exit:
//                    System.exit(0);
//                break;
//            }
//            da.disconnect(); 
//        } 
//        
//
//        String prvi = "Zdravo ";
//        String drugi = "Ahmede";
//        
//        StringBuilder sb = new StringBuilder();
//        sb.append("Ahmed");
//        sb.append(" Puska");
//        sb.append(" je Legenda!!!");
//        
//        
//        StringBuffer sbuffer = new StringBuffer();
//        sbuffer.append("Zdravo");
//        sbuffer.append(" Puska");
//        sbuffer.append(" Ahmed");
//        sbuffer.append(" Je LEGENDA!!!");
//        String message = "Hello from my string";
//        message = message.replace("my", "your");
//        System.out.println(message);
//        String[] string_arr = message.split(" ");
//        for (String str : string_arr) {
//            System.out.println(str);
//        }
//        System.out.println(message.length());
//        char[] all_characters = message.toCharArray();
//        for (char c : all_characters) {
//            System.out.println(c);
//        }
//        String myint = String.valueOf(100);
//        String myfloat = String.valueOf(10.5f);
//        String mychar = String.valueOf(new char[]{'a','h','m','e','d'});
//        System.out.println(myint);
//        System.out.println(myfloat);
//        System.out.println(mychar);
//        System.out.println(sbuffer);
    }

}
