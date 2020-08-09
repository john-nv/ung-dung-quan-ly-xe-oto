/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.model.xe.dao;

import edu.poly.Helper.databaseHelper;
import edu.poly.model.xe.modelXe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class xeDao {

    public boolean insert(modelXe mdXe) throws SQLException, ClassNotFoundException {
        String sql = "Insert into xe (MaXe, TenXe, SoKhung, SoMay, MaLuc, Hang, SoCho, GiaThueXeTheoGio, GiaThueXeTheoNgay, GiaThueXeTheoThang, TienPhat,"
                + "TinhTrangXe, ThoiGianBatDauTinhTrang, ThoiGianKetThucTinhTrang, MaLoaiXe, BienSoXe)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
                Connection con = databaseHelper.openConnection();  
                PreparedStatement ptmt = con.prepareStatement(sql);) {

            // thêm dữ liệu 
            createModelXe(ptmt, mdXe);

            return ptmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(modelXe mdXe) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE dbo.Xe" +
                        "   SET MaXe = 'q2'" +
                        "      ,TenXe = 'aac'" +
                        "      ,SoKhung = '?'" +
                        "      ,SoMay = '?'" +
                        "      ,MaLuc = ?" +
                        "      ,Hang = 'ac'" +
                        "      ,SoCho = ?" +
                        "      ,GiaThueXeTheoGio = ?" +
                        "      ,GiaThueXeTheoNgay = ?" +
                        "      ,GiaThueXeTheoThang = ?" +
                        "      ,TienPhat =  ?" +
                        "      ,TinhTrangXe = '?'" +
                        "      ,ThoiGianBatDauTinhTrang = '?'" +
                        "      ,ThoiGianKetThucTinhTrang = '?'" +
                        "      ,MaLoaiXe = '?'" +
                        "      ,BienSoXe = '?'" +
                        " WHERE MaXe ='?'"; 

        try (
                Connection con = databaseHelper.openConnection();  
                PreparedStatement ptmt = con.prepareStatement(sql);
                ){

            // thêm dữ liệu 
            createModelXe(ptmt, mdXe);
            ptmt.setString(17, mdXe.getMaXe());

            return ptmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String delXe) throws ClassNotFoundException, SQLException{
        String sql = "delete from xe where maXe =? ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setString(1, delXe);

            return  psmt.executeUpdate()>0;
        }
    }
    
    public List<modelXe> showXe() throws ClassNotFoundException, SQLException{
        String sql = "select * from xe where 'aabaca'";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
            //ptmt.setString(1, showXe);
            
            List<modelXe> list = new ArrayList<>();
            try ( ResultSet rs = ptmt.executeQuery()) {
                    while (rs.next()) {
                        modelXe modelXe = new modelXe();
                        fillXe(modelXe, rs);
                        list.add(modelXe);
                    }
                }
            return list;
        }
    }
    

    private void createModelXe(final PreparedStatement psmt, modelXe mdXe) throws SQLException {
        psmt.setString(1, mdXe.getMaXe());
        psmt.setString(2, mdXe.getTenXe());
        psmt.setString(3, mdXe.getSoKhung());
        psmt.setString(4, mdXe.getSoMay());
        psmt.setInt(5, mdXe.getMaLuc());
        psmt.setString(6, mdXe.getHang());
        psmt.setInt(7, mdXe.getSoCho());
        psmt.setInt(8, mdXe.getGiaThueXeTheoGio());
        psmt.setInt(9, mdXe.getGiaThueXeTheoNgay());
        psmt.setInt(10, mdXe.getGiaThueXeTheoThang());
        psmt.setInt(11, mdXe.getTienPhat());
        psmt.setString(12, mdXe.getTinhTrangXe());
        psmt.setString(13, mdXe.getThoiGianBatDauTinhTrang());
        psmt.setString(14, mdXe.getThoiGianKetThucTinhTrang());
        psmt.setString(15, mdXe.getMaLoaiXe());
        psmt.setString(16, mdXe.getBienSoXe());
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
        modelxe.setThoiGianBatDauTinhTrang(rs.getString("ThoiGianBatDauTinhTrang"));
        modelxe.setThoiGianKetThucTinhTrang(rs.getString("ThoiGianKetThucTinhTrang"));
        modelxe.setMaLoaiXe(rs.getString("MaLoaiXe"));
        modelxe.setBienSoXe(rs.getString("BienSoXe"));
    }

    // Lọc tên rồi đưa vào Jtable
    public List<modelXe> findByName(String tenXe) throws SQLException, ClassNotFoundException {
        String sql = "select * from xe where tenXe like ?";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
            
                ptmt.setString(1, "%" + tenXe + "%");
                List<modelXe> list = new ArrayList<>();
                try ( ResultSet rs = ptmt.executeQuery()) {
                    while (rs.next()) {
                        modelXe modelXe = new modelXe();
                        fillXe(modelXe, rs);
                        list.add(modelXe);
                    }
                }
            return list;

        }
    }
    
    
    // Lọc tên rồi đưa vào JtextField
    public modelXe findByMaxeEditTxt(String maXe) throws ClassNotFoundException, SQLException{
             String sql = "select * from xe where MaXe like ?";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
                ptmt.setString(1, maXe);
                
                try(ResultSet rs = ptmt.executeQuery()){
                    if (rs.next()) {
                        modelXe mdXe = new modelXe();
                        mdXe.setMaXe(rs.getString("maXe"));
                        mdXe.setTenXe(rs.getString("TenXe"));
                        mdXe.setSoKhung(rs.getString("Sokhung"));
                        mdXe.setSoMay(rs.getString("SoMay"));
                        mdXe.setMaLuc(rs.getInt("MaLuc"));
                        mdXe.setHang(rs.getString("Hang"));
                        mdXe.setSoCho(rs.getInt("SoCho"));
                        mdXe.setGiaThueXeTheoGio(rs.getInt("GiaThueXeTheoGio"));
                        mdXe.setGiaThueXeTheoNgay(rs.getInt("GiaThueXeTheoNgay"));
                        mdXe.setGiaThueXeTheoThang(rs.getInt("GiaThueXeTheoThang"));
                        mdXe.setTienPhat(rs.getInt("TienPhat"));
                        mdXe.setTinhTrangXe(rs.getString("TinhTrangXe"));
                        mdXe.setThoiGianBatDauTinhTrang(rs.getString("ThoiGianBatDauTinhTrang"));
                        mdXe.setThoiGianKetThucTinhTrang(rs.getString("ThoiGianKetThucTinhTrang"));
                        mdXe.setMaLoaiXe(rs.getString("MaLoaiXe"));
                        mdXe.setBienSoXe(rs.getString("BienSoXe"));
                        
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
            )
        {
            List<modelXe> list = new ArrayList<>();
            try ( ResultSet rs = ptmt.executeQuery()) {
                    while (rs.next()) {
                        modelXe modelXe = new modelXe();
                        fillXe(modelXe, rs);
                        list.add(modelXe);
                    }
                }
            return list;
        }
    }
   
    
    public List<modelXe> showXeRepair() throws ClassNotFoundException, SQLException{
        String sql = "select * from xe where TinhTrangXe = 'sc' ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
            List<modelXe> list = new ArrayList<>();
            try ( ResultSet rs = ptmt.executeQuery()) {
                    while (rs.next()) {
                        modelXe modelXe = new modelXe();
                        fillXe(modelXe, rs);
                        list.add(modelXe);
                    }
                }
            return list;
        }
    }
    
    public List<modelXe> showXeReady() throws ClassNotFoundException, SQLException{
        String sql = "select * from xe where TinhTrangXe = 'ss' ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
            List<modelXe> list = new ArrayList<>();
            try ( ResultSet rs = ptmt.executeQuery()) {
                    while (rs.next()) {
                        modelXe modelXe = new modelXe();
                        fillXe(modelXe, rs);
                        list.add(modelXe);
                    }
                }
            return list;
        }
    }
    
    public List<modelXe> showXeOn() throws ClassNotFoundException, SQLException{
        String sql = "select * from xe where TinhTrangXe = 'thue' ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            )
        {
            List<modelXe> list = new ArrayList<>();
            try ( ResultSet rs = ptmt.executeQuery()) {
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
