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
import lk.ijse.model.Items;
import lk.ijse.model.Supliers;

/**
 *
 * @author kushantha
 */
public class SuplierController {

    public String getLastId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select sup_id from suplier order by sup_id desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("sup_id");
        }

        return null;
    }

    public List<String> getAllId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from suplier";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<String> list = new ArrayList<>();
        while (set.next()) {
            list.add(set.getString("sup_id"));
        }
        return list;
    }

    public Supliers getSupliers(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from suplier where sup_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return new Supliers(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4));
        }
        return null;
    }

    public List<Supliers> getAllSupliers() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from suplier";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<Supliers> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Supliers(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4))
            );
        }
        return list;
    }

    public boolean updateSuplier(Supliers suplier) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update suplier set sup_name = ?,address = ?,contact = ? where sup_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, suplier.getSupName());
        pstm.setObject(2, suplier.getAddress());
        pstm.setObject(3, suplier.getContact());
        pstm.setObject(4, suplier.getSupId());

        return pstm.executeUpdate() > 0;
    }

    public List<Supliers> searchSuplier(String value) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from suplier where sup_name like ? || address like ? || contact like ? || sup_id like ? ";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, "%" + value + "%");
        pstm.setString(2, "%" + value + "%");
        pstm.setString(3, "%" + value + "%");
        pstm.setString(4, "%" + value + "%");

        ResultSet set = pstm.executeQuery();
        List<Supliers> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Supliers(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getInt(4)));
        }
        return list;
    }

    public boolean delesteSuplier(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from suplier where sup_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        return pstm.executeUpdate() > 0;
    }

            
}
