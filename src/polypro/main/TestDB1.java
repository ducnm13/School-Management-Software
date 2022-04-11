/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import polypro.dao.NhanVienDAO;
import polypro.model.NhanVien;

/**
 *
 * @author PC
 */
public class TestDB1 {
    public static void main(String[] args) {
        //Tạo 5 nhân viên từ class NhanVien
        //Gọi method Insert từ class NhanVienDAO
        //Add 5 nhân viên vào database
        NhanVien nv1 = new NhanVien();
        nv1.setMaNV("PS01");
        nv1.setHoten("Phúc");
        nv1.setMatkhau("1234567");
        nv1.setEmail("phucpb@fpt.edu.vn");
        nv1.setSoDT("0938697500");
        nv1.setDiachi("TPHCM");
        nv1.setGioitinh(true);
        nv1.setVaitro(true);
//        NhanVien nv2 = new NhanVien("PS02", "1234568", "Đỏ", "do@fpt.edu.vn", "0909765444", false);
//        NhanVien nv3 = new NhanVien("PS03", "123456", "Đức", "duc@fpt.edu.vn", "0909895424", false);
//        NhanVien nv4 = new NhanVien("PS04", "12345", "Huy", "huy@fpt.edu.vn", "0909712341", false);
//        NhanVien nv5 = new NhanVien("PS05", "1234333", "TAnh", "anht@fpt.edu.vn", "0908235649", false);
        
        NhanVienDAO nv = new NhanVienDAO();
        nv.Insert(nv1);
//        nv.Insert(nv2);
//        nv.Insert(nv3);
//        nv.Insert(nv4);
//        nv.Insert(nv5);
    }
}
