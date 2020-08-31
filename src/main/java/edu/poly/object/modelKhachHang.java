/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

import java.sql.Date;

/**
 *
 * @author QUANGC
 */
public class modelKhachHang {
     String hoTen, ghiChu;
     Date namSinh;
     int soGPLX, soCMND;

    public modelKhachHang() {
    }

    public modelKhachHang(String hoTen, String ghiChu, Date namSinh, int soGPLX, int soCMND) {
        this.hoTen = hoTen;
        this.ghiChu = ghiChu;
        this.namSinh = namSinh;
        this.soGPLX = soGPLX;
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoGPLX() {
        return soGPLX;
    }

    public void setSoGPLX(int soGPLX) {
        this.soGPLX = soGPLX;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }
    
    
}
