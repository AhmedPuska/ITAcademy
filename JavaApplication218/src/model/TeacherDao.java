package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static javaapplication218.DatabaseBroker.getConnection;

public class TeacherDao extends AbstractDAO<Teacher> {

    @Override
    public void insert(Teacher e) throws SQLException {
        Connection cn = getConnection();
        PreparedStatement st = cn.prepareStatement("insert into teacher values ( null, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        st.setString(1, e.name);
        st.setDouble(2, e.salary);
        st.execute();
        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        e.id = rs.getInt(1);
    }

    @Override
    public void update(Teacher e) throws SQLException {
        Connection cn = getConnection();
        PreparedStatement st = cn.prepareStatement("update teacher set name = ?, salary = ? where id = ?");
        st.setString(1, e.name);
        st.setDouble(2, e.salary);
        st.setInt(3, e.id);
        st.execute();
    }

    @Override
    public Teacher get(int id) throws SQLException {
        Connection cn = getConnection();
        PreparedStatement st = cn.prepareStatement("select * from teacher where id = ?");
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            Teacher t = new Teacher();
            t.id = rs.getInt("id");
            t.name = rs.getString("name");
            t.salary = rs.getDouble("salary");
            return t;
        } else {
            return null;
        }
    }

    @Override
    public List<Teacher> getList() throws SQLException {
        List<Teacher> result = new ArrayList<>();
        Connection cn = getConnection();
        PreparedStatement st = cn.prepareStatement("select * from teacher");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Teacher t = new Teacher();
            t.id = rs.getInt("id");
            t.name = rs.getString("name");
            t.salary = rs.getDouble("salary");
            result.add(t);
        }
        return result;
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection cn = getConnection();
        PreparedStatement st = cn.prepareStatement("delete from teacher where id = ?");
        st.setInt(1, id);
        st.execute();
    }
    
}