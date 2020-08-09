/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.ui_Xe;

import edu.poly.model.xe.dao.xeDao;
import edu.poly.model.xe.modelXe;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author QUANGC
 */
public class managementXePanel extends javax.swing.JPanel {
    private addXePanel AddXePanel;
    private editXePanel editXePanel;
    DefaultTableModel model = null;
    /**
     * Creates new form managementXePannel
     */
    public managementXePanel() {
        initComponents();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
            "Mã xe",
            "Tên xe",
            "Số khung",
            "Số máy",
            "Mã lực",
            "Hãng",
            "Số chỗ",
            "Giá thuê xe theo giờ",
            "Giá thue xe theo ngày",
            "Giá thuê xe theo tháng",
            "Tiền phạt",
            "Tình trạng xe",
            "Thời gian bắt đầu tình trạng",
            "Thời gian kết thúc tình trạng",
            "Mã loại xe",
            "Biển số xe"
        });// đặt tiêu đề cho cột
        tblSearchXe.setModel(model); //set dữ liệu cho bảng
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchXe = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDeteleMaXe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDeleteXoaXe = new javax.swing.JButton();
        btnResetDeleteXe = new javax.swing.JButton();
        txtSeachXe_tenXe = new javax.swing.JTextField();
        btnSearchXe_tenXea = new javax.swing.JButton();
        btnShowAllXe = new javax.swing.JButton();
        btnXeRepair = new javax.swing.JButton();
        btnShowReady = new javax.swing.JButton();
        btnShowXeOn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tblMenuXe = new javax.swing.JTabbedPane();
        jLabel21 = new javax.swing.JLabel();
        btnEditXe = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        btnAddXe = new javax.swing.JButton();

        tblSearchXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Xe", "Tên xe", "Số khung", "Số máy", "Phân khối", "Hãng", "Tg bắt đầu tình trạng", "Tg kết thúc tình trạng", "Tình trạng xe", "Số chỗ", "Giá thuê giờ", "Giá thuê ngày", "Giá thuê tháng", "Tiền phạt trễ ngày", "Mã loại xe", "Biển số xe"
            }
        ));
        jScrollPane1.setViewportView(tblSearchXe);

        jLabel2.setText("Tìm xe theo tên xe  : ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Xóa xe"));

        jLabel3.setText("Mã xe :");

        btnDeleteXoaXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/delete-20.png"))); // NOI18N
        btnDeleteXoaXe.setText("Xóa xe");
        btnDeleteXoaXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteXoaXeActionPerformed(evt);
            }
        });

        btnResetDeleteXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/reset-20.png"))); // NOI18N
        btnResetDeleteXe.setText("Đặt lại");
        btnResetDeleteXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDeleteXeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeteleMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnDeleteXoaXe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetDeleteXe)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeteleMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetDeleteXe)
                    .addComponent(btnDeleteXoaXe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchXe_tenXea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/search1.jpg"))); // NOI18N
        btnSearchXe_tenXea.setText("Tìm");
        btnSearchXe_tenXea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchXe_tenXeaActionPerformed(evt);
            }
        });

        btnShowAllXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/allxe.png"))); // NOI18N
        btnShowAllXe.setText("Tất cả các xe");
        btnShowAllXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllXeActionPerformed(evt);
            }
        });

        btnXeRepair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/sc.png"))); // NOI18N
        btnXeRepair.setText("Xe đang sửa chữa");
        btnXeRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXeRepairActionPerformed(evt);
            }
        });

        btnShowReady.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/ss.png"))); // NOI18N
        btnShowReady.setText("Xe sẵng sàng");
        btnShowReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowReadyActionPerformed(evt);
            }
        });

        btnShowXeOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/chothue.png"))); // NOI18N
        btnShowXeOn.setText("Xe đang cho thuê");
        btnShowXeOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowXeOnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quản lý xe");

        tblMenuXe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setText("Sửa thông tin xe :");

        btnEditXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"))); // NOI18N
        btnEditXe.setText("Sửa");
        btnEditXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditXeActionPerformed(evt);
            }
        });

        jLabel22.setText("Thêm xe :");

        btnAddXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"))); // NOI18N
        btnAddXe.setText("Sửa");
        btnAddXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddXeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(666, 666, 666))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSeachXe_tenXe, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchXe_tenXea, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowAllXe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowReady, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowXeOn)
                .addGap(18, 18, 18)
                .addComponent(btnXeRepair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblMenuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel21)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel22))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEditXe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddXe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSeachXe_tenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchXe_tenXea)
                    .addComponent(btnShowXeOn)
                    .addComponent(btnXeRepair)
                    .addComponent(btnShowReady)
                    .addComponent(btnShowAllXe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblMenuXe, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditXe, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddXe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditXeActionPerformed
        if (editXePanel == null){
            editXePanel = new editXePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"));
            tblMenuXe.addTab(" Sửa Xe  ", icon  , editXePanel, "  Sửa Xe ");
        }
        tblMenuXe.setSelectedComponent(editXePanel);
    }//GEN-LAST:event_btnEditXeActionPerformed

    private void btnDeleteXoaXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteXoaXeActionPerformed

        int n =  JOptionPane.showConfirmDialog(this,
            "Bạn có chắc chắn muốn xóa, dữ liệu bị xóa đi sẽ không thể khôi phục lại được !",
            "Thông báo !",
            JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION) {
            try {
                xeDao dao = new xeDao();
                if (dao.delete(txtDeteleMaXe.getText())) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                }else{
                    txtDeteleMaXe.setBackground(Color.red);
                    JOptionPane.showMessageDialog(this, "Xóa không thành công ! Vui lòng kiểm tra lại !");
                }

            } catch (Exception e) {
                e.printStackTrace(); //show lỗi
                JOptionPane.showMessageDialog(this, "Error: "+ e.getMessage()); //show lỗi
            }
        }

    }//GEN-LAST:event_btnDeleteXoaXeActionPerformed

    private void btnResetDeleteXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDeleteXeActionPerformed
        try {
            txtDeteleMaXe.setText("");
            txtDeteleMaXe.setBackground(Color.WHITE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnResetDeleteXeActionPerformed

    private void btnSearchXe_tenXeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchXe_tenXeaActionPerformed
        try {
            xeDao dao = new xeDao();

            List<modelXe> list = dao.findByName(txtSeachXe_tenXe.getText());
            model.setRowCount(0);

            if (list.size()>0) {
                for (modelXe mdXe : list) {

                    model.addRow(new Object[]{
                        mdXe.getMaXe(),
                        mdXe.getTenXe(),
                        mdXe.getSoKhung(),
                        mdXe.getSoMay(),
                        mdXe.getMaLuc(),
                        mdXe.getHang(),
                        mdXe.getSoCho(),
                        mdXe.getGiaThueXeTheoGio(),
                        mdXe.getGiaThueXeTheoNgay(),
                        mdXe.getGiaThueXeTheoThang(),
                        mdXe.getTienPhat(),
                        mdXe.getTinhTrangXe(),
                        mdXe.getThoiGianBatDauTinhTrang(),
                        mdXe.getThoiGianKetThucTinhTrang(),
                        mdXe.getMaLoaiXe(),
                        mdXe.getBienSoXe()

                    });
                }
                model.fireTableDataChanged(); // cập nhật toàn bộ dữ liệu bảng (chỉ dữ liệu của bảng)
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); // show lỗi
            
        }

//        try {
//            xeDao dao = new xeDao();
//            List<modelXe> list = dao.findByName(txtSeachXe_tenXe.getText());
//            model.setRowCount(0);
//                    
//                    
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Looix");
//        }
    }//GEN-LAST:event_btnSearchXe_tenXeaActionPerformed

    private void btnShowAllXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllXeActionPerformed
        try {
            xeDao dao = new xeDao();

            List<modelXe> list = dao.showAllXe();
            model.setRowCount(0);

            for (modelXe mdXe : list) {
                model.addRow(new Object[]{
                    mdXe.getMaXe(),
                    mdXe.getTenXe(),
                    mdXe.getSoKhung(),
                    mdXe.getSoMay(),
                    mdXe.getMaLuc(),
                    mdXe.getHang(),
                    mdXe.getSoCho(),
                    mdXe.getGiaThueXeTheoGio(),
                    mdXe.getGiaThueXeTheoNgay(),
                    mdXe.getGiaThueXeTheoThang(),
                    mdXe.getTienPhat(),
                    mdXe.getTinhTrangXe(),
                    mdXe.getThoiGianBatDauTinhTrang(),
                    mdXe.getThoiGianKetThucTinhTrang(),
                    mdXe.getMaLoaiXe(),
                    mdXe.getBienSoXe()
                });
            }
            model.fireTableDataChanged(); // cập nhật toàn bộ dữ liệu bảng (chỉ dữ liệu của bảng)

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); // show lỗi
        }
    }//GEN-LAST:event_btnShowAllXeActionPerformed

    private void btnXeRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXeRepairActionPerformed
        try {
            xeDao dao = new xeDao();

            List<modelXe> list = dao.showXeRepair();
            model.setRowCount(0);

            for (modelXe mdXe : list) {
                model.addRow(new Object[]{
                    mdXe.getMaXe(),
                    mdXe.getTenXe(),
                    mdXe.getSoKhung(),
                    mdXe.getSoMay(),
                    mdXe.getMaLuc(),
                    mdXe.getHang(),
                    mdXe.getSoCho(),
                    mdXe.getGiaThueXeTheoGio(),
                    mdXe.getGiaThueXeTheoNgay(),
                    mdXe.getGiaThueXeTheoThang(),
                    mdXe.getTienPhat(),
                    mdXe.getTinhTrangXe(),
                    mdXe.getThoiGianBatDauTinhTrang(),
                    mdXe.getThoiGianKetThucTinhTrang(),
                    mdXe.getMaLoaiXe(),
                    mdXe.getBienSoXe()
                });
            }
            model.fireTableDataChanged(); // cập nhật toàn bộ dữ liệu bảng (chỉ dữ liệu của bảng)
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXeRepairActionPerformed

    private void btnShowReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowReadyActionPerformed
        try {
            xeDao dao = new xeDao();

            List<modelXe> list = dao.showXeReady();
            model.setRowCount(0);

            for (modelXe mdXe : list) {
                model.addRow(new Object[]{
                    mdXe.getMaXe(),
                    mdXe.getTenXe(),
                    mdXe.getSoKhung(),
                    mdXe.getSoMay(),
                    mdXe.getMaLuc(),
                    mdXe.getHang(),
                    mdXe.getSoCho(),
                    mdXe.getGiaThueXeTheoGio(),
                    mdXe.getGiaThueXeTheoNgay(),
                    mdXe.getGiaThueXeTheoThang(),
                    mdXe.getTienPhat(),
                    mdXe.getTinhTrangXe(),
                    mdXe.getThoiGianBatDauTinhTrang(),
                    mdXe.getThoiGianKetThucTinhTrang(),
                    mdXe.getMaLoaiXe(),
                    mdXe.getBienSoXe()
                });
            }
            model.fireTableDataChanged(); // cập nhật toàn bộ dữ liệu bảng (chỉ dữ liệu của bảng)

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); // show lỗi
        }

    }//GEN-LAST:event_btnShowReadyActionPerformed

    private void btnShowXeOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowXeOnActionPerformed
        try {
            xeDao dao = new xeDao();

            List<modelXe> list = dao.showXeOn();
            model.setRowCount(0);

            for (modelXe mdXe : list) {
                model.addRow(new Object[]{
                    mdXe.getMaXe(),
                    mdXe.getTenXe(),
                    mdXe.getSoKhung(),
                    mdXe.getSoMay(),
                    mdXe.getMaLuc(),
                    mdXe.getHang(),
                    mdXe.getSoCho(),
                    mdXe.getGiaThueXeTheoGio(),
                    mdXe.getGiaThueXeTheoNgay(),
                    mdXe.getGiaThueXeTheoThang(),
                    mdXe.getTienPhat(),
                    mdXe.getTinhTrangXe(),
                    mdXe.getThoiGianBatDauTinhTrang(),
                    mdXe.getThoiGianKetThucTinhTrang(),
                    mdXe.getMaLoaiXe(),
                    mdXe.getBienSoXe()
                });
            }
            model.fireTableDataChanged(); // cập nhật toàn bộ dữ liệu bảng (chỉ dữ liệu của bảng)

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); // show lỗi
        }
    }//GEN-LAST:event_btnShowXeOnActionPerformed

    private void btnAddXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddXeActionPerformed
        if (AddXePanel == null){
            AddXePanel = new addXePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"));
            tblMenuXe.addTab(" Thêm Xe  ", icon  , AddXePanel, "  Thêm Xe ");
        }
        tblMenuXe.setSelectedComponent(AddXePanel);
    }//GEN-LAST:event_btnAddXeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddXe;
    private javax.swing.JButton btnDeleteXoaXe;
    private javax.swing.JButton btnEditXe;
    private javax.swing.JButton btnResetDeleteXe;
    private javax.swing.JButton btnSearchXe_tenXea;
    private javax.swing.JButton btnShowAllXe;
    private javax.swing.JButton btnShowReady;
    private javax.swing.JButton btnShowXeOn;
    private javax.swing.JButton btnXeRepair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane tblMenuXe;
    private javax.swing.JTable tblSearchXe;
    private javax.swing.JTextField txtDeteleMaXe;
    private javax.swing.JTextField txtSeachXe_tenXe;
    // End of variables declaration//GEN-END:variables
}
