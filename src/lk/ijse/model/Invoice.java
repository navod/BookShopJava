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
public class Invoice {
    private String invoiceId;
    private String custId;
    private String userName;
    private double total;
    private ArrayList <InvoiceDetail> invoiceDetailList;

    public Invoice(String invoiceId, String custId, String userName, double total, ArrayList<InvoiceDetail> invoiceDetailList) {
        this.invoiceId = invoiceId;
        this.custId = custId;
        this.userName = userName;
        this.total = total;
        this.invoiceDetailList = invoiceDetailList;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceId=" + invoiceId + ", custId=" + custId + ", userName=" + userName + ", total=" + total + ", invoiceDetailList=" + invoiceDetailList + '}';
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the invoiceDetailList
     */
    public ArrayList <InvoiceDetail> getInvoiceDetailList() {
        return invoiceDetailList;
    }

    /**
     * @param invoiceDetailList the invoiceDetailList to set
     */
    public void setInvoiceDetailList(ArrayList <InvoiceDetail> invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }

    
}
