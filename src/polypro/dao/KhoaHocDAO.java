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
import polypro.model.KhoaHoc;

/**
 *
 * @author PC
 */
public class KhoaHocDAO {

    //Insert
    public void Insert(KhoaHoc model) {
        String sql = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.excuteUpdate(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiGian(),
                DateHelper.toString(model.getNgayKG(), "dd/MM/yyyy"),
                model.getGhiChu(),
                model.getMaNV());
    }

    public void Update(KhoaHoc model) {
        String sql = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHERE MaKH=?";
        JdbcHelper.excuteUpdate(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiGian(),
                DateHelper.toString(model.getNgayKG(), "dd/MM/yyyy"),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH());
    }

    public void Delete(int MaKH) {
        String sql = "DELETE FROM KhoaHoc WHERE MaKH=?";
        JdbcHelper.excuteUpdate(sql, MaKH);
    }

    public List<KhoaHoc> Select() {
        String sql = "SELECT * FROM KhoaHoc";
        return select(sql);
    }

    public KhoaHoc findById(Integer makh) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaKH=?";
        List<KhoaHoc> list = select(sql, makh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<KhoaHoc> select(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.excuteQuery(sql, args);
                while (rs.next()) {
                    KhoaHoc model = readFromResultSet(rs);
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

    private KhoaHoc readFromResultSet(ResultSet rs) throws SQLException {
        KhoaHoc model = new KhoaHoc();
        model.setMaKH(rs.getInt("MaKH"));
        model.setMaCD(rs.getString("MaCD"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setThoiGian(rs.getInt("ThoiLuong"));
        model.setNgayKG(rs.getDate("NgayKG"));
        model.setMaNV(rs.getString("MaNV"));
        model.setGhiChu(rs.getString("GhiChu"));
        model.setNgayTao(rs.getDate("NgayTao"));
        return model;
    }
}
