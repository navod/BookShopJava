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
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.model.Invoice;
import lk.ijse.model.InvoiceDetail;

/**
 *
 * @author kushantha
 */
public class InvoiceController {

    public String getLastId() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select invoiceId from invoice order by invoiceId desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("invoiceId");
        }
        return null;
    }

    public boolean placeBill1(Invoice invoice) throws SQLException, ClassNotFoundException {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql = "INSERT INTO invoice (invoiceId,cust_id,total,inDate,userName,inTime) VALUES(?,?,?,CURDATE(),?,CURTIME())";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, invoice.getInvoiceId());
            stmt.setString(2, invoice.getCustId());
            stmt.setDouble(3, invoice.getTotal());
            stmt.setString(4, invoice.getUserName());

            boolean isAdded = stmt.executeUpdate() > 0;
            if (isAdded) {
                boolean isAddedAll = new InvoiceDetailController().addedBill(invoice.getInvoiceDetailList());
                if (isAddedAll) {
                    boolean isUpdated = new InvoiceController().updateQTY(invoice.getInvoiceDetailList());
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
    public boolean placeBill2(Invoice invoice) throws SQLException, ClassNotFoundException {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            conn.setAutoCommit(false);
            String sql = "INSERT INTO invoice (invoiceId,total,inDate,userName,inTime) VALUES(?,?,CURDATE(),?,CURTIME())";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, invoice.getInvoiceId());
            stmt.setDouble(2, invoice.getTotal());
            stmt.setString(3, invoice.getUserName());

            boolean isAdded = stmt.executeUpdate() > 0;
            if (isAdded) {
                boolean isAddedAll = new InvoiceDetailController().addedBill(invoice.getInvoiceDetailList());
                if (isAddedAll) {
                    boolean isUpdated = new InvoiceController().updateQTY(invoice.getInvoiceDetailList());
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
    public boolean updateQTY(ArrayList<InvoiceDetail> details) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        for (InvoiceDetail detail : details) {
            String sql = "UPDATE item SET qtyOnHand=(qtyOnHand-?) WHERE item_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setObject(1, detail.getQty());
            stmt.setObject(2, detail.getItem_id());
            if (!(stmt.executeUpdate() > 0)) {
                return false;
            }
        }
        return true;
    }
}
