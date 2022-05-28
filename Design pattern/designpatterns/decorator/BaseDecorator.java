/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.decorator;

/**
 *
 * @author user
 */
public class BaseDecorator implements Component{
    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }
    
    public void execute(){
        this.wrappee.execute();
    }
}
