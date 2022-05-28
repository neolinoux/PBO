/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.uts;

/**
 *
 * @author user
 */
public class Publication extends Content{

    @Override
    public void display() {
        System.out.println("Menampilkan daftar publikasi");
    }

    @Override
    public void selectContent() {
        System.out.println("Satu publikasi dipilih");
    }

    
}
