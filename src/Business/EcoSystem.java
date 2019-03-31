package Business;

import Business.DiseaseList.DiseaseList;
import Business.Enterprise.*;
import Business.Enterprise.CDC;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Order.OrderQueue;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;
import Business.VaccineDirectory.VaccineList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
   // private ArrayList<StateNetwork> networkList;
    private DiseaseList diseaseList;
    private VaccineList vaccineList;
    private ArrayList<CountryNetwork> countryList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        //networkList = new ArrayList<>();
        countryList = new ArrayList<>();
        diseaseList = new DiseaseList();
        vaccineList = new VaccineList();
    }

   /* public ArrayList<StateNetwork> getNetworkList() {
        return networkList;
    }

    public StateNetwork createAndAddNetwork() {
        StateNetwork network = new StateNetwork();
        networkList.add(network);
        return network;
    }*/

    public ArrayList<CountryNetwork> getCountryList() {
        return countryList;
    }

    public CountryNetwork createAndAddCountry(String name) {
        CountryNetwork country = new CountryNetwork();
        country.setNetworkName(name);
        countryList.add(country);
        return country;
    }

    public DiseaseList getDiseaseList() {
        return diseaseList;
    }

    public VaccineList getVaccineList() {
        return vaccineList;
    }
    

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountList().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
    
    public List<Hospital> getAllHospitalEnterprisesFromAllCountries(){
        List<Hospital> hospitalList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            hospitalList.addAll(countryNetwork.getAllHospitalsFromAllStates());
        }
        return hospitalList;
    }
    
    public List<StateHealthDept> getAllStateHealthEnterprisesFromAllCountries(){
        List<StateHealthDept> stateHealthDeptList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            stateHealthDeptList.addAll(countryNetwork.getAllStateHealthDeptsFromAllStates());
        }
        return stateHealthDeptList;
    }
    
    public List<SupplierEnterprise> getSupplierEnterprisesFromAllCountries(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            supplierEnterpriseList.addAll(countryNetwork.getAllSuppliersFromAllStates());
        }
        return supplierEnterpriseList;
    }
    public List<CDC> getCDCEnterprisesFromAllCountries(){
        List<CDC> cdcList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            cdcList.addAll(countryNetwork.getAllCDCsFromAllStates());
        }
        return cdcList;
    }
    
    public List<Pharmacy> getPharmacyEnterprisesFromAllCountries(){
        List<Pharmacy> pharmacyList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            pharmacyList.addAll(countryNetwork.getAllPharmaciesFromAllStates());
        }
        return pharmacyList;
    }
    
    public List<Distributor> getDistributorEnterpriseFromAllCountries(){
        List<Distributor> distributorList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            distributorList.addAll(countryNetwork.getAllDistributorsFromAllStates());
        }
        return distributorList;
    }
    
    /* Get All Request */
    
    public OrderQueue getAllDistributorEnterpriseOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(Distributor distributor : this.getDistributorEnterpriseFromAllCountries()){
            orderQueue.getOrderRequests().addAll(distributor.getOrderQueue().getOrderRequests());
        }
        return orderQueue;
    }
    
    public OrderQueue getAllPharmacyEnterprisesOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(Pharmacy pharmacy : this.getPharmacyEnterprisesFromAllCountries()){
            orderQueue.getOrderRequests().addAll(pharmacy.getOrderQueue().getOrderRequests());
        }
        return orderQueue;
    }
    
    public List<TravelAgencyEnterprise> getAllTravelAgencyEnterprisesFromAllCountries(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            travelAgencyEnterpriseList.addAll(countryNetwork.getAllTravelAgenciesFromAllStates());
        }
        return travelAgencyEnterpriseList;
    }
    
    public OrderQueue getAllTravelAgencyEnterpriseOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(TravelAgencyEnterprise travelAgencyEnterprise: this.getAllTravelAgencyEnterprisesFromAllCountries()){
            orderQueue.getOrderRequests().addAll(travelAgencyEnterprise.getOrderQueue().getOrderRequests());
        }
        return orderQueue;
    }
    
    public CountryNetwork getNetworkByUserAccount(UserAccount userAccount){
        for(CountryNetwork countrynetwork: this.getCountryList()){
            for(StateNetwork network: countrynetwork.getStateNetwork()){
                for(Enterprise enterprise:network.getEnterpriseList().getEnterpriseList()){
                    for(UserAccount ua:enterprise.getUserAccountList().getUserAccountList()){
                        if(ua.getUsername().equalsIgnoreCase(userAccount.getUsername())){
                            return countrynetwork;
                        }
                    }
                    for(Organization organization:enterprise.getOrganizationList().getOrganizationList()){
                        for(UserAccount ua:organization.getUserAccountList().getUserAccountList()){
                            if(ua.getUsername().equalsIgnoreCase(userAccount.getUsername())){
                                return countrynetwork;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    /*  END */
}