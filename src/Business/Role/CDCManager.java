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
import javax.swing.JPanel;
import userinterface.CDCManager.CDCManagerWorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class CDCManager extends Role{

    

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        return new CDCManagerWorkAreaJPanel(userProcessContainer, userAccount, org, enterprise, network, ecoSystem);
    }
    
    
}
