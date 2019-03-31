/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SupplierOrg;
import Business.Role.Role;
import Business.SupplierList.Supplier;
import Business.SupplierList.SupplierList;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SupplierEnterprise extends Enterprise{

    private SupplierList supplierList;
    public SupplierEnterprise(String name){
        super(name, EnterpriseTypeEnum.SupplierEnterprise);
        supplierList = new SupplierList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    public SupplierList getSupplierList() {
        return supplierList;
    }
    //Remove this function 
    
    public Supplier getSupplierBySupplierName(Supplier supplier){
        for(Supplier supply: supplierList.getSupplierList()){
            if(supply.getSupplierName().equalsIgnoreCase(supplier.getSupplierName())){
                return supply;
            }
        }
        return null;
    }

    /*  Get all related Organization    */
    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new SupplierOrg());
        return organizationList;
    }
    
    public SupplierOrg getOrganization(SupplierOrg organization){
        for(Organization org: this.getOrganization()){
            if(org instanceof SupplierOrg && organization.getOrgName().equals(org.getOrgName())){
                return (SupplierOrg)org;
            }
        }
        return null;
    }
}
