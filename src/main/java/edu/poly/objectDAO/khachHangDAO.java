/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelKhachHang;
import edu.poly.object.modelXe;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANGC
 */
public class khachHangDAO {
    public boolean insert(modelKhachHang mdKH) throws ClassNotFoundException, SQLException{ 
        String sql = "INSERT INTO [dbo].[khachhang]  (soCMND ,HoTen ,NamSinh ,SoGPLX ,GhiChu) VALUES  (?,?,?,?,?) "; 
        
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(2, mdKH.getHoTen());
                psmt.setDate(3, mdKH.getNamSinh());
                psmt.setInt(1, mdKH.getSoCMND());
                psmt.setInt(4, mdKH.getSoGPLX());
                psmt.setString(5, mdKH.getGhiChu());
                
                return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(modelKhachHang mdKH) throws ClassNotFoundException, SQLException{
        String sql = "UPDATE [dbo].[KHACHHANG] " +
                "   SET [HoTen] = ?" +
                "      ,[NamSinh] = ?" +
                "      ,[SoGPLX] = ?" +
                "      ,[GhiChu] = ?" +
                "    WHERE [SoCMND] = ?" ;
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(1, mdKH.getHoTen());
                psmt.setDate(2, mdKH.getNamSinh());
                psmt.setInt(3, mdKH.getSoGPLX());
                psmt.setString(4, mdKH.getGhiChu());
                psmt.setInt(5, mdKH.getSoCMND());
                
                return psmt.executeUpdate() > 0;
        }   
    }
    
    public boolean delete(modelKhachHang mdKH) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM [dbo].[KHACHHANG]  WHERE SoCMND = ?" ;
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setInt(1, mdKH.getSoCMND());
                
                return psmt.executeUpdate() > 0;
        }   
    }
    
    public List<modelKhachHang> showAllKhachHang() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM [dbo].[KHACHHANG]";
       try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            List<modelKhachHang> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelKhachHang modelKH = new modelKhachHang();
                    
                    modelKH.setSoCMND(rs.getInt("SoCMND"));
                    modelKH.setHoTen(rs.getString("HoTen"));
                    modelKH.setSoGPLX(rs.getInt("SoGPLX"));
                    modelKH.setNamSinh(rs.getDate("NamSinh"));
                    modelKH.setGhiChu(rs.getString("GhiChu"));
                    
                    list.add(modelKH);
                }
            }
            return list;
        }
    }
    
//    public modelKhachHang showKHbyCMND(String soCMND) throws ClassNotFoundException, SQLException{
//        String sql = "SELECT * FROM [dbo].[KHACHHANG] where MaXe like ?";
//       try (
//                Connection con = databaseHelper.openConnection();
//                PreparedStatement ptmt = con.prepareStatement(sql);
//            ){
//           ptmt.setString(1, soCMND);
//            
//            try (ResultSet rs = ptmt.executeQuery()) {
//                if (rs.next()) {
//                    modelKhachHang mdKH = new modelKhachHang();
//                    mdKH.setSoCMND(rs.getInt("SoCMND"));
//                    mdKH.setHoTen(rs.getString("HoTen"));
//                    mdKH.setSoGPLX(rs.getInt("SoGPLX"));
//                    mdKH.setNamSinh(rs.getDate("NamSinh"));
//                    mdKH.setGhiChu(rs.getString("GhiChu"));
//
//                    return mdKH;
//                }
//            }
//            return null;
//        }
//    }
    
    
    
}
