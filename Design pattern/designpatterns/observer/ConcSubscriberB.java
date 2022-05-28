/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.observer;

/**
 *
 * @author user
 */
public class ConcSubscriberB implements Subscriber{
    String context;
    
    public void display(){
        System.out.println("Subcriber B: event from publisher: "+context);
    }
    @Override
    public void update(String context) {
        this.context = context;
        System.out.println("Subcriber B receive event change from publisher: "+context);
    }
    
}
