package designpatterns.singleton.solution;

import designpatterns.singleton.problem.*;

/**
 *
 * @author user
 */
public class OrderRepository {
    public void save(String orderId){
        DatabaseConnection.getInstance().execute("INSERT INTO order_details....");
    }
}
