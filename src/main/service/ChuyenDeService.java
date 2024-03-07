/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import main.model.ChuyenDe;


/**
 *
 * @author Admin
 */
public class ChuyenDeService {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private String sql = null;

    public List<ChuyenDe> getAll() {
        List<ChuyenDe> listCD = new ArrayList<>();
        sql = "select MaCD,TenCD,HocPhi,MoTa from ChuyenDe";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
              //  ChuyenDe cd= new ChuyenDe(sql, sql, Long.MIN_VALUE, sql, sql)
               ChuyenDe cd = new ChuyenDe(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getInt(4), rs.getString(5));
                listCD.add(cd);
            }
            return listCD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int remove(String ma) {
        sql = "delete from ChuyenDe where MaCD like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
           return 0;
        }
    }
   
    public int add(ChuyenDe cd) {
        sql = "insert into ChuyenDe (MaCD,TenCD,HocPhi,MoTa) values (?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cd.getMaChuyenDe());
            ps.setObject(2, cd.getTenChuyenDe());
            ps.setObject(3, cd.getHocPhi());
            ps.setObject(4, cd.getThoiLuong());
            ps.setObject(5, cd.getMoTa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int update(String ma, ChuyenDe cc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
