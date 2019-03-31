/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.VaccineDirectory.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class InventoryDirectory {
    private ArrayList<InventoryItem> inventoryList;

    public InventoryDirectory() {
    inventoryList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }
    
    public void addNewItem(Vaccine vaccine, int quantity){
        for(InventoryItem inventoryItem: inventoryList){
            if(vaccine.equals(inventoryItem.getVaccine())){
                inventoryItem.setQuantity(inventoryItem.getQuantity()+quantity);
                return;
            }
        }
        InventoryItem inventoryItem = new InventoryItem(vaccine, quantity);
        inventoryList.add(inventoryItem);
        
    }
    
    public void removeInventoryItem(InventoryItem inventoryItem){
        inventoryList.remove(inventoryItem);
    }
    
    public InventoryItem getInventoryByVaccine(Vaccine vaccine){
        for(InventoryItem inventory: this.inventoryList){
            if(inventory.getVaccine().getVaccineName().equalsIgnoreCase(vaccine.getVaccineName())){
                return inventory;
            }
        }
        return null;
    }
}
