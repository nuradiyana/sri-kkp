package com.sri.kkp.entity;
public class User {
    private int id;
    private String namaLengkap;
    private String username;
    private String password;

    public User() {
    }

    public User(String namaLengkap, String username, String password) {
        this.namaLengkap = namaLengkap;
        this.username = username;
        this.password = password;
    }
    
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
