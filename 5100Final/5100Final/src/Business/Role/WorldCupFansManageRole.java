/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WorldCupFansOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.WorldCupFansManageRole.GameManageWorkAreaJPanel;

/**
 *
 * @author MingCheng
 */
public class WorldCupFansManageRole extends Role {

    @Override
    public JPanel createWorkArea(
            JPanel userProcessContainer,  
            UserAccount account, 
            Organization organization,
            Enterprise enterprise, 
            EcoSystem business) {
        return new GameManageWorkAreaJPanel(
                userProcessContainer, 
                account, 
                (WorldCupFansOrganization)organization, 
                enterprise, 
                business);
    }
    
}
