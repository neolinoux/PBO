/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton;

/**
 *
 * @author Mutaqin Alanshoriy
 */
public class Singleton {

    private static Singleton instance;
    
    private String sample;

    private Singleton() {
        System.out.println("instance created!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getSample() {
        return sample;
    }
    
}
