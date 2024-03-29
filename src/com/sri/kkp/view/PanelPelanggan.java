/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sri.kkp.view;

import com.sri.kkp.contoller.PelangganController;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author KNO1300457
 */
public class PanelPelanggan extends javax.swing.JPanel {
    
    private PelangganController controller;
    
    /**
     * Creates new form PanelPelanggan
     */
    public PanelPelanggan() {
        initComponents();
        controller = new PelangganController();
    }

    public JTextField getTextEmail() {
        return textEmail;
    }

    public JTextField getTextJabatan() {
        return textJabatan;
    }

    public JTextField getTextKodePegawai() {
        return textKodePegawai;
    }

    public JTextField getTextNamaPegawai() {
        return textNamaPegawai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelJudul = new javax.swing.JLabel();
        labelKodePegawai = new javax.swing.JLabel();
        labelNamaPegawai = new javax.swing.JLabel();
        labelJabatan = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textKodePegawai = new javax.swing.JTextField();
        textNamaPegawai = new javax.swing.JTextField();
        textJabatan = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        labelJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("INPUT DATA PELANGGAN");

        labelKodePegawai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelKodePegawai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelKodePegawai.setText("Kode Pegawai :");

        labelNamaPegawai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNamaPegawai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNamaPegawai.setText("Nama Pegawai :");

        labelJabatan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelJabatan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelJabatan.setText("Jabatan :");

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("Email :");

        textKodePegawai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textNamaPegawai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textJabatan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNamaPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelKodePegawai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNamaPegawai)
                            .addComponent(textJabatan)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textKodePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 199, Short.MAX_VALUE))
                            .addComponent(textEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSave)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodePegawai)
                    .addComponent(textKodePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaPegawai)
                    .addComponent(textNamaPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJabatan)
                    .addComponent(textJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        controller.inputPelanggan(this);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
        controller.cancel(this);
    }//GEN-LAST:event_buttonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelJabatan;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKodePegawai;
    private javax.swing.JLabel labelNamaPegawai;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textJabatan;
    private javax.swing.JTextField textKodePegawai;
    private javax.swing.JTextField textNamaPegawai;
    // End of variables declaration//GEN-END:variables
}
