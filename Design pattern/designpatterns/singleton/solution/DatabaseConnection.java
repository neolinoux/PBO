package designpatterns.singleton.solution;

import designpatterns.singleton.problem.*;

/**
 *
 * @author user
 */
public class DatabaseConnection {
    
    private static DatabaseConnection dbconnection;
    
    private DatabaseConnection() {
        System.out.println("Create connection...");
    }
    
    public static DatabaseConnection getInstance(){
        if(dbconnection==null){
            dbconnection = new DatabaseConnection();
        }
        return dbconnection;
    }
    
    public void execute(String sql){
        System.out.println("execute sql: "+ sql);
    }
    
}
