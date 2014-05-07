package com.sri.kkp.dao;

import com.sri.kkp.entity.Pelanggan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PelangganDao {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String query = "INSERT INTO pelanggan "
            + "(KODE_PEGAWAI, NAMA_PEGAWAI, JABATAN, EMAIL)"
            + "VALUES"
            + "(?,?,?,?)";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        preparedStatement = this.connection.prepareStatement(query);
    }
    
    public void inputPelanggan(Pelanggan p) throws SQLException{
        preparedStatement.setString(1, p.getKodePegawai());
        preparedStatement.setString(2, p.getNamaPegawai());
        preparedStatement.setString(3, p.getJabatanPegawai());
        preparedStatement.setString(4, p.getEmailPegawai());
        preparedStatement.executeUpdate();
    }
}
