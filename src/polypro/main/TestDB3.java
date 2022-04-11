/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;

import polypro.dao.NhanVienDAO;

/**
 *
 * @author PC
 */
public class TestDB3 {
    
    public static void main(String[] args) {
        //Xoá nhân viên theo mã
        //Tạo biến maso truyền mã nhân viên vào
        //Gọi method Delete từ class NhanVienDAO
        //Delete maso
        String maso = "PS05";
        NhanVienDAO nv = new NhanVienDAO();
        nv.Delete(maso);
        
    }
    
}
