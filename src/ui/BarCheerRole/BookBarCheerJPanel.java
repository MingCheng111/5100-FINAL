/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BarCheerRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.BarAssignOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import Business.WorkQueue.DecorationItem;
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
public class BookBarCheerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private BarAssignOrganization stadiumAssignOrganization;
    private WorldCupFansOrganization concertOrganization;
    private WorkSend workSend;
    private Enterprise enterprise;
    private EcoSystem business;

    DecorationItem decorationItem = new DecorationItem();
    ArrayList<DecorationItem> selectItemList = new ArrayList<>();
    int totalprice = 0;

    public BookBarCheerJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            BarAssignOrganization stadiumAssignOrganization,
            WorldCupFansOrganization concertOrganization, 
            WorkSend workSend,
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.stadiumAssignOrganization = stadiumAssignOrganization;
        this.concertOrganization = concertOrganization; 
        this.enterprise = enterprise;
        this.workSend = workSend;
        this.business = business;
        
        populateDecorationItemJTable();
        System.out.println(userAccount);
    }
    
    //refresh the stadium table
    public void populateDecorationItemJTable() {
        DefaultTableModel model = (DefaultTableModel) decorationItemJTable.getModel();
        model.setRowCount(0);
        for (DecorationItem d : stadiumAssignOrganization.getWorkQueue().getDecorationItemList()) {
            Object[] row = new Object[2];
                row[0] = d;
                row[1] = d.getDecorationItemPrice();
            model.addRow(row); 
        }
    }
    
    public void populateSelectItemJTable() {
        DefaultTableModel model = (DefaultTableModel) selectItemJTable.getModel();
        model.setRowCount(0);
        for (DecorationItem d : selectItemList) {
            Object[] row = new Object[2];
                row[0] = d;
                row[1] = d.getDecorationItemPrice();
            model.addRow(row); 
        }
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookStadiumItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        decorationItemJTable = new javax.swing.JTable();
        btnSubmitDecoration = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectItemJTable = new javax.swing.JTable();
        btnDeleteItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("Book a Bar Cheer");
        add(jLabel1);
        jLabel1.setBounds(320, 96, 210, 30);

        btnBookStadiumItem.setBackground(new java.awt.Color(255, 255, 255));
        btnBookStadiumItem.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBookStadiumItem.setText("Book Cheer Stuff");
        btnBookStadiumItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookStadiumItemActionPerformed(evt);
            }
        });
        add(btnBookStadiumItem);
        btnBookStadiumItem.setBounds(429, 341, 166, 29);

        decorationItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Bar Cheer Stuff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(decorationItemJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(260, 203, 327, 120);

        btnSubmitDecoration.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitDecoration.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSubmitDecoration.setText("Submit ");
        btnSubmitDecoration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitDecorationActionPerformed(evt);
            }
        });
        add(btnSubmitDecoration);
        btnSubmitDecoration.setBounds(455, 574, 125, 29);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel2.setText("Bar Cheer Part");
        add(jLabel2);
        jLabel2.setBounds(0, 18, 424, 43);
        add(jSeparator1);
        jSeparator1.setBounds(0, 67, 826, 11);

        selectItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Bar Cheer Stuff"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(selectItemJTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(260, 434, 335, 109);

        btnDeleteItem.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteItem.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });
        add(btnDeleteItem);
        btnDeleteItem.setBounds(283, 574, 125, 29);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(19, 101, 77, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Champagne-Celebration.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setSize(new java.awt.Dimension(1300, 1000));
        add(jLabel3);
        jLabel3.setBounds(0, -140, 1300, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookStadiumItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookStadiumItemActionPerformed
        
        //select a row
        int selectedRowIndex = decorationItemJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //get the d
        this.decorationItem = (DecorationItem) decorationItemJTable.getValueAt(selectedRowIndex, 0);
        //add to list
        selectItemList.add(decorationItem);
        populateSelectItemJTable();


    }//GEN-LAST:event_btnBookStadiumItemActionPerformed

    private void btnSubmitDecorationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitDecorationActionPerformed
        // TODO add your handling code here:
        for(WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()){
            if( wr instanceof WorkSend ){
                WorkSend ws = (WorkSend)wr;
                if(ws.getConcert().getConcertName().equals(workSend.getConcert().getConcertName())){
                    ws.setChooseDecorationList(selectItemList);
                    ws.setStatus(Status.Cheering);
                }
            }
        }
        
        for(WorkRequest wr : concertOrganization.getWorkQueue().getWorkRequestList()){
            if( wr instanceof WorkSend ){
                WorkSend ws = (WorkSend)wr;
                if(ws.getConcert().getConcertName().equals(workSend.getConcert().getConcertName())){
                    ws.setChooseDecorationList(selectItemList);
                    ws.setStatus(Status.Cheering);
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "Cheer stuff has been booked successfully!", "Information", JOptionPane.DEFAULT_OPTION);
        DB4OUtil.getInstance().storeSystem(business);
        
        //back after submit
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BarCheerJPanel sdjp = (BarCheerJPanel) component;
        sdjp.populateConcertOrderJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnSubmitDecorationActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        //select a row
        int selectedRowIndex = selectItemJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //get the d
        this.decorationItem = (DecorationItem) selectItemJTable.getValueAt(selectedRowIndex, 0);
        //delete it to list
        selectItemList.remove(decorationItem);
        JOptionPane.showMessageDialog(this, "Delete the stuff successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        populateSelectItemJTable();

        DB4OUtil.getInstance().storeSystem(business);
        
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BarCheerJPanel aswj = (BarCheerJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
       
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookStadiumItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnSubmitDecoration;
    private javax.swing.JTable decorationItemJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable selectItemJTable;
    // End of variables declaration//GEN-END:variables
}
