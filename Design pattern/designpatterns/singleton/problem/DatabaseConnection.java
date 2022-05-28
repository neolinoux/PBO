package designpatterns.singleton.problem;

/**
 *
 * @author user
 */
public class DatabaseConnection {
    
    public DatabaseConnection() {
        System.out.println("Create database connection...");
    }
    
    public void execute(String sql){
        System.out.println("execute sql: "+ sql);
    }
}
