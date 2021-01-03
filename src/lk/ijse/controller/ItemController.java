/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.controller;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.model.Customer;
import lk.ijse.model.Data;
import lk.ijse.model.Items;
import lk.ijse.model.OrderDetail;
import lk.ijse.model.Supliers;
import lk.ijse.view.AddedQty;

/**
 *
 * @author kushantha
 */
public class ItemController {

    public Object addedNewItems(Items item, Supliers suplier, double total) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql1 = "insert into item (item_id,description,rack_no,rowNo,qtyOnHand,unitprice,status,pname,author,barcode) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql1);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, item.getDescription());
        pstm.setInt(3, item.getRackNo());
        pstm.setInt(4, item.getRowNo());
        pstm.setInt(5, item.getQtyOnHand());
        pstm.setDouble(6, item.getUnitPrice());
        pstm.setString(7, item.getStatus());
        pstm.setString(8, item.getPname());
        pstm.setString(9, item.getAuthor());
        pstm.setString(10, item.getBarcode());
        pstm.executeUpdate();
        pstm.close();

        String sql2 = "insert into suplier values (?,?,?,?)";
        pstm = connection.prepareStatement(sql2);
        pstm.setString(1, suplier.getSupId());
        pstm.setString(2, suplier.getSupName());
        pstm.setString(3, suplier.getAddress());
        pstm.setInt(4, suplier.getContact());

        pstm.executeUpdate();
        pstm.close();

        String sql3 = "insert into itemdetail (item_id,sup_id,ptotal,qty) values (?,?,?,?)";
        pstm = connection.prepareStatement(sql3);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, suplier.getSupId());
        pstm.setDouble(3, total);

        pstm.setInt(4, item.getQtyOnHand());

        return pstm.executeUpdate();

    }

    public String getLastId() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select item_id from item order by item_id desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("item_id");
        }

        return null;
    }

    public Object addItems(Items item, String id, double total) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql1 = "insert into item (item_id,description,rack_no,rowNo,qtyOnHand,unitprice,status,pname,author,barcode) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql1);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, item.getDescription());
        pstm.setInt(3, item.getRackNo());
        pstm.setInt(4, item.getRowNo());
        pstm.setInt(5, item.getQtyOnHand());
        pstm.setDouble(6, item.getUnitPrice());
        pstm.setString(7, item.getStatus());
        pstm.setString(8, item.getPname());
        pstm.setString(9, item.getAuthor());
        pstm.setString(10, item.getBarcode());

        pstm.executeUpdate();
        pstm.close();

        String sql3 = "insert into itemdetail (item_id,sup_id,ptotal,qty) values (?,?,?,?)";
        pstm = connection.prepareStatement(sql3);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, id);
        pstm.setDouble(3, total);
        pstm.setInt(4, item.getQtyOnHand());

        return pstm.executeUpdate();
    }

    public List<Items> getAllItems() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from item ";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<Items> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Items(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3),
                    set.getInt(4),
                    set.getInt(5),
                    set.getDouble(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10)));
        }
        return list;
    }

    public List<Items> searchItems(String value) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM item "
                + "WHERE description LIKE ? || rack_no LIKE ? ||  rowNo LIKE ? || status LIKE ? || pname LIKE ? || author LIKE ? || item_id LIKE ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, "%" + value + "%");
        pstm.setString(2, "%" + value + "%");
        pstm.setString(3, "%" + value + "%");
        pstm.setString(4, "%" + value + "%");
        pstm.setString(5, "%" + value + "%");
        pstm.setString(6, "%" + value + "%");
        pstm.setString(7, "%" + value + "%");

        ResultSet set = pstm.executeQuery();
        List<Items> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Items(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3),
                    set.getInt(4),
                    set.getInt(5),
                    set.getDouble(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10))
            );

        }
        return list;
    }

    public Object updateItem(Items item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update item set description=?, rack_no = ?, rowNo = ?, qtyOnHand = ?, unitprice=?, status = ? ,pname = ? ,author =?,barcode = ? where item_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, item.getDescription());
        pstm.setObject(2, item.getRackNo());
        pstm.setObject(3, item.getRowNo());
        pstm.setObject(4, item.getQtyOnHand());
        pstm.setObject(5, item.getUnitPrice());
        pstm.setObject(6, item.getStatus());
        pstm.setObject(7, item.getPname());
        pstm.setObject(8, item.getAuthor());
        pstm.setObject(9, item.getBarcode());
        pstm.setObject(10, item.getItemId());

        return pstm.executeUpdate();

    }

    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from item where item_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);

        return pstm.executeUpdate() > 0;
    }

    public Object getsuplierId(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select sup_id from itemdetail where item_id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, id);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("sup_id");
        }
        return null;
    }

    public List<Data> getAllData() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "select suplier.sup_id,sup_name,pname,description,qtyOnHand,qty,supDate "
//                + "from suplier,item,itemdetail "
//                + "where item.item_id = itemdetail.item_id and suplier.sup_id=itemdetail.sup_id"
//                + " group by itemdetail.isid order by supDate asc";
        String sql = "select suplier.sup_id,sup_name,pname,description,qtyOnHand,qty,supDate,ptotal \n"
                + "from suplier cross join itemdetail i cross join item on \n"
                + "suplier.sup_id = i.sup_id and item.item_id = i.item_id group by i.isid order by supDate desc";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        List<Data> list = new ArrayList<>();

        while (set.next()) {
            list.add(new Data(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getInt(6),
                    set.getDate(7),
                    set.getDouble(8)
            )
            );

        }
        return list;
    }

    public List<Data> searchData(String value) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
//        String sql = "select suplier.sup_id,sup_name,pname,description,qtyOnHand,qty,supDate from suplier,item,itemdetail "
////                + "where sup_name like ? || pname like ? ||  description like ? ||  qtyOnHand like ? ||  qty like ? ||  supDate like ?";
//        String sql = "select sup_name,pname,description,qtyOnHand,qty,supDate \n"
//                + " from suplier s cross join item i cross join itemdetail on \n"
//                + " s.sup_id = itemdetail.sup_id  and i.item_id = itemdeetail.item_id where sup_name like ? and pname like ? and  description like ? ";
        String sql = "select suplier.sup_id,sup_name,pname,description,qtyOnHand,qty,supDate,ptotal\n"
                + "from suplier cross join itemdetail i cross join item on\n"
                + "suplier.sup_id = i.sup_id and i.item_id = item.item_id\n"
                + "where sup_name like ? ||  pname like ? || description like ? order by supDate desc";

        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, "%" + value + "%");
        pstm.setString(2, "%" + value + "%");
        pstm.setString(3, "%" + value + "%");
//        pstm.setString(4,"%"+ value + "%");
//        pstm.setString(5,"%"+ value + "%");
//        pstm.setString(6,"%"+ value + "%");

        ResultSet set = pstm.executeQuery();
        List<Data> list = new ArrayList<>();

        while (set.next()) {

            list.add(new Data(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getInt(6),
                    set.getDate(7),
                    set.getDouble(8)
            )
            );

        }
        return list;
    }

    public List<String> getDescription() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select description from item";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<String> list = new ArrayList<>();
        ResultSet set = pstm.executeQuery();
        while (set.next()) {
            list.add(set.getString("description"));

        }
        return list;
    }

    public Items getItemId(String name) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from item where description = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, name);
        ResultSet set = pstm.executeQuery();

        if (set.next()) {
            return new Items(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3),
                    set.getInt(4),
                    set.getInt(5),
                    set.getDouble(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10));
        }
        return null;
    }

    public boolean updateQTY(ArrayList<OrderDetail> details) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        for (OrderDetail detail : details) {
            String sql = "UPDATE item SET qtyOnHand=(qtyOnHand-?) WHERE item_id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setObject(1, detail.getQty());
            stmt.setObject(2, detail.getItemId());
            if (!(stmt.executeUpdate() > 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean updateQTY2(int qty, String id) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE item SET qtyOnHand=(qtyOnHand+?) WHERE item_id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setObject(1, qty);
        stmt.setObject(2, id);
        if (!(stmt.executeUpdate() > 0)) {
            return false;
        }

        return true;
    }

    public Object addItems(Items item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql1 = "insert into item (item_id,description,rack_no,rowNo,qtyOnHand,unitprice,status,pname,author,barcode) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql1);
        pstm.setString(1, item.getItemId());
        pstm.setString(2, item.getDescription());
        pstm.setInt(3, item.getRackNo());
        pstm.setInt(4, item.getRowNo());
        pstm.setInt(5, item.getQtyOnHand());
        pstm.setDouble(6, item.getUnitPrice());
        pstm.setString(7, item.getStatus());
        pstm.setString(8, item.getPname());
        pstm.setString(9, item.getAuthor());
        pstm.setString(10, item.getBarcode());

        return pstm.executeUpdate();
    }

    public Items getDescription2(String code) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM item WHERE item_id = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, code);

        ResultSet set = stmt.executeQuery();
        if (set.next()) {
            return new Items(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3),
                    set.getInt(4),
                    set.getInt(5),
                    set.getDouble(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10));
        }
        return null;
    }

    public String getProduct(String product) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT discount FROM item WHERE pname=?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, product);
        ResultSet set = stmt.executeQuery();
        if (set.next()) {
            return set.getString(1);

        }
        return null;
    }

    public boolean updateDiscount(double discount, String pname) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE item SET discount=? WHERE pname=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setObject(1, discount);
        stmt.setObject(2, pname);
        if (!(stmt.executeUpdate() > 0)) {
            return false;
        }
        return true;
    }

    public boolean deleteDiscount(String pname) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "UPDATE item SET discount=0 WHERE pname=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setObject(1, pname);
        if (!(stmt.executeUpdate() > 0)) {
            return false;
        }
        return true;
    }

    public Items getDetail(String code) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM item WHERE barcode = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, code);

        ResultSet set = stmt.executeQuery();
        if (set.next()) {
            return new Items(
                    set.getString(1),
                    set.getString(2),
                    set.getInt(3),
                    set.getInt(4),
                    set.getInt(5),
                    set.getDouble(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9),
                    set.getString(10));
        }
        return null;
    }
}
