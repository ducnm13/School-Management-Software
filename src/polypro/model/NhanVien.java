/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.model;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String MaNV;
    private String Matkhau;
    private String Hoten;
    private boolean Gioitinh;
    private String Email;
    private String SoDT;
    private String diachi;
    private boolean Vaitro = false;

    public NhanVien(String MaNV, String Matkhau, String Hoten, boolean Gioitinh, String Email, String SoDT, String diachi) {
        this.MaNV = MaNV;
        this.Matkhau = Matkhau;
        this.Hoten = Hoten;
        this.Gioitinh = Gioitinh;
        this.Email = Email;
        this.SoDT = SoDT;
        this.diachi = diachi;
    }

    public NhanVien() {
        
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean getVaitro() {
        return Vaitro;
    }

    public void setVaitro(boolean Vaitro) {
        this.Vaitro = Vaitro;
    }

    
    
}
