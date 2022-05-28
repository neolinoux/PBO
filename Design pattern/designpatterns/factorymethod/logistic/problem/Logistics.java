/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.logistic.problem;

/**
 *
 * @author user
 */
public class Logistics {

    public void planDeliver() {
        Transport transport = new Truck();
        transport.deliver();
    }
}
