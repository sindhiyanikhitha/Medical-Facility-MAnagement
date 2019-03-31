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
public class CDC extends Enterprise{

    public CDC(String cdcName) {
        super(cdcName, EnterpriseTypeEnum.CDC);
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
