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
import userinterface.StateHealthDeptManager.StateHealthDeptManagerWorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SHDManager extends Role{

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization org, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        return new StateHealthDeptManagerWorkAreaJPanel(userProcessContainer, userAccount, org, enterprise, network, ecoSystem.getVaccineList(), ecoSystem);
    }
    
    
}
