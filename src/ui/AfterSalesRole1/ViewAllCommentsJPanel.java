/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AfterSalesRole1;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.FeedBack;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MingCheng
 */
public class ViewAllCommentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AfterSaleRoleWorkJPanel
     */
   private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Game concert;
    
    
    
    public ViewAllCommentsJPanel(JPanel userProcessContainer, 
            UserAccount userAccount, 
            Game concert) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.concert =concert;
        populateTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblOrderInfo.getModel();
        model.setRowCount(0);
        
        for (FeedBack feedback:concert.getComments()) {
            Object[] row = new Object[6];
            row[0] = feedback.getOverallSocre();
            row[1] = feedback.getSocreFacility();    
            row[2] = feedback.getScoreSecurity();
            row[3] = feedback.getScoreService();
            row[4] = feedback.getScoreManage();
            row[5] = feedback.getComment();
                
            model.addRow(row);
                  
        }
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
            backBtn = new javax.swing.JButton();
            jScrollPane3 = new javax.swing.JScrollPane();
            tblOrderInfo = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();

            setLayout(null);

            jPanel1.setLayout(null);

            backBtn.setBackground(new java.awt.Color(255, 255, 255));
            backBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            backBtn.setText("Back");
            backBtn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backBtnActionPerformed(evt);
                }
            });
            jPanel1.add(backBtn);
            backBtn.setBounds(6, 0, 77, 29);

            tblOrderInfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Overall Socre", "Facility Score", "Security Score", "Service Score", "Manage Score", "Comment"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane3.setViewportView(tblOrderInfo);

            jPanel1.add(jScrollPane3);
            jScrollPane3.setBounds(0, 30, 917, 268);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/kjTczgrLk4EDPmASJEnfZB.jpeg"))); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(-5, -4, 1080, 590);

            add(jPanel1);
            jPanel1.setBounds(0, 0, 1068, 580);
        }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GameFeedBackDetailJPanel asjp = (GameFeedBackDetailJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblOrderInfo;
    // End of variables declaration//GEN-END:variables
}
