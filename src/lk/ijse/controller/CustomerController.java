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
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.model.Customer;

/**
 *
 * @author kushantha
 */
public class CustomerController {

    public String getLastId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select cust_id from customer order by cust_id desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("cust_id");
        }

        return null;
    }

    public Object updateCustomer(String name, String nic, int contact, String city, String line1, String line2, String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update customer set cust_name=?, nationalId = ?, city = ?, contact = ?, addressline1=?, addressline2 = ? where cust_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, name);
        pstm.setObject(2, nic);
        pstm.setObject(3, city);
        pstm.setObject(4, contact);
        pstm.setObject(5, line1);
        pstm.setObject(6, line2);
        pstm.setObject(7, id);

        return pstm.executeUpdate();

    }

    public boolean deletedCustomer(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from customer where cust_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        return pstm.executeUpdate() > 0;
    }

    public boolean addedCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "insert into customer (cust_id,cust_name,nationalId,city,contact,addressline1,addressline2,regfee)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, customer.getCustId());
        pstm.setString(2, customer.getCustname());
        pstm.setString(3, customer.getNationalId());
        pstm.setString(4, customer.getCity());
        pstm.setInt(5, customer.getContact());
        pstm.setString(6, customer.getLine1());
        pstm.setString(7, customer.getLine2());
        pstm.setString(7, customer.getLine2());
        pstm.setDouble(8, customer.getRegfee());

        return pstm.executeUpdate() > 0;

    }

    public List<Customer> searchCustomers(String value) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE cust_name LIKE ? || nationalId LIKE ? ||  cust_id LIKE ? || city LIKE ? || contact LIKE ? || addressline1 LIKE ? || addressline2 LIKE ? ";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, "%" + value + "%");
        pstm.setString(2, "%" + value + "%");
        pstm.setString(3, "%" + value + "%");
        pstm.setString(4, "%" + value + "%");
        pstm.setString(5, "%" + value + "%");
        pstm.setString(6, "%" + value + "%");
        pstm.setString(7, "%" + value + "%");

        ResultSet set = pstm.executeQuery();
        List<Customer> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getString(6),
                    set.getString(7),
                    set.getDouble(8),
                    set.getDouble(9))
            );

        }
        return list;
    }

    public List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer order by point desc";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<Customer> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getString(6),
                    set.getString(7),
                    set.getDouble(8),set.getDouble(9)
            )
            );
        }
        return list;
    }

    public List<String> getAllContact() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT contact FROM customer;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet set = stmt.executeQuery();
        List<String> list = new ArrayList<>();
        while (set.next()) {
            list.add(set.getString("contact"));
        }
        return list;
    }

    public Customer getCustomerName(String contact) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from customer where contact = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(contact));
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getString(6),
                    set.getString(7),
                    set.getDouble(8),
                    set.getDouble(9)
                    );

        }
        return null;
    }

    public boolean updatePoint(double point, String id) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET point=(point+?) WHERE cust_id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setObject(1, point);
        stmt.setObject(2, id);

        return stmt.executeUpdate() > 0;
    }

    public List<String> getPoint() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT point FROM customer;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet set = stmt.executeQuery();
        List<String> list = new ArrayList<>();
        while (set.next()) {
            list.add(set.getString("point"));
        }
        return list;
    }
}
