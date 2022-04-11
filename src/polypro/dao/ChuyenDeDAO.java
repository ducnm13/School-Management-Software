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
import polypro.model.ChuyenDe;

/**
 *
 * @author PC
 */
public class ChuyenDeDAO {

    //Inset
    public void Insert(ChuyenDe cd) {
        String sql = "INSERT INTO ChuyenDe VALUES(?,?,?,?,?,?)";
        JdbcHelper.excuteUpdate(sql,
                cd.getMaCD(),
                cd.getTenCD(),
                cd.getHocPhi(),
                cd.getThoiLuong(),
                cd.getHinh(),
                cd.getMoTa());
    }

    //Update
    public void Update(ChuyenDe cd) {
        String sql = "UPDATE ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD = ?";
        JdbcHelper.excuteUpdate(sql,
                cd.getTenCD(),
                cd.getHocPhi(),
                cd.getThoiLuong(),
                cd.getHinh(),
                cd.getMoTa(),
                cd.getMaCD());
    }

    //Delete
    public void Delete(String ma) {
        String sql = "DELETE FROM ChuyenDe WHERE MaCD = ?";
        JdbcHelper.excuteUpdate(sql, ma);
    }

    //Select thì cũng ý là
    // chú viết thêm để đổ vào combobox ấy ùm, chú lấy có chuyên đề sao lại select*. 
    public List<ChuyenDe> Select() {
        String sql = "SELECT * FROM ChuyenDe";
        return select(sql);
    }

    //Find
    public ChuyenDe findByID(String ma) {
        String sql = "SELECT * FROM ChuyenDe WHERE MaCD = ?";
        List<ChuyenDe> list = select(sql, ma);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<ChuyenDe> select(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.excuteQuery(sql, args);
                while (rs.next()) {
                    ChuyenDe model = readFromResultSet(rs);
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

    private ChuyenDe readFromResultSet(ResultSet rs) throws SQLException {
        ChuyenDe model = new ChuyenDe();
        model.setMaCD(rs.getString("MaCD"));
        model.setHinh(rs.getString("Hinh"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setMoTa(rs.getString("MoTa"));
        model.setTenCD(rs.getString("TenCD"));
        model.setThoiLuong(rs.getInt("ThoiLuong"));
        return model;
    }
}
