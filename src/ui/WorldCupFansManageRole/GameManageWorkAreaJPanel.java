/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.WorldCupFansManageRole;


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
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinlang
 */
public class GameManageWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WorldCupFansOrganization concertOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    private BarAssignOrganization stadiumAssignOrganization;
    private BarCheerOrganization stadiumDesignerOrganization;
    private TicketSalesOrganization ticketSalesOrganization;
    private AfterSalesOrganization afterSalesOrganization;
    private CheerAgencyOrganization decorationOrganization;
    private PopulationOrganization populationOrganization;
    

    public GameManageWorkAreaJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            WorldCupFansOrganization concertOrganization, 
            Enterprise enterprise, 
            EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.concertOrganization = concertOrganization;
        System.out.println(concertOrganization);
        this.enterprise = enterprise;
        this.business = business;
        this.setSize(850, 800);

        populateConcertJTable();
        
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
        
        //get the stadium designer organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof BarCheerOrganization){
                        this.stadiumDesignerOrganization = (BarCheerOrganization) o;
                    }
                }
            }      
        }
        
        //get the ticket sales organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof TicketSalesOrganization){
                        this.ticketSalesOrganization = (TicketSalesOrganization) o;
                    }
                }
            }      
        }

        //get the after sales organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof AfterSalesOrganization){
                        this.afterSalesOrganization = (AfterSalesOrganization) o;
                    }
                }
            }      
        }

        //get the decoration organization
        for(Network network : business.getNetworkList()){
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof CheerAgencyOrganization){
                        this.decorationOrganization = (CheerAgencyOrganization) o;
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
        
    }

    public void populateConcertJTable() {
        
        DefaultTableModel model = (DefaultTableModel) concertJTable.getModel();
        model.setRowCount(0);
        //get info from workSend
        for (WorkRequest wr : concertOrganization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof WorkSend){
                WorkSend ws = (WorkSend) wr;
                Object[] row = new Object[9];
                row[0] = ws;
                row[1] = ws.getConcert().getCity();
                row[2] = ws.getConcert().getConcertTime();
                row[3] = ws.getStadium().getStadiumName();
                row[4] = ws.getChooseDecorationList();
                row[5] = (ws.getStadium().getStadiumSeat()==0) ? null : ws.getStadium().getStadiumSeat() ;
                row[6] = (ws.getConcert().getTicketPrice()==0) ? null : ws.getConcert().getTicketPrice() ;
                row[7] = ws.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        concertJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        btnAddNewConcert = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnChooseStadium = new javax.swing.JButton();
        txtTicketPrice = new javax.swing.JTextField();
        btnSetTicketPrice = new javax.swing.JButton();
        btnSellTickets = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        concertJTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Game", "City", "Time", "Bar", "Cheer", "TicketNumber", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(concertJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 841, 187);

        refreshTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(756, 58, 91, 29);

        btnAddNewConcert.setBackground(new java.awt.Color(255, 255, 255));
        btnAddNewConcert.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnAddNewConcert.setText("Add New Game");
        btnAddNewConcert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewConcertActionPerformed(evt);
            }
        });
        add(btnAddNewConcert);
        btnAddNewConcert.setBounds(50, 340, 162, 29);

        btnAccept.setBackground(new java.awt.Color(255, 255, 255));
        btnAccept.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(570, 340, 134, 29);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hold a Game");
        add(jLabel1);
        jLabel1.setBounds(331, 22, 157, 30);

        btnChooseStadium.setBackground(new java.awt.Color(255, 255, 255));
        btnChooseStadium.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnChooseStadium.setText("Choose a Bar");
        btnChooseStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseStadiumActionPerformed(evt);
            }
        });
        add(btnChooseStadium);
        btnChooseStadium.setBounds(310, 340, 158, 29);

        txtTicketPrice.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        txtTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketPriceActionPerformed(evt);
            }
        });
        add(txtTicketPrice);
        txtTicketPrice.setBounds(50, 380, 162, 27);

        btnSetTicketPrice.setBackground(new java.awt.Color(255, 255, 255));
        btnSetTicketPrice.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSetTicketPrice.setText("Set Ticket Price");
        btnSetTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetTicketPriceActionPerformed(evt);
            }
        });
        add(btnSetTicketPrice);
        btnSetTicketPrice.setBounds(310, 380, 162, 29);

        btnSellTickets.setBackground(new java.awt.Color(255, 255, 255));
        btnSellTickets.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSellTickets.setText("Sell Tickets");
        btnSellTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellTicketsActionPerformed(evt);
            }
        });
        add(btnSellTickets);
        btnSellTickets.setBounds(760, 340, 134, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/newGame6.jpeg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, -140, 1300, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateConcertJTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnAddNewConcertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewConcertActionPerformed

        AddNewGameJPanel ancjp = new AddNewGameJPanel(
                userProcessContainer,
                userAccount,
                concertOrganization,
                stadiumAssignOrganization, 
                stadiumDesignerOrganization,
                ticketSalesOrganization,
                afterSalesOrganization,
                decorationOrganization,
                populationOrganization,
                enterprise,
                business);
        userProcessContainer.add("AddNewConcertJPanel", ancjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewConcertActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRowIndex = concertJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);
        if(workSend.getStatus()!=Status.CheerAccept){
            JOptionPane.showMessageDialog(this, "Sorry, bar has not prepared well", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            for(WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()){
                if(wr instanceof WorkSend){
                    WorkSend ws = (WorkSend) wr;
                    if(ws.getConcert().getConcertName().equals(workSend.getConcert().getConcertName())){
                        ws.setStatus(Status.Prepared);
                        JOptionPane.showMessageDialog(this, "Bar has been prepared!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            
        }
        
        populateConcertJTable();
        DB4OUtil.getInstance().storeSystem(business);

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnChooseStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseStadiumActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);
        
        ChooseBarJPanel rsjp = new ChooseBarJPanel(
                userProcessContainer,
                userAccount,
                stadiumAssignOrganization, 
                workSend,
                enterprise,
                business);
        userProcessContainer.add("RentStadiumJPanel", rsjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
        
        
    }//GEN-LAST:event_btnChooseStadiumActionPerformed

    private void txtTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketPriceActionPerformed

    private void btnSetTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetTicketPriceActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtTicketPrice.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int price = 0;
        try {
            price = Integer.parseInt(txtTicketPrice.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please enter valid ticket price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //concert
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);
        workSend.getConcert().setTicketPrice(price);
        
        //stadium assign
        for(WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()){
            if(wr instanceof WorkSend){
                WorkSend ws1 = (WorkSend) wr;
                if(ws1 == (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0)){
                    ws1.getConcert().setTicketPrice(price);
                }
            }
        }

        populateConcertJTable();
        txtTicketPrice.setText("");
        JOptionPane.showMessageDialog(this, "Price has been set!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        
        DB4OUtil.getInstance().storeSystem(business);

        
        
    }//GEN-LAST:event_btnSetTicketPriceActionPerformed

    private void btnSellTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellTicketsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);
        
        if(workSend.getStatus()== Status.Prepared){
            for(WorkRequest wr : concertOrganization.getWorkQueue().getWorkRequestList()){
                if(wr instanceof WorkSend){
                    WorkSend ws = (WorkSend) wr;
                    if(ws.getConcert().getConcertName().equals(workSend.getConcert().getConcertName()) && workSend.getStatus()==Status.Prepared){
                        try {
                            int ticketPrice = workSend.getConcert().getTicketPrice();
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(this, "Please enter valid ticket price", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        ws.setStatus(Status.SellTickets);
                        JOptionPane.showMessageDialog(this, "You can sell tickets now!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Sorry, you cannot sell tickets!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        populateConcertJTable();
        DB4OUtil.getInstance().storeSystem(business);
    }//GEN-LAST:event_btnSellTicketsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAddNewConcert;
    private javax.swing.JButton btnChooseStadium;
    private javax.swing.JButton btnSellTickets;
    private javax.swing.JButton btnSetTicketPrice;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTextField txtTicketPrice;
    // End of variables declaration//GEN-END:variables
}
