package com.sri.kkp.service;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.dao.PelangganDao;
import com.sri.kkp.entity.Pelanggan;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PelangganService {
    private PelangganDao dao;
    private Connection connection;

    public void setConnection(ConnectionDB cdb) throws SQLException {
        connection = cdb.getConnection();
    }
    
    public Pelanggan inputPelanggan(Pelanggan p){
        try {
            connection.setAutoCommit(false);
            dao = new PelangganDao();
            dao.setConnection(connection);
            dao.inputPelanggan(p);
            connection.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                Logger.getLogger(PelangganService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return p;
    }
}
