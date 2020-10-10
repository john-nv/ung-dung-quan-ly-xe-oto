/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelLoaiPhuKien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class loaiPhuKienDAO {
    public boolean insert(modelLoaiPhuKien mdLPK) throws ClassNotFoundException, SQLException{ 
        
        String sql = "INSERT INTO [dbo].[LOAIPHUKIEN] (MaLoaiPK, TenLoaiPK ,SoLuong)" +
                    " VALUES (?,?,?) "; 
        
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(1, mdLPK.getMaLoaiPK());
                psmt.setString(2, mdLPK.getTenLoaiPK());
                psmt.setInt(3, mdLPK.getSoLuong());
                
                
                return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(modelLoaiPhuKien mdLPK) throws SQLException, ClassNotFoundException {
            
            String sql = "UPDATE [dbo].[LOAIPHUKIEN]" +
                        "   SET [TenLoaiPK] = ?" +
                        "      ,[SoLuong] = ?" +
                        " WHERE [MaLoaiPK] = ?";
            
             try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);) {

            // thêm dữ liệu 
            try {
                psmt.setString(1, mdLPK.getTenLoaiPK());
                psmt.setInt(2, mdLPK.getSoLuong());
                psmt.setString(3, mdLPK.getMaLoaiPK());
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String delLPK) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM [dbo].[LOAIPHUKIEN] WHERE [MaLoaiPK] = ? ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
                psmt.setString(1, delLPK);

                return psmt.executeUpdate() > 0;
        }
    }
    
    public List<modelLoaiPhuKien> showAllLoaiPhuKien() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM [dbo].[LOAIPHUKIEN]";
       try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            List<modelLoaiPhuKien> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelLoaiPhuKien mdLPK = new modelLoaiPhuKien();
                    
                    mdLPK.setMaLoaiPK(rs.getString("MaLoaiPK"));
                    mdLPK.setTenLoaiPK(rs.getString("TenLoaiPK"));
                    mdLPK.setSoLuong(rs.getInt("SoLuong"));
                    
                    list.add(mdLPK);
                }
            }
            return list;
        }
    }
}
