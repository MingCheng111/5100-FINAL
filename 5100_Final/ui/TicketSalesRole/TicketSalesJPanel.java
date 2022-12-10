/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TicketSalesRole;


import ui.StadiumDecorationRole.*;
import ui.StadiumAssignRole.*;
import Business.DB4OUtil.DB4OUtil;
import ui.ConcertManagerRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdOrganization;
import Business.Organization.ConcertOrganization;
import Business.Organization.DecorationOrganization;
import Business.Organization.Organization;
import Business.Organization.PopulationOrganization;
import Business.Organization.StadiumAssignOrganization;
import Business.Organization.StadiumDesignerOrganization;
import Business.Organization.TicketSalesOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Concert;
import Business.WorkQueue.Stadium;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkOrder;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TicketSalesJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private TicketSalesOrganization ticketSalesOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private StadiumAssignOrganization stadiumAssignOrganization;
    private PopulationOrganization  populationOrganization;
    
    private WorkSend workSend = new WorkSend();
    private int availableTickets;
    private int sales;

    public TicketSalesJPanel(
            JPanel userProcessContainer,
            UserAccount userAccount, 
            TicketSalesOrganization ticketSalesOrganization,
            Enterprise enterprise, 
            EcoSystem business) {
        initComponents();
        this.setSize(850, 800);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ticketSalesOrganization = ticketSalesOrganization;
        this.business = business;
        this.enterprise = enterprise;

        
        //get the stadium assign organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof StadiumAssignOrganization){
                        this.stadiumAssignOrganization = (StadiumAssignOrganization) o;
                    }
                }
            }      
        }

        //get the population organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof PopulationOrganization){
                        this.populationOrganization = (PopulationOrganization) o;
                    }
                }
            }      
        }
        
        populateOrderJTable();
        populateConcertJTable();
    }
    
    public void populateOrderJTable() {
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : populationOrganization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof WorkOrder){
                WorkOrder wo = (WorkOrder) wr;
                Object[] row = new Object[8];
                row[0] = wo;
                row[1] = wo.getStadium().getStadiumName();
                row[2] = wo.getSender();
                row[3] = wo.getOrderTicketNumber();
                row[4] = wo.getOrderTotalPrice();
                row[5] = wo.getRequestDate();
                row[6] = wo.getCompleteDate();
                row[7] = wo.getStatus();
                
                model.addRow(row); 
            }
        }
    }
    
    public void populateConcertJTable() {
        DefaultTableModel model = (DefaultTableModel) concertJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()) {
            System.out.println("populate");
            if(wr instanceof WorkSend){
                WorkSend ws = (WorkSend) wr;
                Object[] row = new Object[6];
                row[0] = ws;
                row[1] = ws.getStadium();
                row[2] = ws.getStadium().getStadiumSeat();
                int sales = 0;
                for (WorkRequest wr2 : populationOrganization.getWorkQueue().getWorkRequestList()) {
                    if(wr2 instanceof WorkOrder){
                        WorkOrder wo = (WorkOrder) wr2;
                        if(wo.getConcert().getConcertName().equals(ws.getConcert().getConcertName()) && wo.getStatus()==Status.CheckOut)
                        sales += wo.getOrderTicketNumber();
                    }    
                }
                row[3] = sales;
                row[4] = ws.getStadium().getStadiumSeat()-sales;
                row[5] = sales*ws.getConcert().getTicketPrice();
                
                model.addRow(row); 
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        concertJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setText("Ticket Sales Part");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Ticket orders:");

        btnCheckout.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckout.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnCheckout.setText("Check Out");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

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
                "Concert", "Stadium", "Buyer", "Ticket Number", "TotalPrice", "Request Date", "Complete Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderJTable);
        if (orderJTable.getColumnModel().getColumnCount() > 0) {
            orderJTable.getColumnModel().getColumn(2).setHeaderValue("Buyer");
            orderJTable.getColumnModel().getColumn(7).setHeaderValue("Status");
        }

        concertJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Concert", "Stadium", "Seat Number", "Sales", "Available Tickets", "Ticket Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(concertJTable);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Concert Ticket Sales Condition:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/s3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel7)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = orderJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkOrder workOrder = (WorkOrder) orderJTable.getValueAt(selectedRowIndex, 0);
        
        workOrder.setStatus(Status.CheckOut);
        JOptionPane.showMessageDialog(this, "Check out the order successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);

//        if(workOrder.getStatus().equals(Status.BuyTickets)){
//            System.out.println(workOrder.getStatus());
//            workOrder.setStatus(Status.CheckOut);
//            System.out.println(workOrder.getStatus());
//            JOptionPane.showMessageDialog(this, "Check out the order successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
//        }else{
//            JOptionPane.showMessageDialog(this, "You cannot check out the order", "Warning", JOptionPane.WARNING_MESSAGE);
//        }
        populateConcertJTable();
        populateOrderJTable();

    }//GEN-LAST:event_btnCheckoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckout;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables
}
