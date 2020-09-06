/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

/**
 *
 * @author QUANGC
 */
public class modeLogin {
    String taiKhoang, matKhau, chucNang;

    public modeLogin(String taiKhoang, String matKhau, String chucNang) {
        this.taiKhoang = taiKhoang;
        this.matKhau = matKhau;
        this.chucNang = chucNang;
    }

    public modeLogin() {
    }

    public String getTaiKhoang() {
        return taiKhoang;
    }

    public void setTaiKhoang(String taiKhoang) {
        this.taiKhoang = taiKhoang;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }
    
    
}
