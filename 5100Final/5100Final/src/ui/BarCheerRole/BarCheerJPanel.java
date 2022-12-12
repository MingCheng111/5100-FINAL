/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BarCheerRole;


import ui.BarAssignRole.BarAssignWorkJPanel;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.Organization;
import Business.Organization.BarAssignOrganization;
import Business.Organization.BarCheerOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Bar;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jinlang
 */
public class BarCheerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private BarCheerOrganization stadiumDesignerOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private BarAssignOrganization stadiumAssignOrganization;
    private WorldCupFansOrganization  concertOrganization;
    

    public BarCheerJPanel(
            JPanel userProcessContainer,
            UserAccount userAccount, 
            BarCheerOrganization stadiumDesignerOrganization,
            Enterprise enterprise, 
            EcoSystem business) {
        initComponents();
        this.setSize(850, 800);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.stadiumDesignerOrganization = stadiumDesignerOrganization;
        this.business = business;
        this.enterprise = enterprise;
        System.out.println(stadiumAssignOrganization);
        
       
        
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
        System.out.println(stadiumAssignOrganization);
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
        
        populateConcertOrderJTable();
    }
    
    public void populateConcertOrderJTable() {
        DefaultTableModel model = (DefaultTableModel) concertJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof WorkSend){
                WorkSend ws = (WorkSend) wr;
                Object[] row = new Object[5];
                row[0] = ws;
                row[1] = ws.getStadium().getStadiumName();
                row[2] = ws.getChooseDecorationList();
                row[3] = ws.getStatus();
                
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
        btnChooseDecoration = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        concertJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel1.setText("Bar Cheer Part");
        add(jLabel1);
        jLabel1.setBounds(70, 10, 424, 43);
        add(jSeparator1);
        jSeparator1.setBounds(0, 55, 990, 11);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel2.setText("Choose a Bar Cheer");
        add(jLabel2);
        jLabel2.setBounds(430, 190, 241, 30);

        btnChooseDecoration.setBackground(new java.awt.Color(255, 255, 255));
        btnChooseDecoration.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnChooseDecoration.setText("Choose a Cheer Stuff");
        btnChooseDecoration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDecorationActionPerformed(evt);
            }
        });
        add(btnChooseDecoration);
        btnChooseDecoration.setBounds(720, 470, 196, 29);

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
                "Game", "Bar", "Cheer Stuff", "Status"
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
        jScrollPane2.setBounds(180, 260, 723, 187);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Champagne-Celebration.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(30, -610, 1310, 1700);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseDecorationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDecorationActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = concertJTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkSend workSend = (WorkSend) concertJTable.getValueAt(selectedRowIndex, 0);

        BookBarCheerJPanel cdjp = new BookBarCheerJPanel(
            userProcessContainer,
            userAccount,
            stadiumAssignOrganization,
            concertOrganization,
            workSend,
            enterprise,
            business);
        userProcessContainer.add("ChooseDecorationJPanel", cdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnChooseDecorationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseDecoration;
    private javax.swing.JTable concertJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
