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
import lk.ijse.model.itemDetail;
import lk.ijse.view.AddedQty;

/**
 *
 * @author kushantha
 */
public class ItemDetailController {

    public List<String> getItem(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select distinct item_id from itemdetail where sup_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        List<String> list = new ArrayList<>();
        AddedQty.comboItemId.removeAllItems();
        while (set.next()) {
            list.add(set.getString("item_id"));
        }
        return list;
    }

    public Object addItems(itemDetail item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql1 = "insert into itemdetail (item_id,sup_id,ptotal,qty) values (?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql1);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, item.getSupId());
        pstm.setDouble(3, item.getpTotal());
        pstm.setInt(4, item.getQty());

        pstm.executeUpdate();
        pstm.close();

        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE item SET qtyOnHand=(qtyOnHand+?) WHERE item_id=?";
        pstm= conn.prepareStatement(sql);
        pstm.setObject(1, item.getQty());
        pstm.setObject(2, item.getItemId());
        

        return  pstm.executeUpdate();
    }
}


