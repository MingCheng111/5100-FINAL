/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AfterSalesRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class AfterSalesOrganization extends Organization  {
   public AfterSalesOrganization() {
        super(Organization.Type.AfterSalesOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AfterSalesRole());
        return roles;
    }
    
}
