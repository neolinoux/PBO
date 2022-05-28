/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.observer;

/**
 *
 * @author user
 */
public class ConcSubscriberA implements Subscriber{
    String context;
    
    public void display(){
        System.out.println("Subcriber A: event from publisher: "+context);
    }
    @Override
    public void update(String context) {
        this.context = context;
        System.out.println("Subcriber A receive event change from publisher: "+context);
    }
    
}
