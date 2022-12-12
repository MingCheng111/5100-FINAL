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

/**
 *
 * @author Yuemei
 */
public class ModifyCheerStuffJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WorldCupFansOrganization concertOrganization;
    private DecorationItem decorationItem;
    private Enterprise enterprise;
    private EcoSystem business;

    public ModifyCheerStuffJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            WorldCupFansOrganization concertOrganization,
            DecorationItem decorationItem,
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.concertOrganization = concertOrganization; 
        this.decorationItem = decorationItem;
        this.enterprise = enterprise;
        this.business = business;
        this.setSize(850, 800);
       
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
            btnModifyItem = new javax.swing.JButton();
            lblStadiumName = new javax.swing.JLabel();
            txtDecorationItemName = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            btnBack = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();

            jPanel1.setLayout(null);

            btnModifyItem.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnModifyItem.setText("Modify Stuff");
            btnModifyItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnModifyItemActionPerformed(evt);
                }
            });
            jPanel1.add(btnModifyItem);
            btnModifyItem.setBounds(363, 316, 140, 29);

            lblStadiumName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblStadiumName.setText("Stuff  Name:");
            jPanel1.add(lblStadiumName);
            lblStadiumName.setBounds(285, 248, 83, 17);

            txtDecorationItemName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtDecorationItemName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtDecorationItemNameActionPerformed(evt);
                }
            });
            jPanel1.add(txtDecorationItemName);
            txtDecorationItemName.setBounds(396, 243, 140, 27);

            jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
            jLabel1.setText("Modify Cheer Stuff");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(303, 155, 233, 30);

            btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnBack.setText("Back");
            btnBack.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBackActionPerformed(evt);
                }
            });
            jPanel1.add(btnBack);
            btnBack.setBounds(0, 0, 77, 29);

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Champagne-Celebration.jpeg"))); // NOI18N
            jLabel2.setText("jLabel2");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(-5, -4, 1320, 1000);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            );
        }// </editor-fold>//GEN-END:initComponents

    private void txtDecorationItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecorationItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecorationItemNameActionPerformed

    private void btnModifyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyItemActionPerformed

        //data validation 
        if (txtDecorationItemName.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

       

        decorationItem.setDecorationItemName(txtDecorationItemName.getText());
       

 

        for(DecorationItem d : concertOrganization.getWorkQueue().getDecorationItemList()){
            if(d.getDecorationItemName().equals(decorationItem.getDecorationItemName())){
                d.setDecorationItemName(txtDecorationItemName.getText());
            
            }
        }

        JOptionPane.showMessageDialog(this, "Cheer Stuff has been modified");
        DB4OUtil.getInstance().storeSystem(business);
        
        this.decorationItem = new DecorationItem();
        txtDecorationItemName.setText("");
       
    }//GEN-LAST:event_btnModifyItemActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnModifyItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStadiumName;
    private javax.swing.JTextField txtDecorationItemName;
    // End of variables declaration//GEN-END:variables
}
