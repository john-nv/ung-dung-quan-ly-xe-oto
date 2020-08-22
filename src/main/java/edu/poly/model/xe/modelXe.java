/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.model.xe;

import java.awt.Image;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class modelXe {
    
    int MaLuc,SoCho;
    String MaXe, TenXe, SoKhung, SoMay, Hang, TinhTrangXe, MaLoaiXe, BienSoXe; 
    int GiaThueXeTheoGio, GiaThueXeTheoNgay, GiaThueXeTheoThang, TienPhat;
    Date ThoiGianBatDauTinhTrang, ThoiGianKetThucTinhTrang;
    Image HinhXe;
    // DATETIME – định dạng: YYYY-MM-DD HH:MI:SS
    
    public modelXe() {
    }

    public modelXe(int MaLuc, int SoCho, String MaXe, String TenXe, String SoKhung, String SoMay, String Hang, String TinhTrangXe, String MaLoaiXe, String BienSoXe, int GiaThueXeTheoGio, int GiaThueXeTheoNgay, int GiaThueXeTheoThang, int TienPhat, Date ThoiGianBatDauTinhTrang, Date ThoiGianKetThucTinhTrang, Image HinhXe) {
        this.MaLuc = MaLuc;
        this.SoCho = SoCho;
        this.MaXe = MaXe;
        this.TenXe = TenXe;
        this.SoKhung = SoKhung;
        this.SoMay = SoMay;
        this.Hang = Hang;
        this.TinhTrangXe = TinhTrangXe;
        this.MaLoaiXe = MaLoaiXe;
        this.BienSoXe = BienSoXe;
        this.GiaThueXeTheoGio = GiaThueXeTheoGio;
        this.GiaThueXeTheoNgay = GiaThueXeTheoNgay;
        this.GiaThueXeTheoThang = GiaThueXeTheoThang;
        this.TienPhat = TienPhat;
        this.ThoiGianBatDauTinhTrang = ThoiGianBatDauTinhTrang;
        this.ThoiGianKetThucTinhTrang = ThoiGianKetThucTinhTrang;
        this.HinhXe = HinhXe;
    }

    public int getMaLuc() {
        return MaLuc;
    }

    public void setMaLuc(int MaLuc) {
        this.MaLuc = MaLuc;
    }

    public int getSoCho() {
        return SoCho;
    }

    public void setSoCho(int SoCho) {
        this.SoCho = SoCho;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getSoKhung() {
        return SoKhung;
    }

    public void setSoKhung(String SoKhung) {
        this.SoKhung = SoKhung;
    }

    public String getSoMay() {
        return SoMay;
    }

    public void setSoMay(String SoMay) {
        this.SoMay = SoMay;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getTinhTrangXe() {
        return TinhTrangXe;
    }

    public void setTinhTrangXe(String TinhTrangXe) {
        this.TinhTrangXe = TinhTrangXe;
    }

    public String getMaLoaiXe() {
        return MaLoaiXe;
    }

    public void setMaLoaiXe(String MaLoaiXe) {
        this.MaLoaiXe = MaLoaiXe;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public int getGiaThueXeTheoGio() {
        return GiaThueXeTheoGio;
    }

    public void setGiaThueXeTheoGio(int GiaThueXeTheoGio) {
        this.GiaThueXeTheoGio = GiaThueXeTheoGio;
    }

    public int getGiaThueXeTheoNgay() {
        return GiaThueXeTheoNgay;
    }

    public void setGiaThueXeTheoNgay(int GiaThueXeTheoNgay) {
        this.GiaThueXeTheoNgay = GiaThueXeTheoNgay;
    }

    public int getGiaThueXeTheoThang() {
        return GiaThueXeTheoThang;
    }

    public void setGiaThueXeTheoThang(int GiaThueXeTheoThang) {
        this.GiaThueXeTheoThang = GiaThueXeTheoThang;
    }

    public int getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(int TienPhat) {
        this.TienPhat = TienPhat;
    }

    public Date getThoiGianBatDauTinhTrang() {
        return ThoiGianBatDauTinhTrang;
    }

    public void setThoiGianBatDauTinhTrang(Date ThoiGianBatDauTinhTrang) {
        this.ThoiGianBatDauTinhTrang = ThoiGianBatDauTinhTrang;
    }

    public Date getThoiGianKetThucTinhTrang() {
        return ThoiGianKetThucTinhTrang;
    }

    public void setThoiGianKetThucTinhTrang(Date ThoiGianKetThucTinhTrang) {
        this.ThoiGianKetThucTinhTrang = ThoiGianKetThucTinhTrang;
    }

    public Image getHinhXe() {
        return HinhXe;
    }

    public void setHinhXe(Image HinhXe) {
        this.HinhXe = HinhXe;
    }
 
}