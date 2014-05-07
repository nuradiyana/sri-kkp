package com.sri.kkp.entity;
public class Perusahaan {
    private int id;
    private String kodePerusahaan;
    private String namaPerusahaan;
    private String alamat;
    private String kota;
    private String kodepos;
    private String nomorTelp;
    private String nomorFax;
    private String sumberInfo1;
    private String jenisUsaha1;
    private String sumberInfo2;
    private String jenisUsaha2;
    
    public Perusahaan() {
    }

    public Perusahaan(String kodePerusahaan, String namaPerusahaan, String alamat, String kota, String kodepos, String nomorTelp, String nomorFax, String sumberInfo1, String jenisUsaha1, String sumberInfo2, String jenisUsaha2) {
        this.kodePerusahaan = kodePerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.kota = kota;
        this.kodepos = kodepos;
        this.nomorTelp = nomorTelp;
        this.nomorFax = nomorFax;
        this.sumberInfo1 = sumberInfo1;
        this.jenisUsaha1 = jenisUsaha1;
        this.sumberInfo2 = sumberInfo2;
        this.jenisUsaha2 = jenisUsaha2;
    }

    public String getSumberInfo1() {
        return sumberInfo1;
    }

    public void setSumberInfo1(String sumberInfo1) {
        this.sumberInfo1 = sumberInfo1;
    }

    public String getJenisUsaha1() {
        return jenisUsaha1;
    }

    public void setJenisUsaha1(String jenisUsaha1) {
        this.jenisUsaha1 = jenisUsaha1;
    }

    public String getSumberInfo2() {
        return sumberInfo2;
    }

    public void setSumberInfo2(String sumberInfo2) {
        this.sumberInfo2 = sumberInfo2;
    }

    public String getJenisUsaha2() {
        return jenisUsaha2;
    }

    public void setJenisUsaha2(String jenisUsaha2) {
        this.jenisUsaha2 = jenisUsaha2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodePerusahaan() {
        return kodePerusahaan;
    }

    public void setKodePerusahaan(String kodePerusahaan) {
        this.kodePerusahaan = kodePerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public String getNomorFax() {
        return nomorFax;
    }

    public void setNomorFax(String nomorFax) {
        this.nomorFax = nomorFax;
    }
}
