/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.WorldCupFansManageRole;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AfterSalesOrganization;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.CheerAgencyOrganization;
import Business.Organization.PopulationOrganization;
import Business.Organization.BarAssignOrganization;
import Business.Organization.BarCheerOrganization;
import Business.Organization.TicketSalesOrganization;


import Business.UserAccount.UserAccount;
import Business.WorkQueue.Game;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkSend;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AddNewGameJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WorldCupFansOrganization concertOrganization;
    private BarAssignOrganization stadiumAssignOrganization;
    private BarCheerOrganization stadiumDesignerOrganization;
    private TicketSalesOrganization ticketSalesOrganization;
    private AfterSalesOrganization afterSalesOrganization;
    private CheerAgencyOrganization decorationOrganization;
    private PopulationOrganization populationOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Game concert;

    public AddNewGameJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            WorldCupFansOrganization concertOrganization,
            BarAssignOrganization stadiumAssignOrganization, 
            BarCheerOrganization stadiumDesignerOrganization,
            TicketSalesOrganization ticketSalesOrganization,
            AfterSalesOrganization afterSalesOrganization,
            CheerAgencyOrganization decorationOrganization,
            PopulationOrganization populationOrganization,
            Enterprise enterprise, 
            EcoSystem business){
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.concertOrganization = concertOrganization;  
        this.stadiumAssignOrganization = stadiumAssignOrganization;  
        this.stadiumDesignerOrganization = stadiumDesignerOrganization;  
        this.ticketSalesOrganization = ticketSalesOrganization;
        this.afterSalesOrganization = afterSalesOrganization;
        this.decorationOrganization = decorationOrganization;  
        this.populationOrganization = populationOrganization;
        
        this.enterprise = enterprise;
        this.business = business;
        this.setSize(850, 800);
        
        this.concert = new Game();
        
        txtConcertId.setText(String.valueOf(concert.getConcertId()));
       
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
            btnAddNewConcert = new javax.swing.JButton();
            lblConcertId = new javax.swing.JLabel();
            txtConcertId = new javax.swing.JTextField();
            lblConcertName = new javax.swing.JLabel();
            txtConcertName = new javax.swing.JTextField();
            lblConcertName1 = new javax.swing.JLabel();
            txtConcertTime = new javax.swing.JTextField();
            lblConcertName2 = new javax.swing.JLabel();
            txtCity = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            btnBack = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();

            setBackground(new java.awt.Color(255, 255, 255));

            jPanel1.setLayout(null);

            btnAddNewConcert.setBackground(new java.awt.Color(255, 255, 255));
            btnAddNewConcert.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnAddNewConcert.setText("Add a New Game");
            btnAddNewConcert.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddNewConcertActionPerformed(evt);
                }
            });
            jPanel1.add(btnAddNewConcert);
            btnAddNewConcert.setBounds(352, 531, 166, 29);

            lblConcertId.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblConcertId.setForeground(new java.awt.Color(255, 255, 255));
            lblConcertId.setText("Game ID:");
            jPanel1.add(lblConcertId);
            lblConcertId.setBounds(283, 313, 95, 17);

            txtConcertId.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtConcertId.setFocusable(false);
            txtConcertId.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtConcertIdActionPerformed(evt);
                }
            });
            jPanel1.add(txtConcertId);
            txtConcertId.setBounds(406, 308, 140, 27);

            lblConcertName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblConcertName.setForeground(new java.awt.Color(255, 255, 255));
            lblConcertName.setText("Game Name:");
            jPanel1.add(lblConcertName);
            lblConcertName.setBounds(283, 358, 95, 17);

            txtConcertName.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtConcertName.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtConcertNameActionPerformed(evt);
                }
            });
            jPanel1.add(txtConcertName);
            txtConcertName.setBounds(406, 353, 140, 27);

            lblConcertName1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblConcertName1.setForeground(new java.awt.Color(255, 255, 255));
            lblConcertName1.setText("Game Time:");
            jPanel1.add(lblConcertName1);
            lblConcertName1.setBounds(283, 403, 95, 17);

            txtConcertTime.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtConcertTime.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtConcertTimeActionPerformed(evt);
                }
            });
            txtConcertTime.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtConcertTimeKeyPressed(evt);
                }
            });
            jPanel1.add(txtConcertTime);
            txtConcertTime.setBounds(406, 398, 140, 27);

            lblConcertName2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            lblConcertName2.setForeground(new java.awt.Color(255, 255, 255));
            lblConcertName2.setText("City:");
            jPanel1.add(lblConcertName2);
            lblConcertName2.setBounds(283, 448, 95, 17);

            txtCity.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
            txtCity.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtCityActionPerformed(evt);
                }
            });
            jPanel1.add(txtCity);
            txtCity.setBounds(406, 443, 140, 27);

            jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Add a New Game");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(313, 240, 210, 30);

            btnBack.setBackground(new java.awt.Color(255, 255, 255));
            btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
            btnBack.setText("Back");
            btnBack.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBackActionPerformed(evt);
                }
            });
            jPanel1.add(btnBack);
            btnBack.setBounds(0, 0, 77, 29);

            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/shutterstockphotopubfootball.jpeg"))); // NOI18N
            jLabel2.setText("jLabel2");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(-20, -40, 970, 880);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }// </editor-fold>//GEN-END:initComponents

    private void txtConcertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConcertNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConcertNameActionPerformed

    private void btnAddNewConcertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewConcertActionPerformed

        //data validation
        if (txtConcertName.getText().trim().equals("") || txtCity.getText().trim().equals("") 
                || txtConcertTime.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //justify whether the concert name has been used.
        Boolean used = false;
        for(WorkRequest wr : stadiumAssignOrganization.getWorkQueue().getWorkRequestList()){
            if (wr instanceof WorkSend){
                WorkSend workSend = (WorkSend) wr;
                if ( workSend.getConcert().getConcertName().equals(txtConcertName.getText())) {
                    used = true;
                    break;
                }
            }
        } 
        if (used == true) {
            JOptionPane.showMessageDialog(this, "Game Name has been used", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        concert.setConcertId(Integer.parseInt(txtConcertId.getText()));
        concert.setConcertName(txtConcertName.getText());
        concert.setConcertTime(txtConcertTime.getText());
        concert.setCity(txtCity.getText());
        
        //add new workSend for both agency and stadiumAssign
        WorkSend workSend = new WorkSend();
        workSend.setStatus(Status.Started);
        //workSend.setSender(userAccount);
        workSend.setConcert(concert);
        concertOrganization.getWorkQueue().getWorkRequestList().add(workSend);
        stadiumAssignOrganization.getWorkQueue().getWorkRequestList().add(workSend);
        //stadiumDesignerOrganization.getWorkQueue().getWorkRequestList().add(workSend);
        //ticketSalesOrganization.getWorkQueue().getWorkRequestList().add(workOrder);
        //decorationOrganization.getWorkQueue().getWorkRequestList().add(workSend);
        //adOrganization.getWorkQueue().getWorkRequestList().add(workSend);

        JOptionPane.showMessageDialog(this, "Game Information has been added");
        DB4OUtil.getInstance().storeSystem(business);
        //clear the input
        this.concert = new Game();
        txtConcertId.setText(String.valueOf(concert.getConcertId()));
        txtConcertName.setText("");
        txtConcertTime.setText("");
        txtCity.setText("");


    }//GEN-LAST:event_btnAddNewConcertActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

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

    private void txtConcertIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConcertIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConcertIdActionPerformed

    private void txtConcertTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConcertTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConcertTimeActionPerformed

    private void txtConcertTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConcertTimeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)|| Character.isWhitespace(SOMEBITS)||Character.isISOControl(c)){
        JOptionPane.showMessageDialog(this, "Please input right time!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtConcertTimeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewConcert;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConcertId;
    private javax.swing.JLabel lblConcertName;
    private javax.swing.JLabel lblConcertName1;
    private javax.swing.JLabel lblConcertName2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtConcertId;
    private javax.swing.JTextField txtConcertName;
    private javax.swing.JTextField txtConcertTime;
    // End of variables declaration//GEN-END:variables
}
