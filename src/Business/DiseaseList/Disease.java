/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseList;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Disease {
    private String diseaseName;

    public Disease(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    
    @Override
    public String toString(){
    return diseaseName;
    }
    
}
