
package com.sri.kkp.service;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.dao.PerusahaanDao;
import com.sri.kkp.entity.Perusahaan;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PerusahaanService {
    private PerusahaanDao dao;
    private Connection connection;

    public void setConnection(ConnectionDB cdb) throws SQLException {
        connection = cdb.getConnection();
    }
    
    public Perusahaan inputPerusahaan(Perusahaan p){
        try {
            connection.setAutoCommit(false);
            dao = new PerusahaanDao();
            dao.setConnection(connection);
            dao.inputPerusahaan(p);
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(PerusahaanService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return p;
    }    
}
