/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.uts;

/**
 *
 * @author user
 */
public class GenerateCSV implements GenerateContentStrategy{

    @Override
    public void generate() {
        System.out.println("Generate to csv.");
    }
    
}
