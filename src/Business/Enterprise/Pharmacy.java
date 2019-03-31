/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.PharmacyOrg;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Pharmacy extends Enterprise{

    public Pharmacy(String name) {
        super(name, EnterpriseTypeEnum.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
    ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new PharmacyOrg());
        
        return null;
    }
}
