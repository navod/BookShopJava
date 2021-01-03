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
import lk.ijse.model.CashDiscount;
import lk.ijse.model.DateDiscount;

/**
 *
 * @author kushantha
 */
public class DiscountController {

    public String getDayDiscount(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select discount from discount where dates = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, date);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getString("discount");
        }
        return null;
    }

    public String getMothDiscount(String month) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select discount from discount where  months = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, month);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getString("discount");
        }
        return null;
    }

    public List<String> getProduct() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT distinct pname FROM item;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet set = stmt.executeQuery();
        List<String> list = new ArrayList<>();
        while (set.next()) {
            list.add(set.getString("pname"));
        }
        return list;
    }

    public List<DateDiscount> getDayDiscount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount,dates FROM discount where dates is not null ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<DateDiscount> list = new ArrayList<>();

        while (set.next()) {
            list.add(new DateDiscount(set.getInt(1), set.getString(2))
            );
        }
        return list;
    }

    public List<DateDiscount> getMonthDiscount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount,months FROM discount where months is not null ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<DateDiscount> list = new ArrayList<>();

        while (set.next()) {
            list.add(new DateDiscount(set.getInt(1), set.getString(2))
            );
        }
        return list;
    }

    public boolean deleteMonthDiscount(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from discount where months = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, date);

        return pstm.executeUpdate() > 0;
    }

        public boolean deleteDayDiscount(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from discount where dates = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, date);

        return pstm.executeUpdate() > 0;
    }
    public boolean addedDayDiscout(String date, double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "insert into discount (discount,dates)"
                + " VALUES (?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setDouble(1, discount);
        pstm.setString(2, date);

        return pstm.executeUpdate() > 0;

    }

    public boolean addedMonthDiscount(String month, double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "insert into discount (discount,months)"
                + " VALUES (?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setDouble(1, discount);
        pstm.setString(2, month);

        return pstm.executeUpdate() > 0;

    }

    public boolean updateDayDiscount(double discount, String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update discount set discount = ? where months = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setDouble(1, discount);
        pstm.setString(2, date);

        return pstm.executeUpdate() > 0;

    }

    public boolean updateCardDiscount(double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "update discount set discount = ? where other = 'Card Discount'";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setDouble(1, discount);

        return pstm.executeUpdate() > 0;
    }

    public String getCardDiscount() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select discount from discount where other = 'Card Discount'";
        PreparedStatement pstm = connection.prepareStatement(sql);

        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getString("discount");
        }
        return null;
    }

    public boolean addedRange1Value(double cash, double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "update discount set discount = ?,cash = ? where other = 'range1'";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setDouble(1, discount);
        pstm.setDouble(2, cash);

        return pstm.executeUpdate() > 0;
    }

    public boolean addedRange1Value2(double cash, double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "update discount set discount = ?,cash = ? where other = 'range2'";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setDouble(1, discount);
        pstm.setDouble(2, cash);

        return pstm.executeUpdate() > 0;

    }

    public boolean addedRange1Value3(double cash, double discount) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql = "update discount set discount = ?,cash = ? where other = 'range3'";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setDouble(1, discount);
        pstm.setDouble(2, cash);

        return pstm.executeUpdate() > 0;

    }

    public List<CashDiscount> getRange1() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount,cash FROM discount where other = 'range1' ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<CashDiscount> list = new ArrayList<>();

        while (set.next()) {
            list.add(new CashDiscount(set.getDouble(1), set.getDouble(2))
            );
        }
        return list;
    }

    public List<CashDiscount> getRange2() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount,cash FROM discount where other = 'range2' ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<CashDiscount> list = new ArrayList<>();

        while (set.next()) {
            list.add(new CashDiscount(set.getDouble(1), set.getDouble(2))
            );
        }
        return list;
    }

    public List<CashDiscount> getRange3() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount,cash FROM discount where other = 'range3' ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<CashDiscount> list = new ArrayList<>();

        while (set.next()) {
            list.add(new CashDiscount(set.getDouble(1), set.getDouble(2))
            );
        }
        return list;
    }

    public boolean deleteAll() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        connection = DBConnection.getInstance().getConnection();
        String sql1 = "update discount set discount = '0',cash='0' where other = 'range1'";
        PreparedStatement pstm = connection.prepareStatement(sql1);
        pstm.executeUpdate();
        pstm.close();

        connection = DBConnection.getInstance().getConnection();
        String sql2 = "update discount set discount = '0',cash = '0' where other = 'range2'";
        pstm = connection.prepareStatement(sql2);
        pstm.executeUpdate();
        pstm.close();

        connection = DBConnection.getInstance().getConnection();
        String sql3 = "update discount set discount = '0',cash = '0' where other = 'range3'";
        pstm = connection.prepareStatement(sql3);

        return pstm.executeUpdate() > 0;

    }
}
