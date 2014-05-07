package com.sri.kkp.dao;

import com.sri.kkp.entity.Perusahaan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PerusahaanDao {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String query = "INSERT INTO perusahaan "
            + "(KODE_PERUSAHAAN, NAMA_PERUSAHAAN, ALAMAT, KOTA, KODEPOS, NO_TELP, NO_FAX, SUMBER1, SUMBER2, JENIS1, JENIS2) "
            + "VALUES "
            + "(?,?,?,?,?,?,?,?,?,?,?)";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        preparedStatement = this.connection.prepareStatement(query);
    }
    
    public void inputPerusahaan(Perusahaan p) throws SQLException{
        preparedStatement.setString(1, p.getKodePerusahaan());
        preparedStatement.setString(2, p.getNamaPerusahaan());
        preparedStatement.setString(3, p.getAlamat());
        preparedStatement.setString(4, p.getKota());
        preparedStatement.setString(5, p.getKodepos());
        preparedStatement.setString(6, p.getNomorTelp());
        preparedStatement.setString(7, p.getNomorFax());
        preparedStatement.setString(8, p.getSumberInfo1());
        preparedStatement.setString(9, p.getSumberInfo2());
        preparedStatement.setString(10, p.getJenisUsaha1());
        preparedStatement.setString(11, p.getJenisUsaha2());
        preparedStatement.executeUpdate();
    }
}
