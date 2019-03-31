/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Network.StateNetworkList;

/**
 *
 * @author Harshitha
 */
public class Country {
    
    private String countryName;
    private StateNetworkList stateNetworkList;

    public Country(String countryName) {
        this.countryName = countryName;
        stateNetworkList = new StateNetworkList();
        
    }

    public StateNetworkList getStateNetworkList() {
        return stateNetworkList;
    }
    
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    @Override
    public String toString(){
    return countryName;
    }
    
    
}
