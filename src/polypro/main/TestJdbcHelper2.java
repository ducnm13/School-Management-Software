/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;
import polypro.helper.JdbcHelper;
/**
 *
 * @author PC
 */
public class TestJdbcHelper2 {
    public static void main(String[] args) {
        String sql = "UPDATE NguoiHoc SET Email = 'phucpb29@fpt.edu.vn' WHERE MaNH = ?";
        JdbcHelper.excuteUpdate(sql, "NH01");
    }
}
