/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClinicManager.ClinicInventoryManagerWorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ClinicInventoryManager extends Role{

    private String name = "Clinic Inventory Manager";
    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        ClinicOrg org = (ClinicOrg) organization;
        return new ClinicInventoryManagerWorkAreaJPanel(userProcessContainer, userAccount, org, enterprise, network, ecoSystem.getVaccineList(), ecoSystem.getDiseaseList());
    }
    
    @Override
    public String toString(){
    return name;
    
    }
}
