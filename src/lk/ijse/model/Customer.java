/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

import java.util.Currency;

/**
 *
 * @author kushantha
 */
public class Customer {
    private String custId;
    private String custname;
    private String nationalId;
    private String city;
    private int contact;
    private String line1;
    private String line2;
    private double regfee;
    private double point;

    public Customer(String custId, String custname, String nationalId, String city, int contact, String line1, String line2, double regfee, double point) {
        this.custId = custId;
        this.custname = custname;
        this.nationalId = nationalId;
        this.city = city;
        this.contact = contact;
        this.line1 = line1;
        this.line2 = line2;
        this.regfee = regfee;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custname=" + custname + ", nationalId=" + nationalId + ", city=" + city + ", contact=" + contact + ", line1=" + line1 + ", line2=" + line2 + ", regfee=" + regfee + ", point=" + point + '}';
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
     * @return the custname
     */
    public String getCustname() {
        return custname;
    }

    /**
     * @param custname the custname to set
     */
    public void setCustname(String custname) {
        this.custname = custname;
    }

    /**
     * @return the nationalId
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * @param nationalId the nationalId to set
     */
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * @return the line1
     */
    public String getLine1() {
        return line1;
    }

    /**
     * @param line1 the line1 to set
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * @return the line2
     */
    public String getLine2() {
        return line2;
    }

    /**
     * @param line2 the line2 to set
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * @return the regfee
     */
    public double getRegfee() {
        return regfee;
    }

    /**
     * @param regfee the regfee to set
     */
    public void setRegfee(double regfee) {
        this.regfee = regfee;
    }

    /**
     * @return the point
     */
    public double getPoint() {
        return point;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(double point) {
        this.point = point;
    }
    
}
