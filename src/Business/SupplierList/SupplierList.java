/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierList;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class SupplierList {
    
    private ArrayList<Supplier> supplierList;

    public SupplierList() {
    supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    public Supplier addNewSupplier(String supplierName){
        Supplier supplier = new Supplier(supplierName);
        supplierList.add(supplier);
        return supplier;
    
    } 
    
    public void removeSupplier(Supplier supplier){
    supplierList.remove(supplier);
    
    }
    
    
}
