/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TicketSalesRole;
import java.util.ArrayList;

/**
 *
 * @author Yuemei
 */
public class TicketSalesOrganization extends Organization {
   public TicketSalesOrganization() {
        super(Organization.Type.TicketSalesOrganizaiton.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TicketSalesRole());
        return roles;
    }
    
    
}
