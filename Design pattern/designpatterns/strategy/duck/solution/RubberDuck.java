/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.solution;

/**
 *
 * @author user
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
