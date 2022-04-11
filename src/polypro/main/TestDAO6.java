/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.util.List;
import polypro.dao.ThongKeDAO;

/**
 *
 * @author PC
 */
public class TestDAO6 {
    public static void main(String[] args) {
        ThongKeDAO tk = new ThongKeDAO();
        List<Object[]> nguoihoc = tk.getNguoiHoc();
        for (Object[] oj : nguoihoc) {
            System.out.println(oj[0] + ", " + oj[1] + ", " + oj[2] + ", " + oj[3]);
        }
    }
}
