/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.ClinicInventoryManager;
import Business.Role.Doctor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class ClinicOrg extends Organization{

    
    private InventoryDirectory inventoryDirectory;
    
    public ClinicOrg() {
        super(Organization.Type.Clinic.getValue());
        inventoryDirectory = new InventoryDirectory();
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicInventoryManager());
        roles.add(new Doctor());
        return roles;
    }
     
}