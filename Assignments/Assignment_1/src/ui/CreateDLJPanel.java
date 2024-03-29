/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import profile.DLInfo;

/**
 *
 * @author palak
 * This JPanel saves the Driver's License Information of the Person.
 */

public class CreateDLJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDLJPanel
     */
    
    //Reference Variables
    DLInfo dlInfo;
    JLabel tLabel;
    
    public CreateDLJPanel(DLInfo dlInfo, JLabel dlImage) {
        
        initComponents();
        
        //Initialize variable
        this.dlInfo = dlInfo;
        //Object creation of class JLabel        
        tLabel = new JLabel();
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
        lbllicenseNum = new javax.swing.JLabel();
        txtLicenseNum = new javax.swing.JTextField();
        lblIssueDate = new javax.swing.JLabel();
        txtIssueDate = new javax.swing.JTextField();
        lblExpDate = new javax.swing.JLabel();
        txtExpDate = new javax.swing.JTextField();
        lblBloodType = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDLSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 153, 153));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("Create Driver’s license Information");

        lbllicenseNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbllicenseNum.setText("License Number:");

        lblIssueDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIssueDate.setText("Date Of Issue (MM/DD/YYYY):");

        lblExpDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblExpDate.setText("Date Of Expiration (MM/DD/YYYY):");

        txtExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpDateActionPerformed(evt);
            }
        });

        lblBloodType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBloodType.setText("Blood Type:");

        txtBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodTypeActionPerformed(evt);
            }
        });

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Image:");

        btnDLSave.setText("Save");
        btnDLSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDLSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDLSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIssueDate)
                                    .addComponent(lblExpDate)
                                    .addComponent(lblBloodType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllicenseNum)
                                .addGap(18, 18, 18)
                                .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbllicenseNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIssueDate))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExpDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloodType))
                .addGap(35, 35, 35)
                .addComponent(btnDLSave)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpDateActionPerformed

    private void txtBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodTypeActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser;
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("user.dir"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpeg","jpg","png","gif");
        FileFilter filter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        chooser.addChoosableFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(true);
        int selectedPic = chooser.showSaveDialog(null);
        if(selectedPic == JFileChooser.APPROVE_OPTION){
            //sellect File is a reference variable.
            File selectPic = chooser.getSelectedFile();
            tLabel.setBounds(20, 20, 200, 200);
            tLabel.setIcon(setPicture(selectPic.getAbsolutePath(),tLabel));
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private ImageIcon setPicture(String dlImageLocation, JLabel dlImage){
        ImageIcon ImageDL;
        ImageDL = new ImageIcon(dlImageLocation);
        Image picImage = ImageDL.getImage();
        Image resizedImage = picImage.getScaledInstance(dlImage.getWidth(), dlImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedDLPicture = new ImageIcon(resizedImage);
        return selectedDLPicture;
    }
    private void btnDLSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDLSaveActionPerformed
        // TODO add your handling code here:
        dlInfo.setLicenseNum(txtLicenseNum.getText());
        dlInfo.setIssueDate(txtIssueDate.getText());
        dlInfo.setExpDate(txtExpDate.getText());
        dlInfo.setBloodType(txtBloodType.getText());
        dlInfo.setDlImage(tLabel);
        
        JOptionPane.showMessageDialog(this, "Driver’s license Information Saved.");
    }//GEN-LAST:event_btnDLSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDLSave;
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
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
