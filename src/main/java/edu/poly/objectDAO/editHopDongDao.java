/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.objectDAO;

import edu.poly.Helper.databaseHelper;
import edu.poly.object.modelHopDong;
import edu.poly.object.modelTien;
import edu.poly.ui.addHopDongPanel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author dinh
 */
public class editHopDongDao {

    public static void setSoLuongXe() {
        ArrayList<String> danhSachLoaiXe = new ArrayList<>();
        String sql1 = "select MaLoaiXe from LOAIXE";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                danhSachLoaiXe.add(rs.getString(1));

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String dslx : danhSachLoaiXe) {
            String sql2 = "update LOAIXE set LOAIXE.SoLuong=(select count (MaLoaiXe) from Xe where TinhTrangXe = N'Sẵn sàng' and MaLoaiXe = ? group by MaLoaiXe) from LOAIXE lx join Xe x on lx.MaLoaiXe = x.MaLoaiXe where lx.MaLoaiXe = ?";
            try {
                Connection con = databaseHelper.openConnection();
                PreparedStatement pstm2 = con.prepareStatement(sql2);
                pstm2.setString(1, dslx);
                pstm2.setString(2, dslx);
                pstm2.executeUpdate();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void setSoLuongPK() {
        ArrayList<String> danhSachLoaiPK = new ArrayList<>();
        String sql1 = "select MaLoaiPK from LOAIPHUKIEN";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                danhSachLoaiPK.add(rs.getString(1));

            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String dslpk : danhSachLoaiPK) {
            String sql2 = "update LOAIPHUKIEN set LOAIPHUKIEN.SoLuong=(select count (MaLoaiPK) from PHUKIEN where TinhTrangPK = N'Sẵn sàng' and MaLoaiPK = ? group by MaLoaiPK) from LOAIPHUKIEN lpk join PHUKIEN pk on lpk.MaLoaiPK = pk.MaLoaiPK where lpk.MaLoaiPK = ?";
            try {
                Connection con = databaseHelper.openConnection();
                PreparedStatement pstm2 = con.prepareStatement(sql2);
                pstm2.setString(1, dslpk);
                pstm2.setString(2, dslpk);
                pstm2.executeUpdate();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public String convertLoaiXeToMaLoaiXe(String loaiXe) {
        String maLoaiXe = null;
        try {
            String sql = "select MaLoaiXe from LOAIXE where TenLoaiXe = ?";
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setNString(1, loaiXe);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                maLoaiXe = rs.getString(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        System.out.println("rs: "+maLoaiXe);
        return maLoaiXe;
    }
//

    public ArrayList convertLoaiPKToMaLoaiPK(DefaultListModel listLoaiPK) {
        ArrayList<String> maLoaiPK = new ArrayList<>();
        String loaiPK = null;
//        System.out.println("list loai PK in convert: " + listLoaiPK);
        for (int i = 0; i < listLoaiPK.getSize(); i++) {
//            System.out.println("loai pk at " + i + ": " + listLoaiPK.getElementAt(i).toString());
            loaiPK = listLoaiPK.getElementAt(i).toString();
            try {
                String sql = "select MaLoaiPK from LOAIPHUKIEN where TenLoaiPK = ?";
                Connection con = databaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
//                System.out.println("Loai PK in convert: " + listLoaiPK);
                pstm.setNString(1, loaiPK);
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    maLoaiPK.add(rs.getString(1));
//                    System.out.println("ma loai PK rs: " + rs.getString(1));
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

//        System.out.println("rs: "+maLoaiXe);
        return maLoaiPK;
    }

    public String convertMaLoaiXeToLoaiXe(String maLoaiXe) {
        String loaiXe = null;
        try {
            String sql = "select TenLoaiXe from LOAIXE where MaLoaiXe = ?";
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maLoaiXe);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                loaiXe = rs.getString(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        System.out.println("rs: "+maLoaiXe);
        return loaiXe;
    }

    public void doiTrangThaiCuaXeThanhChoThue(String maLoaiXe, int maHD) {
        ArrayList<String> danhSachXe = new ArrayList<>();
        String sql1 = "select MaXe from Xe where MaLoaiXe = ? and TinhTrangXe = N'Sẵn sàng'";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            pstm1.setString(1, maLoaiXe);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                danhSachXe.add(rs.getString(1));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        System.out.println(danhSachXe.get(0));
        String sql2 = "update Xe set TinhTrangXe = N'Đang thuê', MaHD=? where MaXe =?";
//        String sql3 = "insert into ChiTietXeThue (MaHD, MaXe) values (?,?)";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm2 = con.prepareStatement(sql2);
//            PreparedStatement pstm3 = con.prepareStatement(sql3);

            pstm2.setString(1, String.valueOf(maHD));
            pstm2.setString(2, danhSachXe.get(0));

//            pstm3.setInt(1, maHD);
//            pstm3.setString(2, danhSachXe.get(0));
            pstm2.executeUpdate();
//            pstm3.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doiTrangThaiCuaXeThanhSanSang(int maHD) {
//        ArrayList<String> danhSachXe = new ArrayList<>();
//        String sql1 = "select MaXe from Xe where MaLoaiXe = ? and TinhTrangXe = N'Đang thuê'";
//        try {
//            Connection con = databaseHelper.openConnection();
//            PreparedStatement pstm1 = con.prepareStatement(sql1);
//            pstm1.setString(1, maLoaiXe);
//            ResultSet rs = pstm1.executeQuery();
//            while (rs.next()) {
//                danhSachXe.add(rs.getString(1));
//            }
//            System.out.println("xe dang thue cuoi cung 11: " + danhSachXe);
//            System.out.println("last index11: " + danhSachXe.get(0));
//            con.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        System.out.println("xe dang thue cuoi cung22: " + danhSachXe);
//        System.out.println("last index22: " + danhSachXe.get(0));
//        System.out.println(danhSachXe.get(0));
        String sql2 = "update Xe set TinhTrangXe = N'Sẵn sàng', MaHD=null where MaHD =?";
//        String sql3 = "insert into ChiTietXeThue (MaHD, MaXe) values (?,?)";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm2 = con.prepareStatement(sql2);
//            PreparedStatement pstm3 = con.prepareStatement(sql3);

            pstm2.setString(1, String.valueOf(maHD));

//            pstm3.setInt(1, maHD);
//            pstm3.setString(2, danhSachXe.get(0));
            pstm2.executeUpdate();
//            pstm3.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertHopDong(modelHopDong hd, modelTien t) {
        String sql1 = "insert into TIEN (MaThanhToan, TienThueXe, TienSuaChua, TongTien, GhiChu) values (?,?,?,?,?)";
        String sql2 = "insert into HOPDONG (MaHD, NgayLap, SoCMND, ThoiGianBatDauHopDong, ThoiGianKetThucHopDong, DiaDiemNhanXe, DiaDiemTraXe, GhiChu, MaLoaiXe, MaLoaiPK, MaThanhToan, DatCoc, TinhTrang) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
                pstm2.setString(10, hd.getMaLoaiPK());
                pstm2.setString(11, hd.getMaTT());
                pstm2.setString(12, hd.getDatCoc());
                pstm2.setString(13, hd.getTinhTrang());

                pstm1.executeUpdate();
                pstm2.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        doiTrangThaiCuaXeThanhChoThue(hd.getMaLoaiXe(), hd.getMaHD());
        doiTrangThaiCuaPKThanhChoThue(hd.getMaLoaiPK(), hd.getMaHD());
    }

    public void updateHopDong(modelHopDong hd, modelTien t, String valueOfCBX) {
        String sql1 = "update TIEN set TienThueXe=?, TienSuaChua=?, TongTien=?, GhiChu=? where MaThanhToan=?";
        String sql2 = "update HOPDONG set NgayLap=?, SoCMND=?, ThoiGianBatDauHopDong=?, ThoiGianKetThucHopDong=?, DiaDiemNhanXe=?, DiaDiemTraXe=?, GhiChu=?, MaLoaiXe=?, MaLoaiPK=?, MaThanhToan=?, DatCoc=?, TinhTrang=? where MaHD=?";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            PreparedStatement pstm2 = con.prepareStatement(sql2);
            try {
                pstm1.setFloat(1, t.getTienThueXe());
                pstm1.setFloat(2, t.getTienSuaChua());
                pstm1.setFloat(3, t.getTongTien());
                pstm1.setString(4, t.getGhiChu());
                pstm1.setString(5, t.getMaTT());

                pstm2.setDate(1, hd.getNgayLap());
                pstm2.setInt(2, hd.getSoCMND());
                pstm2.setDate(3, hd.getThoiGianBatDauHD());
                pstm2.setDate(4, hd.getThoiGianKetThucHD());
                pstm2.setString(5, hd.getDiaDiemNhanXe());
                pstm2.setString(6, hd.getDiaDiemTraXe());
                pstm2.setString(7, hd.getGhiChu());
                pstm2.setString(8, hd.getMaLoaiXe());
                pstm2.setString(9, hd.getMaLoaiPK());
                pstm2.setString(10, hd.getMaTT());
                pstm2.setString(11, hd.getDatCoc());
                pstm2.setString(12, hd.getTinhTrang());
                pstm2.setInt(13, hd.getMaHD());

                pstm1.executeUpdate();
                pstm2.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println("values of CBX1: " + valueOfCBX);
//        System.out.println("values of CBX2: " + hd.getTinhTrang());
        String hoatDong = "Hoạt Động", ketThuc = "Kết Thúc";
        if (valueOfCBX.equals(hoatDong) && hd.getTinhTrang().equals(ketThuc)) {
            doiTrangThaiCuaXeThanhSanSang(hd.getMaHD());
            doiTrangThaiCuaPKThanhSanSang(hd.getMaHD());
        }

    }

    public int xoaHopDong(modelHopDong hd, modelTien t) {
        int temp = 0;
        String sql1 = "delete from TIEN where MaThanhToan=?";
        String sql2 = "delete from HOPDONG where MaHD=?";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            PreparedStatement pstm2 = con.prepareStatement(sql2);
            try {
                pstm1.setString(1, t.getMaTT());
                pstm2.setInt(1, hd.getMaHD());

                pstm2.executeUpdate();
                pstm1.executeUpdate();
                temp = 1;
            } catch (Exception e) {
                e.printStackTrace();
                temp = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            temp = 0;
        }
        doiTrangThaiCuaXeThanhSanSang(hd.getMaHD());
        doiTrangThaiCuaPKThanhSanSang(hd.getMaHD());
        return temp;
    }

    private void doiTrangThaiCuaPKThanhChoThue(String listMaLoaiPK, int maHD) {
//        System.out.println("ma LoaiPK in doi trang thai PK:" + listMaLoaiPK);
        String[] maLoaiPK = listMaLoaiPK.split(",");
//        System.out.println("length: " + maLoaiPK.length);
        ArrayList<String> danhSachPK = new ArrayList<>();
        for (int i = 0; i < maLoaiPK.length; i++) {
            System.out.println("ma LoaiPK: " + i + " " + maLoaiPK[i].trim());

            String sql1 = "select MaPK from PHUKIEN where MaLoaiPK = ? and TinhTrangPK = N'Sẵn sàng'";
            try {
                Connection con = databaseHelper.openConnection();
                PreparedStatement pstm1 = con.prepareStatement(sql1);
                pstm1.setString(1, maLoaiPK[i].trim());
                ResultSet rs = pstm1.executeQuery();
                while (rs.next()) {
                    danhSachPK.add(rs.getString(1));
                }
//                System.out.println("danh sach PK: " + danhSachPK);
//                System.out.println("danh sach PK index 0: " + danhSachPK.get(0));
                String sql2 = "update PHUKIEN set TinhTrangPK = N'Đang thuê', MaHD=? where MaPK =?";
                try {
//                    Connection con = databaseHelper.openConnection();
                    PreparedStatement pstm2 = con.prepareStatement(sql2);

                    pstm2.setString(1, String.valueOf(maHD));
                    pstm2.setString(2, danhSachPK.get(0));

                    pstm2.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                danhSachPK.clear();
//                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    private void doiTrangThaiCuaPKThanhSanSang(int maHD) {
        String sql2 = "update PHUKIEN set TinhTrangPK = N'Sẵn sàng', MaHD=null where MaHD =?";
        try {
            Connection con = databaseHelper.openConnection();
            PreparedStatement pstm2 = con.prepareStatement(sql2);

            pstm2.setString(1, String.valueOf(maHD));

            pstm2.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
