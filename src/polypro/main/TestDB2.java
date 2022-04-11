/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import polypro.model.NhanVien;
import polypro.dao.NhanVienDAO;

/**
 *
 * @author PC
 */
public class TestDB2 {
    public static void main(String[] args) {
        //Cập nhật thông tin nhân viên theo mã
        //Tạo nhân viên để cập nhật
        //Gọi lệnh Update từ class NhanVienDAO
        //Update lại thông tin nhân viên
        NhanVien nv1 = new NhanVien();
        nv1.setMaNV("PS01");
        nv1.setHoten("Phúc Phạm");
        nv1.setMatkhau("09033");
        nv1.setEmail("phucpb@fpt.edu.vn");
        nv1.setSoDT("0938697503");
        nv1.setVaitro(true);
        
        NhanVienDAO nv = new NhanVienDAO();
        nv.Update(nv1);
    }
}
