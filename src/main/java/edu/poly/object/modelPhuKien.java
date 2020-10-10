/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.object;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class modelPhuKien {
    String maPK, tenPK, TinhTrangPK, maLoaiPK;
    Date timeStartPK,timeEndPK;

    public modelPhuKien() {
    }

    public modelPhuKien(String maPK, String tenPK, String TinhTrangPK, String maLoaiPK, Date timeStartPK, Date timeEndPK) {
        this.maPK = maPK;
        this.tenPK = tenPK;
        this.TinhTrangPK = TinhTrangPK;
        this.maLoaiPK = maLoaiPK;
        this.timeStartPK = timeStartPK;
        this.timeEndPK = timeEndPK;
    }

    public String getMaPK() {
        return maPK;
    }

    public void setMaPK(String maPK) {
        this.maPK = maPK;
    }

    public String getTenPK() {
        return tenPK;
    }

    public void setTenPK(String tenPK) {
        this.tenPK = tenPK;
    }

    public String getTinhTrangPK() {
        return TinhTrangPK;
    }

    public void setTinhTrangPK(String TinhTrangPK) {
        this.TinhTrangPK = TinhTrangPK;
    }

    public String getMaLoaiPK() {
        return maLoaiPK;
    }

    public void setMaLoaiPK(String maLoaiPK) {
        this.maLoaiPK = maLoaiPK;
    }

    public Date getTimeStartPK() {
        return timeStartPK;
    }

    public void setTimeStartPK(Date timeStartPK) {
        this.timeStartPK = timeStartPK;
    }

    public Date getTimeEndPK() {
        return timeEndPK;
    }

    public void setTimeEndPK(Date timeEndPK) {
        this.timeEndPK = timeEndPK;
    }
    
    
}
