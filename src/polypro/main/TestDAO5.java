/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.util.List;
import polypro.dao.NguoiHocDAO;
import polypro.model.NguoiHoc;

/**
 *
 * @author PC
 */
public class TestDAO5 {
    public static void main(String[] args) {
        NguoiHocDAO nh = new NguoiHocDAO();
        List<NguoiHoc> listNh = nh.Select();
        for (NguoiHoc nhs: listNh) {
            System.out.println(nhs.getMaNH() + ", "
                    + nhs.getHoTen() + ", "
                    + nhs.getGioitinh() + ", "
                    + nhs.getNgaySinh() + ", "
                    + nhs.getSoDT() + ", "
                    + nhs.getEmail() + ", "
                    + nhs.getGhiChu() + ", "
                    + nhs.getMaNV() + ", "
                    + nhs.getNgayDK());
        }
    }
}
