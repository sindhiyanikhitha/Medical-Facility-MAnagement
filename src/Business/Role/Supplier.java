/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.SupplierOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.StateHealthDeptManager.ManageSupplierJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Supplier extends Role{

    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        return new ManageSupplierJPanel(userProcessContainer, account,business.getVaccineList(), (SupplierOrg) organization, (SupplierEnterprise) enterprise, network, countryNetwork, business);
    }
    
}
