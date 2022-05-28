package designpatterns.singleton.problem;

/**
 *
 * @author user
 */
public class OrderRepository {
    public void save(String orderId){
        DatabaseConnection connection = new DatabaseConnection();
        connection.execute("INSERT INTO orders....");
    }
}
