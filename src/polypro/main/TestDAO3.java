/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.main;
import polypro.dao.NguoiHocDAO;
/**
 *
 * @author PC
 */
public class TestDAO3 {
    public static void main(String[] args) {
        NguoiHocDAO nh = new NguoiHocDAO();
        nh.Delete("NH09");
    }
}
