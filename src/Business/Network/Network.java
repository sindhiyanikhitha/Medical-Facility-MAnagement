/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Network{
    private String networkName;

    public String getNetworkName() {
        return networkName;
    }
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    @Override
    public String toString(){
        return this.getNetworkName();
    }
    
}
