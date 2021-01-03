/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

import java.util.ArrayList;

/**
 *
 * @author kushantha
 */
public class Order {
    private String orderId;
    private String userId;
    private String custId;
    private String date;
    private ArrayList<OrderDetail> itemDetail;

    public Order(String orderId, String userId, String custId, String date, ArrayList<OrderDetail> itemDetail) {
        this.orderId = orderId;
        this.userId = userId;
        this.custId = custId;
        this.date = date;
        this.itemDetail = itemDetail;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", userId=" + userId + ", custId=" + custId + ", date=" + date + ", itemDetail=" + itemDetail + '}';
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
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the itemDetail
     */
    public ArrayList<OrderDetail> getItemDetail() {
        return itemDetail;
    }

    /**
     * @param itemDetail the itemDetail to set
     */
    public void setItemDetail(ArrayList<OrderDetail> itemDetail) {
        this.itemDetail = itemDetail;
    }

}
