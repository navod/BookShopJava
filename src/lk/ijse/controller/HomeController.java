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
import lk.ijse.bookshop.DB.DBConnection;

/**
 *
 * @author kushantha
 */
public class HomeController {

    public int getAllItem() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select count(item_id) from invoicedetail ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getInt(1);
        }
        return 0;
    }

    public int getAllOrders() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select count(order_id) from orders";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getInt(1);
        }
        return 0;
    }

    public double getIncome(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select sum(total) from invoice where inDate = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, date);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getDouble(1);
        }
        return 0;
    }
    public int getCustomers() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select count(cust_id) from customer";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getInt(1);
        }
        return 0;
    }
}
