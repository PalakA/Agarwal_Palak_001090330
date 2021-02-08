/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import profile.BasicInfo;

/**
 *
 * @author palak
 * This JPanel creates basic information form
 */

public class CreateBasicJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateBasicJPanel
     */
    
    //Reference variable
    BasicInfo basicInfo;
    
    public CreateBasicJPanel(BasicInfo basicInfo) {
        
        initComponents();
        
        //Initialize the variable
        this.basicInfo = basicInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        lblDob = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblWSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        btnSaveBasic = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("Create Basic Information");

        lblFirstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFirstName.setText("First Name:");
        lblFirstName.setToolTipText("");

        txtFirstName.setToolTipText("");

        txtLastName.setToolTipText("");

        lblLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLastName.setText("Last Name:");
        lblLastName.setToolTipText("");

        lblPhoneNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPhoneNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNum.setText("Phone Number:");
        lblPhoneNum.setToolTipText("");

        txtPhoneNum.setToolTipText("");

        lblDob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDob.setText("Date Of Birth (MM/DD/YYYY):");
        lblDob.setToolTipText("");

        txtDob.setToolTipText("");

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("Age:");
        lblAge.setToolTipText("");

        txtAge.setToolTipText("");

        lblHeight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeight.setText("Height (in Cms):");
        lblHeight.setToolTipText("");

        txtHeight.setToolTipText("");

        lblWeight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWeight.setText("Weight (in Kgs):");
        lblWeight.setToolTipText("");

        txtWeight.setToolTipText("");

        lblWSSN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWSSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWSSN.setText("Social Security Number:");
        lblWSSN.setToolTipText("");

        txtSSN.setToolTipText("");

        btnSaveBasic.setText("Save");
        btnSaveBasic.setToolTipText("");
        btnSaveBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBasicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWeight)
                                    .addComponent(lblHeight)
                                    .addComponent(lblAge)
                                    .addComponent(lblDob))
                                .addComponent(lblPhoneNum, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(btnSaveBasic)))
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWSSN)
                        .addGap(18, 18, 18)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSaveBasic)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBasicActionPerformed
        // TODO add your handling code here:
        
        basicInfo.setFirstName(txtFirstName.getText());
        basicInfo.setLastName(txtLastName.getText());
        basicInfo.setSsn(txtSSN.getText());
        basicInfo.setPhoneNumber(txtPhoneNum.getText());
        basicInfo.setDateOfBirth(txtDob.getText());
        basicInfo.setAge(txtAge.getText());
        basicInfo.setHeight(txtHeight.getText());
        basicInfo.setWeight(txtWeight.getText());
        
        JOptionPane.showMessageDialog(this, "Basic Information Saved.");
    }//GEN-LAST:event_btnSaveBasicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveBasic;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWSSN;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}