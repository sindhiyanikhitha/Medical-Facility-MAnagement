/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Harshitha
 */
public class StateNetworkList {
    
    private ArrayList<StateNetwork> stateNetworks;

    public StateNetworkList() {
        stateNetworks = new ArrayList<>();
    }

    public ArrayList<StateNetwork> getStateNetworks() {
        return stateNetworks;
    }
    
    public StateNetwork createAndAddStateNetwork(){
    StateNetwork stateNetwork = new StateNetwork();
    stateNetworks.add(stateNetwork);
    return stateNetwork;
    }
    
    public void removeStateNetwork(StateNetwork stateNetwork){
    
    stateNetworks.remove(stateNetwork);
    }
    
    
    
    
}
