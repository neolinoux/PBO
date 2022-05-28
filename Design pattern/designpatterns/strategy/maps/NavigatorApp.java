/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.maps;

/**
 *
 * @author user
 */
public class NavigatorApp {
    public static void main(String[] args) {
        String start = "Bandung";
        String destination = "Semarang";
        Navigator nav = new MobileNavigator();
        nav.setStartLocation(start);
        nav.setDestinationLocation(destination);
        nav.navigate();
        nav.setRouteStrategy(new MotorcycleStrategy());
        nav.navigate();
        nav.setRouteStrategy(new WalkingStrategy());
        nav.navigate();
        nav.setRouteStrategy(new PublicTransportationStrategy());
        nav.navigate();
    }
}
