package dao;

import java.sql.*;

public class UserDAO {

    public boolean checkLogin(String username, String password) {
        boolean status = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db", "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
