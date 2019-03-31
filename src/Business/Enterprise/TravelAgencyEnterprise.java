/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Organization.LogisticsOrg;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Apurva
 */
public class TravelAgencyEnterprise extends Enterprise{

    public TravelAgencyEnterprise(String name) {
        super(name, EnterpriseTypeEnum.TravelAgent);
        
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new LogisticsOrg());
        return null;
    }
    
}
