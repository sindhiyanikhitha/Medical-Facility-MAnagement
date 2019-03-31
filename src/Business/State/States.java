/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Enterprise.EnterpriseList;
import java.util.ArrayList;

/**
 *
 * @author Apurva
 */
public class States {
    private ArrayList<State> states;
    private EnterpriseList enterprises;

    public States(){
    states = new ArrayList<>();
    enterprises = new EnterpriseList();
    }
    
    public State addState(String stateName){
    State state = new State(stateName);
    states.add(state);
    return state;
    
    }

    public EnterpriseList getEnterprises() {
        return enterprises;
    }
    
    
    public void removeState(State city){
    states.remove(city);
    }

    public ArrayList<State> getStates() {
        return states;
    }
    
    
    
}
