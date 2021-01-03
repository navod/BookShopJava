/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

import java.util.Date;

/**
 *
 * @author kushantha
 */
public class Discount {
    private Date date;
    private int discount;

    public Discount(Date date, int discount) {
        this.date = date;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Discount{" + "date=" + date + ", discount=" + discount + '}';
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}
