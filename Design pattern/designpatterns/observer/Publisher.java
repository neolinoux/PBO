/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Publisher {
    
    private List<Subscriber> subscribers;
    
    private String mainState;

    public Publisher() {
        subscribers = new ArrayList<>();
    }
    
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        String event = mainState;
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }
    public void mainBusinessLogic(String state){
        mainState = state;
        System.out.println("state change in publisher...");
        notifySubscribers();
    }
}