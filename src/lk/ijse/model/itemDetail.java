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
public class itemDetail {
    private String itemId;
    private String supId;
    private double pTotal;
    private int qty;

    public itemDetail(String itemId, String supId, double pTotal, int qty) {
        this.itemId = itemId;
        this.supId = supId;
        this.pTotal = pTotal;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "itemDetail{" + "itemId=" + itemId + ", supId=" + supId + ", pTotal=" + pTotal + ", qty=" + qty + '}';
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
     * @return the supId
     */
    public String getSupId() {
        return supId;
    }

    /**
     * @param supId the supId to set
     */
    public void setSupId(String supId) {
        this.supId = supId;
    }

    /**
     * @return the pTotal
     */
    public double getpTotal() {
        return pTotal;
    }

    /**
     * @param pTotal the pTotal to set
     */
    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
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
