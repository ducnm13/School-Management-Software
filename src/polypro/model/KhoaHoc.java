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
public class KhoaHoc {

    private int MaKH;
    private String MaCD;
    private double HocPhi;
    private int ThoiGian;
    private Date NgayKG;
    private String GhiChu;
    private String MaNV;
    private Date NgayTao = DateHelper.now();

    @Override
    public String toString() {
        return this.MaCD + " (" + this.NgayKG + ")";
    }

    public KhoaHoc() {
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(int ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public Date getNgayKG() {
        return NgayKG;
    }

    public void setNgayKG(Date NgayKG) {
        this.NgayKG = NgayKG;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

}
