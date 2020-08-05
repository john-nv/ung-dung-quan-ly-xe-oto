/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.model.xe;

/**
 *
 * @author Admin
 */
public class modelLoaiXe {
    String MaLoaiXe, TenLoaiXe;
//    	[MaLoaiXe] [varchar](50) NOT NULL,
//	[TenLoaiXe] [nvarchar](50) NOT NULL,

    public modelLoaiXe() {
    }

    public modelLoaiXe(String MaLoaiXe, String TenLoaiXe) {
        this.MaLoaiXe = MaLoaiXe;
        this.TenLoaiXe = TenLoaiXe;
    }

    public String getMaLoaiXe() {
        return MaLoaiXe;
    }

    public void setMaLoaiXe(String MaLoaiXe) {
        this.MaLoaiXe = MaLoaiXe;
    }

    public String getTenLoaiXe() {
        return TenLoaiXe;
    }

    public void setTenLoaiXe(String TenLoaiXe) {
        this.TenLoaiXe = TenLoaiXe;
    }
    
    
}
