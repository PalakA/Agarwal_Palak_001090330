/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import profile.CheckingAccInfo;
import profile.SavingAccInfo;

/**
 *
 * @author palak
 * This JPanel shows the Saving & Checking bank information saved
 */

public class ViewBankJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankJPanel
     */
    
    //Reference Variables
    SavingAccInfo   savingAccInfo;
    CheckingAccInfo checkingAccInfo;
    
    public ViewBankJPanel(SavingAccInfo savingAccInfo, CheckingAccInfo checkingAccInfo) {
        
        initComponents();
        
        //Initialized variables
        this.savingAccInfo   = savingAccInfo;
        this.checkingAccInfo = checkingAccInfo;
        
        displayBankInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSavingAccBalance = new javax.swing.JTextField();
        txtCheckingBankName = new javax.swing.JTextField();
        lblCheckingBankName = new javax.swing.JLabel();
        txtCheckingRoutingNum = new javax.swing.JTextField();
        lblCheckingRoutingNum = new javax.swing.JLabel();
        txtSavingBankName = new javax.swing.JTextField();
        lblCheckingAccNum = new javax.swing.JLabel();
        lblSavingBankName = new javax.swing.JLabel();
        txtSavingRoutingNum = new javax.swing.JTextField();
        txtCheckingAccNum = new javax.swing.JTextField();
        lblSavingRouteNum = new javax.swing.JLabel();
        lblCheckingAccBalance = new javax.swing.JLabel();
        lblSavingAccNum = new javax.swing.JLabel();
        txtCheckingAccBalance = new javax.swing.JTextField();
        txtSavingAccNum = new javax.swing.JTextField();
        lblSavingAccBalance = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSaving = new javax.swing.JLabel();
        lblSaving1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtSavingAccBalance.setEditable(false);

        txtCheckingBankName.setEditable(false);

        lblCheckingBankName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCheckingBankName.setText("Bank Name:");

        txtCheckingRoutingNum.setEditable(false);
        txtCheckingRoutingNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingRoutingNumActionPerformed(evt);
            }
        });

        lblCheckingRoutingNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCheckingRoutingNum.setText("Routing Number:");

        txtSavingBankName.setEditable(false);

        lblCheckingAccNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCheckingAccNum.setText("Account Number:");

        lblSavingBankName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSavingBankName.setText("Bank Name:");

        txtSavingRoutingNum.setEditable(false);

        txtCheckingAccNum.setEditable(false);

        lblSavingRouteNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSavingRouteNum.setText("Routing Number:");

        lblCheckingAccBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCheckingAccBalance.setText("Account Balance:");

        lblSavingAccNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSavingAccNum.setText("Account Number:");

        txtCheckingAccBalance.setEditable(false);

        txtSavingAccNum.setEditable(false);

        lblSavingAccBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSavingAccBalance.setText("Account Balance:");

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("View Bank Account Information");

        lblSaving.setBackground(new java.awt.Color(0, 153, 153));
        lblSaving.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaving.setForeground(new java.awt.Color(0, 153, 153));
        lblSaving.setText("Account Type: Saving");

        lblSaving1.setBackground(new java.awt.Color(0, 153, 153));
        lblSaving1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaving1.setForeground(new java.awt.Color(0, 153, 153));
        lblSaving1.setText("Account Type: Checking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSavingAccBalance)
                                .addGap(18, 18, 18)
                                .addComponent(txtSavingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSavingRouteNum)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSavingRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSavingBankName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSavingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSavingAccNum)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSavingAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCheckingAccBalance)
                                .addGap(18, 18, 18)
                                .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCheckingRoutingNum)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCheckingRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCheckingAccNum)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCheckingAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCheckingBankName)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSaving1)
                                        .addComponent(txtCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblSaving)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaving1)
                    .addComponent(lblSaving))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingBankName)
                            .addComponent(txtSavingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingRouteNum)
                            .addComponent(txtSavingRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingAccNum)
                            .addComponent(txtSavingAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSavingAccBalance)
                            .addComponent(txtSavingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingBankName)
                            .addComponent(txtCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingRoutingNum)
                            .addComponent(txtCheckingRoutingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingAccNum)
                            .addComponent(txtCheckingAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheckingAccBalance)
                            .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCheckingRoutingNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingRoutingNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingRoutingNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCheckingAccBalance;
    private javax.swing.JLabel lblCheckingAccNum;
    private javax.swing.JLabel lblCheckingBankName;
    private javax.swing.JLabel lblCheckingRoutingNum;
    private javax.swing.JLabel lblSaving;
    private javax.swing.JLabel lblSaving1;
    private javax.swing.JLabel lblSavingAccBalance;
    private javax.swing.JLabel lblSavingAccNum;
    private javax.swing.JLabel lblSavingBankName;
    private javax.swing.JLabel lblSavingRouteNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCheckingAccBalance;
    private javax.swing.JTextField txtCheckingAccNum;
    private javax.swing.JTextField txtCheckingBankName;
    private javax.swing.JTextField txtCheckingRoutingNum;
    private javax.swing.JTextField txtSavingAccBalance;
    private javax.swing.JTextField txtSavingAccNum;
    private javax.swing.JTextField txtSavingBankName;
    private javax.swing.JTextField txtSavingRoutingNum;
    // End of variables declaration//GEN-END:variables

    private void displayBankInfo() {
        txtSavingBankName.setText(savingAccInfo.getBankName());
        txtSavingRoutingNum.setText(savingAccInfo.getBankRoutingNum());
        txtSavingAccNum.setText(savingAccInfo.getBankAccNum());
        txtSavingAccBalance.setText(savingAccInfo.getAccBalance());
        txtCheckingBankName.setText(checkingAccInfo.getBankName());
        txtCheckingRoutingNum.setText(checkingAccInfo.getBankRoutingNum());
        txtCheckingAccNum.setText(checkingAccInfo.getBankAccNum());
        txtCheckingAccBalance.setText(checkingAccInfo.getAccBalance());
    }
}
