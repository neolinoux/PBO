/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.duck.solution;

/**
 *
 * @author user
 */
public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
