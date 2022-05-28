/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.decorator;

/**
 *
 * @author user
 */
public class ConcreteDecoratorA extends BaseDecorator{

    public ConcreteDecoratorA(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Execute in Concrete Decorator A");
        extra();
    }
    
    public void extra(){
        System.out.println("Extra method in Concrete Decorator A");
    }
}
