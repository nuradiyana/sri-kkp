package com.sri.kkp.contoller;

import com.sri.kkp.connection.ConnectionDB;
import com.sri.kkp.dao.UserDao;
import com.sri.kkp.entity.User;
import com.sri.kkp.view.App;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserController {

    private Connection connection;

    public void loginController(App app) {
        ConnectionDB con = new ConnectionDB();
        String username = app.getTextUsername().getText();
        String password = String.valueOf(app.getTextPassword().getPassword());

        if (!username.trim().equals("") && !password.trim().equals("")) {

            boolean login = false;

            try {
                connection = con.getConnection();
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);

                UserDao dao = new UserDao();
                dao.setConnection(connection);
                login = dao.loginUser(user);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(app, e.getMessage());
            }

            if (login == true) {
                app.showPanel("panelPerusahaan");
                app.getMenuPelanggan().setEnabled(true);
                app.getMenuPerusahaan().setEnabled(true);
                app.getMenuProgram().setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(app, "Username atau password salah !");
                reset(app);
            }
        } else {
            JOptionPane.showMessageDialog(app, "Mohon isi username dan password !");
            reset(app);
        }
    }

    private void reset(App app) {
        app.getTextUsername().setText("");
        app.getTextPassword().setText("");
    }
}

