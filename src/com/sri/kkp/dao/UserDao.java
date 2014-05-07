package com.sri.kkp.dao;

import com.sri.kkp.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private Connection connection;
    private PreparedStatement login;
    private final String loginQuery = "SELECT * FROM user WHERE USERNAME=? AND PASSWORD =?";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        login = this.connection.prepareStatement(loginQuery);
    }
    
    public boolean loginUser(User user) throws SQLException{        
        login.setString(1, user.getUsername());
        login.setString(2, user.getPassword());
        
        ResultSet result = login.executeQuery();
        
        if(result.next()){
            return true;
        } else {
            return false;
        }
    }
}
