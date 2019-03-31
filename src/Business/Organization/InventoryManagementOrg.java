/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.DistributorInventoryManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class InventoryManagementOrg extends Organization{
    
    private InventoryDirectory inventoryDirectory;
    public InventoryManagementOrg() {
        
        super(Organization.Type.Inventory.getValue());
        inventoryDirectory = new InventoryDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorInventoryManager());
        return roles;
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
    
}