/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

/**
 *
 * @author Apurva
 */
public class State {
   
    private String stateName;

    public State(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
    @Override
    public String toString(){
    return stateName;
    }
    
}

    

