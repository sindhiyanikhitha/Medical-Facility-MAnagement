/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.*;
import Business.Enterprise.Distributor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class CountryNetwork extends Network{
    private List<StateNetwork> stateNetworkList;
    
    public CountryNetwork(){
        stateNetworkList = new ArrayList<>();
    }

    public List<StateNetwork> getStateNetwork() {
        return stateNetworkList;
    }
    
    public StateNetwork addStateNetwork(){
        StateNetwork stateNetwork = new StateNetwork();
        stateNetworkList.add(stateNetwork);
        return stateNetwork;
    }
    
    public void removeStateNetwork(StateNetwork stateNetwork){
        stateNetworkList.remove(stateNetwork);
    }
    
    public List<Hospital> getAllHospitalsFromAllStates(){
        List<Hospital> hospitalList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            hospitalList.addAll(stateNetwork.getEnterpriseList().getHospitalEnterpriseList());
        }
        return hospitalList;
    }
    
    public List<StateHealthDept> getAllStateHealthDeptsFromAllStates(){
        List<StateHealthDept> stateHealthDeptList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            stateHealthDeptList.addAll(stateNetwork.getEnterpriseList().getStateHealthDeptEnterpriseList());
        }
        return stateHealthDeptList;
    }
    public List<SupplierEnterprise> getAllSuppliersFromAllStates(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            supplierEnterpriseList.addAll(stateNetwork.getEnterpriseList().getSupplierEnterpriseList());
        }
        return supplierEnterpriseList;
    }
    public List<CDC> getAllCDCsFromAllStates(){
        List<CDC> cdcList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            cdcList.addAll(stateNetwork.getEnterpriseList().getCDCEnterpriseList());
        }
        return cdcList;
    }
    
    public List<Pharmacy> getAllPharmaciesFromAllStates(){
        List<Pharmacy> pharmacyList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            pharmacyList.addAll(stateNetwork.getEnterpriseList().getPharmacyEnterpriseList());
        }
        return pharmacyList;
    }
    
    public List<Distributor> getAllDistributorsFromAllStates(){
        List<Distributor> distributorList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            distributorList.addAll(stateNetwork.getEnterpriseList().getDistributorEnterpriseList());
        }
        return distributorList;
    }
    
    public List<TravelAgencyEnterprise> getAllTravelAgenciesFromAllStates(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            travelAgencyEnterpriseList.addAll(stateNetwork.getEnterpriseList().getTravelAgencyEnterpriseList());
        }
        return travelAgencyEnterpriseList;
    }
}
