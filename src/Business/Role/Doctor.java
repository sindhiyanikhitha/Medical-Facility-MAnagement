/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Doctor extends Role{

    private String name = "Doctor";
    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        ClinicOrg org = (ClinicOrg) organization;
        Hospital hospital = (Hospital)enterprise;
         return new DoctorWorkAreaJPanel(userProcessContainer, account, org, hospital, network, business);
        }
    
    @Override
    public String toString(){
    return name;
    
    }
}
