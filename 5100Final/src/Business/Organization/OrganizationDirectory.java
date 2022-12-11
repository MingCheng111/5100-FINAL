/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;

        if (type.getValue().equals(Type.BarAssignOrganization.getValue())){
            organization = new BarAssignOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BarCheerOrganization.getValue())){
            organization = new BarCheerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TicketSalesOrganizaiton.getValue())){
            organization = new TicketSalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AfterSalesOrganization.getValue())){
            organization = new AfterSalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.WorldCupFansOrganization.getValue())){
            organization = new WorldCupFansOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CheerAgencyOrganization.getValue())){
            organization = new CheerAgencyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Population.getValue())){
            organization = new PopulationOrganization();
            organizationList.add(organization);
        }
        
        
    return organization;
    }
}