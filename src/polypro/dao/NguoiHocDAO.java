/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polypro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import polypro.helper.DateHelper;
import polypro.helper.JdbcHelper;
import polypro.model.NguoiHoc;

/**
 *
 * @author PC
 */
public class NguoiHocDAO {

    public void Insert(NguoiHoc model) {
        String sql = "INSERT INTO NguoiHoc VALUES(?,?,?,?,?,?,?,?,?,?)";
        JdbcHelper.excuteUpdate(sql,
                model.getMaNH(),
                model.getHoTen(),
                model.getGioitinh(),
                model.getDiachi(),               
                DateHelper.toString(model.getNgaySinh(), "yyyy/MM/dd"),
                model.getSoDT(),
                model.getEmail(),
                model.getMaNV(),
                DateHelper.toString(model.getNgayDK(), "yyyy/MM/dd"),              
                model.getGhiChu());                         
    }

    public void Update(NguoiHoc model) {
        String sql = "UPDATE NguoiHoc SET HoTen = ?, GioiTinh = ?, DiaChi = ?, NgaySinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, MaNV = ? WHERE MaNH = ?";
        JdbcHelper.excuteUpdate(sql, model.getHoTen(),
                model.getGioitinh(),
                model.getDiachi(),               
                model.getNgaySinh(),
                model.getSoDT(),
                model.getEmail(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaNH());
    }

    public void Delete(String MaNH) {
        String sql = "DELETE FROM NguoiHoc Where MaNH = ?";
        JdbcHelper.excuteUpdate(sql, MaNH);
    }

    public List<NguoiHoc> Select() {
        String sql = "SELECT * FROM NguoiHoc";
        return Select(sql);
    }
    
    public List<NguoiHoc> SelectByKeyword(String keyword){
        String sql="SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return Select(sql, "%"+keyword+"%");
    }
    
    public List<NguoiHoc> SelectByCourse(Integer makh){
        String sql="SELECT * FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return Select(sql, makh);
    }
    
    public NguoiHoc findById(String manh){
        String sql="SELECT * FROM NguoiHoc WHERE MaNH=?";
        List<NguoiHoc> list = Select(sql, manh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NguoiHoc> Select(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.excuteQuery(sql, args);
                while (rs.next()) {
                    NguoiHoc model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    private NguoiHoc readFromResultSet(ResultSet rs) throws SQLException{
        NguoiHoc model=new NguoiHoc();
        model.setMaNH(rs.getString("MaNH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setDiachi(rs.getString("DiaChi"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setGioitinh(rs.getBoolean("GioiTinh"));
        model.setSoDT(rs.getString("DienThoai"));
        model.setEmail(rs.getString("Email"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setMaNV(rs.getString("MaNV"));
        model.setNgayDK(rs.getDate("NgayDK"));
        return model;
    }
}
