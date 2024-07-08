package taxiapp;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    
    private String taxiName;
    private float totalEarning;
    private List<Ride> historyOfride=new ArrayList<Ride>();
    //AVAIL, BUSY
    private String rideStatus;
    private String currentLocation;
    
    
    public Taxi() {
        
    }
    public Taxi(String taxiName, float totalEarning, List<Ride> historyOfRide, String rideStatus, String currentLocation) {
        this.taxiName = taxiName;
        this.totalEarning = totalEarning;
        this.historyOfride = new ArrayList<>();  
        this.rideStatus = rideStatus;
        this.currentLocation = currentLocation;
    }
    public String getTaxiName() {
        return taxiName;
    }
    public void setTaxiName(String taxiName) {
        this.taxiName = taxiName;
    }
    public float getTotalEarning() {
        return totalEarning;
    }
    public void setTotalEarning(float totalEarning) {
        this.totalEarning = totalEarning;
    }
    public List<Ride> getHistoryOfride() {
        return historyOfride;
    }
    public void setHistoryOfride(List<Ride> historyOfride) {
        this.historyOfride = historyOfride;
    }
    public String getRideStatus() {
        return rideStatus;
    }
    public void setRideStatus(String rideStatus) {
        this.rideStatus = rideStatus;
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
 
}
