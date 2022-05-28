/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.problem;

/**
 *
 * @author user
 */
public class Canvas {
    
    public void drawShape(){
        Shape shape = new Rectangle();
        shape.draw();
    }
}
