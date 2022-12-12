/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BarAssignRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.BarAssignOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
import Business.WorkQueue.BarDirectory;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinlang
 */
public class AddNewBarJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private BarAssignOrganization stadiumAssignOrganization;
    private WorldCupFansOrganization concertOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Bar newStadium;

    public AddNewBarJPanel(
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
        
        this.newStadium = new Bar();
        txtStadiumId.setText(String.valueOf(newStadium.getStadiumID()));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtStadiumName = new javax.swing.JTextField();
        btnAddNewStadium = new javax.swing.JButton();
        lblStadiumName = new javax.swing.JLabel();
        lblStadiumSeat = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtStadiumId = new javax.swing.JTextField();
        lblStadiumId = new javax.swing.JLabel();
        txtStadiumSeat = new javax.swing.JTextField();
        lblStadiumCity = new javax.swing.JLabel();
        txtStadiumCity = new javax.swing.JTextField();
        lblStadiumAddress = new javax.swing.JLabel();
        txtStadiumAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add a New Bar");
        add(jLabel1);
        jLabel1.setBounds(190, 150, 181, 30);

        txtStadiumName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtStadiumName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStadiumNameActionPerformed(evt);
            }
        });
        add(txtStadiumName);
        txtStadiumName.setBounds(290, 270, 140, 27);

        btnAddNewStadium.setBackground(new java.awt.Color(255, 255, 255));
        btnAddNewStadium.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnAddNewStadium.setText("Add a New Bar");
        btnAddNewStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewStadiumActionPerformed(evt);
            }
        });
        add(btnAddNewStadium);
        btnAddNewStadium.setBounds(280, 530, 149, 29);

        lblStadiumName.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblStadiumName.setForeground(new java.awt.Color(255, 255, 255));
        lblStadiumName.setText("Bar Name:");
        add(lblStadiumName);
        lblStadiumName.setBounds(150, 270, 110, 17);

        lblStadiumSeat.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblStadiumSeat.setForeground(new java.awt.Color(255, 255, 255));
        lblStadiumSeat.setText("Available Seats:");
        add(lblStadiumSeat);
        lblStadiumSeat.setBounds(150, 320, 110, 17);

        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 30, 100, 29);

        txtStadiumId.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtStadiumId.setEnabled(false);
        txtStadiumId.setFocusable(false);
        txtStadiumId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStadiumIdActionPerformed(evt);
            }
        });
        add(txtStadiumId);
        txtStadiumId.setBounds(290, 210, 140, 27);

        lblStadiumId.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblStadiumId.setForeground(new java.awt.Color(255, 255, 255));
        lblStadiumId.setText("Bar ID:");
        add(lblStadiumId);
        lblStadiumId.setBounds(150, 220, 110, 17);

        txtStadiumSeat.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtStadiumSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStadiumSeatActionPerformed(evt);
            }
        });
        add(txtStadiumSeat);
        txtStadiumSeat.setBounds(290, 320, 140, 27);

        lblStadiumCity.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblStadiumCity.setForeground(new java.awt.Color(255, 255, 255));
        lblStadiumCity.setText("City:");
        add(lblStadiumCity);
        lblStadiumCity.setBounds(150, 370, 110, 17);

        txtStadiumCity.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtStadiumCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStadiumCityActionPerformed(evt);
            }
        });
        add(txtStadiumCity);
        txtStadiumCity.setBounds(290, 370, 140, 27);

        lblStadiumAddress.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblStadiumAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblStadiumAddress.setText("Address:");
        add(lblStadiumAddress);
        lblStadiumAddress.setBounds(150, 420, 110, 17);

        txtStadiumAddress.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtStadiumAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStadiumAddressActionPerformed(evt);
            }
        });
        add(txtStadiumAddress);
        txtStadiumAddress.setBounds(290, 420, 140, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/bar1.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1300, 1000));
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1260, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStadiumNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStadiumNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStadiumNameActionPerformed

    private void btnAddNewStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewStadiumActionPerformed

        //data validation 
        if (txtStadiumId.getText().trim().equals("") || txtStadiumName.getText().trim().equals("") 
                || txtStadiumSeat.getText().trim().equals("")
                || txtStadiumCity.getText().trim().equals("") || txtStadiumAddress.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //justify whether the concert name has been used.
        Boolean used = false;
        for (Bar s : userAccount.getWorkQueue().getStadiumList()) {
                if (s.getStadiumName().equals(txtStadiumName.getText())) {
                    used = true;
                    break;
                }
            }
        if (used == true) {
            JOptionPane.showMessageDialog(this, "Bar Name has been used", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //invalidation: seat number is int
        try {
            int seat = 0;
            seat = Integer.parseInt(txtStadiumSeat.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please enter valid seat numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       
        
        newStadium.setStadiumID(Integer.parseInt(txtStadiumId.getText()));
        newStadium.setStadiumName(txtStadiumName.getText());
        newStadium.setStadiumSeat(Integer.parseInt(txtStadiumSeat.getText()));
       
        newStadium.setStadiumCity(txtStadiumCity.getText());
        newStadium.setStadiumAddress(txtStadiumAddress.getText());

        //put the new stadium to stadium and concert
        stadiumAssignOrganization.getWorkQueue().getStadiumList().add(newStadium);
        concertOrganization.getWorkQueue().getStadiumList().add(newStadium);

        JOptionPane.showMessageDialog(this, "Bar Information has been added");
        DB4OUtil.getInstance().storeSystem(business);
        
        this.newStadium = new Bar();
        txtStadiumId.setText(String.valueOf(newStadium.getStadiumID()));
        txtStadiumName.setText("");
        txtStadiumSeat.setText("");
       
        txtStadiumCity.setText("");
        txtStadiumAddress.setText("");
        
        

    }//GEN-LAST:event_btnAddNewStadiumActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageBarJPanel msjp = (ManageBarJPanel) component;
        msjp.populateStadiumJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStadiumIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStadiumIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStadiumIdActionPerformed

    private void txtStadiumSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStadiumSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStadiumSeatActionPerformed

    private void txtStadiumCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStadiumCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStadiumCityActionPerformed

    private void txtStadiumAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStadiumAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStadiumAddressActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewStadium;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStadiumAddress;
    private javax.swing.JLabel lblStadiumCity;
    private javax.swing.JLabel lblStadiumId;
    private javax.swing.JLabel lblStadiumName;
    private javax.swing.JLabel lblStadiumSeat;
    private javax.swing.JTextField txtStadiumAddress;
    private javax.swing.JTextField txtStadiumCity;
    private javax.swing.JTextField txtStadiumId;
    private javax.swing.JTextField txtStadiumName;
    private javax.swing.JTextField txtStadiumSeat;
    // End of variables declaration//GEN-END:variables
}
