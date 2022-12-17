package javaapplication295;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.EventObject;
import java.util.Scanner;

public class JavaApplication295 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        
        Class gameClass = Class.forName("javaapplication295.GameClass");
        Object game_class_object = gameClass.newInstance();
        Method game_start_method = gameClass.getMethod("StartGame", null);
        game_start_method.invoke(game_class_object, null);
        Method game_hit = gameClass.getMethod("hit",int.class);
        game_hit.invoke(game_class_object, 10);
        game_hit.invoke(game_class_object, 20);
        game_hit.invoke(game_class_object, 30);
//        
//        
//        Reservoir res = new Reservoir();
//        res.addEventListener(new ReservoirListener() {
//            @Override
//            public void reserveReached(EventObject evt) {
//                     System.out.println("No more fuel in car. Please refill!");
//            }
//        });
//        for(int i=0;i<100;i++){
//            res.consumeFuel();
//            Thread.sleep(100);
//        }
//        
//        
//        AuctionManager manager = new AuctionManager();
//        manager.ticker();
//        
//        
//        Connection conn;
////        CallableStatement cs = conn.prepareCall("{call changeBalance(?,?,?)}");
////        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
////        Statement st = conn.createStatement();
////        ResultSet res = st.executeQuery("select * from accounts");
//        while (true) {            
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/travel", "root", "");
//            Statement st = conn.createStatement();
//            st.executeUpdate("Update auctions set active = CASE " 
//                    + "WHEN starttime<now() and endtime>now() THEN 1 "
//                    + "WHEN endtime<now() and active = 1 THEN 0 "
//                    + "else 0 END");
//            Thread.sleep(1000);
//            conn.close();
//        }
//        for (int i = 0; i < 1000; i++) {
//            st.addBatch("update accounts set balance = 200 where id = " + i);
//        }
//        st.executeBatch();
        
//        
//        
        //Position somewhere
//        res.absolute(3);
        //Move to insert row position
//        res.moveToInsertRow();
//        res.updateString(2, "Brand new user");
//        res.updateBigDecimal(3, new BigDecimal(500)); 
//        res.insertRow();
//        res.last();
//        System.out.println("Row inserted with id " + res.getInt(1));
//        //Go back to current row
//        res.moveToCurrentRow();
//        System.out.println(res.getString(2));
//        
//        //Delete row
//        res.absolute(4);
//        System.out.println("Row with id " + res.getInt(1) + " is about to be deleted");
//        res.deleteRow(); 
//        
//        res.absolute(3);
//        System.out.println("Users " + res.getInt(1) + " name is about to be changed");
//        res.updateString(2, "Some other user");
//        res.updateRow(); 
//        res.absolute(2); 
//        System.out.println("Transfer funds to user " + res.getInt(1));
//        res.updateBigDecimal(3, res.getBigDecimal(3).add(new BigDecimal(50)));
//        res.updateRow(); 
//        res.absolute(1);
//        System.out.println("Transfer funds from user " + res.getInt(1));
//        res.updateBigDecimal(3, res.getBigDecimal(3).subtract(new BigDecimal(50)));
//        res.updateRow();  
//        conn.close(); 
//        
//        
//        cs.setInt(1, 2);
//        cs.setInt(2, 1);
//        cs.setBigDecimal(3, new BigDecimal(15));
//        cs.execute();
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.println("Enter first user id: ");
//            int userid1 = sc.nextInt();
//            System.out.println("Enter second user id: ");
//            int userid2 = sc.nextInt();
//            System.out.print("Enter amount: ");
//            BigDecimal amount = sc.nextBigDecimal();
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel", "root", "");
//            conn.setAutoCommit(false);
//            String sql = "update accounts set balance = balance + ? where id = ?";
//            //First statement preparation
//            PreparedStatement st = conn.prepareStatement(sql);
//            st.setBigDecimal(1, amount.negate());
//            st.setInt(2, userid1);
//            st.execute();
//            //Second statement preparation
//            st.setBigDecimal(1, amount);
//            st.setInt(2, userid2);
//            st.execute();
//            //Try adding this code, and then try to modify rows
//            /*
//            Thread.sleep(20000);
//            */
////            Thread.sleep(20000);
//            
//            conn.commit();
            
//        }
    }
    
}
