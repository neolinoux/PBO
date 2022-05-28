/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.maps;

/**
 *
 * @author user
 */
public class MobileNavigator extends Navigator{

    public MobileNavigator() {
        detectCurrentLocation();
        setStartLocation(getCurrentLocation());
        RouteStrategy defaultStrategy = new CarStrategy();
        setRouteStrategy(defaultStrategy);
    }

    @Override
    public void detectCurrentLocation() {
        System.out.println("Detecting current location from mobile device...");
        setCurrentLocation("Jakarta");
        System.out.println("Current location is "+getCurrentLocation());
    }
    
}
