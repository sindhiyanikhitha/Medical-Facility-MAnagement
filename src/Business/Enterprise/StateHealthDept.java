/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class StateHealthDept extends Enterprise{

    public StateHealthDept(String name) {
        super(name, EnterpriseTypeEnum.StateHealthDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        return null;
    }

}
