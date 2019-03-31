/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.InventoryManagementOrg;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Distributor extends Enterprise{

    public Distributor(String distributorName) {
        super(distributorName, EnterpriseTypeEnum.Distributor);
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    /*  Get all related organization    */
    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new InventoryManagementOrg());
        return organizationList;
    }
}
