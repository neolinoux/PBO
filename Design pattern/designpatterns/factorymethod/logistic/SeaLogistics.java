/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.logistic;

/**
 *
 * @author user
 */
public class SeaLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
