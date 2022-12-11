/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.BarCheerRole;
import java.util.ArrayList;

/**
 *
 * @author MingCheng
 */
public class BarCheerOrganization extends Organization {
    public BarCheerOrganization(){
      super(Organization.Type.BarCheerOrganization.getValue());
     }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BarCheerRole());
      
        return roles;
    }
    
}
