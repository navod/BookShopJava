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
public class Items {
    private String itemId;
    private String description;
    private int rackNo;
    private int rowNo;
    private int qtyOnHand;
    private double unitPrice;
    private String status;
    private String pname;
    private String author;
    private String barcode;

    public Items(String itemId, String description, int rackNo, int rowNo, int qtyOnHand, double unitPrice, String status, String pname, String author, String barcode) {
        this.itemId = itemId;
        this.description = description;
        this.rackNo = rackNo;
        this.rowNo = rowNo;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
        this.status = status;
        this.pname = pname;
        this.author = author;
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Items{" + "itemId=" + itemId + ", description=" + description + ", rackNo=" + rackNo + ", rowNo=" + rowNo + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + ", status=" + status + ", pname=" + pname + ", author=" + author + ", barcode=" + barcode + '}';
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the rackNo
     */
    public int getRackNo() {
        return rackNo;
    }

    /**
     * @param rackNo the rackNo to set
     */
    public void setRackNo(int rackNo) {
        this.rackNo = rackNo;
    }

    /**
     * @return the rowNo
     */
    public int getRowNo() {
        return rowNo;
    }

    /**
     * @param rowNo the rowNo to set
     */
    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname the pname to set
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    
   
}
