/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.BarAssignRole;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class BarAssignOrganization extends Organization {
    public BarAssignOrganization(){
      super(Organization.Type.BarAssignOrganization.getValue());
     }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BarAssignRole());
        return roles;
    }
    
}
