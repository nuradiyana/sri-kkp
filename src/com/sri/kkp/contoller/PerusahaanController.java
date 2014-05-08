package com.sri.kkp.contoller;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.entity.Perusahaan;
import com.sri.kkp.service.PerusahaanService;
import com.sri.kkp.view.PanelPerusahaan;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PerusahaanController {

    private ConnectionDB cdb;

    public void cancel(PanelPerusahaan panelPerusahaan) {
        reset(panelPerusahaan);
    }

    public void inputPerusahaan(PanelPerusahaan panelPerusahaan) {

        cdb = new ConnectionDB();

        String kodePerusahaan = panelPerusahaan.getTextKodePerusahaan().getText();
        String namaPerusahaan = panelPerusahaan.getTextNamaPerusahaan().getText();
        String alamatPerusahaan = panelPerusahaan.getTextAreaAlamat().getText();
        String kota = panelPerusahaan.getTextKota().getText();
        String kodepos = panelPerusahaan.getTextKodePos().getText();
        String nomorTelp = panelPerusahaan.getTextNomorTelp().getText();
        String nomorFax = panelPerusahaan.getTextNomorFax().getText();
        String jenisUsaha1 = String.valueOf(panelPerusahaan.getComboJenisUsaha().getSelectedItem());
        String sumberData1 = String.valueOf(panelPerusahaan.getComboSumberData().getSelectedItem());
        String jenisUsaha2 = panelPerusahaan.getTextJenisUsaha().getText();
        String sumbeData2 = panelPerusahaan.getTextSumberData().getText();

        if (kodePerusahaan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Kode Perusahaan tidak boleh kosong");
        } else if (namaPerusahaan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Nama Perusahaan tidak boleh kosong");
        } else if (alamatPerusahaan.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Alamat Perusahaan tidak boleh kosong");
        } else if (kota.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Kota Perusahaan tidak boleh kosong");
        } else if (kodepos.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Kode POS Perusahaan tidak boleh kosong");
        } else if (nomorTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(panelPerusahaan, "Nomor Telp Perusahaan tidak boleh kosong");
        } else {
            try {
                Perusahaan p = new Perusahaan();
                p.setKodePerusahaan(kodePerusahaan);
                p.setNamaPerusahaan(namaPerusahaan);
                p.setAlamat(alamatPerusahaan);
                p.setKota(kota);
                p.setKodepos(kodepos);
                p.setNomorTelp(nomorTelp);
                p.setNomorFax(nomorFax);
                p.setJenisUsaha1(jenisUsaha1);
                p.setJenisUsaha2(jenisUsaha2);
                p.setSumberInfo1(sumberData1);
                p.setSumberInfo2(sumbeData2);
                
                PerusahaanService service = new PerusahaanService();
                service.setConnection(cdb);
                service.inputPerusahaan(p);
                JOptionPane.showMessageDialog(panelPerusahaan, "Input succes!");
                reset(panelPerusahaan);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(panelPerusahaan, "Terjadi kesalahan : " + e.getMessage());
            }
        }
    }

    private void reset(PanelPerusahaan panelPerusahaan) {
        panelPerusahaan.getTextKodePerusahaan().setText("");
        panelPerusahaan.getTextNamaPerusahaan().setText("");
        panelPerusahaan.getTextAreaAlamat().setText("");
        panelPerusahaan.getTextKota().setText("");
        panelPerusahaan.getTextKodePos().setText("");
        panelPerusahaan.getTextNomorTelp().setText("");
        panelPerusahaan.getTextNomorFax().setText("");
        panelPerusahaan.getTextJenisUsaha().setText("");
        panelPerusahaan.getTextSumberData().setText("");
    }
}
