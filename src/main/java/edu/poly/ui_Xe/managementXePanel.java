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
    private showXePanel showXePanel;
    DefaultTableModel model = null;
    /**
     * Creates new form managementXePannel
     */
    public managementXePanel() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tplXeBoard = new javax.swing.JTabbedPane();
        btnPanelShowXe = new javax.swing.JButton();
        btnPanelUpdaXe = new javax.swing.JButton();
        btnPanelEditXe = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quản lý xe");

        btnPanelShowXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/search1.jpg"))); // NOI18N
        btnPanelShowXe.setText("Tìm kiếm Xe");
        btnPanelShowXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanelShowXeActionPerformed(evt);
            }
        });

        btnPanelUpdaXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/save-20.png"))); // NOI18N
        btnPanelUpdaXe.setText("Thêm Xe");
        btnPanelUpdaXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanelUpdaXeActionPerformed(evt);
            }
        });

        btnPanelEditXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"))); // NOI18N
        btnPanelEditXe.setText("Sửa Xe");
        btnPanelEditXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanelEditXeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tplXeBoard)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 815, Short.MAX_VALUE)
                                .addComponent(btnPanelShowXe)
                                .addGap(18, 18, 18)
                                .addComponent(btnPanelEditXe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPanelUpdaXe)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPanelShowXe)
                        .addComponent(btnPanelUpdaXe)
                        .addComponent(btnPanelEditXe)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplXeBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanelShowXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanelShowXeActionPerformed
        if (showXePanel == null){
            showXePanel = new showXePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/poly/icon/icon/xe-15.jpg"));
            tplXeBoard.addTab("  Quản lý Xe  ", icon  , showXePanel, "  Quản lý Xe  ");
        }
        tplXeBoard.setSelectedComponent(showXePanel);
    }//GEN-LAST:event_btnPanelShowXeActionPerformed

    private void btnPanelUpdaXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanelUpdaXeActionPerformed
        if (AddXePanel == null){
            AddXePanel = new addXePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/poly/icon/icon/edit-20.png"));
            tplXeBoard.addTab(" Thêm Xe  ", icon  , AddXePanel, "  Thêm Xe ");
        }
        tplXeBoard.setSelectedComponent(AddXePanel);
    }//GEN-LAST:event_btnPanelUpdaXeActionPerformed

    private void btnPanelEditXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanelEditXeActionPerformed
        if (editXePanel == null){
            editXePanel = new editXePanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/edu/poly/icon/icon/save-20.png"));
            tplXeBoard.addTab(" Sửa Xe  ", icon  , editXePanel, "  Sửa Xe ");
        }
        tplXeBoard.setSelectedComponent(editXePanel);
    }//GEN-LAST:event_btnPanelEditXeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPanelEditXe;
    private javax.swing.JButton btnPanelShowXe;
    private javax.swing.JButton btnPanelUpdaXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane tplXeBoard;
    // End of variables declaration//GEN-END:variables
}
