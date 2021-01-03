/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.model.InvoiceDetail;
import lk.ijse.model.itemDetail;

/**
 *
 * @author kushantha
 */
public class InvoiceDetailController {

    public boolean addedBill(ArrayList<InvoiceDetail> list) throws ClassNotFoundException, SQLException {
        for (InvoiceDetail temp : list) {
            boolean isAdded = addItem(temp);
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }
     public boolean addItem(InvoiceDetail detail) throws ClassNotFoundException, SQLException {
        java.sql.Connection conn = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO invoicedetail VALUES(?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, detail.getInvoiceId());
        stmt.setString(2, detail.getItem_id());
        stmt.setInt(3, detail.getQty());
        stmt.setDouble(4, detail.getUnitPrice());
        stmt.setDouble(5, detail.getOurPrice());
        return stmt.executeUpdate() > 0;
    }
}
