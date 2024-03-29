/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JLabel;
import profile.DLInfo;

/**
 *
 * @author palak
 * This JPanel helps in viewing Driver's License information of the person.
 */

public class ViewDLJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDLJPanel
     */
    
    //Reference Variable
    DLInfo dlInfo;
    JLabel dlImage;
    
    public ViewDLJPanel(DLInfo dlInfo, JLabel dlImage) {
        
        initComponents();
        
        //Initialize Variables
        this.dlInfo  = dlInfo;
        this.dlImage = dlImage;
        
        displayDLInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBloodType = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbllicenseNum = new javax.swing.JLabel();
        txtLicenseNum = new javax.swing.JTextField();
        lblIssueDate = new javax.swing.JLabel();
        txtIssueDate = new javax.swing.JTextField();
        lblExpDate = new javax.swing.JLabel();
        txtExpDate = new javax.swing.JTextField();
        lblBloodType = new javax.swing.JLabel();
        imageLabelView = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtBloodType.setEditable(false);
        txtBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodTypeActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("View Driver’s license Information");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Image:");

        lbllicenseNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbllicenseNum.setText("License Number:");

        txtLicenseNum.setEditable(false);

        lblIssueDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIssueDate.setText("Date Of Issue (MM/DD/YYYY):");

        txtIssueDate.setEditable(false);

        lblExpDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblExpDate.setText("Date Of Expiration (MM/DD/YYYY):");

        txtExpDate.setEditable(false);
        txtExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpDateActionPerformed(evt);
            }
        });

        lblBloodType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBloodType.setText("Blood Type:");

        imageLabelView.setBackground(new java.awt.Color(204, 204, 204));
        imageLabelView.setAutoscrolls(true);
        imageLabelView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllicenseNum)
                                .addGap(18, 18, 18)
                                .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(lblIssueDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblExpDate)
                                        .addComponent(lblBloodType))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(imageLabelView, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllicenseNum))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIssueDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExpDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBloodType)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(imageLabelView, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodTypeActionPerformed

    private void txtExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabelView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblExpDate;
    private javax.swing.JLabel lblIssueDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbllicenseNum;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtExpDate;
    private javax.swing.JTextField txtIssueDate;
    private javax.swing.JTextField txtLicenseNum;
    // End of variables declaration//GEN-END:variables

    private void displayDLInfo() {
        
        txtLicenseNum.setText(dlInfo.getLicenseNum());
        txtIssueDate.setText(dlInfo.getIssueDate());
        txtExpDate.setText(dlInfo.getExpDate());
        txtBloodType.setText(dlInfo.getBloodType());
        dlImage = dlInfo.getDlImage();
        if(dlImage !=null){
        imageLabelView.setIcon(dlImage.getIcon());
        }
    }
}
