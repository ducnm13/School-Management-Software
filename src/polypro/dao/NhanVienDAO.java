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
import polypro.helper.JdbcHelper;
import polypro.model.NhanVien;

/**
 *
 * @author PC
 */
public class NhanVienDAO {

    public void Insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien VALUES(?,?,?,?,?,?,?,?)";
        JdbcHelper.excuteUpdate(sql, model.getMaNV(), model.getMatkhau(), model.getHoten(), model.getGioitinh(), model.getEmail(), model.getSoDT(), model.getDiachi(), model.getVaitro());
    }

    public void Update(NhanVien model) {
        String sql = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, GioiTinh = ?, Email = ?, SoDT = ?, VaiTro = ? WHERE MaNV = ?";
        JdbcHelper.excuteUpdate(sql, model.getMatkhau(), model.getHoten(), model.getGioitinh(), model.getEmail(), model.getSoDT(), model.getVaitro(), model.getMaNV());
    }

    public void Delete(String MaNV) {
        String sql = "DELETE FROM NhanVien Where MaNV = ?";
        JdbcHelper.excuteUpdate(sql, MaNV);
    }

    public List<NhanVien> Select() {
        String sql = "SELECT * FROM NhanVien";
        return Select(sql);
    }

    public NhanVien findByID(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV = ?";
        List<NhanVien> list = Select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NhanVien> Select(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.excuteQuery(sql, args);
                while (rs.next()) {
                    NhanVien model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws SQLException {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setMatkhau(rs.getString("MatKhau"));
        model.setHoten(rs.getString("HoTen"));
        model.setGioitinh(rs.getBoolean("GioiTinh"));
        model.setEmail(rs.getString("Email"));
        model.setSoDT(rs.getString("SoDT"));
        model.setDiachi(rs.getString("DiaChi"));
        model.setVaitro(rs.getBoolean("VaiTro"));
        return model;
    }
}
