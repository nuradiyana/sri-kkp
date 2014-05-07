package com.sri.kkp.entity;
public class Program {
    private int id;
    private String kodeProgram;
    private String jenisProgram;
    private String judulProgram;

    public Program() {
    }

    public Program(String kodeProgram, String jenisProgram, String judulProgram) {
        this.kodeProgram = kodeProgram;
        this.jenisProgram = jenisProgram;
        this.judulProgram = judulProgram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeProgram() {
        return kodeProgram;
    }

    public void setKodeProgram(String kodeProgram) {
        this.kodeProgram = kodeProgram;
    }

    public String getJenisProgram() {
        return jenisProgram;
    }

    public void setJenisProgram(String jenisProgram) {
        this.jenisProgram = jenisProgram;
    }

    public String getJudulProgram() {
        return judulProgram;
    }

    public void setJudulProgram(String judulProgram) {
        this.judulProgram = judulProgram;
    }
    
}
