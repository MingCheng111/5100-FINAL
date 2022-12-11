
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
/**
 *
 * @author MingCheng
 */

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

import java.util.ArrayList;


public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.BarEnterprise){
            enterprise=new BarEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Population){
            enterprise=new PopulationEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.WorldCupFansAgency){
            enterprise=new WorldCupFansAgency(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.CheerAgency){
            enterprise=new CheerAgency(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
