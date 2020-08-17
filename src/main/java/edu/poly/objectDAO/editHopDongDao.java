/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;
import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelHopDong;
import edu.poly.object.modelTien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author dinh
 */
public class editHopDongDao {
    public void insertHopDong(modelHopDong hd, modelTien t){
        String sql1 = "insert into TIEN (MaThanhToan, TienThueXe, TienSuaChua, TongTien, GhiChu) values (?,?,?,?,?)";
        String sql2 = "insert into HOPDONG (MaHD, NgayLap, SoCMND, ThoiGianBatDauHopDong, ThoiGianKetThucHopDong, DiaDiemNhanXe, DiaDiemTraXe, GhiChu, MaLoaiXe, MaPK, MaThanhToan, DatCoc) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            PreparedStatement pstm2 = con.prepareStatement(sql2);
            try {
                pstm1.setString(1, t.getMaTT());
                pstm1.setFloat(2, t.getTienThueXe());
                pstm1.setFloat(3, t.getTienSuaChua());
                pstm1.setFloat(4, t.getTongTien());
                pstm1.setString(5, t.getGhiChu());
                
                pstm2.setInt(1, hd.getMaHD());
                pstm2.setDate(2, hd.getNgayLap());
                pstm2.setInt(3, hd.getSoCMND());
                pstm2.setDate(4, hd.getThoiGianBatDauHD());
                pstm2.setDate(5, hd.getThoiGianKetThucHD());
                pstm2.setString(6, hd.getDiaDiemNhanXe());
                pstm2.setString(7, hd.getDiaDiemTraXe());
                pstm2.setString(8, hd.getGhiChu());
                pstm2.setString(9, hd.getMaLoaiXe());
                pstm2.setString(10, hd.getMaPK());
                pstm2.setString(11, hd.getMaTT());
                pstm2.setString(12, hd.getDatCoc());
                
                pstm1.executeUpdate();
                pstm2.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
