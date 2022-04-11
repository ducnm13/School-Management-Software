/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import polypro.dao.NguoiHocDAO;
import polypro.helper.DateHelper;
import polypro.model.NguoiHoc;

/**
 *
 * @author PC
 */
public class TestDAO2 {
    public static void main(String[] args) {
        NguoiHoc nh1 = new NguoiHoc();
        nh1.setHoTen("Tường Vy");
        nh1.setGioitinh(false);
        nh1.setNgaySinh(DateHelper.toDate("2002-10-09", "yyyy-dd-mm"));
        nh1.setSoDT("0909365788");
        nh1.setEmail("vyt09@fpt.edu.vn");
        nh1.setGhiChu("Nóng tính, khó gân");
        nh1.setMaNV("PS02");
        nh1.setMaNH("NH05");
        NguoiHocDAO nh = new NguoiHocDAO();
        nh.Update(nh1);
    }
}
