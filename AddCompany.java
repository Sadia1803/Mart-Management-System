/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.CompanyFunctions;
import java.awt.event.KeyEvent;

/**
 *
 * @author Farhan
 */
public class AddCompany extends javax.swing.JFrame {
    CompanyFunctions companyFunctions = new CompanyFunctions();
    
    /**
     * Creates new form AddCompany
     */
    public AddCompany() {
        this.setResizable(false);
        companyFunctions.setCompanyFunctions(this, null, null, null);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        companyIdField = new javax.swing.JTextField();
        companyNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Company");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(82, 91, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 34, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add_100px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(82, 91, 86));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Add Company...");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, 40));

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Undo_32px.png"))); // NOI18N
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(51, 51, 51));
        add.setText("Add");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addKeyPressed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 110, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jSeparator7.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, 20));

        jSeparator8.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 20));

        companyIdField.setBackground(new java.awt.Color(82, 91, 86));
        companyIdField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        companyIdField.setForeground(new java.awt.Color(255, 255, 255));
        companyIdField.setText("Enter ID");
        companyIdField.setBorder(null);
        companyIdField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        companyIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                companyIdFieldFocusGained(evt);
            }
        });
        jPanel1.add(companyIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 30));

        companyNameField.setBackground(new java.awt.Color(82, 91, 86));
        companyNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        companyNameField.setForeground(new java.awt.Color(255, 255, 255));
        companyNameField.setText("Enter Name");
        companyNameField.setBorder(null);
        companyNameField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        companyNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                companyNameFieldFocusGained(evt);
            }
        });
        jPanel1.add(companyNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        CompanyOperations companyOperations = new CompanyOperations();
        companyOperations.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE ){
        CompanyOperations companyOperations = new CompanyOperations();
        companyOperations.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_backKeyPressed

    private void companyNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_companyNameFieldFocusGained
        companyNameField.setText("");
    }//GEN-LAST:event_companyNameFieldFocusGained

    private void companyIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_companyIdFieldFocusGained
        companyIdField.setText("");
    }//GEN-LAST:event_companyIdFieldFocusGained

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        companyFunctions.addCompany();
        companyIdField.setText("");
        companyNameField.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void addKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            companyFunctions.addCompany();
            companyIdField.setText("");
            companyNameField.setText("");
        }
    }//GEN-LAST:event_addKeyPressed

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
            java.util.logging.Logger.getLogger(AddCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    public javax.swing.JTextField companyIdField;
    public javax.swing.JTextField companyNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}