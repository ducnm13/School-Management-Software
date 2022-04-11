/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import polypro.helper.DateHelper;
import polypro.helper.JdbcHelper;

/**
 *
 * @author PC
 */
public class TestJdbcHelper1 {
    public static void main(String[] args) {
        String sql = "INSERT INTO dbo.NguoiHoc\n" +
"VALUES  ( N'NH01' , -- MaNH - nchar(7)\n" +
"          N'Phúc' , -- HoTen - nvarchar(50)\n" +
"          1 , -- GioiTinh - bit\n" +
"          N'11/29/1999' , -- NgaySinh - date\n" +
"          N'0938697503' , -- DienThoai - nvarchar(24)\n" +
"          N'phuc@fpt.edu.vn' , -- Email - nvarchar(50)\n" +
"          N'' , -- GhiChu - nvarchar(255)\n" +
"          N'PS01' , -- MaNV - nvarchar(20)\n" +
"          GETDATE()  -- NgayDK - date\n" +
"        )";
        String sql1 = "INSERT INTO NguoiHoc VALUES (N'NH02',N'Đỏ',1,N'01/10/1999',N'0938697500','do@fpt.edu.vn',N'không ghi chú',N'PS02',GETDATE())";
        String sql2 = "INSERT INTO NguoiHoc VALUES (N'NH03',N'N.Tuấn',1,N'02/28/2000',N'0938444500','tuann@fpt.edu.vn',N'không ghi chú',N'PS03',GETDATE())";
        String sql3 = "INSERT INTO NguoiHoc VALUES (N'NH04',N'Q.Tuấn'  ,1,N'04/30/1995',N'090923042','tuanq@fpt.edu.vn' ,N'không ghi chú',N'PS01',GETDATE())";
        String sql4 = "INSERT INTO NguoiHoc VALUES (N'NH05',N'Đức'  ,1,N'09/02/2000',N'0977665541','duc@fpt.edu.vn' ,N'không ghi chú',N'PS04',GETDATE())";
        JdbcHelper.excuteUpdate(sql, args);
        JdbcHelper.excuteUpdate(sql1, args);
        JdbcHelper.excuteUpdate(sql2, args);
        JdbcHelper.excuteUpdate(sql3, args);
        JdbcHelper.excuteUpdate(sql4, args);
    }
}
