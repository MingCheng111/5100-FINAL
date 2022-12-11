/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Audience;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AfterSalesOrganization;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.Organization;
import Business.Organization.PopulationOrganization;
import Business.Organization.BarAssignOrganization;
import Business.Organization.BarCheerOrganization;
import Business.Organization.TicketSalesOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkOrder;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TicketOrderJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private PopulationOrganization populationOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    private BarAssignOrganization stadiumAssignOrganization;
    private WorldCupFansOrganization concertOrganization;
    private BarCheerOrganization stadiumDesignerOrganization;
    private TicketSalesOrganization ticketSalesOrganization;
    private AfterSalesOrganization afterSalesOrganization;
    private CheerAgencyOrganization decorationOrganization;
    
    
    private WorkOrder workOrder = new WorkOrder();
    private ArrayList<WorkOrder> selectOrderList = new ArrayList<>();
    
    public TicketOrderJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            PopulationOrganization populationOrganization, 
            Enterprise enterprise, 
            EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.populationOrganization = populationOrganization;
        this.enterprise = enterprise;
        this.business = business;
        this.setSize(850, 800);

        //get the stadium assign organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof BarAssignOrganization){
                        this.stadiumAssignOrganization = (BarAssignOrganization) o;
                    }
                }
            }      
        }
        
        //get the concert organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof WorldCupFansOrganization){
                        this.concertOrganization = (WorldCupFansOrganization) o;
                    }
                }
            }      
        }
        
        populateConcertJTable();
        populateOrderJTable();
    }

    public void populateConcertJTable() {
        DefaultTableModel model = (DefaultTableModel) concertJTable.getModel();
        model.setRowCount(0);
        //get info from stadiumAssign
       for (WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof WorkSend){
                WorkSend ws = (WorkSend) wr;
                Object[] row = new Object[4];
                row[0] = ws;
                row[1] = ws.getStadium();
                row[2] = ws.getConcert().getConcertTime();
                row[3] = ws.getConcert().getTicketPrice();
  
                model.addRow(row);
            }          
        }
    }


    public void populateOrderJTable() {
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        //get info from workSend
        for (WorkRequest wr : populationOrganization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof WorkOrder){
                WorkOrder wo = (WorkOrder) wr;
                if(wo.getSender().equals(userAccount)){
                    Object[] row = new Object[8];
                    row[0] = wo;
                    row[1] = wo.getStadium();
                    row[2] = wo.getConcert().getConcertTime();
                    row[3] = wo.getRequestDate() ;
                    row[4] = wo.getCompleteDate() ;
                    row[5] = wo.getOrderTicketNumber();
                    row[6] = wo.getOrderTotalPrice();
                    row[7] = wo.getStatus();

                    model.addRow(row);
                }
            }          
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        btnBuyTicket = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        concertJTable = new javax.swing.JTable();
        btnComment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Game", "Bar", "Time", "Request Date", "Complete Date", "Ticket Number", "Total Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 250, 810, 139);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tickets Order History");
        add(jLabel1);
        jLabel1.setBounds(670, 160, 270, 100);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Audience Part");
        add(jLabel2);
        jLabel2.setBounds(60, 30, 424, 43);

        btnComplete.setBackground(new java.awt.Color(255, 255, 255));
        btnComplete.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete);
        btnComplete.setBounds(650, 400, 131, 29);

        lblPrice.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        lblPrice.setText(" ");
        add(lblPrice);
        lblPrice.setBounds(220, 700, 80, 17);

        btnBuyTicket.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyTicket.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBuyTicket.setText("Buy Ticket");
        btnBuyTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyTicketActionPerformed(evt);
            }
        });
        add(btnBuyTicket);
        btnBuyTicket.setBounds(810, 610, 125, 29);

        concertJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concert", "Stadium", "Time", "Ticket Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(concertJTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(130, 460, 810, 139);

        btnComment.setBackground(new java.awt.Color(255, 255, 255));
        btnComment.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });
        add(btnComment);
        btnComment.setBounds(810, 400, 131, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/worldcup dark backgroud.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, -50, 1390, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed

        //select a row
        int selectedRowIndex = orderJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        WorkOrder workOrder = (WorkOrder) orderJTable.getValueAt(selectedRowIndex, 0);
        workOrder.setStatus(Status.Complete);
        populateOrderJTable();
            JOptionPane.showMessageDialog(this, "Thanks for coming to the game", "Warning", JOptionPane.INFORMATION_MESSAGE);
//        if(workOrder.getStatus()==Status.CheckOut){
//            workOrder.setStatus(Status.Complete);
//            populateOrderJTable();
//            JOptionPane.showMessageDialog(this, "Thanks for coming to the concert", "Warning", JOptionPane.INFORMATION_MESSAGE);
//        }else{
//            JOptionPane.showMessageDialog(this, "Sorry, concert has not prepared well", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        DB4OUtil.getInstance().storeSystem(business);
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnBuyTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyTicketActionPerformed
        // TODO add your handling code here:
        //select a row
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);

        BuyTicketJPanel btjp = new BuyTicketJPanel(
                userProcessContainer,
                userAccount,
                populationOrganization,
                workSend,
                enterprise,
                business);
        userProcessContainer.add("BuyTicketJPanel", btjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        
    }//GEN-LAST:event_btnBuyTicketActionPerformed

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentActionPerformed
        // TODO add your handling code here:
        //select a row
        int selectedRowIndex = orderJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkOrder workOrder = (WorkOrder) orderJTable.getValueAt(selectedRowIndex, 0);
        WriteFeedBackJPanel1 wfbjp = new WriteFeedBackJPanel1(
                userProcessContainer,
                userAccount,
                workOrder.getConcert()
);
        userProcessContainer.add("WriteFeedBackJPanel1", wfbjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnCommentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyTicket;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnComplete;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables
}
