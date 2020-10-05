/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelLoaiXe;
import edu.poly.object.modelXe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANGC
 */
public class loaiXeDao {
    public boolean insert(modelLoaiXe mdLoaiXe) throws ClassNotFoundException, SQLException{
        String sql = "INSERT INTO LoaiXe (MaLoaiXe, TenLoaiXe) VALUES (?,?)";
        
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ) {
            
            ptmt.setString(1, mdLoaiXe.getMaLoaiXe());
            ptmt.setString(2, mdLoaiXe.getTenLoaiXe());
            
            return ptmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(String del) throws ClassNotFoundException, SQLException{
        String sql = "delete from LoaiXe where maLoaiXe = ? ";
        
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            ptmt.setString(1, del);
            
            return ptmt.executeUpdate() > 0;
        }
    }
    
    
    // Lọc tên rồi đưa vào Jtable
    public List<modelLoaiXe> findByMaLoai(String tenMaLoai) throws SQLException, ClassNotFoundException {
        String sql = "SELECT MaLoaiXe,TenLoaiXe FROM LOAIXE where MaLoaiXe like ? ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) {

            ptmt.setString(1, "%" + tenMaLoai + "%");
            List<modelLoaiXe> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelLoaiXe modelLoaiXe = new modelLoaiXe();
                    
                    modelLoaiXe.setMaLoaiXe(rs.getString("MaLoaiXe"));
                    modelLoaiXe.setTenLoaiXe(rs.getString("TenLoaiXe"));
                    
                    list.add(modelLoaiXe);
                }
            }
            return list;
        }
    }
    
    public List<modelLoaiXe> findAllMaLoai() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM LOAIXE  ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) {

            List<modelLoaiXe> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modelLoaiXe modelLoaiXe = new modelLoaiXe();
                    
                    modelLoaiXe.setMaLoaiXe(rs.getString("MaLoaiXe"));
                    modelLoaiXe.setTenLoaiXe(rs.getString("TenLoaiXe"));
                    
                    list.add(modelLoaiXe);
                }
            }
            return list;
        }
    }
    
    
}
