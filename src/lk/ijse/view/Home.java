/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import lk.ijse.controller.HomeController;

/**
 *
 * @author kushantha
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomer
     */
    public Home() throws ClassNotFoundException, SQLException {
        initComponents();
        loadSoldItem();
        loadOrders();
        loadTodayInCome();
        loadCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSoldQty = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblOrders = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCust = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTodayincome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 31, 151));
        setMinimumSize(new java.awt.Dimension(960, 710));
        setPreferredSize(new java.awt.Dimension(960, 710));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));

        lblSoldQty.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblSoldQty.setForeground(new java.awt.Color(255, 255, 255));
        lblSoldQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoldQty.setText("0");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sold Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSoldQty, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSoldQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(68, 68, 68))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 180, 360, 120));

        jPanel2.setBackground(new java.awt.Color(211, 84, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Orders");

        lblOrders.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrders.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 360, 120));

        jPanel3.setBackground(new java.awt.Color(241, 196, 15));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registerd Customers");

        lblCust.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblCust.setForeground(new java.awt.Color(255, 255, 255));
        lblCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCust.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(lblCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(42, 42, 42))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 360, 120));

        jPanel4.setBackground(new java.awt.Color(41, 128, 185));

        lblTodayincome.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTodayincome.setForeground(new java.awt.Color(255, 255, 255));
        lblTodayincome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTodayincome.setText("0");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Today Income");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTodayincome, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTodayincome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 400, 360, 120));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/view/pictures/icons8_home_30px.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/view/pictures/home2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 960, 710));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCust;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblSoldQty;
    private javax.swing.JLabel lblTodayincome;
    // End of variables declaration//GEN-END:variables

    private void loadSoldItem() throws ClassNotFoundException, SQLException {
        int soldItemCount = new HomeController().getAllItem();
        lblSoldQty.setText(String.valueOf(soldItemCount));
    }

    private void loadOrders() throws ClassNotFoundException, SQLException {
        int ordersCount = new HomeController().getAllOrders();
        lblOrders.setText(String.valueOf(ordersCount));
    }
    private String loadDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date2 = dateFormat.format(date);
        return date2;
    }
    private void loadTodayInCome() throws SQLException, ClassNotFoundException {
        String date = loadDate();
        double income = new HomeController().getIncome(date);
        if(income != 0){
            lblTodayincome.setText("Rs "+String.valueOf(income));
        }else{
            lblTodayincome.setText("0");
        }
    }
    private void loadCustomer() throws ClassNotFoundException, SQLException {
        int custCount = new HomeController().getCustomers();
        lblCust.setText(String.valueOf(custCount));
    }
}
