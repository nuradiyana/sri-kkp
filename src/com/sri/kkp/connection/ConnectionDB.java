package com.sri.kkp.connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionDB {

    private Connection connection;
            
    public Connection getConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("Password12");
        dataSource.setDatabaseName("sridb");
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        
        connection = dataSource.getConnection();
        
        return connection;
    }
}
