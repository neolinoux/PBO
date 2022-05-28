/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton;

/**
 *
 * @author user
 */
public class SingletonApp {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.setSample("sample A");
        System.out.println("Sample: "+ instance.getSample());
        instance.setSample("sample B");
        SampleTest test = new SampleTest();
        System.out.println("Sample: "+ test.getSample());
        test.setSample("other value");
        System.out.println("Sample: "+instance.getSample());
    }
}
