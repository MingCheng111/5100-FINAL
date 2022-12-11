
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
import Business.Organization.Organization;


public abstract class Enterprise extends Organization{
    String name;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        BarEnterprise("Bar"),
       WorldCupFansAgency("WorldCupFansAgency"),
        CheerAgency("CheerAgency"),
//        AdvertisementCompany("AdvertisementCompany"),
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
