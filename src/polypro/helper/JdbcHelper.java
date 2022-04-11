/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class JdbcHelper {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String durl = "jdbc:sqlserver://localhost:1433;database=Polypro_PS10710";
    private static String user = "sa";
    private static String pass = "songlong";

    /*Connect driver*/
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    Tạo thử tục PreparedStatement
    @param sql là câu lệnh sql có thể chứa tham sô, hoặc các thủ tục
    @param args là các giá trị được cung cấp cho các tham số trong câu lệnh sql
     */
    public static PreparedStatement preparedstatement(String sql, Object... args) throws SQLException {
        Connection connect = DriverManager.getConnection(durl, user, pass);
        PreparedStatement ps = null;
        if (sql.trim().startsWith("(")) {
            ps = connect.prepareCall(sql);
        } else {
            ps = connect.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }

    /*
    Thực hiện các câu lệnh thao tác sql (Insert, Update, Delete...)
     */
    public static void excuteUpdate(String sql, Object... args) {
        try {
            PreparedStatement ps = preparedstatement(sql, args);
            try {
                ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Thực hiện câu lệnh truy vấn(Select) hoặc thủ tục truy vấn dữ liêu
     */
    public static ResultSet excuteQuery(String sql, Object... args) {
        try {
            PreparedStatement ps = preparedstatement(sql, args);
            return ps.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
