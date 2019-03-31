/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierList;

import Business.VaccineDirectory.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Supplier{
    
    private String supplierName;
    
    private ArrayList<VaccineInventory> vaccineInventories;

    public Supplier(String name) {
        this.supplierName = name;
        vaccineInventories = new ArrayList<>();
    }

    public void addInventory(Vaccine vaccine, int quantity){
        VaccineInventory vaccineInventory = new VaccineInventory(vaccine, quantity);
        vaccineInventories.add(vaccineInventory);
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    

    public String getSupplierName() {
        return supplierName;
    }

    public ArrayList<VaccineInventory> getVaccineInventories() {
        return vaccineInventories;
    }
    
    @Override
    public String toString(){
    return supplierName;
    }
    
    }
    

    
    

