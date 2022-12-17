package perzistencijademo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Db {
    
    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/perzistencija", "root", "");
        return conn;
    }
    
    public void insertZaposleni(PerzistencijaDemo2 perz) throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
//        PreparedStatement st = conn.prepareStatement("insert into zaposleni (ime,godine,adresa,dohodak) values (?,?,?,?)");  
//        st.setString(1, ime);  
//        st.setString(2, godine);  
//        st.setString(3, adresa);  
//        st.setString(4, dohodak);  
//        st.execute();   
        String query = "insert into zaposleni values ( null, '" +
                perz.getIme() + "','" +
                perz.getGodine() + "','"+
                perz.getAdresa() + "','" +
                perz.getDohodak() + "')";
        st.execute(query);
        st.close();
        conn.close();
    }
    
    public void deleteZaposleni(int id) throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        String query = "delete from zaposleni where id = " + id;
        st.execute(query);
        st.close();
        conn.close();
    }
    
    public void deleteZaposleniIme(String ime) throws SQLException {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        String query = "delete from zaposleni where ime = '" + ime + "' ";
        st.execute(query);
        st.close();
        conn.close();
    }
    
    public void updateZaposleni(PerzistencijaDemo2 perz) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement st = conn.prepareStatement("update zaposleni set ime=?, godine=?, adresa=?, dohodak=? where id =?");
        st.setString(1, perz.getIme());
        st.setInt(2, perz.getGodine());
        st.setString(3, perz.getAdresa());
        st.setDouble(4, perz.getDohodak());
        st.setInt(5, perz.getId());
        st.execute();
//        String query = "update zaposleni set ime='" + perz.getIme() + "', godine='" + perz.getGodine() + "', adresa='" + perz.getAdresa() + "', dohodak='" + perz.getDohodak() + "' where id =" + perz.getId();
        st.close();
        conn.close();
    }
    
    public ArrayList<PerzistencijaDemo2> getAllZaposleni() throws SQLException {
         ArrayList<PerzistencijaDemo2> listaZaposlenih = new ArrayList<>();
         Connection conn = getConnection();
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery("select * from zaposleni");
         while (rs.next()) {
             PerzistencijaDemo2 perz = new PerzistencijaDemo2(
                     rs.getInt("id"),
                     rs.getString("ime"),
                     rs.getInt("godine"),
                     rs.getString("adresa"),
                     rs.getInt("dohodak")
                    );
                     listaZaposlenih.add(perz);
             
         }
         conn.close();
         return listaZaposlenih;
    }
    
    public PerzistencijaDemo2 getZaposleni(int id) throws SQLException {
        PerzistencijaDemo2 perz  = null;
        
        Connection conn = getConnection();
        PreparedStatement st = conn.prepareStatement("select * from zaposleni where id = ?");
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            perz = new PerzistencijaDemo2(
                    rs.getInt("id"),
                    rs.getString("ime"),
                    rs.getInt("godine"),
                    rs.getString("adresa"),
                    rs.getInt("dohodak")
            );
        }
        st.close();
        rs.close();
        conn.close();
        return perz;
    }
}
