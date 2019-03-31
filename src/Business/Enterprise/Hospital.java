/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.ClinicOrg;
import Business.Organization.Organization;
import Business.Patient.PatientList;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Hospital extends Enterprise{

    private PatientList patientList;
    
    public Hospital(String name) {
        super(name, EnterpriseTypeEnum.Hospital);
        patientList = new PatientList();
    }
    
    

    public PatientList getPatientList() {
        return patientList;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new ClinicOrg());
        return null;
    }
    
}
