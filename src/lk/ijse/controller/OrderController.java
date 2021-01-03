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
import lk.ijse.model.Order;
import lk.ijse.model.OrderDetail;

/**
 *
 * @author kushantha
 */
public class OrderController {
     public String getLastOrderId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select order_id from orders order by order_id desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("order_id");
        }

        return null;
    }
     public boolean placeOrder(Order order) throws SQLException, ClassNotFoundException {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql = "INSERT INTO orders (order_id,cust_id,user_id) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, order.getOrderId());
            stmt.setString(2, order.getCustId());
            stmt.setString(3, order.getUserId());
            
            
            boolean isAdded = stmt.executeUpdate() > 0;
                
            if (isAdded) {
                boolean isAddedAll = new OrderDetailController().addOrderDetail(order.getItemDetail());
                if (isAddedAll) {
                    boolean isUpdated = new ItemController().updateQTY(order.getItemDetail());
                    if (isUpdated) {
                        conn.commit();
                        return true;
                    }
                }
            } else {
                conn.rollback();
            }
            DBConnection.getInstance().getConnection().rollback();
            return false;
        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }
      public int countCustomerOrders(String id) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = " select count(order_id) as count from orders where cust_id = ? ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getInt(1);
        }

        return 0;
    }
     public String searchOrders(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select order_id from orders where cust_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("order_id");
        }
        return null;
    }
      public boolean deleteOrders(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from orders where order_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        return pstm.executeUpdate() > 0;
    }
      public List<Order> getAllOrders() throws ClassNotFoundException, SQLException{
          Connection connection = DBConnection.getInstance().getConnection();
          String sql = "select * from orders";
          PreparedStatement pstm = connection.prepareCall(sql);
          ResultSet set = pstm.executeQuery();
          
          List<Order> list = new ArrayList<>();
          ArrayList <OrderDetail> temp = new ArrayList<>();
          while(set.next()){
              list.add(new Order(
                      set.getString(1), 
                      set.getString(2),
                      set.getString(3), 
                      set.getString(4),
                      temp
              )
              );
          }
          return list;
      }
}
