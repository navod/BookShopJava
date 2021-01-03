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
import lk.ijse.model.Chart;
import lk.ijse.view.DayIncomeReport;

/**
 *
 * @author kushantha
 */
public class ReportController {
   public List<String> getDate() throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getInstance().getConnection();
       String sql = "select distinct inDate from invoice";
       PreparedStatement pstm = connection.prepareStatement(sql);
       ResultSet set = pstm.executeQuery();
       List<String> list = new ArrayList<>();
       while(set.next()){
           list.add(set.getString("inDate"));
       }
       return list;
   }
    public List<String> getMonth() throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getInstance().getConnection();
       String sql = "select distinct MONTH (inDate) month from invoice";
       PreparedStatement pstm = connection.prepareStatement(sql);
       ResultSet set = pstm.executeQuery();
       List<String> list = new ArrayList<>();
       while(set.next()){
           list.add(set.getString("month"));
           
       }
       return list;
   }
    public List<String> getMonths(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select distinct Month(inDate) month from invoice where inDate like ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id +"%");
        ResultSet set = pstm.executeQuery();
        List<String> list = new ArrayList<>();
        DayIncomeReport.comboMonth.removeAllItems();
        while (set.next()) {
            list.add(set.getString("month"));
        }
        return list;
    }
    public List<String> getYear() throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getInstance().getConnection();
       String sql = "select distinct YEAR (inDate) year from invoice";
       PreparedStatement pstm = connection.prepareStatement(sql);
       ResultSet set = pstm.executeQuery();
       List<String> list = new ArrayList<>();
       while(set.next()){
           list.add(set.getString("year"));
       }
       return list;
   }
  
   public List<Chart> getQueryChart(String date) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select invoiceId,total from invoice where inDate = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, date);
        ResultSet set = pstm.executeQuery();
        List<Chart> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Chart(set.getString(1), set.getDouble(2))
            );
        }
        return list;
    }
   public double getDateIncome(String date) throws ClassNotFoundException, SQLException {
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
   public double getMonthIncome(String value) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select sum(total) from invoice where inDate like ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, "%" + value +"%");
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getDouble(1);
        }
        return 0;
    }
   public double getYearIncome(String value) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select sum(total) from invoice where inDate like ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, value+"%");
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return set.getDouble(1);
        }
        return 0;
    }

}
