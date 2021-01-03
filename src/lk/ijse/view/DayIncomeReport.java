/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.bookshop.DB.DBConnection;
import lk.ijse.controller.ReportController;
import lk.ijse.model.Chart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;


/**
 *
 * @author kushantha
 */
public class DayIncomeReport extends javax.swing.JPanel {

    /**
     * Creates new form DayIncomeReport
     */
    public DayIncomeReport() {
        try {
            initComponents();
            loadAllDate();
            loadAllMonth();
            loadAllYear();
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        comboMonth = new javax.swing.JComboBox<>();
        comboDate = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblIncome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboMYear = new javax.swing.JComboBox<>();
        lblIncome1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDateInCome = new javax.swing.JLabel();
        lblMonthIncome = new javax.swing.JLabel();
        comboYear = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        comboMonth.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboMonth.setForeground(new java.awt.Color(255, 255, 255));
        comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Month" }));
        comboMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMonthItemStateChanged(evt);
            }
        });
        add(comboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 150, 40));

        comboDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboDate.setForeground(new java.awt.Color(255, 255, 255));
        comboDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date" }));
        comboDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboDateItemStateChanged(evt);
            }
        });
        comboDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboDateKeyReleased(evt);
            }
        });
        add(comboDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 270, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Month :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        lblYear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblYear.setForeground(new java.awt.Color(255, 255, 255));
        lblYear.setText("N/A");
        add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jButton1.setText("Selling Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, -1, -1));

        lblIncome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIncome.setForeground(new java.awt.Color(255, 255, 255));
        lblIncome.setText("Income   : ");
        add(lblIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year    :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        comboMYear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboMYear.setForeground(new java.awt.Color(255, 255, 255));
        comboMYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select year" }));
        comboMYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMYearItemStateChanged(evt);
            }
        });
        add(comboMYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 160, 40));

        lblIncome1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIncome1.setForeground(new java.awt.Color(255, 255, 255));
        lblIncome1.setText("Income   : ");
        add(lblIncome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Income  :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtDateInCome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDateInCome.setForeground(new java.awt.Color(255, 255, 255));
        txtDateInCome.setText("N/A");
        add(txtDateInCome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        lblMonthIncome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMonthIncome.setForeground(new java.awt.Color(255, 255, 255));
        lblMonthIncome.setText("N/A");
        add(lblMonthIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        comboYear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comboYear.setForeground(new java.awt.Color(255, 255, 255));
        comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select year" }));
        comboYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboYearItemStateChanged(evt);
            }
        });
        add(comboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/view/pictures/income.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void comboDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboDateKeyReleased

    }//GEN-LAST:event_comboDateKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "select inDate,total month from invoice";
            DefaultCategoryDataset datest = new JDBCCategoryDataset(DBConnection.getInstance().getConnection(), sql);

            JFreeChart chart = ChartFactory.createLineChart("Monthly Income Chart", "Date", "Income", datest, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = new BarRenderer();
            CategoryPlot plot = null;
            ChartFrame frame = new ChartFrame("Monthly Income Char", chart);
            frame.setVisible(true);
            frame.setSize(400, 400);
            //                  jPanel1.add(frame);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboDateItemStateChanged
        try {
            String date = (String) comboDate.getSelectedItem();
            double income = new ReportController().getDateIncome(date);
            txtDateInCome.setText(String.valueOf(income));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboDateItemStateChanged

    private void comboMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMonthItemStateChanged
        try {
            String month = (String) comboMonth.getSelectedItem();
            double income = new ReportController().getMonthIncome(month);
            lblMonthIncome.setText(String.valueOf(income));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboMonthItemStateChanged

    private void comboMYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMYearItemStateChanged
        try {
            String year = (String) comboMYear.getSelectedItem();
            for (String id : new ReportController().getMonths(year)) {
                comboMonth.addItem(id);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboMYearItemStateChanged

    private void comboYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboYearItemStateChanged
        try {
            String year = (String) comboYear.getSelectedItem();
            double income = new ReportController().getYearIncome(year);
            lblYear.setText(String.valueOf(income));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DayIncomeReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_comboYearItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboDate;
    private javax.swing.JComboBox<String> comboMYear;
    public static javax.swing.JComboBox<String> comboMonth;
    private javax.swing.JComboBox<String> comboYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblIncome1;
    private javax.swing.JLabel lblMonthIncome;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel txtDateInCome;
    // End of variables declaration//GEN-END:variables

    private void loadAllDate() throws ClassNotFoundException, SQLException {
        for (String date : new ReportController().getDate()) {
            comboDate.addItem(date);
        }
    }
    private void loadAllMonth() throws ClassNotFoundException, SQLException {
        for (String month : new ReportController().getMonth()) {
            comboMonth.addItem(month);
        }
    }
    private void loadAllYear() throws ClassNotFoundException, SQLException {
        for (String year : new ReportController().getYear()) {
            comboMYear.addItem(year);
            comboYear.addItem(year);
        }
    }
}
