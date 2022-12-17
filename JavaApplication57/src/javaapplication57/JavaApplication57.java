package javaapplication57;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JavaApplication57 {
    static void insert()throws SQLException{
        String ime          = "Dar Mar Mundo";
        String specijalnsot = "Mesar";
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        st.execute("insert into ljekari set ime = '"+ime+"', specijalnost = '"+specijalnsot+"'");
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/vp6_proba","root","");
    }
    public static void install()throws SQLException {
        Connection conn = getConnection();
        Statement izjava = conn.createStatement();
        izjava.execute("create database if not exists vp3_urgentni");
        izjava.execute("use vp3_urgentni" );
        izjava.execute("create table ljekari ( id int primary key auto_increment, ime varchar(50), specijalnost varchar(50) )engine = innodb");
        izjava.execute("create table pacijenti ( id int primary key auto_increment, ime varchar(50), dijagnoza varchar(512), ljekar int, foreign key (ljekar) references ljekari (id) ) engine = innodb");
    }
    public static void main(String[] args) throws SQLException {
       Connection conn = getConnection();
        
        Scanner s= new Scanner(System.in);
        while(true){
        System.out.println("Unesi id proizvoda: ");
        String id = s.nextLine();
        ResultSet rs = conn.createStatement().executeQuery("select * from proizvodi where id = "+id);
        while(rs.next()){
            System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("cijena")+" "+rs.getString("nabavnacijena"));
        }}
//        try {
//            izjava.execute("insert into hiscores (name,score) values ('player 1',25)");
//            System.out.println("Score successfully inserted");
//        }catch(SQLException ex){System.out.println("Insert failed");}
    }
}
