/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.solution;

/**
 *
 * @author user
 */
public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
