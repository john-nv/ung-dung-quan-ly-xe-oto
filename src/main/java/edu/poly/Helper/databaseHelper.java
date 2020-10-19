/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author QUANGC
 */
public class databaseHelper {
    public static Connection openConnection() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://DINH-PC\\SQLEXPRESS:1433;database=QuanLyChoThueXe;useUnicode=true;characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(connectionUrl, "sa", "123456");

        return con;

    }
    
}
