/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class Drone extends TransportMode {
    
    private int speed;
    
    public Drone() {
        super(TransportModeType.Drone.getValue());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    
}
