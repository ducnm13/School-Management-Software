/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.helper;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DialogHelper {
    //Hiển thị cửa sổ thông báo
    //parent là cửa sổ chứa thông báo
    //message là thông báo
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Hiển thị thông báo và yêu cầu người dùng xác nhận
    //parent là cửa sổ thông báo
    //message là câu hỏi yes/no
    //return về kết quả
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thông quản lý đào tạo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    //Hiển thị thông báo yêu cầu nhập dữ liệu
    //parent là cửa sổ thông báo
    //message là dữ liệu nhập
    //return về kết quả
    public static String prompt(Component parent , String message){
        return JOptionPane.showInputDialog(parent, message, "Hệ thông quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
