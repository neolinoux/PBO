/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tyo
 */
public class myConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
