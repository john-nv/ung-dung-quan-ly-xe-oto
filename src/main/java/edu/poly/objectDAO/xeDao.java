/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelXe;
import java.awt.image.BufferedImage;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Admin
 */
public class xeDao {

    public boolean insert(modelXe mdXe) throws SQLException, ClassNotFoundException {
        String sql = "Insert into xe (MaXe, TenXe, SoKhung, SoMay, MaLuc, Hang, SoCho, GiaThueXeTheoGio, GiaThueXeTheoNgay, GiaThueXeTheoThang, TienPhat,"
                + "TinhTrangXe, ThoiGianBatDauTinhTrang, ThoiGianKetThucTinhTrang, MaLoaiXe, BienSoXe, HinhXe)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);) {

            // thêm dữ liệu 
            psmt.setString(1, mdXe.getMaXe());
            psmt.setString(2, mdXe.getTenXe());
            psmt.setString(3, mdXe.getSoKhung());
            psmt.setString(4, mdXe.getSoMay());
            psmt.setInt(5, mdXe.getMaLuc());
            psmt.setString(6, mdXe.getHang());
            psmt.setInt(7, mdXe.getSoCho());
            psmt.setFloat(8, mdXe.getGiaThueXeTheoGio());
            psmt.setFloat(9, mdXe.getGiaThueXeTheoNgay());
            psmt.setFloat(10, mdXe.getGiaThueXeTheoThang());
            psmt.setFloat(11, mdXe.getTienPhat());
            psmt.setString(12, mdXe.getTinhTrangXe());
            psmt.setDate(13, mdXe.getThoiGianBatDauTinhTrang());
            psmt.setDate(14, mdXe.getThoiGianKetThucTinhTrang());
            psmt.setString(15, mdXe.getMaLoaiXe());
            psmt.setString(16, mdXe.getBienSoXe());
            if (mdXe.getHinhXe() != null) {
                Blob hinh = new SerialBlob(mdXe.getHinhXe());
                psmt.setBlob(17, hinh);
            }else {
                Blob hinh = null;
                psmt.setBlob(17, hinh);
            }

            return psmt.executeUpdate() > 0;
        }
    }

    public boolean update(modelXe mdXe) throws SQLException, ClassNotFoundException {
            String sql = " UPDATE [dbo].[Xe]" +
                            "  SET  [TenXe] = ?" +
                            "      , [SoKhung] = ?" +
                            "      , [SoMay] = ?" +
                            "      , [MaLuc] = ?" +
                            "      , [Hang] = ?" +
                            "      , [SoCho] = ?" +
                            "      , [GiaThueXeTheoGio] = ?" +
                            "      , [GiaThueXeTheoNgay] = ?" +
                            "      , [GiaThueXeTheoThang] = ?" +
                            "      , [TienPhat] =  ?" +
                            "      , [TinhTrangXe] = ?" +
                            "      , [ThoiGianBatDauTinhTrang] = ?" +
                            "      , [ThoiGianKetThucTinhTrang] = ?" +
                            "      , [MaLoaiXe] = ?" +
                            "      , [BienSoXe] = ?" +
                            "      ,[HinhXe] = ?" +
                            " WHERE [MaXe] = ? ";
            
             try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);) {

            // thêm dữ liệu 
            try {
                psmt.setString(1, mdXe.getTenXe());
                psmt.setString(2, mdXe.getSoKhung());
                psmt.setString(3, mdXe.getSoMay());
                psmt.setInt(4, mdXe.getMaLuc());
                psmt.setString(5, mdXe.getHang());
                psmt.setInt(6, mdXe.getSoCho());
                psmt.setFloat(7, mdXe.getGiaThueXeTheoGio());
                psmt.setFloat(8, mdXe.getGiaThueXeTheoNgay());
                psmt.setFloat(9, mdXe.getGiaThueXeTheoThang());
                psmt.setFloat(10, mdXe.getTienPhat());
                psmt.setString(11, mdXe.getTinhTrangXe());
                psmt.setDate(12, mdXe.getThoiGianBatDauTinhTrang());
                psmt.setDate(13, mdXe.getThoiGianKetThucTinhTrang());
                psmt.setString(14, mdXe.getMaLoaiXe());
                psmt.setString(15, mdXe.getBienSoXe());
                if (mdXe.getHinhXe() != null) {
                    Blob hinh = new SerialBlob(mdXe.getHinhXe());
                    psmt.setBlob(16, hinh);
                }else {
                    Blob hinh = null;
                    psmt.setBlob(16, hinh);
                }
                psmt.setString(17, mdXe.getMaXe());
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return psmt.executeUpdate() > 0;
        }
    }

    public boolean delete(String delXe) throws ClassNotFoundException, SQLException {
        String sql = "delete from xe where maXe =? ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
                psmt.setString(1, delXe);

                return psmt.executeUpdate() > 0;
        }
    }
    
    private void fillXe(modelXe modelxe, final ResultSet rs) throws SQLException {
        modelxe.setMaXe(rs.getString("MaXe"));
        modelxe.setTenXe(rs.getString("TenXe"));
        modelxe.setSoKhung(rs.getString("SoKhung"));
        modelxe.setSoMay(rs.getString("SoMay"));
        modelxe.setMaLuc(rs.getInt("MaLuc"));
        modelxe.setHang(rs.getString("Hang"));
        modelxe.setSoCho(rs.getInt("SoCho"));
        modelxe.setGiaThueXeTheoGio(rs.getInt("GiaThueXeTheoGio"));
        modelxe.setGiaThueXeTheoNgay(rs.getInt("GiaThueXeTheoNgay"));
        modelxe.setGiaThueXeTheoThang(rs.getInt("GiaThueXeTheoThang"));
        modelxe.setTienPhat(rs.getInt("TienPhat"));
        modelxe.setTinhTrangXe(rs.getString("TinhTrangXe"));
        modelxe.setThoiGianBatDauTinhTrang(rs.getDate("ThoiGianBatDauTinhTrang"));
        modelxe.setThoiGianKetThucTinhTrang(rs.getDate("ThoiGianKetThucTinhTrang"));
        modelxe.setMaLoaiXe(rs.getString("MaLoaiXe"));
        modelxe.setBienSoXe(rs.getString("BienSoXe"));
    }

    // Lọc tên rồi đưa vào Jtable
    public List<modelXe> findByName(String tenXe) throws SQLException, ClassNotFoundException {
        String sql = "select * from xe where tenXe like ?";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) {

            ptmt.setString(1, "%" + tenXe + "%");
            List<modelXe> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelXe modelXe = new modelXe();
                    fillXe(modelXe, rs);
                    list.add(modelXe);
                }
            }
            return list;

        }
    }

    
    public modelXe findByMaxeEditTxt(String maXe) throws ClassNotFoundException, SQLException {
        String sql = "select * from xe where MaXe like ?";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) {
            ptmt.setString(1, maXe);

            try (ResultSet rs = ptmt.executeQuery()) {
                if (rs.next()) {
                    modelXe mdXe = new modelXe();
                    fillXe(mdXe, rs);
                    Blob Blod = rs.getBlob("HinhXe");
                    if (Blod != null) {
                        mdXe.setHinhXe(Blod.getBytes(1, (int) Blod.length() ));
                    }

                    return mdXe;
                }
            }
            return null;
        }
    }

    public List<modelXe> showAllXe() throws SQLException, ClassNotFoundException {
        String sql = "select * from xe ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            List<modelXe> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelXe modelXe = new modelXe();
                    
                    fillXe(modelXe, rs);
                    
                    list.add(modelXe);
                }
            }
            return list;
        }
    }

    
    public List<modelXe> filterXe(String hang, String tinhTrang) throws ClassNotFoundException, SQLException { 
        String sql = "SELECT * FROM [dbo].[Xe] where Hang = ? and  TinhTrangXe = ?";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) 
        {
            ptmt.setString(1, hang);
            ptmt.setString(2, tinhTrang);
            
            List<modelXe> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelXe modelXe = new modelXe();
                    fillXe(modelXe, rs);
                    list.add(modelXe);
                }
            }
            return list;
        }
    }

}


