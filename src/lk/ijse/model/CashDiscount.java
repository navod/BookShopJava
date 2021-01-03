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
public class CashDiscount {
    private double discount;
    private double cash;

    public CashDiscount(double discount, double cash) {
        this.discount = discount;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "CashDiscount{" + "discount=" + discount + ", cash=" + cash + '}';
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }
    
    
}
