/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.controller.CustomerController;
import lk.ijse.controller.ItemController;
import lk.ijse.model.Items;
import lk.ijse.model.Supliers;

/**
 *
 * @author kushantha
 */
public class ItemSearch extends javax.swing.JFrame {

    /**
     * Creates new form ItemAddedFrame
     */
    public ItemSearch() throws ClassNotFoundException, SQLException {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        loadAllItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        txtRowNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        txtProduct = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        lblsupId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rStationery = new javax.swing.JRadioButton();
        rOthers = new javax.swing.JRadioButton();
        txtItemId = new javax.swing.JTextField();
        txtRackNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDiscription1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item search");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Item ID");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtRowNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRowNo.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtRowNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRowNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtRowNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 205, 120, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Barcode ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtBarcode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtBarcode.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 280, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Row No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qty");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Unit Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txtUnitPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUnitPrice.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 140, -1));

        txtProduct.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtProduct.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });
        txtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductKeyReleased(evt);
            }
        });
        jPanel1.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 340, -1));

        txtQty.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtQty.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 280, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Author Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txtAuthorName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAuthorName.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 300, -1));

        lblsupId.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jPanel1.add(lblsupId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        tbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Description", "Qty", "Product name", "Unit Price", "Author", "Status", "rackNo", "rowNo", "Barcode"
            }
        ));
        tbl.setRowHeight(25);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1270, 370));

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 120, 40));

        jButton4.setBackground(new java.awt.Color(204, 0, 204));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 120, 40));

        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/view/icons8_search_32px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 30, 30));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Status");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 30));

        buttonGroup1.add(rStationery);
        rStationery.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rStationery.setForeground(new java.awt.Color(255, 255, 255));
        rStationery.setText("Stationery");
        rStationery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rStationeryActionPerformed(evt);
            }
        });
        jPanel1.add(rStationery, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, 30));

        buttonGroup1.add(rOthers);
        rOthers.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rOthers.setForeground(new java.awt.Color(255, 255, 255));
        rOthers.setText("Others");
        jPanel1.add(rOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 30));

        txtItemId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtItemId.setEnabled(false);
        txtItemId.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIdActionPerformed(evt);
            }
        });
        txtItemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemIdKeyReleased(evt);
            }
        });
        jPanel1.add(txtItemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 15, 140, -1));

        txtRackNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRackNo.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtRackNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRackNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtRackNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 155, 120, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rack no");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product / publisher name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtDiscription1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDiscription1.setSelectionColor(new java.awt.Color(0, 0, 204));
        txtDiscription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscription1ActionPerformed(evt);
            }
        });
        txtDiscription1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscription1KeyReleased(evt);
            }
        });
        jPanel1.add(txtDiscription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 105, 300, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 102));
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/view/pictures/searchback1.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1270, 540));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1270, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRowNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRowNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRowNoActionPerformed

    private void txtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcodeActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        try {
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);

            for(Items temp : new ItemController().searchItems(txtSearch.getText())){
                model.addRow(new Object[]{
                    temp.getItemId(),
                    temp.getDescription(),
                    temp.getQtyOnHand(),
                    temp.getPname(),
                    temp.getUnitPrice(),
                    temp.getAuthor(),
                    temp.getStatus(),
                    temp.getRackNo(),
                    temp.getRowNo(),
                    temp.getBarcode()
                   

                });
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIdActionPerformed
        
    }//GEN-LAST:event_txtItemIdActionPerformed

    private void txtRackNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRackNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRackNoActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int i = tbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        txtItemId.setText(model.getValueAt(i, 0).toString());
        txtDiscription1.setText(model.getValueAt(i, 1).toString());
        txtQty.setText(model.getValueAt(i, 2).toString());
        txtProduct.setText(model.getValueAt(i, 3).toString());
        txtUnitPrice.setText(model.getValueAt(i, 4).toString());
        txtAuthorName.setText(model.getValueAt(i, 5).toString());
        String status = model.getValueAt(i, 6).toString();
        
            if(status.equals("Staioney")){
                rStationery.setSelected(true);
                
            }else if (status.equals("Others")){
                rOthers.setSelected(true);
            }
        
        txtRackNo.setText(model.getValueAt(i, 7).toString());
        txtRowNo.setText(model.getValueAt(i, 8).toString());
        txtBarcode.setText(model.getValueAt(i, 9).toString());
        
    }//GEN-LAST:event_tblMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            String id = txtItemId.getText();
            String discription = txtDiscription1.getText();
            int qty = Integer.parseInt(txtQty.getText());
            String pname = txtProduct.getText();
            double unitPrice = Double.parseDouble(txtUnitPrice.getText());
            String status = getStatus();
            String author = txtAuthorName.getText();
            int rackNo = Integer.parseInt(txtRackNo.getText());
            int rowNo = Integer.parseInt(txtRowNo.getText());
            String supId = lblsupId.getText();
     
            String barcode = txtBarcode.getText();
            Object isUpdate = new ItemController().updateItem(new Items(id, discription, rackNo, rowNo, qty, 
                    unitPrice, status, pname, author,barcode));
            
            
            if (isUpdate != null){
                JOptionPane.showMessageDialog(this,"Updated");
            }else{
                JOptionPane.showMessageDialog(this,"Cant Update");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if(new ItemController().deleteItem(txtItemId.getText())){
                JOptionPane.showMessageDialog(this,"Deleted");
                
            }else{
                JOptionPane.showMessageDialog(this,"Error");
                
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtItemIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemIdKeyReleased
        
         
         
    }//GEN-LAST:event_txtItemIdKeyReleased

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void txtDiscription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscription1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscription1ActionPerformed

    private void rStationeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rStationeryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rStationeryActionPerformed

    private void txtDiscription1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscription1KeyReleased
        int i = txtDiscription1.getCaretPosition();
        txtDiscription1.setText(txtDiscription1.getText().toUpperCase());
        txtDiscription1.setCaretPosition(i);
    }//GEN-LAST:event_txtDiscription1KeyReleased

    private void txtProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductKeyReleased
        int i = txtProduct.getCaretPosition();
        txtProduct.setText(txtProduct.getText().toUpperCase());
        txtProduct.setCaretPosition(i);
    }//GEN-LAST:event_txtProductKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ItemSearch().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ItemSearch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblsupId;
    private javax.swing.JRadioButton rOthers;
    private javax.swing.JRadioButton rStationery;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtDiscription1;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtRackNo;
    private javax.swing.JTextField txtRowNo;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void loadAllItem() throws ClassNotFoundException, SQLException {
        DefaultTableModel model =(DefaultTableModel) tbl.getModel();
        for(Items temp : new ItemController().getAllItems()){
            model.addRow(new Object[]{
                temp.getItemId(),
                temp.getDescription(),
                temp.getQtyOnHand(),
                temp.getPname(),
                temp.getUnitPrice(),
                temp.getAuthor(),
                temp.getStatus(),
                temp.getRackNo(),
                temp.getRowNo(),
                temp.getBarcode()
                
                 
                 
                 
            });
        }
    }

    private String getStatus() {
        String status = "";
        if(rStationery.isSelected()){
            status = "stationery";
        }else if(rOthers.isSelected()){
            status = "others";
        }
        return status;
    }
}