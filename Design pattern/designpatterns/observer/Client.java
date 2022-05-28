/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.observer;

/**
 *
 * @author user
 */
public class Client {
    public static void main(String[] args) {
        Publisher p = new Publisher();
        ConcSubscriberA subscriberA = new ConcSubscriberA();
        subscriberA.display();
        p.subscribe(subscriberA);
        p.mainBusinessLogic("State a");
        subscriberA.display();
    }
}
