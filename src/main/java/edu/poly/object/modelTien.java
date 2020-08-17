/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

/**
 *
 * @author dinh
 */
public class modelTien {

    String maTT;
    float tienThueXe, tienSuaChua, tongTien;
    String ghiChu;

    public modelTien() {
    }

    public modelTien(String maTT, float tienThueXe, float tienSuaChua, float tongTien, String ghiChu) {
        this.maTT = maTT;
        this.tienThueXe = tienThueXe;
        this.tienSuaChua = tienSuaChua;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public float getTienThueXe() {
        return tienThueXe;
    }

    public void setTienThueXe(float tienThueXe) {
        this.tienThueXe = tienThueXe;
    }

    public float getTienSuaChua() {
        return tienSuaChua;
    }

    public void setTienSuaChua(float tienSuaChua) {
        this.tienSuaChua = tienSuaChua;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
}
