/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.event.KeyEvent;

/**
 *
 * @author Farhan
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
    }
    public void usernameAdmin(String userAdmin){
        adminId.setText(userAdmin);
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
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customer = new javax.swing.JButton();
        product = new javax.swing.JButton();
        transactions = new javax.swing.JButton();
        cashier = new javax.swing.JButton();
        company = new javax.swing.JButton();
        category = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(82, 91, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 34, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout_32px.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backKeyPressed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin_100px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(82, 91, 86));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("ID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 40, 40));

        adminId.setBackground(new java.awt.Color(82, 91, 86));
        adminId.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        adminId.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(adminId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 40));

        jLabel4.setBackground(new java.awt.Color(82, 91, 86));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Admin...");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        customer.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        customer.setForeground(new java.awt.Color(19, 34, 38));
        customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Customer_100px.png"))); // NOI18N
        customer.setText("Customer");
        customer.setBorder(null);
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        customer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerKeyPressed(evt);
            }
        });
        jPanel1.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 200, 120));

        product.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        product.setForeground(new java.awt.Color(19, 34, 38));
        product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Product_100px.png"))); // NOI18N
        product.setText("Product");
        product.setBorder(null);
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productKeyPressed(evt);
            }
        });
        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 120));

        transactions.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        transactions.setForeground(new java.awt.Color(19, 34, 38));
        transactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chart_100px.png"))); // NOI18N
        transactions.setText("Transactions");
        transactions.setBorder(null);
        transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsActionPerformed(evt);
            }
        });
        transactions.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transactionsKeyPressed(evt);
            }
        });
        jPanel1.add(transactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 200, 120));

        cashier.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        cashier.setForeground(new java.awt.Color(19, 34, 38));
        cashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cashier_100px.png"))); // NOI18N
        cashier.setText("Cashier");
        cashier.setBorder(null);
        cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierActionPerformed(evt);
            }
        });
        cashier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cashierKeyPressed(evt);
            }
        });
        jPanel1.add(cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 200, 120));

        company.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        company.setForeground(new java.awt.Color(19, 34, 38));
        company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Company_100px.png"))); // NOI18N
        company.setText("Company");
        company.setBorder(null);
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        company.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                companyKeyPressed(evt);
            }
        });
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, 120));

        category.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        category.setForeground(new java.awt.Color(19, 34, 38));
        category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Category_100px.png"))); // NOI18N
        category.setText("Category");
        category.setBorder(null);
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoryKeyPressed(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        LoginAdmin loginAdmin = new LoginAdmin();
        loginAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE ){
            LoginAdmin loginAdmin = new LoginAdmin();
            loginAdmin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backKeyPressed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        ProductOperations productOperations = new ProductOperations();
        productOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productActionPerformed

    private void productKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        ProductOperations productOperations = new ProductOperations();
        productOperations.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_productKeyPressed

    private void cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierActionPerformed
        CashierOperations cashierOperations = new CashierOperations();
        cashierOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cashierActionPerformed

    private void cashierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashierKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        CashierOperations cashierOperations = new CashierOperations();
        cashierOperations.setVisible(true);
        this.dispose();
        }   
    }//GEN-LAST:event_cashierKeyPressed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        CustomerOperations customerOperations = new CustomerOperations();
        customerOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerActionPerformed

    private void customerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        CustomerOperations customerOperations = new CustomerOperations();
        customerOperations.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_customerKeyPressed

    private void transactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsActionPerformed
        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactionsActionPerformed

    private void transactionsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transactionsKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_transactionsKeyPressed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        CompanyOperations companyOperations = new CompanyOperations();
        companyOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_companyActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        CategoryOperations categoryOperations = new CategoryOperations();
        categoryOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryActionPerformed

    private void categoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          CategoryOperations categoryOperations = new CategoryOperations();
        categoryOperations.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_categoryKeyPressed

    private void companyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          CompanyOperations companyOperations = new CompanyOperations();
        companyOperations.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_companyKeyPressed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel adminId;
    private javax.swing.JButton back;
    private javax.swing.JButton cashier;
    private javax.swing.JButton category;
    private javax.swing.JButton company;
    private javax.swing.JButton customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton product;
    private javax.swing.JButton transactions;
    // End of variables declaration//GEN-END:variables
}
