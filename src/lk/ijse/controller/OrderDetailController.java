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
import lk.ijse.model.OrderDetail;

/**
 *
 * @author kushantha
 */
public class OrderDetailController {
    public boolean addOrderDetail(ArrayList<OrderDetail> list) throws ClassNotFoundException, SQLException {
        for (OrderDetail temp : list) {
            boolean isAdded = addItem(temp);
            if(!isAdded){
                return false;
            }
        }
        return true;
    }
     public boolean addItem(OrderDetail detail) throws ClassNotFoundException, SQLException {
        java.sql.Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO orderDetail VALUES(?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, detail.getOrderId());
        stmt.setString(2, detail.getItemId());
        stmt.setInt(3, detail.getQty());
        
        return stmt.executeUpdate() > 0;
    }
     
    public boolean searchItem(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select item_id,qty from orderdetail where order_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            String search = set.getString("item_id") ;
            int qty = set.getInt("qty") ;
            
            if(search != null){
                boolean isUpdated = new ItemController().updateQTY2(qty,search);
                return true;
            }
        }
        return false;
    }
   public List<OrderDetail> getItems(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from orderdetail where order_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        List<OrderDetail> list = new ArrayList<>();

        while (set.next()) {
            list.add(new OrderDetail(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3)));
                    
        }
        return list;
    }
}
       

