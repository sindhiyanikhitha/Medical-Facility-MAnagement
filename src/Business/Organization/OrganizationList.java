/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class OrganizationList {
    
    private ArrayList<Organization> organizationList;

    public OrganizationList() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDC.getValue())){
            organization = new CdcOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryManagementOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SHD.getValue())){
            organization = new SHDOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrg();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Logistics.getValue())){
            organization = new LogisticsOrg();
            organizationList.add(organization);
        }
        return organization;
    }
}