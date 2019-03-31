/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Inventory.InventoryItem;
import Business.Role.Role;
import Business.Role.Supplier;
import Business.VaccineDirectory.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SupplierOrg extends Organization{

    private InventoryDirectory inventoryDirectory;
    
    public SupplierOrg(){
        super(Organization.Type.Supplier.getValue());
        inventoryDirectory = new InventoryDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Supplier());
        return roles;
    }
    
    public void addStock(Vaccine vaccine, int quantity){
        InventoryItem inventoryItem = new InventoryItem(vaccine, quantity);
        this.inventoryDirectory.getInventoryList().add(inventoryItem);
    }

    public ArrayList<InventoryItem> getInventoryDirectory() {
        return inventoryDirectory.getInventoryList();
    }
    
    public InventoryDirectory getVaccineStock(){
        return inventoryDirectory;
    }
    @Override
    public String toString(){
        return this.getOrgName();
    }
}
