/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdminRole.AdminWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Admin extends Role{

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
return new AdminWorkAreaJPanel(userProcessContainer, enterprise, userAccount, network);
    }
    
}
