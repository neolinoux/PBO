/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.logistic;

/**
 *
 * @author user
 */
public class RoadLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
