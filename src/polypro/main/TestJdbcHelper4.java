/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import polypro.helper.JdbcHelper;

/**
 *
 * @author PC
 */
public class TestJdbcHelper4 {

    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH = ?";
        String ma = "NH01";
        ResultSet rs = JdbcHelper.excuteQuery(sql, ma);
        while (rs.next()) {
            System.out.println(rs.getObject(1) + ", "
                    + rs.getObject(2) + ", "
                    + rs.getObject(3) + ", "
                    + rs.getObject(4) + ", "
                    + rs.getObject(5) + ", "
                    + rs.getObject(6) + ", "
                    + rs.getObject(7) + ", "
                    + rs.getObject(8) + ", "
                    + rs.getObject(9) + "\n");
        }

    }
}
