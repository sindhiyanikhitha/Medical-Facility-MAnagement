/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SupplierOrg;

import java.util.*;

/**
 *
 * @author Harshitha
 */
public class EnterpriseList {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseList() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String enterpriseName, Enterprise.EnterpriseTypeEnum type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseTypeEnum.Hospital){
            enterprise = new Hospital(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseTypeEnum.StateHealthDepartment){
            enterprise = new StateHealthDept(enterpriseName);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseTypeEnum.CDC){
            enterprise = new CDC(enterpriseName);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseTypeEnum.Distributor){
            enterprise = new Distributor(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseTypeEnum.SupplierEnterprise){
            enterprise = new SupplierEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseTypeEnum.Pharmacy){
            enterprise = new Pharmacy(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseTypeEnum.TravelAgent){
            enterprise = new TravelAgencyEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    /*  Get all Enterprise list by their types  */
    public List<SupplierEnterprise> getSupplierEnterpriseList(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise: enterpriseList){
            if(enterprise instanceof SupplierEnterprise){
                supplierEnterpriseList.add((SupplierEnterprise)enterprise);
            }
        }
        return supplierEnterpriseList;
    }
    
    public List<Hospital> getHospitalEnterpriseList(){
        List<Hospital> hospitalList = new ArrayList<>();
        for(Enterprise enterprise: enterpriseList){
            if(enterprise instanceof Hospital){
                hospitalList.add((Hospital)enterprise);
            }
        }
        return hospitalList;
    }
    
    public List<CDC> getCDCEnterpriseList(){
        List<CDC> cdcList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof CDC){
                cdcList.add((CDC) enterprise);
            }
        }
        return cdcList;
    }
    
    public List<StateHealthDept> getStateHealthDeptEnterpriseList(){
        List<StateHealthDept> stateHealthDeptList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof StateHealthDept){
                stateHealthDeptList.add((StateHealthDept) enterprise);
            }
        }
        return stateHealthDeptList;
    }
    
    /*  End */
    
    public void deleteEnterprise(Enterprise enterprise){
        this.enterpriseList.remove(enterprise);
    }
    
    public List<Distributor> getDistributorEnterpriseList(){
        List<Distributor> distributorList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof Distributor){
                distributorList.add((Distributor) enterprise);
            }
        }
        return distributorList;
    }
    
    public List<Pharmacy> getPharmacyEnterpriseList(){
        List<Pharmacy> pharmacyList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof Distributor){
                pharmacyList.add((Pharmacy) enterprise);
            }
        }
        return pharmacyList;
    }
    
    public Distributor getNearestDistributorEnterpriseList(){
        Distributor distributor = null;
        for(Distributor row: this.getDistributorEnterpriseList()){
            
        }
        return distributor;
    }
    
    public List<TravelAgencyEnterprise> getTravelAgencyEnterpriseList(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof TravelAgencyEnterprise){
                travelAgencyEnterpriseList.add((TravelAgencyEnterprise) enterprise);
            }
        }
        return travelAgencyEnterpriseList;
    }
    
    
    
    public SupplierEnterprise supplierEnterpriseByOrganization(SupplierOrg supplierOrg){
        SupplierEnterprise mainSupplierEnterprise = null;
        for(SupplierEnterprise supplierEnterprise: this.getSupplierEnterpriseList()){
            for( Organization sup: supplierEnterprise.getOrganizationList().getOrganizationList()){
                if(sup instanceof SupplierOrg && sup.equals(supplierOrg))
                    return mainSupplierEnterprise;
            }
        }
        return mainSupplierEnterprise;
    }
}
