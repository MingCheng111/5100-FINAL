/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organization;

import Employee.EmployeeDirectory;
import Role.Role;
import UerAccount.UserAccountDirectory;
import WorldCupSystem.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author JINLANG
 */
public abstract class Organization {
    private String name;
    private ArrayList<Role> roleList;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public enum OrganizationType{
        AdminOrganization("Admin Organization"),
        
        StadiumAssignOrganization("Stadium Assign Organization"),
        StadiumDesignerOrganization("Stadium Designer Organization"),
        TicketSalesOrganizaiton("TicketSales Organizaiton"),
        AfterSalesOrganization("AfterSales Organization"),
        
        ConcertOrganization("Concert Organization"),
        
        DecorationOrganization("Decoration Organization"),
        
        AdOrganization("Ad Organization"),
        
        Population("Population Organization");
       
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
}
