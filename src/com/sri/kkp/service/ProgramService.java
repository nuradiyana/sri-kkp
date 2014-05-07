package com.sri.kkp.service;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.dao.ProgramDao;
import com.sri.kkp.entity.Program;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProgramService {
    private ProgramDao dao;
    private Connection connection;

    public void setConnection(ConnectionDB cdb) throws SQLException {
        connection = cdb.getConnection();
    }
    
    public Program inputProgram(Program p){
        try {
            connection.setAutoCommit(false);
            dao = new ProgramDao();
            dao.setConnection(connection);
            dao.inputProgram(p);
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
