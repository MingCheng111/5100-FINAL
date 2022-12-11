/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CheerAgencyRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.BarAssignOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.DecorationItem;
import Business.WorkQueue.Bar;
import Business.WorkQueue.BarDirectory;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AddNewCheerStuffJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private BarAssignOrganization stadiumAssignOrganization;
    private WorldCupFansOrganization concertOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private DecorationItem decorationItem;

    public AddNewCheerStuffJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            BarAssignOrganization stadiumAssignOrganization,
            WorldCupFansOrganization concertOrganization, 
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.stadiumAssignOrganization = stadiumAssignOrganization;
        this.concertOrganization = concertOrganization; 
        this.enterprise = enterprise;
        this.business = business;
        this.setSize(850, 800);
        
        this.decorationItem = new DecorationItem();

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                ImageIcon img = new ImageIcon(getClass().getResource("/ui/2.jpg"));
                g.drawImage(img.getImage(),0,0,1100,700,null);
            }};
            btnAddNewItem = new javax.swing.JButton();
            lblStadiumName = new javax.swing.JLabel();
            txtDecorationItemName = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            btnBack = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();

            setLayout(null);

            jPanel1.setLayout(null);

            btnAddNewItem.setBackground(new java.awt.Color(255, 255, 255));
            btnAddNewItem.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnAddNewItem.setText("Add a New Stuff");
            btnAddNewItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddNewItemActionPerformed(evt);
                }
            });
            jPanel1.add(btnAddNewItem);
            btnAddNewItem.setBounds(354, 400, 174, 29);

            lblStadiumName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblStadiumName.setText("Stuff  Name:");
            jPanel1.add(lblStadiumName);
            lblStadiumName.setBounds(280, 333, 83, 17);

            txtDecorationItemName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtDecorationItemName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtDecorationItemNameActionPerformed(evt);
                }
            });
            jPanel1.add(txtDecorationItemName);
            txtDecorationItemName.setBounds(381, 328, 160, 27);

            jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
            jLabel1.setText("Add a New Cheer Stuff");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(268, 205, 281, 30);

            btnBack.setBackground(new java.awt.Color(255, 255, 255));
            btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnBack.setText("Back");
            btnBack.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBackActionPerformed(evt);
                }
            });
            jPanel1.add(btnBack);
            btnBack.setBounds(0, 0, 77, 29);

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Champagne-Celebration.jpeg"))); // NOI18N
            jLabel3.setText("jLabel3");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(-5, -4, 1180, 780);

            add(jPanel1);
            jPanel1.setBounds(0, 0, 1300, 1000);
        }// </editor-fold>//GEN-END:initComponents

    private void txtDecorationItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecorationItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecorationItemNameActionPerformed

    private void btnAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewItemActionPerformed

        //data validation 
        if (txtDecorationItemName.getText().trim().equals("")  ){
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        decorationItem.setDecorationItemName(txtDecorationItemName.getText());
        

        //put the new stadium to stadium and concert
        stadiumAssignOrganization.getWorkQueue().getDecorationItemList().add(decorationItem);
        concertOrganization.getWorkQueue().getDecorationItemList().add(decorationItem);

        JOptionPane.showMessageDialog(this, "New Cheer Stuff has been added");
        DB4OUtil.getInstance().storeSystem(business);
        
        this.decorationItem = new DecorationItem();
        txtDecorationItemName.setText("");
        
    }//GEN-LAST:event_btnAddNewItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CheerWorkJPanel dwjp = (CheerWorkJPanel) component;
        dwjp.populateDecorationItemJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStadiumName;
    private javax.swing.JTextField txtDecorationItemName;
    // End of variables declaration//GEN-END:variables
}
