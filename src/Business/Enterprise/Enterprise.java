/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.OrderRequest;
import Business.Organization.Organization;
import Business.Organization.OrganizationList;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nikhitha
 */
public abstract class Enterprise extends Organization{

    private EnterpriseTypeEnum enterpriseTypeEnum;
    private OrganizationList organizationList;
    
    public Enterprise(String name, EnterpriseTypeEnum type) {
        super(name);
        this.enterpriseTypeEnum = type;
        organizationList = new OrganizationList();
    }
    
    public enum EnterpriseTypeEnum {
        Hospital("Hospital"),
        Distributor("Distributor"),
        CDC("CDC"),
        StateHealthDepartment("StateHealthDepartment"),
        SupplierEnterprise("Supplier"),
        TravelAgent("TravelAgent"),
        Pharmacy("Pharmacy");
        private String value;

        private EnterpriseTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract ArrayList<Organization> getOrganization();
    
    public EnterpriseTypeEnum getEnterpriseTypeEnum() {
        return enterpriseTypeEnum;
    }

    public OrganizationList getOrganizationList() {
        return organizationList;
    }

    public boolean approveOrgRequest(Type type, Enterprise sdphEnterprise, UserAccount userAccount){
        
        
        if (type.getValue().equals(Type.Supplier.getValue())){
            OrderRequest supplierOrganizationRequest = sdphEnterprise.getOrderQueue().addOrderRequest();
            supplierOrganizationRequest.setOrderSender(userAccount);
            //supplierOrganizationRequest.setSupplierEnterprise((SupplierEnterprise)this);
            supplierOrganizationRequest.setType(type);
            supplierOrganizationRequest.setOrderStatus("Sent");
            return true;
        }
        return false;
    }
}
