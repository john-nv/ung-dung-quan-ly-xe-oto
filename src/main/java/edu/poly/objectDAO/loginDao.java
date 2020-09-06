/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modeLogin;
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
public class loginDao {
    
    public boolean insert(modeLogin mdLogin) throws ClassNotFoundException, SQLException{ 
        String sql = "INSERT INTO [dbo].[login]  (taiKhoang ,matKhau ,chucNang ) VALUES  (?,?,?) "; 
        
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(1, mdLogin.getTaiKhoang());
                psmt.setString(2, mdLogin.getMatKhau());
                psmt.setString(3, mdLogin.getChucNang());
                
                return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean update(modeLogin mdLogin) throws ClassNotFoundException, SQLException{
        String sql = "UPDATE [dbo].[LOGIN] " +
                "   SET [matKhau] = ?" +
                "      ,[chucNang] = ?" +
                "    WHERE [taiKhoang] = ?" ;
        try(
                Connection con = databaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            //add
                psmt.setString(1, mdLogin.getMatKhau());
                psmt.setString(2, mdLogin.getChucNang());
                psmt.setString(3, mdLogin.getTaiKhoang());
                
                return psmt.executeUpdate() > 0;
        }   
    }
    
    public boolean delete(String del) throws ClassNotFoundException, SQLException{
        String sql = "delete from LOGIN where taiKhoang = ? ";
        
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            ptmt.setString(1, del);
            
            return ptmt.executeUpdate() > 0;
        }
    }
    
    public List<modeLogin> showLogin() throws ClassNotFoundException, SQLException{
        String sql = "SELECT * FROM [dbo].[LOGIN]";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            List<modeLogin> list = new ArrayList<>();
            try (ResultSet rs = ptmt.executeQuery()) {
                while (rs.next()) {
                    modeLogin mdLG = new modeLogin();
                    
                    mdLG.setTaiKhoang(rs.getString("taiKhoang"));
                    mdLG.setMatKhau(rs.getString("matKhau"));
                    mdLG.setChucNang(rs.getString("chucNang"));
                    
                    list.add(mdLG);
                }
            }
            return list;
        }
    }
    
    public modeLogin checkLogin(String use, String pass) throws  SQLException, ClassNotFoundException{
        String sql = "select taiKhoang, matKhau, chucnang from LOGIN"
                + " where taiKhoang = ? and matKhau = ? ";
        try (
                Connection con = databaseHelper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);
            ){
            
            ptmt.setString(1, use);
            ptmt.setString(2, pass);
            
            try(ResultSet rs = ptmt.executeQuery()) {
                if (rs.next()) {
                    modeLogin mdLG = new modeLogin();
                    mdLG.setTaiKhoang(use);
                    mdLG.setChucNang("chucnang");
                    return mdLG;
                }  
            } 
        }
        return null;
    }
}
