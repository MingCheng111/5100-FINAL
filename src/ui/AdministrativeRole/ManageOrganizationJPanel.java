/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MingCheng
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.AdminOrganization.getValue()))
                organizationJComboBox.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                ImageIcon img = new ImageIcon(getClass().getResource("/ui/2.jpg"));
                g.drawImage(img.getImage(),0,0,1100,700,null);
            }};
            organizationJComboBox = new javax.swing.JComboBox();
            jLabel1 = new javax.swing.JLabel();
            addJButton = new javax.swing.JButton();
            backJButton = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            organizationJTable = new javax.swing.JTable();
            jLabel2 = new javax.swing.JLabel();

            setLayout(null);

            jPanel1.setLayout(null);

            organizationJComboBox.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
            organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    organizationJComboBoxActionPerformed(evt);
                }
            });
            jPanel1.add(organizationJComboBox);
            organizationJComboBox.setBounds(381, 251, 111, 27);

            jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Organization Type ");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(232, 255, 131, 17);

            addJButton.setBackground(new java.awt.Color(255, 255, 255));
            addJButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
            addJButton.setText("Add Organization");
            addJButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addJButtonActionPerformed(evt);
                }
            });
            jPanel1.add(addJButton);
            addJButton.setBounds(546, 250, 166, 29);

            backJButton.setBackground(new java.awt.Color(255, 255, 255));
            backJButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
            backJButton.setText("<< Back");
            backJButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backJButtonActionPerformed(evt);
                }
            });
            jPanel1.add(backJButton);
            backJButton.setBounds(0, 0, 101, 29);

            organizationJTable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
            organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null},
                    {null, null},
                    {null, null},
                    {null, null}
                },
                new String [] {
                    "ID", "Name"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane1.setViewportView(organizationJTable);
            if (organizationJTable.getColumnModel().getColumnCount() > 0) {
                organizationJTable.getColumnModel().getColumn(0).setResizable(false);
                organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            }

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(232, 83, 480, 103);

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/world-cup-trophy.jpeg"))); // NOI18N
            jPanel1.add(jLabel2);
            jLabel2.setBounds(-90, -20, 1440, 1120);

            add(jPanel1);
            jPanel1.setBounds(0, 0, 1240, 1000);
        }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
