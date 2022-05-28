package designpatterns.singleton.problem;

/**
 *
 * @author user
 */
public class OrderDetailRepository {
    public void save(String orderId, String product){
        DatabaseConnection connection = new DatabaseConnection();
        connection.execute("INSERT INTO order_details....");
    }
}
