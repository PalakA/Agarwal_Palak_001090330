/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import javax.swing.JLabel;

/**
 *
 * @author palak
 * Contains all the Driver’s license information of the person.
 */

public class DLInfo {
    
    private String licenseNum;
    private String issueDate;
    private String expDate;
    private String bloodType;
    private JLabel dlImage;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public JLabel getDlImage() {
        return dlImage;
    }

    public void setDlImage(JLabel dlImage) {
        this.dlImage = dlImage;
    }
    
    
    
}
