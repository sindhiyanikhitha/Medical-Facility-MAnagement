/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierList;

import Business.VaccineDirectory.Vaccine;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class VaccineInventory {
    private Vaccine vaccine;
    private int quantity;

    public VaccineInventory(Vaccine vaccine, int quantity) {
        this.vaccine = vaccine;
        this.quantity = quantity;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    @Override
    public String toString(){
    return vaccine.getVaccineName();
    }
    
}
