/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.WorldCupFansManageRole;


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
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinlang
 */
public class ChooseBarJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private BarAssignOrganization stadiumAssignOrganization;
    private WorkSend workSend;
    private Enterprise enterprise;
    private EcoSystem business;

    Bar bookStadium = new Bar();
    int rentDays = 0;
    int totalPrice = 0;

    public ChooseBarJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            BarAssignOrganization stadiumAssignOrganization, 
            WorkSend workSend,
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.stadiumAssignOrganization = stadiumAssignOrganization; 
        this.enterprise = enterprise;
        this.workSend = workSend;
        this.business = business;
        this.setSize(850, 800);
        
        populateStadiumJTable();
        System.out.println(userAccount);
    }
    
    //refresh the stadium table
    public void populateStadiumJTable() {
        DefaultTableModel model = (DefaultTableModel) stadiumJTable.getModel();
        model.setRowCount(0);
        for (Bar s : stadiumAssignOrganization.getWorkQueue().getStadiumList()) {
            if(s.getStadiumCity().equals(workSend.getConcert().getCity())){
                Object[] row = new Object[5];
                row[0] = s;
                row[1] = s.getStadiumCity();
                row[2] = s.getStadiumAddress();
                row[3] = s.getStadiumSeat();
                row[4] = s.getStadiumPrice();
                model.addRow(row); 
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stadiumJTable = new javax.swing.JTable();
        btnSubmitStadium = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("Book a Bar");
        add(jLabel1);
        jLabel1.setBounds(450, 120, 130, 30);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(0, 0, 77, 29);

        stadiumJTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Bar", "City", "Address", "Available Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stadiumJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 200, 691, 155);

        btnSubmitStadium.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitStadium.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSubmitStadium.setText("Submit ");
        btnSubmitStadium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitStadiumActionPerformed(evt);
            }
        });
        add(btnSubmitStadium);
        btnSubmitStadium.setBounds(690, 430, 125, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/shutterstockphotopubfootball.jpeg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, -160, 1370, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GameManageWorkAreaJPanel cmwaj = (GameManageWorkAreaJPanel) component;
        cmwaj.populateConcertJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitStadiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitStadiumActionPerformed
        // TODO add your handling code here:
           //select a row
        int selectedRowIndex = stadiumJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
  

        //get the bookStadium
        bookStadium = (Bar) stadiumJTable.getValueAt(selectedRowIndex, 0);
        
        
        
        workSend.setStadium(bookStadium);
        
        workSend.setStatus(Status.BookBar);
        System.out.println(userAccount);
        workSend.setSender(userAccount);
        System.out.println(workSend.getSender());
        workSend.setRequestDate(new Date());
        for(WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()){
            if( wr instanceof WorkSend ){
                WorkSend ws = (WorkSend)wr;
                if(ws.getConcert().getConcertName().equals(workSend.getConcert().getConcertName())){
                    ws.setStadium(bookStadium);
                    
                    ws.setStatus(Status.BookBar);
                    ws.setSender(userAccount);
                    System.out.println("ws"+ws.getSender());
                    ws.setRequestDate(new Date());
                }
            }
        }
        
        JOptionPane.showMessageDialog(this, "Bar has been booked successfully!", "Information", JOptionPane.DEFAULT_OPTION);
        DB4OUtil.getInstance().storeSystem(business);
        
        //back after submit
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GameManageWorkAreaJPanel cmwaj = (GameManageWorkAreaJPanel) component;
        cmwaj.populateConcertJTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnSubmitStadiumActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitStadium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable stadiumJTable;
    // End of variables declaration//GEN-END:variables
}
