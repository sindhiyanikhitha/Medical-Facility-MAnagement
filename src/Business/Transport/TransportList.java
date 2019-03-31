/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

import Business.Order.OrderRequest;
import Business.Organization.Organization;
import Business.Organization.OrganizationList;
import Business.Transport.TransportMode.TransportModeType;
import Business.UserAccount.UserAccount;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author HarshithaApurvaNikhitha
 */
public class TransportList {
    
    private ArrayList<TransportMode> transportList;

    public TransportList() {
    transportList = new ArrayList<>();
    }

    public ArrayList<TransportMode> getTransportList() {
        return transportList;
    }
    
    public TransportMode.TransportModeType getTransportType(){
        return this.getTransportType();
    }
    
    public TransportMode addTransport(TransportModeType transportModeType){
        TransportMode transportMode = null;
        if (transportModeType.getValue().equals(TransportModeType.Drone.getValue())){
            transportMode = new Drone();
            transportList.add(transportMode);
        }
        else if (transportModeType.getValue().equals(TransportModeType.Ambulance.getValue())){
            transportMode = new Ambulance();
            transportList.add(transportMode);
        }
        return transportMode;
    }
    
    
    // Check This if it works else create 2 objects
    public void removeTransport(TransportMode transport){
    transportList.remove(transport);
    
    }
    
    public double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
      double theta = lon1 - lon2;
      double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
      dist = Math.acos(dist);
      dist = rad2deg(dist);
      dist = dist * 60 * 1.1515;
      if (unit == 'K') {
        dist = dist * 1.609344;
      } else if (unit == 'N') {
        dist = dist * 0.8684;
        }
      return (dist);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts decimal degrees to radians             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double deg2rad(double deg) {
      return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts radians to decimal degrees             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double rad2deg(double rad) {
      return (rad * 180.0 / Math.PI);
    }

    private void showDistance(){
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'M') + " Miles\n");
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'K') + " Kilometers\n");
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'N') + " Nautical Miles\n");

    }
    
    public static Organization calculateShortestDistance(OrganizationList organizationList, OrderRequest orderRequest)throws Exception{
        String key ="AIzaSyAyiHM8SthFspcIXSblPCok9ee42wjxQms"; 
    StringBuffer urlString = new StringBuffer();
    //40.6905615%2C-73.9976592%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626&key="+key;
        urlString.append("https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins="+orderRequest.getDestinationLocationCoordinates().getLatitudeCoordinates()+","+orderRequest.getDestinationLocationCoordinates().getLongitudeCoordinates()+"&destinations=");
         
        double distanceList[] = new double[organizationList.getOrganizationList().size()] ;
        int durationList[] = new int[organizationList.getOrganizationList().size()] ;
        
        for(int i = 0; i< organizationList.getOrganizationList().size(); i++){
           Organization organization= organizationList.getOrganizationList().get(i);
            urlString.append(organization.getLocationCoordinates().getLatitudeCoordinates()+"%2C"+organization.getLocationCoordinates().getLongitudeCoordinates()+"%7C");
    
    }
    
        urlString.substring(0, urlString.length()- 2);
        urlString.append("&key="+key);
        //System.out.println(urlString);
        
//    String key ="AIzaSyAyiHM8SthFspcIXSblPCok9ee42wjxQms"; 
//    String urlString = "https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=40.6655101,-73.8918896&destinations=40.6905615%2C-73.9976592%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626&key="+key;
    
    URL url = new URL(urlString.toString());
        //URLConnection urlconn = url.openConnection();
        InputStreamReader in = null;
        StringBuilder sb = new StringBuilder();
        HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
        urlConn.setRequestMethod("GET");
        urlConn.connect();
//        urlconn.connect();
//        InputStream inputStream = urlconn.getInputStream();
         //= url.openStream();
        //System.out.println("Code: "+urlConn.getResponseCode());
        if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
                System.out.println(sb.toString()); 
                
     
               
JsonParser parser = new JsonParser(); 

JsonObject json = (JsonObject) parser.parse(sb.toString());

        JsonArray rows = json.getAsJsonArray("rows");
        
        Iterator <JsonElement> iterator1 = rows.iterator();
        Organization org = null;
         
    while (iterator1.hasNext()) {
        
        Object obj = iterator1.next();
        if(obj instanceof JsonObject) {
           JsonArray elements = ((JsonObject)obj).getAsJsonArray("elements"); 
        
           
         Iterator <JsonElement> iterator2 = elements.iterator();
         int i =0;
    while (iterator2.hasNext()) {
        
        JsonObject obj1 = (JsonObject)iterator2.next();
        if(obj1 instanceof JsonObject) {
            //JsonObject jsonObject = obj1.get("distance").getAsJsonObject();
            //System.out.println(jsonObject.get("text"));
            String dist = obj1.getAsJsonObject("distance").get("text").getAsString();
            String duration = obj1.getAsJsonObject("duration").get("text").getAsString();
            
      String numberPattern = "[^.0-9]";
      dist = dist.replaceAll(numberPattern,"");
      duration =duration.replaceAll("[^0-9]","");
      
          distanceList[i]=Double.parseDouble(dist);
          durationList[i]=Integer.parseInt(duration);
        System.out.println("\n Element: "+ i+ "\t"+" Distance: "+dist+"\t Duration: "+duration);
        }    
            
            
            
        
        i++;
    }
    
    double shortest = distanceList[0];
    int index = 0;
    for(int j= 1; j<distanceList.length; j++){
    if(shortest>distanceList[j]){
    shortest = distanceList[j];
    index = j;
    }
    
    }
    
    orderRequest.setETA(durationList[index]);
    orderRequest.setDist(shortest);
    org = organizationList.getOrganizationList().get(index);
    UserAccount u = org.getUserAccountList().getUserAccountList().get(0);
    orderRequest.setOrderReceiver(u);
    orderRequest.getLastOrderRequest().setOrderReceiver(u);
        }
    }
        
        
        
        
    return org;
    
    }
}