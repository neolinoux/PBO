/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.logistic;

/**
 *
 * @author user
 */
public class LogisticsApp {
    public static void main(String[] args) {
        Logistics logistics = null;
        String transport = "road";
        if(transport.equalsIgnoreCase("road")){
            logistics = new RoadLogistics();
        }else if(transport.equalsIgnoreCase("sea")){
            logistics = new SeaLogistics();
        }
        logistics.planDelivery();
    }
}
