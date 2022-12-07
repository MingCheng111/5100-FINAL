package Business;

import Business.Employee.Employee;
import Business.Role.ConcertManagerRole;
import Business.Role.StadiumAssignRole;
import Business.Role.SystemAdminRole;
import Business.Role.TicketSalesRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee1 = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee1, new SystemAdminRole());
        //UserAccount test = system.getUserAccountDirectory().createUserAccount("ticketsales", "ticketsales", employee, new TicketSalesRole());
        //UserAccount testStadiumAssign = system.getUserAccountDirectory().createUserAccount("StadiumAssign", "StadiumAssign", employee, new StadiumAssignRole());
        
        return system;
    }
    
}
