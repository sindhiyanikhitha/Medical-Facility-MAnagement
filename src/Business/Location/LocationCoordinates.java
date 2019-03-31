/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

/**
 *
 * @author Harshitha
 */
public class LocationCoordinates {
   
    double latitudeCoordinates;
    double longitudeCoordinates;

    public LocationCoordinates() {
    
    }

    public double getLatitudeCoordinates() {
        return latitudeCoordinates;
    }

    public double getLongitudeCoordinates() {
        return longitudeCoordinates;
    }

    public void setCoordinates(String latitude, String longitude) {
        this.latitudeCoordinates = Double.parseDouble(latitude);
        this.longitudeCoordinates = Double.parseDouble(longitude);
    
    }
}
