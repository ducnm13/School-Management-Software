/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.util.List;
import java.util.Scanner;
import polypro.dao.ThongKeDAO;

/**
 *
 * @author PC
 */
public class TestDB5 {

    public static void main(String[] args) {
        //Gọi thủ tục sp_ThongKeNguoiHoc xuất ra màn hình
        //Gọi class ThongKeDAO
        //Gọi method getNguoiHoc()
        //Tạo list add vào
        ThongKeDAO tk = new ThongKeDAO();
        List<Object[]> nguoihoc = tk.getNguoiHoc();
        for (Object[] oj : nguoihoc) {
            System.out.println(oj[0] + ", " + oj[1] + ", " + oj[2] + ", " + oj[3]);
        }
    }
}
