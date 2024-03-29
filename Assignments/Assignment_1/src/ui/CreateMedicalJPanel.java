/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import profile.MedicalRecords;

/**
 *
 * @author palak
 * This JPanel saves Medical Information of the Person.
 */

public class CreateMedicalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateMedicalJPanel
     */
    
    //Reference Variables
    MedicalRecords medicalRecords;
    
    public CreateMedicalJPanel(MedicalRecords medicalRecords) {
        
        initComponents();
        
        //Initialize variables
        this.medicalRecords = medicalRecords;
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
        lblRecordNum = new javax.swing.JLabel();
        txtRecordNum = new javax.swing.JTextField();
        txtAlergy1 = new javax.swing.JTextField();
        lblAlergy1 = new javax.swing.JLabel();
        txtAlergy2 = new javax.swing.JTextField();
        lblAlergy2 = new javax.swing.JLabel();
        txtAlergy3 = new javax.swing.JTextField();
        lblAlergy3 = new javax.swing.JLabel();
        btnMedicalSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("Create Medical Information");

        lblRecordNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRecordNum.setText("Medical Record Number:");

        lblAlergy1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAlergy1.setText("Alergy 1:");

        lblAlergy2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAlergy2.setText("Alergy 2:");

        lblAlergy3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAlergy3.setText("Alergy 3:");

        btnMedicalSave.setText("Save");
        btnMedicalSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRecordNum)
                        .addGap(18, 18, 18)
                        .addComponent(txtRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAlergy2)
                            .addGap(18, 18, 18)
                            .addComponent(txtAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAlergy1)
                            .addGap(18, 18, 18)
                            .addComponent(txtAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAlergy3)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMedicalSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecordNum))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergy1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergy2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergy3))
                .addGap(30, 30, 30)
                .addComponent(btnMedicalSave)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicalSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalSaveActionPerformed
        // TODO add your handling code here:
        medicalRecords.setMedicalRecordNum(txtRecordNum.getText());
        medicalRecords.setAlergy1(txtAlergy1.getText());
        medicalRecords.setAlergy2(txtAlergy2.getText());
        medicalRecords.setAlergy3(txtAlergy3.getText());
        
        JOptionPane.showMessageDialog(this, "Medical Information Saved.");
    }//GEN-LAST:event_btnMedicalSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicalSave;
    private javax.swing.JLabel lblAlergy1;
    private javax.swing.JLabel lblAlergy2;
    private javax.swing.JLabel lblAlergy3;
    private javax.swing.JLabel lblRecordNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAlergy1;
    private javax.swing.JTextField txtAlergy2;
    private javax.swing.JTextField txtAlergy3;
    private javax.swing.JTextField txtRecordNum;
    // End of variables declaration//GEN-END:variables
}
