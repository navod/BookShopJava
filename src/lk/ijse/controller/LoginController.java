/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.model.Login;
import lk.ijse.model.SignUp;

/**
 *
 * @author kushantha
 */
public class LoginController {

    public boolean checkLogin(String username, String password) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from users where username = ? and password = ? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
        ResultSet set = pstm.executeQuery();
        boolean datafound;
        return datafound = set.next();

    }

    public String getLastId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select user_id from users order by user_id desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("user_id");
        }
        return null;
    }

    public boolean addedUser(SignUp sign) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "insert into users values (?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, sign.getUserId());
        pstm.setString(2, sign.getUserName());
        pstm.setString(3, sign.getPassword());
        pstm.setString(4, sign.getRole());
        pstm.setString(5, sign.getGender());

        return pstm.executeUpdate() > 0;
    }

    public String searchUserId(String userId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select user_id from users where username = ? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, userId);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getString("user_id");
        }
        return null;
    }

        public String checkRole(String username,String passord) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select role from users where username = ? and password = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, passord);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getString("role");
        }
        return null;
    }
}
