/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CheerAgencyManageRole;
import Business.Role.Role;
import java.util.ArrayList;


public class CheerAgencyOrganization extends Organization  {
    
   public CheerAgencyOrganization() {
        super(Organization.Type.CheerAgencyOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CheerAgencyManageRole());
        return roles;
    }
    
}