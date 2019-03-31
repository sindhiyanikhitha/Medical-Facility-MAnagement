/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SHDManager;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SHDOrg extends Organization{

    public SHDOrg() {
        super(Organization.Type.SHD.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SHDManager());
        return roles;
    }
     
   
    
    
}
