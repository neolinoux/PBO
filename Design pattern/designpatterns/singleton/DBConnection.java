/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton;

/**
 *
 * @author user
 */
public class DBConnection {
    private DBConnection connection;

    private DBConnection() {
        
    }
    
    public DBConnection getInstance(){
        if(connection==null){
            connection = new DBConnection();
        }
        return new DBConnection();
    }
}
