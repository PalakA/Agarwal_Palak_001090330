/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

/**
 *
 * @author palak
 * Contains all the Saving Account Information of the person.
 */

public class SavingAccInfo {
    
    private String bankName;
    private String bankRoutingNum;
    private String bankAccNum;
    private String accBalance;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String bankRoutingNum) {
        this.bankRoutingNum = bankRoutingNum;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(String accBalance) {
        this.accBalance = accBalance;
    }
    
    
}
