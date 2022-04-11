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
public class TestJdbcHelper3 {
    public static void main(String[] args) {
        String sql = "DELETE FROM NguoiHoc WHERE MaNH = ?";
        String ma = "NH05";
        JdbcHelper.excuteUpdate(sql, ma);
    }
}
