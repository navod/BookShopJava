/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

/**
 *
 * @author kushantha
 */
public class OrderDetail {
    private String orderId;
    private String itemId;
    private int qty;
    private double total;

    public OrderDetail(String orderId, String itemId, int qty) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "orderId=" + orderId + ", itemId=" + itemId + ", qty=" + qty + '}';
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

}
