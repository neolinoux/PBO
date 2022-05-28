/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.problem;

/**
 *
 * @author user
 */
public abstract class Duck {
    
    
    public void swim(){
        System.out.println("A duck swims");
    }
    public void fly(){
        System.out.println("A duck flies");
    }
    public abstract void display();
    //many other methods here
}
