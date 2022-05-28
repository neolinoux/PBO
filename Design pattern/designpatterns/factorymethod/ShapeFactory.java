/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod;

/**
 *
 * @author user
 */
public class ShapeFactory {
    public static Shape createShape(String type){
        Shape shape = null;
        if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else if(type.equalsIgnoreCase("square")){
            shape = new Square();
        }
        return shape;
    }
}
