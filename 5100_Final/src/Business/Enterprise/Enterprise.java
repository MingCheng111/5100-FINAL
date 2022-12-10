/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import Organization.OrganizationDirectory;

/**
 *
 * @author JINLANG
 */
public abstract class Enterprise {
    private String name;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        SportsLotteryEnterprise("SportsLotteryEnterprise"),
        StadiumEnterprise("Stadium"),
        SalesAgency("SalesAgency"),
        PlanningEnterprise("PlanningEnterprise"),
        AdvertisingEnterprise("AdvertisingEnterprise"),
        Population("Population");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public Enterprise(String name, EnterpriseType enterpriseType) {
        this.name = name;
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    
    
}
