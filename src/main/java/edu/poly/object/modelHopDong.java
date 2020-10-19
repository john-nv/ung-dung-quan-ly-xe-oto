/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

import java.sql.Date;

/**
 *
 * @author dinh
 */
public class modelHopDong {

    int maHD;
    Date ngayLap;
    int soCMND;
    Date thoiGianBatDauHD, thoiGianKetThucHD;
    String diaDiemNhanXe, diaDiemTraXe, ghiChu, maLoaiXe, maLoaiPK, maTT, datCoc, tinhTrang;

    public modelHopDong() {
    }

    public modelHopDong(int maHD, Date ngayLap, int soCMND, Date thoiGianBatDauHD, Date thoiGianKetThucHD, String diaDiemNhanXe, String diaDiemTraXe, String ghiChu, String maLoaiXe, String maLoaiPK, String maTT, String datCoc, String tinhTrang) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.soCMND = soCMND;
        this.thoiGianBatDauHD = thoiGianBatDauHD;
        this.thoiGianKetThucHD = thoiGianKetThucHD;
        this.diaDiemNhanXe = diaDiemNhanXe;
        this.diaDiemTraXe = diaDiemTraXe;
        this.ghiChu = ghiChu;
        this.maLoaiXe = maLoaiXe;
        this.maLoaiPK = maLoaiPK;
        this.maTT = maTT;
        this.datCoc = datCoc;
        this.tinhTrang = tinhTrang;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public Date getThoiGianBatDauHD() {
        return thoiGianBatDauHD;
    }

    public void setThoiGianBatDauHD(Date thoiGianBatDauHD) {
        this.thoiGianBatDauHD = thoiGianBatDauHD;
    }

    public Date getThoiGianKetThucHD() {
        return thoiGianKetThucHD;
    }

    public void setThoiGianKetThucHD(Date thoiGianKetThucHD) {
        this.thoiGianKetThucHD = thoiGianKetThucHD;
    }

    public String getDiaDiemNhanXe() {
        return diaDiemNhanXe;
    }

    public void setDiaDiemNhanXe(String diaDiemNhanXe) {
        this.diaDiemNhanXe = diaDiemNhanXe;
    }

    public String getDiaDiemTraXe() {
        return diaDiemTraXe;
    }

    public void setDiaDiemTraXe(String diaDiemTraXe) {
        this.diaDiemTraXe = diaDiemTraXe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLoaiXe() {
        return maLoaiXe;
    }

    public void setMaLoaiXe(String maLoaiXe) {
        this.maLoaiXe = maLoaiXe;
    }

    public String getMaLoaiPK() {
        return maLoaiPK;
    }

    public void setMaLoaiPK(String maLoaiPK) {
        this.maLoaiPK = maLoaiPK;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public String getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(String datCoc) {
        this.datCoc = datCoc;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
