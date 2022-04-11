/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.util.ArrayList;
import java.util.List;
import polypro.dao.NguoiHocDAO;
import polypro.model.NguoiHoc;

/**
 *
 * @author PC
 */
public class TestDAO4 {

    public static void main(String[] args) {
        NguoiHocDAO nh = new NguoiHocDAO();
        NguoiHoc nh1 = new NguoiHoc();
        nh1 = nh.findById("NH05");
        System.out.println(nh1.getMaNH() + ", "
                + nh1.getHoTen() + ", "
                + nh1.getGioitinh() + ", "
                + nh1.getNgaySinh() + ", "
                + nh1.getSoDT() + ", "
                + nh1.getEmail() + ", "
                + nh1.getGhiChu() + ", "
                + nh1.getMaNV() + ", "
                + nh1.getNgayDK());

    }
}
