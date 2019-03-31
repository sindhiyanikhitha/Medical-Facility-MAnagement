/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineDirectory;

import Business.DiseaseList.Disease;
import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class VaccineList {
    
    ArrayList<Vaccine> vaccineList;

    public VaccineList() {
    vaccineList = new ArrayList<>();
    
    }
    
    public void addNewVaccine(String vaccineName, Disease disease){
    Vaccine vaccine = new Vaccine(vaccineName, disease);
    vaccineList.add(vaccine);
    //return vaccine;
    }
    
    public void removeVaccine(Vaccine vaccine){
    vaccineList.remove(vaccine);
    
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
}
