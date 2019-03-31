/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineDirectory;

import Business.DiseaseList.Disease;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Vaccine {
    String vaccineName;
    Disease diseaseUsedFor;

    public Vaccine(String vaccineName, Disease diseaseUsedFor) {
        this.vaccineName = vaccineName;
        this.diseaseUsedFor = diseaseUsedFor;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public Disease getDiseaseUsedFor() {
        return diseaseUsedFor;
    }

    public void setDiseaseUsedFor(Disease diseaseUsedFor) {
        this.diseaseUsedFor = diseaseUsedFor;
    }
    
    @Override
    public String toString(){
    return vaccineName;
    }
    
    
}
