/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.maps;

/**
 *
 * @author user
 */
public abstract class Navigator {

    private RouteStrategy routeStrategy;
    private String currentLocation;
    private String startLocation;
    private String destinationLocation;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setCurrentLocation(String currentLocation) {
        System.out.println("Set current location: "+currentLocation);
        this.currentLocation = currentLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setStartLocation(String startLocation) {
        System.out.println("Set start location: "+startLocation);
        this.startLocation = startLocation;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        System.out.println("Set destination location: "+destinationLocation);
        this.destinationLocation = destinationLocation;
    }

    public void navigate() {
        routeStrategy.route(startLocation, destinationLocation);
    }
    
    public abstract void detectCurrentLocation();

}
