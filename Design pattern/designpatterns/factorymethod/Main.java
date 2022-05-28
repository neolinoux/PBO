/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.factorymethod;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();
        Shape shape2 = ShapeFactory.createShape("rectangle");
        shape2.draw();
    }
}
