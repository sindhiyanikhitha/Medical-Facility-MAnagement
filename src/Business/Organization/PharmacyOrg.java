/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.PharmacyManager;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class PharmacyOrg extends Organization{
    
    private InventoryDirectory inventoryDirectory;
    
    public PharmacyOrg() {
        super(Organization.Type.Pharmacy.getValue());
        inventoryDirectory = new InventoryDirectory();
    }

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacyManager());
        return roles;
    }
}
