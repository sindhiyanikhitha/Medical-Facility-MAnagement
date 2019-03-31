/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Pharmacy;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Pharmacy.WorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class PharmacyManager extends Role{

    

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        return new WorkAreaJPanel(userProcessContainer, userAccount, (PharmacyOrg)org, (Pharmacy)enterprise, network, countryNetwork, ecoSystem);
    }
    
    
}
