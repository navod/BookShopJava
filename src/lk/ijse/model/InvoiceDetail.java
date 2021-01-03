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
public class InvoiceDetail {

    private String invoiceId;
    private String item_id;
    private int qty;
    private double unitPrice;
    private double ourPrice;

    public InvoiceDetail(String invoiceId, String item_id, int qty, double unitPrice, double ourPrice) {
        this.invoiceId = invoiceId;
        this.item_id = item_id;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.ourPrice = ourPrice;
    }

    @Override
    public String toString() {
        return "InvoiceDetail{" + "invoiceId=" + invoiceId + ", item_id=" + item_id + ", qty=" + qty + ", unitPrice=" + unitPrice + ", ourPrice=" + ourPrice + '}';
    }

    /**
     * @return the invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the item_id
     */
    public String getItem_id() {
        return item_id;
    }

    /**
     * @param item_id the item_id to set
     */
    public void setItem_id(String item_id) {
        this.item_id = item_id;
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

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the ourPrice
     */
    public double getOurPrice() {
        return ourPrice;
    }

    /**
     * @param ourPrice the ourPrice to set
     */
    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }
}
