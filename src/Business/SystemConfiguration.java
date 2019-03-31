package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SystemConfiguration {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();

        
        Employee employee = system.getEmployeeList().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountList().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdmin());
        
        return system;
    }
    
}
