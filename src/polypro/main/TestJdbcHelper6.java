/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import polypro.helper.JdbcHelper;

/**
 *
 * @author PC
 */
public class TestJdbcHelper6 {

    public static void main(String[] args) throws SQLException {
        String sql = "{EXEC dbo.sp_ThongKeNguoiHoc}";
        PreparedStatement ps = JdbcHelper.preparedstatement(sql, args);
    }
}
