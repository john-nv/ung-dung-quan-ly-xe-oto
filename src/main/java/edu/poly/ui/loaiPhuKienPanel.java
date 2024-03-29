/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.ui;

import edu.poly.Helper.notificationError;
import edu.poly.object.modelLoaiPhuKien;
import edu.poly.objectDAO.editHopDongDao;
import edu.poly.objectDAO.loaiPhuKienDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public final class loaiPhuKienPanel extends javax.swing.JPanel {

    DefaultTableModel tblModel = null;

    /**
     * Creates new form loaiPhuKienPanel
     */
    public loaiPhuKienPanel() {
        initComponents();

        initTable();
        loadDataToTable();
        
        setEnabledTextFieldOFF();
        setEnabledEventOFF();
        setEnabledControlON();
        
        editHopDongDao.setSoLuongXe();
        editHopDongDao.setSoLuongPK();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{
            "Mã loại phụ kiện",
            "Tên loại phụ kiện",
            "Số lượng",});// đặt tiêu đề cho cột
        tblLoaiPhuKien.setModel(tblModel); //set dữ liệu cho bảng
    }

    private void loadDataToTable() {
        try {
            loaiPhuKienDAO dao = new loaiPhuKienDAO();

            List<modelLoaiPhuKien> list = dao.showAllLoaiPhuKien();
            tblModel.setRowCount(0);

            for (modelLoaiPhuKien mdPK : list) {

                tblModel.addRow(new Object[]{
                    mdPK.getMaLoaiPK(),
                    mdPK.getTenLoaiPK(),
                    mdPK.getSoLuong()
                });

                tblModel.fireTableDataChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi !");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtTenPK = new javax.swing.JTextField();
        txtLoaiPK = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnControlAdd = new javax.swing.JButton();
        btnControlUpdate = new javax.swing.JButton();
        btnControlDel = new javax.swing.JButton();
        btnControlCencel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiPhuKien = new javax.swing.JTable();

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel21.setText("Quản lý Loại phụ kiện");

        jLabel2.setText("Chỉnh sửa thông tin loại phụ kiện");

        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyPressed(evt);
            }
        });

        jLabel3.setText("Mã loại phụ kiện :");

        jLabel4.setText("Tên loại phụ kiện :");

        jLabel5.setText("Số lượng :");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"))); // NOI18N
        btnUpdate.setText("Lưu thay đổi");
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/reset-20.png"))); // NOI18N
        btnReset.setText("Tạo mới");
        btnReset.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/save-20.png"))); // NOI18N
        btnSave.setText("Thêm");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/delete-20.png"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bảng điều kiển"));

        btnControlAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/save-20.png"))); // NOI18N
        btnControlAdd.setText("Thêm");
        btnControlAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlAddActionPerformed(evt);
            }
        });

        btnControlUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"))); // NOI18N
        btnControlUpdate.setText("Sửa");
        btnControlUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlUpdateActionPerformed(evt);
            }
        });

        btnControlDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/delete-20.png"))); // NOI18N
        btnControlDel.setText("Xóa");
        btnControlDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlDelActionPerformed(evt);
            }
        });

        btnControlCencel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/huy-18.jpg"))); // NOI18N
        btnControlCencel.setText("Hủy");
        btnControlCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlCencelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(btnControlAdd)
                .addGap(18, 18, 18)
                .addComponent(btnControlUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnControlDel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnControlCencel)
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnControlDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnControlCencel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnControlAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnControlUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        tblLoaiPhuKien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblLoaiPhuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiPhuKienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiPhuKien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel21))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLoaiPK)
                                    .addComponent(txtTenPK)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                .addGap(872, 872, 872))
                            .addComponent(jSeparator3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoaiPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenPK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblLoaiPhuKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiPhuKienMouseClicked
        try {
            txtLoaiPK.setText(String.valueOf(tblLoaiPhuKien.getValueAt(rowSelected(), 0)));
            txtTenPK.setText(String.valueOf(tblLoaiPhuKien.getValueAt(rowSelected(), 1)));
            txtSoLuong.setText(String.valueOf(tblLoaiPhuKien.getValueAt(rowSelected(), 2)));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi ! ");
        }
    }//GEN-LAST:event_tblLoaiPhuKienMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtTenPK.setText("");
        txtTenPK.setBackground(Color.white);
        txtLoaiPK.setText("");
        txtLoaiPK.setBackground(Color.white);
        txtSoLuong.setText("");
        txtSoLuong.setBackground(Color.white);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            //-------------báo lỗi-------------
            StringBuilder sb = new StringBuilder();

            notificationError.DataAvailable(txtTenPK, sb, "Trường số Mã phụ kiện không thể bỏ trống !");
            notificationError.DataAvailable(txtLoaiPK, sb, "Trường Tên phụ kiện không thể bỏ trống !");
            notificationError.DataAvailable(txtSoLuong, sb, "Trường Tên phụ kiện không thể bỏ trống !");

            // Hiển thị thông báo lỗi đã được đặt sẵn
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString());
                return;
            }
            //--------------------------------------------

            int n = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc thêm loại phụ kiện này ?", "Thông báo !", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {

                modelLoaiPhuKien mdLPK = new modelLoaiPhuKien();

                mdLPK.setMaLoaiPK(txtLoaiPK.getText());
                mdLPK.setTenLoaiPK(txtTenPK.getText());
                mdLPK.setSoLuong(Integer.parseInt(txtSoLuong.getText()));

                loaiPhuKienDAO dao = new loaiPhuKienDAO();
                if (dao.insert(mdLPK)) {
                    JOptionPane.showMessageDialog(this, "Thêm loại phụ kiện thàng công !");

                    loadDataToTable();
                    btnResetActionPerformed(evt);
                    setEnabledControlON();
                    setEnabledEventOFF();
                    setEnabledTextFieldOFF();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm loại phụ kiện bại. Vui lòng kiểm tra lại ! !");
                }
            }
            if (n == JOptionPane.NO_OPTION) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi ! ");

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {

            modelLoaiPhuKien mdLPK = new modelLoaiPhuKien();

            mdLPK.setMaLoaiPK(txtLoaiPK.getText());
            mdLPK.setTenLoaiPK(txtTenPK.getText());
            mdLPK.setSoLuong(Integer.parseInt(txtSoLuong.getText()));

            int n = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc cập nhật thông tin loại phụ kiện ?", "Thông báo !", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                loaiPhuKienDAO dao = new loaiPhuKienDAO();
                if (dao.update(mdLPK)) {
                    JOptionPane.showMessageDialog(this, "Cập nhật loại phụ kiện thàng công !");
                    loadDataToTable();
                    btnResetActionPerformed(evt);
                    setEnabledControlON();
                    setEnabledEventOFF();
                    setEnabledTextFieldOFF();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại. Vui lòng kiểm tra lại ! !");
                }
            }
            if (n == JOptionPane.NO_OPTION) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi ! ");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {

            //-------------báo lỗi-------------
            StringBuilder sb = new StringBuilder();

            notificationError.DataAvailable(txtLoaiPK, sb, "Trường Mã loại phụ kiện không thể bỏ trống !");

            // Hiển thị thông báo lỗi đã được đặt sẵn
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString());
                return;
            }
            //--------------------------------------------

            int n = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc chắn muốn xóa, dữ liệu bị xóa đi sẽ không thể khôi phục lại được !",
                    "Thông báo !",
                    JOptionPane.YES_NO_OPTION);

            if (n == JOptionPane.YES_OPTION) {
                try {
                    loaiPhuKienDAO dao = new loaiPhuKienDAO();
                    if (dao.delete(txtLoaiPK.getText())) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        btnResetActionPerformed(evt);
                        setEnabledControlON();
                        setEnabledEventOFF();
                        setEnabledTextFieldOFF();
                        loadDataToTable();
                    } else {
                        txtLoaiPK.setBackground(Color.red);
                        JOptionPane.showMessageDialog(this, "Xóa không thành công ! Vui lòng kiểm tra lại !");
                    }

                } catch (Exception e) {
                    e.printStackTrace(); //show lỗi
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage()); //show lỗi
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi ! ");

        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnControlCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlCencelActionPerformed
        setEnabledEventOFF();
        setEnabledTextFieldOFF();
        setEnabledControlON();
    }//GEN-LAST:event_btnControlCencelActionPerformed

    private void txtSoLuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyPressed
        char c=evt.getKeyChar();
        String checkSoCMND = txtSoLuong.getText();
        int length = checkSoCMND.length();
        if (Character.isLetter(c)) {
            txtSoLuong.setEditable(false);
        }else{
            txtSoLuong.setEditable(true);
        }
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<= '9'){
            if (length<10) {
                txtSoLuong.setEnabled(true);
            }else{
                txtSoLuong.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtSoLuongKeyPressed

    private void btnControlAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlAddActionPerformed
        setEnabledTextFieldON();
        setEnabledControlOFF();
        setEnabledEventOFF();
        btnResetActionPerformed(evt);
        btnReset.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnControlAddActionPerformed

    private void btnControlUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlUpdateActionPerformed
        setEnabledTextFieldON();
        setEnabledControlOFF();
        setEnabledEventOFF();
        btnUpdate.setEnabled(true);
        txtLoaiPK.setEnabled(false);
    }//GEN-LAST:event_btnControlUpdateActionPerformed

    private void btnControlDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlDelActionPerformed
        setEnabledTextFieldON();
        setEnabledControlOFF();
        setEnabledEventOFF();
        btnDel.setEnabled(true);
    }//GEN-LAST:event_btnControlDelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnControlAdd;
    private javax.swing.JButton btnControlCencel;
    private javax.swing.JButton btnControlDel;
    private javax.swing.JButton btnControlUpdate;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblLoaiPhuKien;
    private javax.swing.JTextField txtLoaiPK;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenPK;
    // End of variables declaration//GEN-END:variables

    public int rowSelected() {
        int row = tblLoaiPhuKien.getSelectedRow();
        return row;
    }
    
    public void setEnabledTextFieldON(){
        txtLoaiPK.setEnabled(true);
        txtSoLuong.setEnabled(true);
        txtTenPK.setEnabled(true);
    }
    
    public void setEnabledTextFieldOFF(){
        txtLoaiPK.setEnabled(false);
        txtSoLuong.setEnabled(false);
        txtTenPK.setEnabled(false);
    }
    
    public void setEnabledEventON(){
        btnReset.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDel.setEnabled(true);
    }
    
    public void setEnabledEventOFF(){
        btnReset.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDel.setEnabled(false);
    }
    
    public void setEnabledControlON(){
        btnControlAdd.setEnabled(true);
        btnControlDel.setEnabled(true);
        btnControlUpdate.setEnabled(true);
    }
    
    public void setEnabledControlOFF(){
        btnControlAdd.setEnabled(false);
        btnControlDel.setEnabled(false);
        btnControlUpdate.setEnabled(false);
    }
}
