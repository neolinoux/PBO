/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod.solution;

/**
 *
 * @author user
 */
public class ShapeFactory {
    public static Shape createShape(String type){
        Shape shape = null;
        if(type.equals("circle")){
            shape = new Circle();
        }else if(type.equals("rectangle")){
            shape = new Rectangle();
        }else if(type.equals("square")){
            shape = new Square();
        }else if(type.equals("triangle")){
            shape = new Triangle();
        }else if(type.equals("diamond")){
            shape = new Diamond();
        }
        return shape;
    }
}
