/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseList;

/**
 *
 * @author Harshitha
 */
public class StateNetwork extends Network{
    private EnterpriseList enterpriseList;
    
    public StateNetwork(){
        enterpriseList = new EnterpriseList();
    }

    public EnterpriseList getEnterpriseList() {
        return enterpriseList;
    }
    
}
