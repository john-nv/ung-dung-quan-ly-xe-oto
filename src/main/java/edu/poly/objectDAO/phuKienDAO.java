/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelKhachHang;
import edu.poly.object.modelPhuKien;
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
public class phuKienDAO {
    public boolean insert(modelPhuKien mdPK) throws ClassNotFoundException, SQLException{ 
        
        String sql = "INSERT INTO [dbo].[PHUKIEN] (MaPK, TenPK ,TinhTrangPK ,ThoiGianBatDauTinhTrang ,ThoiGianKetThucTinhTrang ,MaLoaiPK)" +
                    " VALUES (?,?,?,?,?,?) "; 
        
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(1, mdPK.getMaPK());
                psmt.setString(2, mdPK.getTenPK());
                psmt.setString(3, mdPK.getTinhTrangPK());
                psmt.setDate(4, mdPK.getTimeStartPK());
                psmt.setDate(5, mdPK.getTimeEndPK());
                psmt.setString(6, mdPK.getMaLoaiPK());
                
                return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(modelPhuKien mdPK) throws SQLException, ClassNotFoundException {
            
            String sql = "UPDATE [dbo].[PHUKIEN]" +
                        "   SET [TenPK] = ?" +
                        "      ,[TinhTrangPK] = ?" +
                        "      ,[ThoiGianBatDauTinhTrang] = ?" +
                        "      ,[ThoiGianKetThucTinhTrang] = ?" +
                        "      ,[MaLoaiPK] = ?" +
                        " WHERE [MaPK] = ?";
            
             try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);) {

            // thêm dữ liệu 
            try {
                psmt.setString(1, mdPK.getTenPK());
                psmt.setString(2, mdPK.getTinhTrangPK());
                psmt.setDate(3, mdPK.getTimeStartPK());
                psmt.setDate(4, mdPK.getTimeEndPK());
                psmt.setString(5, mdPK.getMaLoaiPK());
                psmt.setString(1, mdPK.getMaPK());
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String delPK) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM [dbo].[PHUKIEN] WHERE maXe = [MaPK] ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
                psmt.setString(1, delPK);

                return psmt.executeUpdate() > 0;
        }
    }
    
    public List<modelPhuKien> showAllPhuKien() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM [dbo].[PHUKIEN]";
       try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            List<modelPhuKien> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelPhuKien mdPK = new modelPhuKien();
                    
                    mdPK.setMaPK(rs.getString("MaPK"));
                    mdPK.setTenPK(rs.getString("TenPK"));
                    mdPK.setMaLoaiPK(rs.getString("TinhTrangPK"));
                    mdPK.setTimeEndPK(rs.getDate("ThoiGianBatDauTinhTrang"));
                    mdPK.setTimeStartPK(rs.getDate("ThoiGianKetThucTinhTrang"));
                    mdPK.setTinhTrangPK(rs.getString("MaLoaiPK"));
                    
                    list.add(mdPK);
                }
            }
            return list;
        }
    }
    
}
