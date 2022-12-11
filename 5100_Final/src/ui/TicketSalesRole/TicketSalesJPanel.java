/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TicketSalesRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.Organization;
import Business.Organization.PopulationOrganization;
import Business.Organization.BarAssignOrganization;
import Business.Organization.BarCheerOrganization;
import Business.Organization.TicketSalesOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
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
    private BarAssignOrganization stadiumAssignOrganization;
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
                    if(o instanceof BarAssignOrganization){
                        this.stadiumAssignOrganization = (BarAssignOrganization) o;
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
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setText("Ticket Sales Part");
        add(jLabel1);
        jLabel1.setBounds(0, 6, 424, 43);
        add(jSeparator1);
        jSeparator1.setBounds(0, 55, 875, 11);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("Ticket orders:");
        add(jLabel2);
        jLabel2.setBounds(78, 104, 125, 22);

        btnCheckout.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckout.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnCheckout.setText("Check Out");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });
        add(btnCheckout);
        btnCheckout.setBounds(643, 374, 158, 29);

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
                "Game", "Bar", "Buyer", "Ticket Number", "TotalPrice", "Request Date", "Complete Date", "Status"
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

        add(jScrollPane2);
        jScrollPane2.setBounds(78, 169, 723, 187);

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
                "Game", "Bar", "Seat Number", "Sales", "Available Tickets", "Ticket Revenue"
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

        add(jScrollPane3);
        jScrollPane3.setBounds(78, 532, 723, 187);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setText("Concert Ticket Sales Condition:");
        add(jLabel3);
        jLabel3.setBounds(78, 492, 251, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/r993360_1296x729_16-9.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, -130, 900, 1000);
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


        populateConcertJTable();
        populateOrderJTable();

    }//GEN-LAST:event_btnCheckoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckout;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables
}
