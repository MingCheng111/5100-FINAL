/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Audience;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.PopulationOrganization;
import Business.Organization.BarAssignOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkOrder;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BuyTicketJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private PopulationOrganization populationOrganization;
    private WorkSend workSend;
    private Enterprise enterprise;
    private EcoSystem business;

    WorkOrder newWorkOrder = new WorkOrder();
    int ticketNumber = 0;
    int totalPrice = 0;

    public BuyTicketJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            PopulationOrganization populationOrganization, 
            WorkSend workSend,
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.populationOrganization = populationOrganization; 
        this.enterprise = enterprise;
        this.workSend = workSend;
        this.business = business;
        this.setSize(850, 800);
        
        populateConcertJTable();
    }
    
    //refresh the stadium table
    public void populateConcertJTable() {
        DefaultTableModel model = (DefaultTableModel) concertJTable.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[6];
        row[0] = this.workSend;
        row[1] = workSend.getConcert().getCity();
        row[2] = workSend.getStadium().getStadiumAddress();
        row[3] = workSend.getStadium();
        row[4] = workSend.getConcert().getConcertTime();
        row[5] = workSend.getConcert().getTicketPrice();

        model.addRow(row); 
    }
    
    public void populateTicketJTable() {
        DefaultTableModel model = (DefaultTableModel) ticketJTable.getModel();
        model.setRowCount(0);

        Object[] row = new Object[4];
        row[0] = this.workSend;
        row[1] = workSend.getConcert().getTicketPrice();
        row[2] = ticketNumber;
        row[3] = totalPrice;
        model.addRow(row); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        concertJTable = new javax.swing.JTable();
        lblRentDays = new javax.swing.JLabel();
        btnSubmitStadium = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ticketJTable = new javax.swing.JTable();
        txtTicketNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("Book a Game");
        add(jLabel1);
        jLabel1.setBounds(416, 110, 159, 30);

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder);
        btnOrder.setBounds(732, 285, 132, 29);

        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(0, 55, 77, 29);

        concertJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Game", "City", "Address", "Bar", "Time", "Ticket Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(concertJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(173, 152, 691, 115);

        lblRentDays.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        lblRentDays.setText("How many tickets you wanna buy:");
        add(lblRentDays);
        lblRentDays.setBounds(173, 290, 230, 17);

        btnSubmitStadium.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitStadium.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSubmitStadium.setText("Submit ");
        btnSubmitStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitStadiumActionPerformed(evt);
            }
        });
        add(btnSubmitStadium);
        btnSubmitStadium.setBounds(743, 495, 121, 29);
        add(jSeparator1);
        jSeparator1.setBounds(83, 55, 933, 11);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel2.setText("Audience Part");
        add(jLabel2);
        jLabel2.setBounds(0, 6, 424, 43);

        ticketJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Game", "Ticket Price", "Ticket Number", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ticketJTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(173, 362, 691, 115);

        txtTicketNumber.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtTicketNumber.setText(" ");
        add(txtTicketNumber);
        txtTicketNumber.setBounds(415, 285, 76, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/r993360_1296x729_16-9.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(-5, -4, 1020, 830);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        
        //select a row
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //data validation
        int ticket = 0;
        //null validation
        if (txtTicketNumber.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Ticket numbers cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(Integer.parseInt(txtTicketNumber.getText())<=0){
            JOptionPane.showMessageDialog(this, "Please enter valid ticket numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //int validation
        try {
            ticket = Integer.parseInt(txtTicketNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter valid ticket numbers", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //get the workSend
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);
        //add to user workSend
        ticketNumber = Integer.parseInt(txtTicketNumber.getText());
        totalPrice = workSend.getConcert().getTicketPrice()*ticketNumber;
        //clear rent days
        populateTicketJTable();



    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TicketOrderJPanel tojp = (TicketOrderJPanel) component;
        tojp.populateOrderJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitStadiumActionPerformed
        // TODO add your handling code here:

        newWorkOrder.setConcert(workSend.getConcert());
        newWorkOrder.setStadium(workSend.getStadium());
        newWorkOrder.setOrderTicketNumber(ticketNumber);
        newWorkOrder.setStatus(Status.BuyTickets);
        newWorkOrder.setSender(userAccount);
        newWorkOrder.setRequestDate(new Date());

        populationOrganization.getWorkQueue().getWorkRequestList().add(newWorkOrder);
        JOptionPane.showMessageDialog(this, "You have order the ticket successfully!", "Information", JOptionPane.DEFAULT_OPTION);
        DB4OUtil.getInstance().storeSystem(business);
        
        //back after submit
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TicketOrderJPanel tojp = (TicketOrderJPanel) component;
        tojp.populateOrderJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnSubmitStadiumActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnSubmitStadium;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRentDays;
    private javax.swing.JTable ticketJTable;
    private javax.swing.JTextField txtTicketNumber;
    // End of variables declaration//GEN-END:variables
}
