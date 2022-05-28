/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.solution;

import designpatterns.factorymethod.problem.*;

/**
 *
 * @author user
 */
public class Canvas {
    
    public void drawing(String type){
        Shape shape = selectShape(type);
        shape.draw();
    }
    public Shape selectShape(String type){
        Shape shape = ShapeFactory.createShape(type);
        return shape;
    }
}
