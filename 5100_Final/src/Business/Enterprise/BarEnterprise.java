/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.BarDirectory;
import java.util.ArrayList;


public class BarEnterprise extends Enterprise {
    //public static ArrayList<> stadiumList = new ArrayList<>();
    //private BarDirectory newStadiumList;
    //static BarDirectory sdy =null;

   public BarEnterprise(String name) {
       //To change body of generated methods, choose Tools | Templates.
       super(name, EnterpriseType.BarEnterprise);
       
       
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         //To change body of generated methods, choose Tools | Templates.
         return null;
    }
    
    
    
}
