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
public class DateDiscount {
    private int discount;
    private String date;

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Date{" + "discount=" + discount + ", date=" + date + '}';
    }

    public DateDiscount(int discount, String date) {
        this.discount = discount;
        this.date = date;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
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
    
    
    
}
