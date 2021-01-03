/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

import java.sql.Date;

/**
 *
 * @author kushantha
 */
public class Data {
    private String supId;
    private String supName;
    private String pName;
    private String discription;
    private int availableQty;
    private int boughtQty;
    private Date supDate;
    private double ptotal;

    public Data(String supId, String supName, String pName, String discription, int availableQty, int boughtQty, Date supDate, double ptotal) {
        this.supId = supId;
        this.supName = supName;
        this.pName = pName;
        this.discription = discription;
        this.availableQty = availableQty;
        this.boughtQty = boughtQty;
        this.supDate = supDate;
        this.ptotal = ptotal;
    }

    @Override
    public String toString() {
        return "Data{" + "supId=" + getSupId() + ", supName=" + getSupName() + ", pName=" + getpName() + ", discription=" + getDiscription() + ", availableQty=" + getAvailableQty() + ", boughtQty=" + getBoughtQty() + ", supDate=" + getSupDate() + ", ptotal=" + getPtotal() + '}';
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
     * @return the supName
     */
    public String getSupName() {
        return supName;
    }

    /**
     * @param supName the supName to set
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the availableQty
     */
    public int getAvailableQty() {
        return availableQty;
    }

    /**
     * @param availableQty the availableQty to set
     */
    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    /**
     * @return the boughtQty
     */
    public int getBoughtQty() {
        return boughtQty;
    }

    /**
     * @param boughtQty the boughtQty to set
     */
    public void setBoughtQty(int boughtQty) {
        this.boughtQty = boughtQty;
    }

    /**
     * @return the supDate
     */
    public Date getSupDate() {
        return supDate;
    }

    /**
     * @param supDate the supDate to set
     */
    public void setSupDate(Date supDate) {
        this.supDate = supDate;
    }

    /**
     * @return the ptotal
     */
    public double getPtotal() {
        return ptotal;
    }

    /**
     * @param ptotal the ptotal to set
     */
    public void setPtotal(double ptotal) {
        this.ptotal = ptotal;
    }

    
}
