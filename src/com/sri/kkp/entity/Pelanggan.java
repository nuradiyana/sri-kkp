package com.sri.kkp.entity;
public class Pelanggan {
    private int id;
    private String kodePegawai;
    private String namaPegawai;
    private String jabatanPegawai;
    private String emailPegawai;

    public Pelanggan() {
    }

    public Pelanggan(String kodePegawai, String namaPegawai, String jabatanPegawai, String emailPegawai) {
        this.kodePegawai = kodePegawai;
        this.namaPegawai = namaPegawai;
        this.jabatanPegawai = jabatanPegawai;
        this.emailPegawai = emailPegawai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodePegawai() {
        return kodePegawai;
    }

    public void setKodePegawai(String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getJabatanPegawai() {
        return jabatanPegawai;
    }

    public void setJabatanPegawai(String jabatanPegawai) {
        this.jabatanPegawai = jabatanPegawai;
    }

    public String getEmailPegawai() {
        return emailPegawai;
    }

    public void setEmailPegawai(String emailPegawai) {
        this.emailPegawai = emailPegawai;
    }
    
}
