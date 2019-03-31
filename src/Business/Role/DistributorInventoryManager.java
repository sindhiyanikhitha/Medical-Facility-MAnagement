/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Distributor;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.InventoryManagementOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryManager.DistributorInventoryManagerWorkAreaJPanel;

/**
 *
 * @author Apurva
 */
public class DistributorInventoryManager extends Role{

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        InventoryManagementOrg org = (InventoryManagementOrg)organization;
        return new DistributorInventoryManagerWorkAreaJPanel(userProcessContainer, userAccount, org, (Distributor)enterprise, network, countryNetwork, ecoSystem);
    }
    
    
}
