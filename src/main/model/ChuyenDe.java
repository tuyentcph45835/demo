/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

import java.util.Vector;

/**
 *
 * @author ctuye
 */
public class ChuyenDe {
    private String MaChuyenDe;
    private String TenChuyenDe;
    private Long HocPhi;

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public ChuyenDe() {
    }
    private String Mota;

    public ChuyenDe(String string, String string1, long aLong, int aInt, String string2) {
    }

    public ChuyenDe(String maCD, String tenCD, Long hocPhi, String moTa, String tenCD0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaChuyenDe() {
        return MaChuyenDe;
    }

    public void setMaChuyenDe(String MaChuyenDe) {
        this.MaChuyenDe = MaChuyenDe;
    }

    public String getTenChuyenDe() {
        return TenChuyenDe;
    }

    public void setTenChuyenDe(String TenChuyenDe) {
        this.TenChuyenDe = TenChuyenDe;
    }
    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return "ChuyenDe{" + "MaChuyenDe=" + MaChuyenDe + ", TenChuyenDe=" + TenChuyenDe + ", HocPhi=" + HocPhi + ", Mota=" + Mota + '}';
    }

    public Object getTenCD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getThoiLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getMoTa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Vector<?> toDataRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getHocPhi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
