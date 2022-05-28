/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui2;

/**
 *
 * @author ASUS
 */
import java.sql.*;

public class db {

    Connection conn = null;

    public void addAkun() {
        try {
            this.connect();
            Statement stmt = conn.createStatement();
            String tableName = "account";
            stmt.executeUpdate("INSERT INTO account (id, username, password)"
                    + "VALUES ('1', 'rahmad', '12345');");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("asdasdasd");
        }
    }
    public ResultSet selectAkun(String username) {
        ResultSet a =null;
        try {
            this.connect();
            Statement stmt = conn.createStatement();
            String tableName = "account";
            ResultSet rSet = stmt.executeQuery("SELECT * FROM account WHERE username='" + username + "'" );
            a = rSet;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("asdasdasd");
        }
         
        return a;
    }
    
    public void connect() {
        try {
//            Connection conn = null;
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/example_pbo";
            this.conn = DriverManager.getConnection(url, userName, password);
//            Statement stmt = conn.createStatement();
//            String tableName = "akun";
//            stmt.executeUpdate("CREATE TABLE akun ("
//                    + "    userID int,"
//                    + "    username varchar(255),"
//                    + "    password varchar(255)"
//                    + ");");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("asdasdasd");
        }
    }
    
    public static void main(String[] args) {
        db db1 = new db();
//        db1.connect();
//        db1.addAkun();
         ResultSet rSet = db1.selectAkun("rahmad");
         try {
             //rSet.next();
             System.out.println("username = " + rSet.getString("username"));
             System.out.println("pass = " + rSet.getString("password"));
  
         } catch (Exception e ){
              System.err.println(e.getMessage());
         }
    }    
}
