package javaapplication218;

import model.Subject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseBroker {
    static Connection conn;
    
    public static Connection getConnection() throws SQLException {
        
        if (conn==null || conn.isClosed()) {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/g4_school", "root", "");
        }
        
        return conn;
    }
    
//    public static List<Subject> getSubjects() throws SQLException {
//        List<Subject> res = new ArrayList<Subject>();
//        Connection cn = getConnection();
//        PreparedStatement st = cn.prepareStatement("select * from subject");
//        ResultSet rs = st.executeQuery();
//        while (rs.next()) {
//            Subject s = new Subject();
//            s.id = rs.getInt("id");
//            s.title = rs.getString("title");
//            s.classCount = rs.getInt("classcount");
//            res.add(s);
//        }
//        return res;
//    }
//    
//    public static Subject getSubject(int id) throws SQLException {
//        Connection cn = getConnection();
//        PreparedStatement st = cn.prepareStatement("select * from subject where id = ?");
//        st.setInt(1, id);
//        ResultSet rs = st.executeQuery();
//        if (rs.next()) {
//            Subject s = new Subject();
//            s.id = rs.getInt("id");
//            s.title = rs.getString("title");
//            s.classCount = rs.getInt("classcount");
//            return s;
//        } else {
//            return null;
//        }
//    }
//    
//    public static void updateSubject(Subject s) throws SQLException {
//        Connection cn = getConnection();
//        PreparedStatement st = cn.prepareStatement("update subject set title = ?, classcount = ? where id = ?");
//        st.setString(1, s.title);
//        st.setInt(2, s.classCount);
//        st.setInt(3, s.id);
//        st.execute();
//    }
//    
//    public static void saveSubject(Subject s) throws SQLException {
//        Connection cn = getConnection();
//        PreparedStatement st = cn.prepareStatement("insert into subject values ( null, ?, ?)", Statement.RETURN_GENERATED_KEYS);
//        st.setString(1, s.title);
//        st.setInt(2, s.classCount);
//        st.execute();
//        ResultSet rs = st.getGeneratedKeys();
//        rs.next();
//        s.id = rs.getInt(1);
//    }
//    public DatabaseBroker() {
//        
//    }
}