/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.maps;

/**
 *
 * @author user
 */
public class CarStrategy implements RouteStrategy{

    @Override
    public void route(String startLocation, String destinationLocation) {
        System.out.println("Route from "+startLocation+" to "+destinationLocation+" with car");
    }
}
