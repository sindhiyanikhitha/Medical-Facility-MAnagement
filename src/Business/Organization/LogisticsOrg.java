/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Transport.TransportList;
import Business.Role.LogisticsManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class LogisticsOrg extends Organization{

    private TransportList transportList;
    
    
    public LogisticsOrg() {
        super(Organization.Type.Logistics.getValue());
        transportList = new TransportList();
    
    }

    public TransportList getTransportList() {
        return transportList;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticsManager());
        return roles;
    }
     
   
    
    
}
