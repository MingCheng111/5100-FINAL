/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author MingCheng
 */



public class CheerAgency extends Enterprise{
    
    public CheerAgency(String name) {
       //To change body of generated methods, choose Tools | Templates.
       super(name, Enterprise.EnterpriseType.CheerAgency);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         //To change body of generated methods, choose Tools | Templates.
         return null;
    }
    
}