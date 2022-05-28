/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.problem;

/**
 *
 * @author user
 */
public class RubberDuck extends Duck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Rubber duck not quack but squeak");
    }
    @Override
    public void display() {
        System.out.println(" rubber duck");
    }
    //many other methods here
}
