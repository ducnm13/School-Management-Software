/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.model;

import java.util.Date;
import polypro.helper.DateHelper;

/**
 *
 * @author PC
 */
public class NguoiHoc {

    private String MaNH;
    private String HoTen;
    private boolean Gioitinh;
    private String Diachi;
    private Date NgaySinh;
    private String SoDT;
    private String Email;
    private String MaNV;
    private Date NgayDK = DateHelper.now();
    private String GhiChu;
    
    @Override
    public String toString() {
        return this.HoTen;
    }

    public NguoiHoc() {
    }

    public NguoiHoc(String MaNH, String HoTen, boolean Gioitinh, String Diachi, Date NgaySinh, String SoDT, String Email, String MaNV, String GhiChu) {
        this.MaNH = MaNH;
        this.HoTen = HoTen;
        this.Gioitinh = Gioitinh;
        this.Diachi = Diachi;
        this.NgaySinh = NgaySinh;
        this.SoDT = SoDT;
        this.Email = Email;
        this.MaNV = MaNV;
        this.GhiChu = GhiChu;
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
