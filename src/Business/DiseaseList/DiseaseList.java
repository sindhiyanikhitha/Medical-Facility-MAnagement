/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseList;

import java.util.ArrayList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class DiseaseList {
    private ArrayList<Disease> diseaseList;

    public DiseaseList() {

    diseaseList = new ArrayList<>();
    
    }
    
    public Disease addDisease(String diseaseName) {

    Disease disease = new Disease(diseaseName);
    diseaseList.add(disease);
    return disease;
    
    }
    
    public void removeDisease(Disease disease){
    diseaseList.remove(disease);
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    
    
}
