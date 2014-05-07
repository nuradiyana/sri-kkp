package com.sri.kkp.contoller;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.entity.Pelanggan;
import com.sri.kkp.service.PelangganService;
import com.sri.kkp.view.PanelPelanggan;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class PelangganController {

    private ConnectionDB cdb;

    public void inputPelanggan(PanelPelanggan panelPelanggan) {
        cdb = new ConnectionDB();

        String kodePelanggan = panelPelanggan.getTextKodePegawai().getText();
        String namaPelanggan = panelPelanggan.getTextNamaPegawai().getText();
        String jabatan = panelPelanggan.getTextJabatan().getText();
        String email = panelPelanggan.getTextEmail().getText();

        if (kodePelanggan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPelanggan, "Kode Pelanggan tidak boleh kosong !");
        } else if (namaPelanggan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPelanggan, "Nama Pelanggan tidak boleh kosong !");
        } else if (jabatan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPelanggan, "Jabatan tidak boleh kosong !");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPelanggan, "Email tidak boleh kosong !");
        } else {
            try {
                Pelanggan p = new Pelanggan();
                p.setKodePegawai(kodePelanggan);
                p.setNamaPegawai(namaPelanggan);
                p.setJabatanPegawai(jabatan);
                p.setEmailPegawai(email);

                PelangganService service = new PelangganService();
                service.setConnection(cdb);
                service.inputPelanggan(p);
                JOptionPane.showMessageDialog(panelPelanggan, "Input Succes!");
                reset(panelPelanggan);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panelPelanggan, ex.getMessage());
            }
        }
    }
    
    public void cancel(PanelPelanggan panelPelanggan){
        reset(panelPelanggan);
    }

    private void reset(PanelPelanggan panelPelanggan) {
        panelPelanggan.getTextKodePegawai().setText("");
        panelPelanggan.getTextNamaPegawai().setText("");
        panelPelanggan.getTextJabatan().setText("");
        panelPelanggan.getTextEmail().setText("");
    }
}
