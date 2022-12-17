package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public String mojString() {
        List<String> categories = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String kategorija : getList()) {
            sb.append("<dd><a href='http://www.free-css.com/'>" + kategorija + "</a></dd>");
        }
        return sb.toString();
    }

    public List<String> getList() {
        List<String> kategorije = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "");
            ResultSet rs = conn.createStatement().executeQuery("select * from category");
            while (rs.next()) {
                kategorije.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kategorije;
    }
}
