package com.sri.kkp;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.dao.UserDao;
import com.sri.kkp.entity.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ConnectionDB con = new ConnectionDB();
        Connection connection;
        
        boolean login = false;
        
        try {
            connection = con.getConnection();

            User user = new User();
            user.setUsername("Test");
            user.setPassword("b59c67bf196a4758191e42f76670ceba");

            UserDao dao = new UserDao();
            dao.setConnection(connection);
            login = dao.loginUser(user);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (login == true) {
            System.out.print("Login Success!!");
        } else {
            System.out.print("Login Gagal!!");
        }
    }

}
