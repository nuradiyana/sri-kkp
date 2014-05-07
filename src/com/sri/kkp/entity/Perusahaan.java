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
    private String sumberInfo;
    private String jenisUsaha;

    public Perusahaan() {
    }

    public Perusahaan(String kodePerusahaan, String namaPerusahaan, String alamat, String kota, String kodepos, String nomorTelp, String nomorFax, String sumberInfo, String jenisUsaha) {
        this.kodePerusahaan = kodePerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.kota = kota;
        this.kodepos = kodepos;
        this.nomorTelp = nomorTelp;
        this.nomorFax = nomorFax;
        this.sumberInfo = sumberInfo;
        this.jenisUsaha = jenisUsaha;
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

    public String getSumberInfo() {
        return sumberInfo;
    }

    public void setSumberInfo(String sumberInfo) {
        this.sumberInfo = sumberInfo;
    }

    public String getJenisUsaha() {
        return jenisUsaha;
    }

    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }
}
