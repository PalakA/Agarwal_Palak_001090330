

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount user;
    Restaurant rest;
    EcoSystem system;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount user, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.system = system;
        for(Restaurant r : system.getRestaurantDirectory().getRestaurantList())
        {
            for(Employee e : r.getEmployeeDirectory().getEmployeeList())
            {
                if(user.getEmployee() == e)
                {
                    this.rest = r;
                    valueLabel.setText(r.getName());
                }
            } 
        }
        txtName.setText(this.rest.getName());
        txtAddress.setText(this.rest.getAddress());
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Work Area - Administrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, -1));

        btnManageMenu.setText("Manage menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, -1));

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 290, 30));

        jLabel2.setText("Restaurant Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, -1));

        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 110, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
        AdminManageMenu amm = new AdminManageMenu(userProcessContainer, rest);
        userProcessContainer.add("UserCustomer", amm);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        AdminManageOrders amo = new AdminManageOrders(userProcessContainer, rest);
        userProcessContainer.add("UserCustomer", amo);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(("".equals(txtName.getText())) || ("".equals(txtAddress.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(txtName.getText() == null ? rest.getName() != null : !txtName.getText().equals(rest.getName()))
        {
            if(system.getRestaurantDirectory().checkIfRestaurantIsUnique(txtName.getText()))
            {
                rest.setName(txtName.getText());
                rest.setAddress(txtAddress.getText());
                JOptionPane.showMessageDialog(null, "Restaurant details updated!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Restaurant name not unique!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }       
        valueLabel.setText(rest.getName());
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
