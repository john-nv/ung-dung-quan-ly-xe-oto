/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

/**
 *
 * @author ASUS
 */
public class modelLoaiPhuKien {
    String MaLoaiPK, TenLoaiPK;
    int SoLuong;

    public modelLoaiPhuKien() {
    }

    public modelLoaiPhuKien(String MaLoaiPK, String TenLoaiPK, int SoLuong) {
        this.MaLoaiPK = MaLoaiPK;
        this.TenLoaiPK = TenLoaiPK;
        this.SoLuong = SoLuong;
    }

    public String getMaLoaiPK() {
        return MaLoaiPK;
    }

    public void setMaLoaiPK(String MaLoaiPK) {
        this.MaLoaiPK = MaLoaiPK;
    }

    public String getTenLoaiPK() {
        return TenLoaiPK;
    }

    public void setTenLoaiPK(String TenLoaiPK) {
        this.TenLoaiPK = TenLoaiPK;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
    
}
