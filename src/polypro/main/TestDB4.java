/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import java.util.List;
import polypro.dao.NhanVienDAO;
import polypro.model.NhanVien;

/**
 *
 * @author PC
 */
public class TestDB4 {
    public static void main(String[] args) {
        //Truy vấn xuất ra màn hình tất cả thông tin nhân viên
        //Tạo một list từ class NhanVien
        //Gọi method Select
        //Chạy vòng lặp for đê xuất hết thông tin nhân viên có trong list
        NhanVienDAO nv = new NhanVienDAO();
        List<NhanVien> listNV = nv.Select();
        for (NhanVien nv1: listNV) {
            System.out.println(nv1.getMaNV() + ", " + nv1.getMatkhau() + ", " + nv1.getHoten() + ", " + nv1.getEmail() + ", " + nv1.getSoDT() + ", " + nv1.getVaitro() );
        }
    }
}
