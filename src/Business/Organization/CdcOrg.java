/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCManager;
import Business.Role.Role;
import Business.Role.Supplier;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class CdcOrg extends Organization{

    public CdcOrg() {
        super(Organization.Type.CDC.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCManager());
        roles.add(new Supplier());
        return roles;
    }
     
   
    
    
}
