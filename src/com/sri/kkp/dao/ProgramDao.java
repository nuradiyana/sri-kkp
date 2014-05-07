package com.sri.kkp.dao;

import com.sri.kkp.entity.Program;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramDao {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private final String query = "INSERT INTO program "
            + "(KODE_PROGRAM, JENIS_PROGRAM, JUDUL_PROGRAM) "
            + "VALUES "
            + "(?,?,?)";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        preparedStatement = this.connection.prepareStatement(query);
    }
    
    public void inputProgram(Program p) throws SQLException{
        preparedStatement.setString(1, p.getKodeProgram());
        preparedStatement.setString(2, p.getJenisProgram());
        preparedStatement.setString(3, p.getJudulProgram());
        preparedStatement.executeUpdate();
    }
}
