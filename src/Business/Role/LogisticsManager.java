/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.LogisticsOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Logistics.LogisticsManagerWorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class LogisticsManager extends Role{

    private String name = "Logistics Manager";
    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem ecoSystem) {
        LogisticsOrg org = (LogisticsOrg)organization;
            return new LogisticsManagerWorkAreaJPanel(userProcessContainer, userAccount, (LogisticsOrg)org, (TravelAgencyEnterprise)enterprise, network, ecoSystem);
        }
    
    @Override
    public String toString(){
    return name;
    
    }
}
